package com.example.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Addnum extends AppCompatActivity {

    Button b1,b2;
    EditText ed1,ed2;
    TextView tv;
    String getNum1,getNum2,result;
    int Num1,Num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addnum);

        b1=(Button) findViewById(R.id.back);
        b2=(Button)findViewById(R.id.calc);
        ed1=(EditText)findViewById(R.id.n1);
        ed2=(EditText)findViewById(R.id.n2);
        tv=(TextView)findViewById(R.id.op);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=ed1.getText().toString();
                getNum2=ed2.getText().toString();
                Num1=Integer.parseInt(getNum1);
                Num2=Integer.parseInt(getNum2);
                sum=Num1+Num2;
                result=String.valueOf(sum);
                tv.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });





    }
}