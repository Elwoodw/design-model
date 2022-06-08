package com.pingan.structuralpatterns.adapterpattern;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter adapter;
    @Override
    public void play(String audioType, String fileName) {
if(audioType.equalsIgnoreCase("mp3"))
{
    System.out.println("mp3");
}
else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4"))
{
    adapter=new MediaAdapter(audioType);
    adapter.play(audioType, fileName);
}
else
{
    System.out.println("not support");
}
    }
}
