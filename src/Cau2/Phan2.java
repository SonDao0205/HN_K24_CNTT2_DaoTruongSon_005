package Cau2;

public class Phan2 {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int max = array[0];
        boolean flag = false;
        int left = 0;
        int sum = array[left];
        int right = left +1;
        int i = 1;
        while(right < array.length){
            System.out.println("turn : " + i++);
            sum += array[right];
            if(right >= array.length){
                left++;
                right = left + 1;
                sum = array[left];
            }
        }
        System.out.println("Max  : " + max);
    }
}