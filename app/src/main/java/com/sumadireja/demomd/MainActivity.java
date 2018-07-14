package com.sumadireja.demomd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton menu1, menu2, menu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu1 = (FloatingActionButton)findViewById(R.id.subFloatingMenu1);
        menu2 = (FloatingActionButton)findViewById(R.id.subFloatingMenu2);
        menu3 = (FloatingActionButton)findViewById(R.id.subFloatingMenu3);

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Alarm Icon Chicked", Toast.LENGTH_LONG).show();
            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "back up", Toast.LENGTH_LONG).show();

            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "settings", Toast.LENGTH_LONG).show();

            }
        });
    }
}