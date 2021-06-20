package com.company.adapter;

public class Main {
    public static void main(String[]args){
        //create a movie player
        //support mp3,mp4
        MoviePlayer moviePlayer=new MP3Player();
        moviePlayer.play();
        MoviePlayer moviePlayer1=new MP4Player();
        moviePlayer1.play();
        MoviePlayer moviePlayer2=new ImageAdapter();
        moviePlayer2.play();
    }
}
