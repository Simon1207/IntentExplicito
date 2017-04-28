package com.example.simon.intentexplicito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private TextView textVIew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textVIew=(TextView)findViewById(R.id.textViewMain);

        //Recuperar los datos del Intent con Bundle
        Bundle bundle=getIntent().getExtras();
        //comprobar que Bundle no este vacio

   
        if(bundle != null && bundle.getString("greeter") !=null ){
           String greeter=bundle.getString("greeter");
            Toast.makeText(SecondActivity.this,greeter,Toast.LENGTH_LONG).show();
            textVIew.setText(greeter);
        } else  {
            Toast.makeText(SecondActivity.this,"Esta vacio!", Toast.LENGTH_LONG).show();
        }
    }//onCreate
}
