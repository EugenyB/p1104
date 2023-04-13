import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Main2 main = new Main2();
        main.run();
    }

    private void run() {
        List<String> list = new ArrayList<>(List.of("first", "second", "last", "very last"));
        System.out.println(list);
        System.out.println(list.get(2));  // System.out.println(list[2]);
        list.set(3, "fourth");            // list[3] = "fourth";
        System.out.println(list);

        List<String> strings = List.of("Jack", "John", "Sara", "Donald", "Maria", "Bill", "John");
        System.out.println(strings);
        Set<String> set = new HashSet<>(strings);
        System.out.println(set);

        Set<Integer> intSet = new HashSet<>(List.of(20,1,2,3,8,4,15,6,7,20,9));
        System.out.println(intSet + " " + intSet.size());
        intSet.add(18);
        System.out.println(intSet + " " + intSet.size());
        intSet.add(30);
        System.out.println(intSet + " " + intSet.size());
        intSet.add(35);
        System.out.println(intSet + " " + intSet.size());

        Set<String> sorted = new TreeSet<>(strings);
        System.out.println(sorted);

        List<Person> people = List.of(
                new Person("John", 25),
                new Person("Jack", 30),
                new Person("Maria", 23),
                new Person("Jack", 23),
                new Person("Bill", 40)
        );

        Set<Person> personSet = new TreeSet<>(people);
        System.out.println(personSet);

        PriorityQueue<Integer> nums = new PriorityQueue<>(Comparator.reverseOrder());
        nums.add(7);
        nums.add(5);
        nums.add(10);
        nums.add(8);
        nums.add(6);
        nums.add(1);
        nums.add(12);
        nums.add(2);
        nums.add(4);

        System.out.println(nums);
        System.out.println(nums.poll());
        System.out.println(nums);
    }
}
