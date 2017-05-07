package com.example.muhammad.protectyou2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;


public class AddContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        final EditText name=(EditText) findViewById(R.id.contactname1);
        final EditText relation=(EditText) findViewById(R.id.relation1);
        final EditText phone =(EditText) findViewById(R.id.phonenumber1);
        final Button btnAdd = (Button) findViewById(R.id.addnewcontact1);
        btnAdd.setOnClickListener((OnClickListener) this);

    }


}
