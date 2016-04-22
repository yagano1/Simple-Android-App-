package com.example.linh.funfacts;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private facBook mfacBook = new facBook();
    private randcomColor randomColor = new randcomColor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        Button ShowFact = (Button) findViewById(R.id.ShowFactsButton);
        final TextView factLabel = (TextView) findViewById(R.id.factLabel);
        final RelativeLayout mealLayout = (RelativeLayout) findViewById(R.id.RelativeLayout);
        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View View){
                String fact = " ";
                factLabel.setText(mfacBook.getFacts());
                mealLayout.setBackgroundColor(Color.parseColor(randomColor.getColor()));


            }

        };
        ShowFact.setOnClickListener(listener);
        Toast.makeText(this,"Yay! Our Activity was created", Toast.LENGTH_LONG).show();


    }


    }

