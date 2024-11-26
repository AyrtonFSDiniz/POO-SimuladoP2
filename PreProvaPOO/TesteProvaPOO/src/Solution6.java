import java.util.ArrayList;
import java.util.Scanner;

class Student {}
class Rockstar {}
class Hacker {}

public class Solution6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Object> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String s = sc.nextLine();
            if (s.equals("Student")) {
                people.add(new Student());
            } else if (s.equals("Rockstar")) {
                people.add(new Rockstar());
            } else if (s.equals("Hacker")) {
                people.add(new Hacker());
            }
        }

        int studentCount = 0, rockstarCount = 0, hackerCount = 0;

        for (Object person : people) {
            if (person instanceof Student) {
                studentCount++;
            } else if (person instanceof Rockstar) {
                rockstarCount++;
            } else if (person instanceof Hacker) {
                hackerCount++;
            }
        }

        System.out.println(studentCount + " " + rockstarCount + " " + hackerCount);
    }
}
