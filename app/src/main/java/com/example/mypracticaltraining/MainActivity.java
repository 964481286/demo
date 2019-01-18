package com.example.mypracticaltraining;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            show();

    }

    private void show() {

        Toast.makeText(this, "老牛是个傻狗", Toast.LENGTH_SHORT).show();
    }
}
