package com.galudino.sampleuiandroid.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.galudino.sampleuiandroid.R;

public class RightButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);

        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.frameLayoutFragment, com.galudino.sampleuiandroid.ContentFragment.class, savedInstanceState)
                .commit();
    }
}