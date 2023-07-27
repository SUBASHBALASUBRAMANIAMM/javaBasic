package arrayy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int[] arr = new int[5];
       arr[0] = 1;
       arr[1] = 2;
       int[] arr2 = {1,2,3,4,5};
       arr2[1] = 0;
       int[] arr3 = new int[]{1,2,3,4,5,6};
       int nu = arr.length;
        System.out.println(nu);
        System.out.println(Arrays.toString(arr3));
        char[] ch = {'a','b','c'};
        String x = new String(ch);
        System.out.println(x);
        System.out.println(Arrays.toString(ch));


    }
}
