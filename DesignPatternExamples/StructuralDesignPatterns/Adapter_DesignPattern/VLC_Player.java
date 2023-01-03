package StructuralDesignPatterns.Adapter_DesignPattern;

public class VLC_Player implements Advanced_Media_Player{
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc file. Name: "+fileName);
    }

    @Override
    public void playMP4(String fileName) {
        //nothing

    }

}
