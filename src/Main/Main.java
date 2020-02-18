package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import Model.Employee;

public class Main {
	public static void main(String[] args) {
		// Task 1 and 2
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		reverseList(list).stream().forEach(System.out::println);
//		System.out.println(minList(list));
//		System.out.println(maxList(list));
		
		// Task 3
//		int[] arr = new int[] {1, 2, 3};
//		reverseIntArray(arr).stream().forEach(System.out::println);
		
		// Task 4
		char[] charArr = new char[] {'a', 'b', 'c', 'd', 'e'};
		
		// Task 5
		// Task 5
		// Create a class Employee with this constructor
		// public Employee(int id, String name, int age, int salary)
		// Create a list of 5 employees
		// sort list by age with comparable
		// then create 3 comparators [ageComparator, SalaryComparator, NameComparator]
		// Sort the list of employee again with comparator
		List<Employee> empList = new LinkedList<Employee>();
		empList.add(new Employee(0, "John", 24, 40000));
		empList.add(new Employee(1, "Dave", 26, 40000));
		empList.add(new Employee(2, "Mary", 44, 40000));
		empList.add(new Employee(3, "Katy", 31, 40000));
		empList.add(new Employee(4, "Joe", 18, 40000));
		
		empList.stream().sorted().forEach(e -> System.out.println(e.toString()));



	}

	// Task 1
	// Reverse an ArrayList in one line
	public static List<Integer> reverseList(List<Integer> list) {
		Collections.reverse(list);
		return list;
	}

	// Task 2
	// findMin and findMax of ArrayList in one line
	public static int minList(List<Integer> list) {
		return Collections.min(list);
	}

	public static int maxList(List<Integer> list) {
		return Collections.max(list);
	}
	
	// Task 3
	// Reverse an array by using Stack
	public static List<Integer> reverseIntArray(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0 ; i < arr.length ; i++) {
			stack.push(arr[i]);
		}
		
		while (!stack.isEmpty())
			result.add(stack.pop());
		
		return result;
	}
	
	// Task 4
	// abcde -> edcbaabcde
	public static char[] reverseAddFront(char[] chars) {
		Deque<Character> dq = new LinkedList<Character>();
		
		for (int i = 0; i < chars.length; i++) {
			dq.addFirst(chars[i]);
			dq.addLast(chars[i]);
		}
		
		return chars;
	}
	
	// Task 5
	// Create a class Employee with this constructor
	// public Employee(int id, String name, int age, int salary)
	// Create a list of 5 employees
	// sort list by age with comparable
	// then create 3 comparators [ageComparator, SalaryComparator, NameComparator]
	// Sort the list of employee again with comparator
	
	
	
}
