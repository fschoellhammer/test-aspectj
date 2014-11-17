package com.test.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.test.sample.annotation.DebugTrace;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Hello");
        setContentView(textView);

        init();
    }

    @DebugTrace
    void init() {
        System.out.println("init");
    }
}
