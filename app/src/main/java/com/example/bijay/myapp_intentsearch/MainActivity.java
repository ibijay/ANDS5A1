package com.example.bijay.myapp_intentsearch;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    EditText srchtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        srchtext = (EditText) findViewById(R.id.editText);
    }

    public void Search (View v){
        String text = srchtext.getText().toString();
        Intent srchintent = new Intent(Intent.ACTION_WEB_SEARCH);
        srchintent.putExtra(SearchManager.QUERY, text );
        startActivity(srchintent);
    }
}