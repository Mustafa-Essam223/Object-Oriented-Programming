package StructuralDesignPatterns.Adapter_DesignPattern;

public class MP4_Player implements Advanced_Media_Player{
    @Override
    public void playVLC(String fileName) {
        // nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+fileName);

    }
}
