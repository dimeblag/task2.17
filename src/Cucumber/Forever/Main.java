package Cucumber.Forever;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    LInkedList<Integer> list = new LInkedList<Integer>();
        int[] array = {1, 2, 3, 4, 5, 9, 6, 7, 8, 10, 11};
        for (int i = 0; i < array.length; i++) {
            list.addTail(array[i]);
        }
        String listInString = list.toString();
        System.out.println(listInString);

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int search = list.searchElement(n);
        System.out.println(search);
    }
}
