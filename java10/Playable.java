public interface Playable {
    void play();
    void pause();
    void stop();
}
class MP3Player implements Playable {
    public void play() {
        System.out.println("MP3 player is playing.");
    }
    public void pause() {
        System.out.println("MP3 player is paused.");
    }
    public void stop() {
        System.out.println("MP3 player is stopped.");
    }
}
class CDPlayer implements Playable {
    public void play() {
        System.out.println("CD player is playing.");
    }
    public void pause() {
        System.out.println("CD player is paused.");
    }
    public void stop() {
        System.out.println("CD player is stopped.");
    }
}

class StreamingPlayer implements Playable {
    public void play() {
        System.out.println("Streaming player is playing.");
    }
    public void pause() {
        System.out.println("Streaming player is paused.");
    }
    public void stop() {
        System.out.println("Streaming player is stopped.");
    }
}

 class Main {
    public static void main(String[] args) {
        Playable mp3Player = new MP3Player();
        Playable cdPlayer = new CDPlayer();
        Playable streamingPlayer = new StreamingPlayer();
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();
        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();
        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}
