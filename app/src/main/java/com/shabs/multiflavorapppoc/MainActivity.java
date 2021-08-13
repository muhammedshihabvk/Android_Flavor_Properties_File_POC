package com.shabs.multiflavorapppoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mainText = findViewById(R.id.mainText);
        mainText.setText(BuildConfig.BUILD_COUNTRY + "\n" + BuildConfig.BUILD_URL + "\n" + BuildConfig.BUILD_NAME);

    }
}