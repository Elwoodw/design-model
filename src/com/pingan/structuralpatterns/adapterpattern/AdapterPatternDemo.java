package com.pingan.structuralpatterns.adapterpattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer player=new AudioPlayer();
        player.play("mp3","a");
        player.play("vlc","a");
        player.play("mp4","a");
        player.play("avi","a");
    }
}
