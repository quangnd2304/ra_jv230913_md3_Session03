package ra;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        //Viết chương trình nhập vào các số nguyên, kết thúc khi nhập 0 và in ra tổng các số vừa nhập
        int sum = 0;
        int number = 1;
        Scanner scanner = new Scanner(System.in);
        while (number != 0) {
            System.out.println("Nhập vào số nguyên:");
            number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        System.out.println("Tổng các số vừa nhập là: " + sum);
        //vòng lặp vô hạn
        int a=10;
        while (a!=0){
            System.out.println("a là "+a);
        }
    }
}
