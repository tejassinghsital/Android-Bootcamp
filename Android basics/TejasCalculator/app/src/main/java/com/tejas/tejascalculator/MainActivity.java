package com.tejas.tejascalculator;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variable initialization for views call
    EditText etFirstValue,etSecondValue;//these are variable initializations and not id(i gave variable names same as id names...)
    TextView tvAns;
    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();//removing axctionbar for particular activity otherwise for whole change in themes darActionBar to NoActionBAr

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);//this is to remove title bar/notification bar from the activity...
        setContentView(R.layout.activity_main);


        //views call by their id
        etFirstValue=findViewById(R.id.etFirstValue);//first etFirstValue is variable name that we initialize above and second one is ID so don' confuse in both i gave same name to variable to that of views...
        etSecondValue=findViewById(R.id.etSecondValue);

        tvAns=findViewById(R.id.tvAns);

        add=findViewById(R.id.btnAdd);//we can check which is variable and which is view and ctrl+right click on it...
        sub=findViewById(R.id.btnSub);
        mul=findViewById(R.id.btnMul);
        div=findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue,secondValue,answer;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());//this etFirstValue is a variable and not id
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                answer=firstValue+secondValue;

                tvAns.setText("The Addition is "+answer);//this tvAns is a variable and not an id...




            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue,secondValue,answer;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());//this etFirstValue is a variable and not id
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                answer=firstValue-secondValue;

                tvAns.setText("The Subtraction is "+answer);//this tvAns is a variable and not an id...




            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue,secondValue,answer;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());//this etFirstValue is a variable and not id
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                answer=firstValue*secondValue;

                tvAns.setText("The Multiplication is "+answer);//this tvAns is a variable and not an id...




            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int firstValue,secondValue,answer;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());//this etFirstValue is a variable and not id
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                answer=firstValue/secondValue;

                tvAns.setText("The Division is "+answer);//this tvAns is a variable and not an id...




            }
        });
    }
}