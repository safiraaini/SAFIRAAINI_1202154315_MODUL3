package com.example.safiraaini.safira_1202154315_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int splashInterval = 2000; //waktu untuk splash screen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //untuk membentuk full screen
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_main);

        //jeda waktu intent atau pindah halaman
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub

                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent

                Toast.makeText(MainActivity.this,"Welcome!", Toast.LENGTH_LONG).show();

                //jeda selesai Splashscreen
                this.finish();
            }

            //selesai
            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);

    };
}