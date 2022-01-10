package com.apkbundle.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private TextView txt1;
    private EditText txtname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= findViewById(R.id.button);
        txt1=findViewById(R.id.textView);
        txtname= findViewById(R.id.editTextName);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredName=txtname.getText().toString();
                if(enteredName.isEmpty()){
                    txt1.setText("Hello, Mr. Lazy");
                }
                else{
                    txt1.setText("Hello, "+enteredName);
                }

            }
        });

    }
}