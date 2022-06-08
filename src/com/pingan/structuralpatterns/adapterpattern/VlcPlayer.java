package com.pingan.structuralpatterns.adapterpattern;

public class VlcPlayer implements AdavancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("vlc");
    }

    @Override
    public void playMp4(String fileName) {

    }
}
