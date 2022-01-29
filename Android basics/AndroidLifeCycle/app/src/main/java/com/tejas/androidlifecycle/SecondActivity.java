package com.tejas.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    //No need of below line because we don't want to go anywhere from SecondActivity text view
        //TextView secondText= findViewById(R.id.tvSecondActivity);

        Toast toast= Toast.makeText(this,"SecondOnCreateJatin",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0);//not works after api level 30 that's why not working on emulator but in 3s prime 
        toast.show();

    }

    @Override
    protected void onStart(){
        super.onStart();

        Toast toast=Toast.makeText(this,"SecondOnStart",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onResume(){
        super.onResume();

        Toast myToast3=Toast.makeText(this,"SecondOnResume",Toast.LENGTH_SHORT);
        myToast3.setGravity(Gravity.CENTER,0,0);
        myToast3.show();
    }

    @Override
    protected void onPause(){
        super.onPause();

        Toast myToast4=Toast.makeText(this,"SecondOnPause",Toast.LENGTH_SHORT);
        myToast4.setGravity(Gravity.CENTER,0,0);
        myToast4.show();
    }

    @Override
    protected void onStop(){
        super.onStop();

        Toast myToast5=Toast.makeText(this,"SecondOnStop",Toast.LENGTH_SHORT);
        myToast5.setGravity(Gravity.CENTER,0,0);
        myToast5.show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Toast myToast6=Toast.makeText(this,"SecondOnDestroy",Toast.LENGTH_SHORT);
        myToast6.setGravity(Gravity.CENTER,0,0);
        myToast6.show();
    }
}