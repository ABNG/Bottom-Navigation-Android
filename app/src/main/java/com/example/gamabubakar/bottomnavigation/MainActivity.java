package com.example.gamabubakar.bottomnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private TextView mTextMessage;
    BottomNavigationView navigation;
    TextView text;
    RelativeLayout rl;  //click to finish margins
ViewGroup.MarginLayoutParams mm;     //only for margins from below

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = findViewById(R.id.message);
        navigation = findViewById(R.id.navigation);
        text=findViewById(R.id.textView);
        mm= (ViewGroup.MarginLayoutParams) navigation.getLayoutParams();
        rl=findViewById(R.id.containered);
        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setVisibility(View.GONE);
                mm.setMargins(0,0,0,0);
                navigation.setLayoutParams(mm);
            }
        });
        navigation.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                mTextMessage.setText(R.string.title_home);
                text.setText("Home Selected");
                text.setVisibility(View.VISIBLE);
                mm.setMargins(0,0,0,50);
                navigation.setLayoutParams(mm);
                return true;
            case R.id.navigation_dashboard:
                mTextMessage.setText(R.string.title_dashboard);
                text.setText("Dashboard Selected");
                text.setVisibility(View.VISIBLE);
                mm.setMargins(0,0,0,50);
                navigation.setLayoutParams(mm);
                return true;
            case R.id.navigation_notifications:
                mTextMessage.setText(R.string.title_notifications);
                text.setText("notification Selected");
                text.setVisibility(View.VISIBLE);
                mm.setMargins(0,0,0,50);
                navigation.setLayoutParams(mm);
                return true;
        }
        return false;
    }
}
