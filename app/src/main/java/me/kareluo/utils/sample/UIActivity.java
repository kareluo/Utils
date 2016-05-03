package me.kareluo.utils.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import me.kareluo.utils.app.DeviceUtils;

/**
 * Created by felix on 16/5/3.
 */
public class UIActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mScreenshotView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        mScreenshotView = (ImageView) findViewById(R.id.iv_screenshot);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_screenshot:
                mScreenshotView.setImageBitmap(DeviceUtils.captureScreenshot(this, true));
                break;
        }
    }
}
