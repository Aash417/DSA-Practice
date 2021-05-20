package arrays;

import java.util.ArrayList;

public class ArrayL {

    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i]+" ");
        }

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(50);
        al.add(70);
        al.size();
        
        System.out.println(al);
    }
}