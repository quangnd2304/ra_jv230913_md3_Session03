package ra;

import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        //B1: Nhập vào 3 số
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất:");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số thứ hai:");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số thứ ba:");
        int number3 = Integer.parseInt(scanner.nextLine());
        //B2: Tìm số max và số min
        int min = number1, max = number1;
        if (min > number2) {
            min = number2;
        }
        if (min > number3) {
            min = number3;
        }
        if (max < number2) {
            max = number2;
        }
        if (max < number3) {
            max = number3;
        }
        int mid;
        if (min != number1 && max != number1) {
            mid = number1;
        } else if (min != number2 && max != number2) {
            mid = number2;
        } else {
            mid = number3;
        }
        //B3: In ra sắp xếp giảm dần
        System.out.printf("Sắp xếp giảm dần: %d\t%d\t%d\n", max, mid, min);
    }
}
