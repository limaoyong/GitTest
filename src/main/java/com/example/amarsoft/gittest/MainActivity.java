package com.example.amarsoft.gittest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by amarsoft on 2017/4/14.
 */

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvents();
    }

    private void initEvents() {
    }

    private void initView() {
        mTextView = (TextView) findViewById(R.id.textView);
        mTextView.setText("显示功能2");
        Log.i("aaa","test");
    }
}
