package Cau3;

import java.util.Scanner;

public class Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phẩn tử : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("Nhập phần tử thứ %d : ",i+1);
            array[i] = sc.nextInt();
        }
        System.out.print("Nhập S : ");
        int s = sc.nextInt();
        boolean flag = false;
        int firtsIndex = 0;
        int secondIndex = firtsIndex + 1;
        int sum = array[firtsIndex];
        while (secondIndex < n) {
            sum += array[secondIndex];
            if(sum != s){
                secondIndex++;
            }else{
                System.out.printf("[%d,%d]\n",firtsIndex,secondIndex);
                flag = true;
                break;
            }
            if(secondIndex == n){
                firtsIndex++;
                secondIndex = firtsIndex + 1;
                sum = array[firtsIndex];
            }
        }
        if(!flag){
            System.out.println("-1");
        }
    }
}
