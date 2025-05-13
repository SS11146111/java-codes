package com.sangita.designpatterns;


interface MediaPlayer {
    void play(String fileType, String fileName);
}

class AdvancedPlayer {
    public void playMP4(String fileName) {
        System.out.println("Playing MP4: " + fileName);
    }
}

public class MediaPlayerAdapterDemo implements MediaPlayer {
	    AdvancedPlayer advancedPlayer = new AdvancedPlayer();

	    public void play(String fileType, String fileName) {
	        if (fileType.equalsIgnoreCase("mp4")) {
	            advancedPlayer.playMP4(fileName);
	        } else {
	            System.out.println("Format not supported");
	        }
	    }
}
