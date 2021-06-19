import java.util.ArrayList;

public class Album {
  private String name;
  private String artist;
  private ArrayList<Song> album;

  public Album(String name, String artist) {
    this.name = name;
    this.artist = artist;
    this.album = new ArrayList<Song>();
  }

  // Adding song to album
  public boolean addSongToAlbum(String title, String duration) {
    if (findSong(title) == null) {
      this.album.add(new Song(title, duration));
      return true;
    }
    return false;
  }

  // Helper function to find if a song exists in album
  public Song findSong(String title) {
    for (Song checkSong: this.album) {
      if (checkSong.getTitle() == title) {
        return checkSong;
      }
    }
    return null;
  }

  public String getName() {
    return this.name;
  }

  public String getArtist() {
    return this.artist;
  }

  public ArrayList<Song> getAlbum() {
    return this.album;
  }

}
