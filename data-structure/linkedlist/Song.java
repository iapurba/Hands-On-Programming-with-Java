public class Song {
  private String title;
  private String duration;

  public Song(String title, String duration) {
    this.title = title;
    this.duration = duration;
  }

  public String getTitle() {
    return this.title;
  }

  @Override
  public String toString() {
    return (this.title + "|" + this.duration);
  }
}
