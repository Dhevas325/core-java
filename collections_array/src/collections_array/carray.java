package collections_array;

import java.util.Arrays;
import java.util.Comparator;

public class carray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {5,3,10,18,92};// primitive data type -int, float, char, boolean.
        System.out.println("Before sorting:");
        for (int i:arr)
        	System.out.println(i);
        Arrays.sort(arr);
        System.out.println("after sorting");
        for (int i:arr)
        	System.out.println(i);
        
        // non-pritive data type-Array, String, Class, Object, Structure, Linked List.
        String[] b= {"Raja","Chitra","Dhevasun","Kural"};
        System.out.println("Before sorting:");
        for (String i:b)
        	System.out.println(i);
        Arrays.sort(b);
        System.out.println("after sorting");
        for (String i:b)
        	System.out.println(i);
        // comparator in dynamic binding
        Comparator comp=new cmparabledemo();
        Arrays.sort(b,comp);
        System.out.println("****after sorting*****");
        for (String i:b)
        	System.out.println(i);
        
        
	}

}
