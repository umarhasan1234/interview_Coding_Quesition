package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniqueElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element  in array");
		List<Integer> ar=new ArrayList<>();
		ar.add(23);
		ar.add(39);
		ar.add(19);
		ar.add(39);
		ar.add(23);
		ar.add(100);
		System.out.println(ar);
		 List<Integer> num=ar.stream().distinct().collect(Collectors.toList());
		System.out.println(num);
	}

}
