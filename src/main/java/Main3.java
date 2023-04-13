import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Main3 main = new Main3();
        main.run();
    }

    private void run() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // <число,кількість>
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (map.containsKey(x)) {
                Integer k = map.get(x);
                map.put(x, k+1);
            } else {
                map.put(x, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
