package ra;

public class ForDemo {
    public static void main(String[] args) {
        //In ra các số chẵn từ 1 đến 20
        System.out.println("Các số chẵn trong khoảng 1-20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\t", i);
            }
        }
        //Tìm điểm trung bình trong khoảng 0-10
        int i, j;
        for (i = 0, j = 10; i < j; i++, j--) {
            //i=1, j=10
            //i=2, j=9
            //i=3, j =8
            //i=4, j=7
            //i=5, j=6

        }
        System.out.println("\nĐiểm trung bình: " + i);
        //In ra các số lẻ từ 1 đến 20, không sử dụng if
        //k=k+2
        System.out.println("Các số lẻ từ 1-20 là:");
        for (int k = 1; k <= 20; k += 2) {
            System.out.printf("%d\t", k);
        }
        System.out.printf("\n");
        // In ra các số chia hết cho 3 từ 20-1
        System.out.println("Các số chia hết cho 3 trong khoảng 20-1:");
        for (int k = 20; k >= 1; k--) {
            if (k % 3 == 0) {
                System.out.printf("%d\t", k);
            }
        }
    }
}
