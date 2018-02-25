package com.example.safiraaini.safira_1202154315_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText usr, pas; //membuat variabel
    Button lgn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //mendefinisikan variabel dan menghubungkan dengan layout
        usr = (EditText)findViewById(R.id.etuser);
        pas = (EditText)findViewById(R.id.etpas);
        lgn = (Button) findViewById(R.id.login_btn);
        //kondisi yang terjadi apabila Login
        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = usr.getText().toString();
                String passwordKey = pas.getText().toString();

                if (usernameKey.equals("EAD") && passwordKey.equals("MOBILE")){
                    Toast.makeText(getApplicationContext(),"Login is Sucess",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, ListMenu.class);
                    intent.putExtra("admin", usernameKey);
                    LoginActivity.this.startActivity(intent);
                } else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Username or password is Wrong !").setNegativeButton("Please Retry...", null).create().show();
                }
            }
        });
    }
}
