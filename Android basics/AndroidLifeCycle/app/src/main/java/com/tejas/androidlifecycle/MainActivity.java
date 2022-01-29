package com.tejas.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();

        TextView firstText = findViewById(R.id.tvFirstAcitvity);


        firstText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent myIntent =new Intent(MainActivity.this, SecondActivity.class);
                startActivity(myIntent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this ,"onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this ,"onResume",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this ,"onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this ,"onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this ,"onDestroy",Toast.LENGTH_SHORT).show();
    }
}