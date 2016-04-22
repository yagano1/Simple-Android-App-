package com.example.linh.funfacts;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        Button ShowFact = (Button) findViewById(R.id.ShowFactsButton);
        final TextView factLabel = (TextView) findViewById(R.id.factLabel);
        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View View){
                String fact;
                Random
                 factLabel.setText(fact);
            }

        };
        ShowFact.setOnClickListener(listener);

    }


    }

