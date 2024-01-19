package ra;

public class ForeachDemo {
    public static void main(String[] args) {
        int[] arrInt = {1, 3, 5, 7, 9};
        //In giá trị các phần tử mảng
        System.out.println("Giá trị các phần tử trong mảng là:");
        for (int element : arrInt) {
            System.out.printf("%d\t", element);
        }
    }
}
