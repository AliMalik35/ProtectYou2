package com.example.muhammad.protectyou2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class Home extends AppCompatActivity {

    public Button btn1;
    public Button btn2;

    public void iniit() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ctn = new Intent(Home.this, ContactMessage.class);
                startActivity(ctn);
            }
        });
    };
    public void iniit1() {
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ctn2 = new Intent(Home.this, ProtectData.class);
                startActivity(ctn2);
            }
        });
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        iniit();
        iniit1();
    }
}
