package me.kareluo.utils.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import me.kareluo.utils.sample.R;
import me.kareluo.utils.ui.CanvasUtils;

/**
 * Created by felix on 16/6/14.
 */
public class MaskView extends FrameLayout {

    private Bitmap maskBitmap;

    private Paint paint;

    public MaskView(Context context) {
        this(context, null, 0);
    }

    public MaskView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaskView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context, attrs, defStyleAttr);
    }

    private void initialize(Context context, AttributeSet attrs, int defStyleAttr) {
        inflate(context, R.layout.layout_mask, this);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        maskBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bird);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        CanvasUtils.mask(canvas, paint, maskBitmap);
    }
}
