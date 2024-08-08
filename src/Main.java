import java.util.*;

import static java.util.Collections.min;
import static java.util.Collections.sort;
import static java.util.List.*;

public class Main {

    private static final List<Integer> nums = new ArrayList<>(of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(of("один", "два", "два", "три", "три", "три"));


    public static void main(String[] args) {
        hello();
        task1();
        task2();
        task3();
        task4();
    }

    public static void hello() {
        System.out.println("Привет, наставник!");
    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        sort(nums);
        int doubleDelete = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && doubleDelete != num) {
                System.out.println(num);
                doubleDelete = num;
            }
        }
    }

    public static void task3() {
        Set<String> strings1 = new HashSet(strings);
        System.out.println(strings1);
    }

    public static void task4() {
        sort(strings);
        int currentCount = 1;
        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).equals(strings.get(i - 1))) {
                currentCount++;
            } else {
                String fff = strings.get(i - 1) + " - " + currentCount;
                System.out.println(fff);
                currentCount = 1;
            }
        }
        String print = strings.get(strings.size() - 1) + " - " + currentCount;
        System.out.println(print);
    }
}

