public class QuickFindUF {
  private int[] id;

  public QuickFindUF(int N) {
    id = new int[N];
    for (int i = 0; i < N; i++) {
      id[i] = i;
    }
  }

  public boolean connected(int p, int q) {
    return id[p] == id[q];
  }

  public void union(int p, int q) {
    int pid = id[p];
    int qid = id[q];
    // change all entries with id[p] to id[q] (atmost 2N + 2 array accesses)
    for (int i = 0; i < id.length; i++) {
      if (id[i] == pid) {
        id[i] = qid;
      }
    }
  }

  public static void main(String[] args) {
    QuickFindUF qf = new QuickFindUF(10);
    qf.union(2, 3);
    qf.union(3, 5);
    for (int i = 0; i < qf.id.length; i++) {
      System.out.println(qf.id[i]);
    }
  }
}