package com.example.crazyhands.testingadapters;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListOfPoolCFragment extends Fragment {


    public ListOfPoolCFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_catagory, container, false);

        // Create an ArrayList of ClistItems objects
        final ArrayList<List_item> ListItems = new ArrayList<List_item>();
        ListItems.add(new List_item("wingchun", "0.00", YogaInfo.class));
        ListItems.add(new List_item("gummybears", "22.00", PilatiesInfo.class));
        ListItems.add(new List_item("aqua robics", "15.00", PilatiesInfo.class));


        // Create an {@link SimpleListAdapter}, whose data source is a list of
        // {@link List_item}s. The adapter knows how to create list item views for each item
        // in the list.
        SimpleListAdapter ItemsAdapter = new SimpleListAdapter(getActivity(), ListItems);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(ItemsAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                List_item item = ListItems.get(position);

                Intent newIntent = new Intent(getActivity(), item.getActivityToName());
                startActivity(newIntent);

                //mMediaPlayer = MediaPlayer.create(getActivity(), word.getAudioResourceId());


            }
        });


        return rootView;
    }

}
