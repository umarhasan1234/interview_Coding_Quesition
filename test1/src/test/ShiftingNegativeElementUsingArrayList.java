package test;
import java.util.*;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class ShiftingNegativeElementUsingArrayList {
	public static void main(String[] args) {
		
		
		        int[] array = {5, 3, -6, 58, 0, -76, -3, 0, 1, -4, 0};

		        List<Integer> negatives = new ArrayList<>();
		        List<Integer> nonNegatives = new ArrayList<>();

		        for (int num : array) {
		            if (num < 0) {
		                negatives.add(num);
		            } else {
		                nonNegatives.add(num);
		            }
		        }

		        List<Integer> result = new ArrayList<>(negatives);
		        result.addAll(nonNegatives);

		        int[] convertedArray = new int[result.size()];
		        for (int i = 0; i < result.size(); i++) {
		            convertedArray[i] = result.get(i);
		        }

		        for (int num : convertedArray) {
		            System.out.print(num + " ");
		        }
		    }
		}
