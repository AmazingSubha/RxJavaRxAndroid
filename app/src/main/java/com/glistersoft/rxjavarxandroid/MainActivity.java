package com.glistersoft.rxjavarxandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.glistersoft.rxjavarxandroid.example.ActivityExample1;
import com.glistersoft.rxjavarxandroid.example.ActivityExample2;
import com.glistersoft.rxjavarxandroid.example.ActivityExample3;
import com.glistersoft.rxjavarxandroid.example.ActivityExample4;
import com.glistersoft.rxjavarxandroid.example.ActivityExample5;
import com.glistersoft.rxjavarxandroid.flight_ticket_app.view.FlightTicketActivity;
import com.glistersoft.rxjavarxandroid.instant_search_app.view.InstantSearchActivity;
import com.glistersoft.rxjavarxandroid.note_app.view.NoteActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1,button2,button3,button4,button5,notesApp,instantSearch,flightTicket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        notesApp = findViewById(R.id.notesApp);
        instantSearch = findViewById(R.id.instantSearch);
        flightTicket = findViewById(R.id.flightTicket);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        notesApp.setOnClickListener(this);
        instantSearch.setOnClickListener(this);
        flightTicket.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                startActivity(new Intent(MainActivity.this, ActivityExample1.class));
                break;
            case R.id.button2:
                startActivity(new Intent(MainActivity.this, ActivityExample2.class));
                break;
            case R.id.button3:
                startActivity(new Intent(MainActivity.this, ActivityExample3.class));
                break;
            case R.id.button4:
                startActivity(new Intent(MainActivity.this, ActivityExample4.class));
                break;
            case R.id.button5:
                startActivity(new Intent(MainActivity.this, ActivityExample5.class));
                break;
            case R.id.notesApp:
                startActivity(new Intent(MainActivity.this, NoteActivity.class));
                break;
            case R.id.instantSearch:
                startActivity(new Intent(MainActivity.this, InstantSearchActivity.class));
                break;
            case R.id.flightTicket:
                startActivity(new Intent(MainActivity.this, FlightTicketActivity.class));
                break;
        }
    }
}