package com.example.gestiondegarage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.gestiondegarage.doc.Doc;
import com.example.gestiondegarage.prev.Preventif;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    EditText email, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.login);
        email = findViewById(R.id.input_email);
        password = findViewById(R.id.input_pass);

        String emailL;
        btnlogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                        startActivity(intent);


                        /*  String emailL = email.getText().toString();
                        String pass = password.getText().toString();

                        JsonObject json = new JsonObject();
                        json.addProperty("email", emailL);
                        json.addProperty("password", pass);

                        Ion.with(MainActivity.this)
                                .load("https://garage-backend.herokuapp.com//users/login")
                                .setJsonObjectBody(json)
                                .asJsonObject()
                                .setCallback(new FutureCallback<JsonObject>() {
                                    @Override
                                    public void onCompleted(Exception e, JsonObject result) {

                                        if(e == null){

                                            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                                            startActivity(intent);
                                        }

                                    }
                                });*/

                        }
                    }


        );


    }
 }
