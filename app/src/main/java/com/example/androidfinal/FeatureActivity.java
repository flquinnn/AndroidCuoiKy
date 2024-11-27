package com.example.androidfinal;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FeatureActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        // Gán sự kiện khi chọn các mục trong BottomNavigation
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.nav_featured) {
                // Xử lý khi chọn Featured
            } else if (itemId == R.id.nav_feed) {
                // Xử lý khi chọn Feed
            } else if (itemId == R.id.nav_settings) {
                // Xử lý khi chọn Settings
            } else if (itemId == R.id.nav_user) {
                // Xử lý khi chọn User
                Intent intent = new Intent(this, UserActivity.class);
                startActivity(intent);
            } else {
                return false; // Nếu không khớp với bất kỳ trường hợp nào
            }

            return true; // Trả về true nếu xử lý xong
        });


    }
}


