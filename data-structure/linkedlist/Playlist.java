import java.util.LinkedList;

public class Playlist {
  private String name;
  private LinkedList<Song> playlist;

  public Playlist(String name) {
    this.name = name;
    this.playlist = new LinkedList<Song>();
  }

  // Add song to playlist
  public boolean addSongToPlayList(int trackNumber, Album album) {
    int index = trackNumber - 1;

    if (index >= 0 && index < album.getAlbum().size()) {
      this.playlist.add(album.getAlbum().get(index));
      return true;
    }
    
    System.out.println("This album does not have a track " + trackNumber);
    return false;
  }

  // Overloaded
  public boolean addSongToPlayList(String title, Album album) {
    Song foundSong = album.findSong(title);

    if (foundSong == null) {
      System.out.println("This album does not have " + title);
      return false;
    }

    this.playlist.add(foundSong);
    return true;
  }

  public String getName() {
    return this.name;
  }

  public LinkedList<Song> getPlaylist() {
    return this.playlist;
  }
}