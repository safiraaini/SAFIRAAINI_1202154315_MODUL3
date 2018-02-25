package com.example.safiraaini.safira_1202154315_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class watersDetail extends AppCompatActivity {

    //membuat variabel untuk didefinisikan
    private int counts = 1;
    private Button plus, minus;
    private TextView value;
    private ImageView battery;

    //menghubungkan ke layout berikutnya
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waters_detail);
        Intent intent = getIntent();

        //mengambil String dari adapter
        String judul = intent.getStringExtra("judul");
        String desc = intent.getStringExtra("desc");
        String descs = intent.getStringExtra("descs");
        int gambar = intent.getIntExtra("gambar", 0);

        TextView textTitle = findViewById(R.id.title);
        TextView textDesc = findViewById(R.id.desc);
        ImageView imageGambar = findViewById(R.id.imageview);

        textTitle.setText(judul);
        textDesc.setText(descs);
        imageGambar.setImageResource(gambar);

        //menghubungkan dengan item layout battery
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        value = findViewById(R.id.txt);
        battery = findViewById(R.id.battery);

        battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
        value.setText(Integer.toString(counts) + "L");

    }

    //perulangan untuk menambahkan nilai baterai
    public void plus(View view) {
        counts++;
        if (value != null) {
            switch (counts) {
                case 1:
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Bottle is Empty", Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Bottle is Full", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

    //perulangan untuk mengurangi nilai baterai
    public void minus(View view) {
        counts--;
        if (value != null) {
            switch (counts) {
                case 6:
                    battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Bottle is Full", Toast.LENGTH_LONG).show();
                    break;
                case 5:
                    battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 2:
                    battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 1:
                    battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Bottle is Low", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}

