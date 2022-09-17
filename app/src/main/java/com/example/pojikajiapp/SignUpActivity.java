package com.example.pojikajiapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class SignUpActivity extends AppCompatActivity {

   ViewPager2 viewPager2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_PojikajiApp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        viewPager2 = findViewById(R.id.view_pager_slecte_color);
        PagerAdapter pagerAdapter = new PagerAdapter(this);
        viewPager2.setAdapter(pagerAdapter);
    }
}