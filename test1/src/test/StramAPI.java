package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StramAPI {
	public static void main(String[] args) {
     List<Integer> num= Arrays.asList(-4,85,0,95,95,-8,-3);
		
		//distinct method use
		List<Integer> unique=num.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
		//filter method (use for filtering the record)
		List<Integer>even=num.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		//maximun finding 
		Integer max=num.stream().max(Integer::compare).get();
		System.out.println(max);
		
		//Minimum finding 
		Integer min=num.stream().min(Comparator.naturalOrder()).get();
		System.out.println(min);
		
		// Map method (use for performing operation on all data)
		List<Integer> all=num.stream().map(x->x*2).collect(Collectors.toList());
		System.out.println(all);
		
		List<Integer> sort=num.stream().sorted().collect(Collectors.toList());
		System.out.println(sort);
	}

}
