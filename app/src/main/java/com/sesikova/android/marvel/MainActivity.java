package com.sesikova.android.marvel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton= (Button) findViewById(R.id.startButton);

        OnClickListener startButtonClickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HeroActivity.class);
                startActivity(intent);
            }
        };
        startButton.setOnClickListener(startButtonClickListener);
    }
}
