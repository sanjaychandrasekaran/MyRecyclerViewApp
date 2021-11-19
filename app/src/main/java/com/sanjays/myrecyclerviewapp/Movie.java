package com.sanjays.myrecyclerviewapp;

public class Movie {

//   2.1 creating 3 strings
    private String title,genre,date;

//    2.2 creating constructor

    public Movie(String title, String genre, String date) {
        this.title = title;
        this.genre = genre;
        this.date = date;
    }



//    2.3 create empty constructor _this will help us to avoid errors in android studio

    public Movie() {

    }

//    2.4  create Getters and setters  and back to main activity

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



}
