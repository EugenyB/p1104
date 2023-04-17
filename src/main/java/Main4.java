import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        Main4 main = new Main4();
        main.run();
    }

    private void run() { // Problem "I've been everywhere"
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-->0) {
            int m = Integer.parseInt(in.nextLine());
            Set<String> cities = new HashSet<>();
            for (int i = 0; i < m; i++) {
                String city = in.nextLine();
                cities.add(city);
            }
            System.out.println(cities.size());
        }
    }
}
