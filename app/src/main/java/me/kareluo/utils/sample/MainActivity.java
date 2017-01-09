package me.kareluo.utils.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import me.kareluo.utils.value.SecureUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ui:
                startActivity(new Intent(this, UIActivity.class));
                break;
            case R.id.btn_secure:
                secure();
                break;
        }
    }

    private void secure() {
        String password = new String(new byte[]{13, 4, 33, -23, 34, -34, -45, 22, 56, 2, 1, 4, 4, 6, 6, 78, 8, 5, 5, 5, 4, -13, -3, -3, -127});

        String encrypt = SecureUtils.encrypt("我是Felix", password);

        Log.d(TAG, "加密后:" + encrypt);
        Log.d(TAG, "解密后:" + SecureUtils.decrypt(encrypt, password));
    }
}
