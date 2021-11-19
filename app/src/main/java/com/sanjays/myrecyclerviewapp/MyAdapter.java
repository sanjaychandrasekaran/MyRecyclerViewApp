package com.sanjays.myrecyclerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
//
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
//  3.1  we need to create private list of our movies

    private List<Movie> movieList;
//    3.2 after that create constructor

    public MyAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }


//    public MyAdapter(List<Movie> movieList) {
//        this.movieList = movieList;
//    }


//3.3.3
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        3.3.4 adapter views there are three main  methods in these fisrt one is inflation
//        View itemView = LayoutInflater.from(parent.getContext())
//                                                 .inflate(R.layout.movie_row,parent,false);

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_row,parent,false);

//        3.3.5 return the viewholder views
        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

//        now we have to bind the list of datas in viewholder
//        3.3.6 Deals with diff data and methods related to clicks on particular items of the recycler view

//        3.3.6.1 create movie and attached that to movielist position
        Movie movie = movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.date.setText(movie.getDate());
    }

    @Override
    public int getItemCount() {
//        returns the length of the recycler view
        return movieList.size();
    }


//    to create instance of viewHolder 3.3.3 for this we have to extends RecyclerView.adopter<Recycler.ViewHolder>



// 3.3  now we have to create another class which is attached to adapter class called view holder
//    create a new class called MyViewHolder
//   public class MyViewHolder extends RecyclerView.ViewHolder{
//
////        3.3.1 create widgets  like textView
//    public TextView title,genre,date;
//    //    3.3.2 initializing the views
//
//    public MyViewHolder(@NonNull View itemView) {
//        super(itemView);
////        here we have to put everything
//
////        go to res layout and create new layout file
//        title = itemView.findViewById(R.id.title_text);
//        genre = itemView.findViewById(R.id.genre_text);
//        date = itemView.findViewById(R.id.date_text);
//
//    }



//}

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title,genre,date;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            title = itemView.findViewById(R.id.title_text);
            genre = itemView.findViewById(R.id.genre_text);
            date = itemView.findViewById(R.id.date_text);

        }

    }
}
