
package com.mycompany.week3_javahw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewClass {
    
    
    boolean isPrime(int n){
       
        for(int i=2; i<n; i++){
            if(n%i == 0) 
            {
                return false;
            }  
        }
        return true;
    }

    int getPrimeSum(int[] nums){
        int sm=0;
        for(int i=0; i<nums.length; i++){
            if(isPrime(nums[i])){
                sm+=nums[i];
            }
        }
        return sm;
    }
    
    int[] getArrayFromFile(String fl) throws FileNotFoundException{
        Scanner sc= new Scanner( new File(fl));
        while(sc.hasNext()){
         
        }
           // int[] arr=new int[10];
        
       // return arr;
    }
    
    public static void main(String[] args) {
        NewClass nc= new NewClass();
        int[] textFile= new int [5];
        Scanner sc = new Scanner( ‪"C:\Users\itlabs\Desktop\Week3Hw_TextFile.txt" );
        int sum= nc.getPrimeSum(textFile);
        System.out.println("The text file has this sum of prime numbers"+ item); 
    }
}

