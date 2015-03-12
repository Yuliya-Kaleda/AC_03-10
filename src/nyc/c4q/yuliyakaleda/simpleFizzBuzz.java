package nyc.c4q.yuliyakaleda;

/**
 * Created by olgakoleda on 3/10/15.
 */
public class simpleFizzBuzz {
    public static void main (String[] args) {
        for (int i = 1; i <=100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i%3==0) {
                System.out.println("Fizz");
                continue;
            }
            if (i%5==0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }
}
