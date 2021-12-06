package com.example.hw5;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class  secondactivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        textView = findViewById(R.id.text_vw);

        User model = (User) getIntent().getSerializableExtra("text");

        if (model != null) {
            textView.setText(model.getName());
        }else {
            Toast.makeText(this, "FAILURE", Toast.LENGTH_SHORT).show();
        }
    }
}