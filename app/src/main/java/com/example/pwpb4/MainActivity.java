package com.example.pwpb4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bil2;
    private EditText jumlah;
    private Button btnresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan1);
        initUI();
        initEvent();

    }


    private void initUI(){
        bil1 = (EditText) findViewById(R.id.angka1);
        bil2 = (EditText) findViewById(R.id.angka2);
        jumlah =(EditText) findViewById(R.id.hasil);
        btnresult = (Button) findViewById(R.id.btnhasil);
    }

    private void initEvent(){
        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah(){
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bil2.getText().toString());
        int total = angka1 + angka2;
        jumlah.setText(total+"");
    }
}
