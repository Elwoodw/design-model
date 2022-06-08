package com.pingan.structuralpatterns.adapterpattern;

public class Mp4Player implements AdavancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("mp4");
    }
}
