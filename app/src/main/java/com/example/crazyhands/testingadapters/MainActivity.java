package com.example.crazyhands.testingadapters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toListAllC = (Button) findViewById(R.id.bookingButton);
        toListAllC.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent listAllIntent = new Intent(MainActivity.this, ListOfAllC.class);
                startActivity(listAllIntent);
            }
        });

    }
}
