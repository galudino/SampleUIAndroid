package com.galudino.sampleuiandroid.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageButton;
import android.content.Intent;
import com.galudino.sampleuiandroid.R;

public class MainMenuActivity extends AppCompatActivity {
    // Each field will correspond to an item for this class's layout.
    private TextView textViewLabelLeft;
    private TextView textViewLabelRight;

    private ImageButton imageButtonLeft;
    private ImageButton imageButtonRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);// Load the layout XML for this class

        initializeWidgets();                     // Assign all references to layout elements
        initializeOnClickListeners();            // Implement onClick operations for layout elements
    }

    private void initializeWidgets() {
        /*
        textViewLabelLeft = findViewById(R.id.textViewLabelLeft);
        textViewLabelLeft.setTag(R.string.textViewLabelLeft);

        textViewLabelRight = findViewById(R.id.textViewLabelRight);
        textViewLabelRight.setTag(R.string.textViewLabelRight);
        */
        imageButtonLeft = findViewById(R.id.imageButtonLeftMainMenu);
        imageButtonLeft.setTag(R.string.imageButtonLeft);

        imageButtonRight = findViewById(R.id.imageButtonRightMainMenu);
        imageButtonRight.setTag(R.string.imageButtonRight);
    }

    private void initializeOnClickListeners() {
        if (imageButtonLeft.isClickable()) {
            imageButtonLeft.setOnClickListener(v -> startActivity(new Intent(this, LeftButtonActivity.class)));
        }

        if (imageButtonRight.isClickable()) {
            imageButtonRight.setOnClickListener(v -> startActivity(new Intent(this, RightButtonActivity.class)));
        }
    }
}