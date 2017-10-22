package com.sihuynh.w7fragmentexample;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager) findViewById(R.id.page_header);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
//        FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.add(R.id.fragment_container,new OneFragment());
//        fragmentTransaction.commit();
    }
}
