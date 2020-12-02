package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText name,num,Email,Pass;
    Button Reg;
    TextView lbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


        name = findViewById(R.id.name);
        num = findViewById(R.id.num);
        Email = findViewById(R.id.Email);
        Pass = findViewById(R.id.pass);

        Reg = findViewById(R.id.Reg);
        lbtn = findViewById(R.id.lbtn);

        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name,Num,Mail,passw;

                Name = name.getText().toString();
                Num = num.getText().toString();
                Mail = Email.getText().toString();
                passw = Pass.getText().toString();

                if(Name.equals(""));{
                    Toast.makeText(Register.this, "Name is Blank", Toast.LENGTH_SHORT).show();
                }

                if(num.equals(""));{
                    Toast.makeText(Register.this, "Number is Blank", Toast.LENGTH_SHORT).show();
                }

                if(Mail.equals(""));{
                    Toast.makeText(Register.this, "Email is Blank", Toast.LENGTH_SHORT).show();
                }

                if(passw.equals(""));{
                    Toast.makeText(Register.this, "Password is Blank", Toast.LENGTH_SHORT).show();
                }

            }
        });
        lbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent R = new Intent(Register.this, MainActivity.class);
                startActivity(R);
                finish();

            }
        });

    }
}