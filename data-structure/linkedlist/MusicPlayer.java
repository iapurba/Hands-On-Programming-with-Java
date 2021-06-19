import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicPlayer {

  public static void main(String[] args) {

    Album evolve = new Album("Evolve", "Imagine Dragons");
    // Adding songs to the album evolve
    evolve.addSongToAlbum("Believer", "3:24");
    evolve.addSongToAlbum("Whatever It Takes", "3:21");
    evolve.addSongToAlbum("Thunder", "3:07");
    evolve.addSongToAlbum("Walking the Wire", "3:52");
    evolve.addSongToAlbum("Rise Up", "3:51");
    evolve.addSongToAlbum("Mouth of the river", "3:41");
    evolve.addSongToAlbum("Start Over", "3:06");

    Album meteora = new Album("Meteora", "Linkin Park");
    // Adding songs to the album meteora
    meteora.addSongToAlbum("Don't Stay", "3:07");
    meteora.addSongToAlbum("Somewhere I Belong", "3:33");
    meteora.addSongToAlbum("Lying from You", "2:55");
    meteora.addSongToAlbum("Faint", "2:42");
    meteora.addSongToAlbum("Breaking the Habit", "3:16");
    meteora.addSongToAlbum("From the Inside", "2:58");
    meteora.addSongToAlbum("Numb", "3:07");

    Playlist myPlaylist = new Playlist("Relax");
    myPlaylist.addSongToPlayList(1, evolve);
    myPlaylist.addSongToPlayList(3, evolve);
    myPlaylist.addSongToPlayList(2, meteora);
    myPlaylist.addSongToPlayList("Faint", meteora);
    myPlaylist.addSongToPlayList("Numb", meteora);
    myPlaylist.addSongToPlayList(5, meteora);

    play(myPlaylist);
  }

  private static void play(Playlist playlist) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean forward = true;

    LinkedList<Song> currentPlaylist = playlist.getPlaylist();
    ListIterator<Song> listIterator = currentPlaylist.listIterator();

    if (currentPlaylist.size() == 0) {
      System.out.println("No song in the playlist.");
      scanner.close();
      return;
    } else {
      System.out.println("Now playing=> " + listIterator.next().toString());
      printMenu();
    }

    while (!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();

      switch (action) {
        case 0:
          quit = true;
          break;

        case 1:
          if (!forward) {
            if (listIterator.hasNext()) {
              listIterator.next();
            }
            forward = true;
          }

          if (listIterator.hasNext()) {
            System.out.println("Now playing=> " + listIterator.next().toString());
          } else {
            System.out.println("You have reached end of the playlist");
            forward = false;
          }
          break;

        case 2:
          if (forward) {
            if (listIterator.hasPrevious()) {
              listIterator.previous();
            }
            forward = false;
          }

          if (listIterator.hasPrevious()) {
            System.out.println("Now playing=> " + listIterator.previous().toString());
          } else {
            System.out.println("You are at start of the playlist");
            forward = false;
          }
          break;
        
        case 3:
          if (forward) {
            if (listIterator.hasPrevious()) {
              System.out.println("Playing again => " + listIterator.previous().toString());
              forward = false;
            }
            else {
              System.out.println("We are at start of the list");
            }
          } else {
            if (listIterator.hasNext()) {
              System.out.println("Playing again => " + listIterator.next().toString());
              forward = true;
            }
            else {
              System.out.println("We are at end of the list");
            }
          }
          break;

        case 4:
          printPlaylist(playlist);
          break;
        
        case 5:
          if (currentPlaylist.size() > 0) {
            listIterator.remove();

            if (listIterator.hasNext()) {
              System.out.println("Now playing => " + listIterator.next());
            } else if (listIterator.hasPrevious()) {
              System.out.println("Now playing => " + listIterator.previous());
            }
          }
          break;

        case 6:
        default:
          printMenu();
          break;
      }
    }
    scanner.close();
  }

  private static void printPlaylist(Playlist playlist) {
    Iterator<Song> iterator = playlist.getPlaylist().iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  private static void printMenu() {
    System.out.println("Available actions:");
    System.out.println("0 - quit");
    System.out.println("1 - next");
    System.out.println("2 - previous");
    System.out.println("3 - replay");
    System.out.println("4 - playlist");
    System.out.println("5 - remove current song from playlist");
    System.out.println("6 - available options");
  }
}
