package com.galudino.sampleuiandroid.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageButton;
import android.content.Intent;
import com.galudino.sampleuiandroid.R;

public class SplashActivity extends AppCompatActivity {
    // Each field will correspond to an item for this class's layout.
    private TextView textViewLabelLeft;
    private TextView textViewLabelRight;

    private ImageButton imageButtonLeft;
    private ImageButton imageButtonRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);// Load the layout XML for this class

        initializeWidgets();                     // Assign all references to layout elements
        initializeOnClickListeners();            // Implement onClick operations for layout elements
    }

    private void initializeWidgets() {
        textViewLabelLeft = findViewById(R.id.textViewLabelRight);
        textViewLabelLeft.setTag(R.string.textViewLabelLeft);

        textViewLabelRight = findViewById(R.id.textViewLabelRight);
        textViewLabelRight.setTag(R.string.textViewLabelRight);

        imageButtonLeft = findViewById(R.id.imageButtonRight);
        imageButtonLeft.setTag(R.string.imageButtonLeft);

        imageButtonRight = findViewById(R.id.imageButtonRight);
        imageButtonRight.setTag(R.string.imageButtonRight);
    }

    private void initializeOnClickListeners() {
        if (imageButtonLeft.isClickable()) {
            imageButtonLeft.setOnClickListener(v -> {
                startActivity(new Intent(this, LeftButtonActivity.class));
            });
        }

        if (imageButtonRight.isClickable()) {
            imageButtonRight.setOnClickListener(v -> {
                startActivity(new Intent(this, RightButtonActivity.class));
            });
        }
    }
}