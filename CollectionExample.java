package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>mylist =new ArrayList<String>();
		mylist.add("YRaj");
		mylist.add("Kiran");
		mylist.add("Prem");
		
		
		System.out.println("Before Sorting");
		System.out.println(mylist);
		
		Collections.sort(mylist);
		System.out.println(mylist);
		System.out.println("After Sorting");
		
		Collections.sort(mylist,Collections.reverseOrder());
		System.out.println(mylist);
		
		Stack<String>mystack =new Stack<String>();
		
		mystack.push("abc");
		mystack.push("PQR");
		mystack.pop();
		mystack.push("XYZ");
		
		System.out.println(mystack);
	}

}
