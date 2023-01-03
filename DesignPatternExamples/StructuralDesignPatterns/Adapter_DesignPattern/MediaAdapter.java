package StructuralDesignPatterns.Adapter_DesignPattern;

public class MediaAdapter implements Media_Player{
    private Advanced_Media_Player advanced_media_player;
    public MediaAdapter(String AudioType)
    {
        if (AudioType.equalsIgnoreCase("vlc"))
            advanced_media_player=new VLC_Player();
        else if (AudioType.equalsIgnoreCase("mp4"))
            advanced_media_player=new MP4_Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc"))
            advanced_media_player.playVLC(fileName) ;
        else if (audioType.equalsIgnoreCase("mp4"))
            advanced_media_player.playMP4(fileName) ;


    }
}
