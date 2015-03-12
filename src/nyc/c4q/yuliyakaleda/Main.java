package nyc.c4q.yuliyakaleda;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter count from: ");
        int Num1 = input.nextInt();
        System.out.print("Enter count to: ");
        int Num2 = input.nextInt();
        System.out.print("Enter count by: ");
        int Num3 = input.nextInt();

	    for (int i = Num1; i <= Num2; i+=Num3) {
            System.out.print(i + " ");
        }
    }
}
