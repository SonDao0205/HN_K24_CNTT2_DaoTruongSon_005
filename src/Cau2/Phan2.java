package Cau2;

public class Phan2 {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int sumMax = array[0];
        int sum = array[0];

        for(int i = 1; i < array.length; i++) {
            if(sum + array[i] > array[i]) {
                sum = sum + array[i];
            } else {
                sum = array[i];
            }

            if(sum > sumMax) {
                sumMax = sum;
            }
        }

        System.out.println("Max : " + sumMax);
    }
}