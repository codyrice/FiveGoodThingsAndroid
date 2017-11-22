package com.codyrice.fivegoodthingsandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String feeling = ((Integer) intent.getIntExtra(MainActivity.EXTRA_FEELING, 0)).toString();

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(feeling);

    }

    /** Called when the user taps the Send button */
    public void saveFeelings(View view) {
        Intent intent = new Intent(this, DoneActivity.class);
        startActivity(intent);

    }
}
