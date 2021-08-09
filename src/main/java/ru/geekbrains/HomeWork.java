package ru.geekbrains;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HomeWork {


    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,7,8};
        int [] arr1 = {1,1,1,1,1,1,1,1};
        System.out.println(Arrays.toString(arrayAfter(arr)));
        System.out.println(search(arr1));
    }
    public static int[] arrayAfter(int[] arr){

        int[] arrNew ;

        int indexLast = 0;

        boolean have4 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==4){
                indexLast=i;
                have4 = true;
            }

        }
        if (0 == indexLast && have4 == false) {
            throw new RuntimeException("Нет четверок");
        }
        arrNew = Arrays.copyOfRange(arr,indexLast+1, arr.length);



        return arrNew;
    }

    public static boolean search (int[] arr){
        boolean have1 = IntStream.of(arr).anyMatch(x-> x==1);
        boolean have4 = IntStream.of(arr).anyMatch(x-> x==4);

return have1 && have4;
    }
}