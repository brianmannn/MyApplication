package com.example.crazyhands.testingadapters;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListOfAllC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_all_c);

        // Create an ArrayList of ClistItems objects
        final ArrayList<List_item> ListItems = new ArrayList<List_item>();
        ListItems.add(new List_item("Donut", "8.00"));
        ListItems.add(new List_item("Eclair", "9.00"));


        // Create an {@link SimpleListAdapter}, whose data source is a list of
        // {@link List_item}s. The adapter knows how to create list item views for each item
        // in the list.
        SimpleListAdapter ItemsAdapter = new SimpleListAdapter(this, ListItems);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_Item);
        listView.setAdapter(ItemsAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                List_item item = ListItems.get(position);

                Context context = getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                //mMediaPlayer = MediaPlayer.create(getActivity(), word.getAudioResourceId());



            }
        });
    }
}
