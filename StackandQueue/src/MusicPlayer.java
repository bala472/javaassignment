class Song {
    private String title;
    private String artist;
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
    @Override
    public String toString() {
        return title + " - " + artist;
    }
}
class Playlist {
    private SongNode head;
    private static class SongNode {
        private Song song;
        private SongNode next;
        public SongNode(Song song) {
            this.song= song;
            this.next= null;
            }
     }
    public Playlist() {
        this.head = null;
    }
    public void addSong(Song song) {
        SongNode newNode = new SongNode(song);
        if (head == null) {
            head = newNode;
        } else {
            SongNode current = head;
            while (current.next != null) {
                current = current.next;
                   }
            current.next = newNode;
        }
    }

    public void removeSong(Song songs) {
        if (head == null) {
            return;
        }
        if (head.song.getTitle().equals(songs.getTitle())) {
            head = head.next;
            return;
        }
        SongNode current = head;
        while (current.next != null) {
            if (current.next.song.getTitle().equals(songs.getTitle())) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    public void displayPlaylist() {
        SongNode current = head;
        System.out.println("Playlist:");
        while (current != null) {
            System.out.println("- " + current.song);
            current = current.next;
        }
        System.out.println();
    }
}
public class MusicPlayer {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Hukum", "Aniruth"));
        playlist.addSong(new Song("Roja Roja", "AR Rahman"));
        playlist.addSong(new Song("Thuli Thuli", "Yuvan"));

        playlist.displayPlaylist();

        Song songToRemove = new Song("Roja Roja", "AR Rahman");
        playlist.removeSong(songToRemove);

        playlist.displayPlaylist();
    }
}

