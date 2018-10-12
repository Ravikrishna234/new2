public class Taxicab implements Comparable<Taxicab> {
    public final int i;
    public final int j;
    public final long sum;
    Taxicab(int i, int j) {
        this.sum = (long) i*i*i + (long) j*j*j;
        this.i = i;
        this.j = j;
    }
    public int geti() {
        return this.i;
    }
    public int getj() {
        return this.j;
    }
    public long getsum() {
        return this.sum;
    }

    // compare by i^3 + j^3, breaking ties by i
    public int compareTo(Taxicab that) {
        if (this.sum < that.sum) {
            return -1;
        }
        else if (this.sum > that.sum) {
            return 1;
        }
        else if (this.i < that.i) {
            return -1;
        }
        else if (this.i > that.i) {
             return 1;
         }
        else {
            return 0;
        }
    }

    public String toString() {
        return sum + "" ;
    }

}