package com.sanjays.myrecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

// 1.1   initialize recycler view
   RecyclerView recyclerview;
// 2.4.1.2  create instance of
    List<Movie> movieList = new ArrayList<>();
//    then back to adapter.java

//   1.2 in-order to view data sets create an adapter
//    create instance fe=rom myAdapter
    MyAdapter myAdapter;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        1.1.2

        recyclerview = findViewById(R.id.recyclerView);

        myAdapter = new MyAdapter(movieList);

//        4/3/4 step no 4 attach the adapter recycler view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerview.setLayoutManager(layoutManager);

        recyclerview.setItemAnimator(new DefaultItemAnimator());

//        set no 5 binding recycler view to the adapter

        recyclerview.setAdapter(myAdapter);



//      6  last step insert the data and bind it to the recycler view
        InsertData();

    }

//    this is the method outside the oncreate

//    6
    private void InsertData() {

//        very imp we are adding all datas to be inserted

        Movie movie = new Movie("Fast & Furious 9","Action","2019");
        movieList.add(movie);

    movie = new Movie("Fast & Furious6","Action","2019");
        movieList.add(movie);

    movie = new Movie("Avatar1","Fantasy","2014");
        movieList.add(movie);


     movie = new Movie("Avatar2","Fantasy","2014");
        movieList.add(movie);


      movie = new Movie("Avatar3","Fantasy","2014");
        movieList.add(movie);




        myAdapter.notifyDataSetChanged();









    }
}