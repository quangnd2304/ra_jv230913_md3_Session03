package ra;

public class JumpDemo {
    public static void main(String[] args) {
        System.out.println("Các số từ 1 đến 10 là:");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.printf("%d\t", i);
        }
        System.out.println("Tổng 2 số là:" + add(10, 5));
    }

    public static int add(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }
}
