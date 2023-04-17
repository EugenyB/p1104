import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        List<String> animals = List.of("elephant", "lion", "giraffe", "zebra", "deer");
        System.out.println(animals);
        Set<String> animalsSet = new HashSet<>(animals);
        System.out.println(animalsSet);

        Set <Integer> sevens = new HashSet<>(List.of(7, 7, 7, 77, 777, 7777, 77777, 9));
        System.out.println(sevens + " " + sevens.size());
        sevens.add(70);
        System.out.println(sevens + " " + sevens.size());
        sevens.add(700);
        System.out.println(sevens + " " + sevens.size());
        sevens.add(7000);
        System.out.println(sevens + " " + sevens.size());

        Set<String> animalsSorted = new TreeSet<>(animals);
        System.out.println(animalsSorted);

        List<Dish> menu = List.of(
                new Dish("Ice-cream", 40.17),
                new Dish("Sandwich", 50.50),
                new Dish("Mashed potato", 35.90),
                new Dish("Soup", 70.80),
                new Dish("Pizza", 130.50)
        );

        Set<Dish> menuSet = new TreeSet<>(menu);
        System.out.println(menuSet);

        PriorityQueue<Integer> years = new PriorityQueue<>(Comparator.reverseOrder());
        years.add(2023);
        years.add(2010);
        years.add(2021);
        years.add(2014);
        years.add(2003);
        years.add(2022);
        years.add(2019);
        years.add(2020);
        years.add(2000);

        System.out.println(years);
        System.out.println("Queue's head: " + years.poll()); // This method returns the element at the front
        System.out.println(years);
    }

    private void run2() {
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
