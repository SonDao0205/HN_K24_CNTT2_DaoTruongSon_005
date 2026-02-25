package Cau2;

import java.util.Scanner;

public class Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int k;
        System.out.print("số phần tử trong mảng : ");
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d : ",i + 1);
            array[i] = sc.nextInt();
        }
        do {
            System.out.print("nhập k : ");
            k = sc.nextInt();
            if(k > n){
                System.out.println("K không được lớn hơn phần tử mảng!");
            }
        }while(k > n);

        for (int i = 0; i < k; i++) {
            int temp = array[n - 1];
            for (int j = n - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }


        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
