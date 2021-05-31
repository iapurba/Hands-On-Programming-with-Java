import java.util.Arrays;

public class QuickUnionUF {
  private int[] id;
  private int[] sz;

  public QuickUnionUF(int N) {
    id = new int[N];
    sz = new int[N];
    for (int i = 0; i < N; i++)
      id[i] = i;

    for (int i = 0; i < N; i++) {
      sz[i] = 1;
    }
  }

  private int root(int i) {
    while (i != id[i])
      i = id[i];
    return i;
  }

  public boolean connected(int p, int q) {
    return root(p) == root(q);
  }

  public void union(int p, int q) {
    int i = root(p);
    int j = root(q);
    if ( i == j) return;
    if (sz[i] < sz[j]) {
      id[i] = j;
      sz[j] += sz[i];
    }
    else {
      id[j] = i;
      sz[i] += sz[j];
    }
  }

  public static void main(String[] args) {
    QuickUnionUF qu = new QuickUnionUF(10);
    qu.union(4, 3);
    qu.union(3, 8);
    qu.union(6, 5);
    qu.union(9, 4);
    qu.union(2, 1);
    qu.union(5, 0);
    qu.union(7, 2);
    qu.union(6, 1);
    qu.union(7, 3);
    System.out.println("ID = " + Arrays.toString(qu.id));
    System.out.println("SZ = " + Arrays.toString(qu.sz));
  }
}

