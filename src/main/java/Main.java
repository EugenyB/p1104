import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PriorityQueue<Time> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(new Time(in.nextInt(), in.nextInt(), in.nextInt()));
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

class Time implements Comparable<Time> {
    int h;
    int m;
    int s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public String toString() {
        return h + " " + m + " " + s;
    }

    @Override
    public int compareTo(Time other) {
        int k = Integer.compare(h, other.h);
        if (k!=0) return k;
        k = Integer.compare(m, other.m);
        if (k!=0) return k;
        return Integer.compare(s, other.s);
    }
}
