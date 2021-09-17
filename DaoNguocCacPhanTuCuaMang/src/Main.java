import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //todo khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter a size");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("size does not exceed 20");
        } while (size > 20);

        //todo nhập giá trị cho các phần tử của mảng
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }

        //todo in ra mảng đã nhập
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        /*todo đảo ngược các phần tử trong mảng
         *todo sử dụng biến trung gian để hoán đổi giá trị giữa 2 phần tủ
         */
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }

        //todo in ra mảng sau khi đã đảo ngược các phần tử
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}