//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int R, int C) {
        // code here      
        int n=R*C;
        int len=n/2;
        //since arr has odd number of elements so median is always n/2 
        
        int start=1;
        int end=2000;
        while(start<=end){
            int assumedMedian=start+(end-start)/2;
            //This basically the number of elements less than median
            //k -> number of lesser elements
            int lesserElements=findNumber(matrix,assumedMedian);
            
            if(lesserElements<=len){
                start=assumedMedian+1;
                
            }else{
                end=assumedMedian-1;
            }
            
        }
        return start;
        
    }
    
    static int findNumber(int[][] matrix, int k){
        int countStarts=0;
        for(int i=0;i<matrix.length;i++){
            //apply bs row by row to find number of elements smaller than k
            int start=0;
            int end=matrix[i].length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(matrix[i][mid]<=k){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            countStarts+=start;
            
            
        }
        return countStarts;
    }
}