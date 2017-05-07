package com.example.muhammad.protectyou2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactMessage extends AppCompatActivity {
    public Button addmessagebtn1;
    public Button addcontactbtn1;
    public TextView emergencycontact1;
    public TextView emergencymessage1;

    public void iniit2() {
        addcontactbtn1 = (Button) findViewById(R.id.addcontactbtn1);
        addcontactbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ctn3 = new Intent(ContactMessage.this, AddContact.class);
                startActivity(ctn3);
            }
        });
    };
    public void iniit3() {
        addmessagebtn1 = (Button) findViewById(R.id.addmessagebtn1);
        addmessagebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ctn4 = new Intent(ContactMessage.this, AddMessage.class);
                startActivity(ctn4);
            }
        });
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_message);
        iniit2();
        iniit3();
    }
}
