package com.codyrice.fivegoodthingsandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_FEELING = "com.codyrice.fivegoodthingsandroid.FEELING";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void saveFeeling(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        SeekBar seekBar = findViewById(R.id.seekBar);
        Integer feeling = seekBar.getProgress();
        intent.putExtra(EXTRA_FEELING, feeling);
        startActivity(intent);

    }
}
