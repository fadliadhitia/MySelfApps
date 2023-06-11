package com.example.myselfapps;

import android.content.Intent;
import android.content.SharedPreferences;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/*
Fadli Adhitia Mahardika
10120237
IF6
10 - 06 - 2023 - 16:00
*/

public class SlideActivity extends AppCompatActivity {

    public static ViewPager viewPager;
    SlideViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        viewPager = findViewById(R.id.viewpager);
        adapter = new SlideViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        if (isOpenAlread()){
            Intent intent = new Intent(SlideActivity.this,HomeActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        } else {
            SharedPreferences.Editor editor = getSharedPreferences("slide",MODE_PRIVATE).edit();
            editor.putBoolean("slide",true);
            editor.commit();
        }

    }

    private boolean isOpenAlread() {
        SharedPreferences sharedPreferences = getSharedPreferences("slide",MODE_PRIVATE);
        boolean result = sharedPreferences.getBoolean("slide",false);
        return result;
    }
}
