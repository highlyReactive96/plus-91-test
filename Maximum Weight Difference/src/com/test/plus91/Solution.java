package com.test.plus91;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	 private static int calMaxWeightDifference(int N, int K, int[] weightsarr) {
	        Arrays.sort(weightsarr); 
	        int sonWeight= 0;
	        int chefWeight = 0;
	        
	        for (int i = 0; i < K; i++) {
	            sonWeight += weightsarr[i];
	        }
	        for (int i = 0; i < N; i++) {
	            chefWeight += weightsarr[i];
	        }
	        int diff = chefWeight - sonWeight;
	        return diff ; 
	    }
	   
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        int T = scanner.nextInt();

	        
	        for (int t = 0; t < T; t++) {
	           
	            int N = scanner.nextInt();
	            int K = scanner.nextInt();

	            
	            int[] weightsarr = new int[N];
	            for (int i = 0; i < N; i++) {
	                weightsarr[i] = scanner.nextInt();
	            }

	   
	            int maxDifference = calMaxWeightDifference(N, K, weightsarr);

	            
	            System.out.println(maxDifference);
	        }

	        scanner.close();
	    }
	    	
	    }
	    

	    
	




































