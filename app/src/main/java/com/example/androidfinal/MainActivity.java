package com.example.androidfinal;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tham chiếu đến nút OK
        Button okButton = findViewById(R.id.okButton);

        // Gán sự kiện nhấn nút
        okButton.setOnClickListener(view -> {
            // Chuyển sang FeatureActivity (Màn hình 2)
            Intent intent = new Intent(MainActivity.this, FeatureActivity.class);
            startActivity(intent);
        });
    }
}
