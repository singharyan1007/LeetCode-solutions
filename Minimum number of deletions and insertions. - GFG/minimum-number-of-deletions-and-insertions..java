//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    int n=str1.length();
	    int m=str2.length();
	    int[][] t=new int[n+1][m+1];
	    
	    for(int i=0;i<t.length;i++){
	        for(int j=0;j<t[0].length;j++){
	            if(i==0||j==0)t[i][j]=0;
	        }
	    }
	    
	    for(int i=1;i<t.length;i++){
	        for(int j=1;j<t[0].length;j++){
	            if(str1.charAt(i-1)==str2.charAt(j-1)){
	                t[i][j]=t[i-1][j-1]+1;
	            }else{
	                t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
	            }
	        }
	    }
	    int del=str1.length()-t[n][m];
	    int ins=str2.length()-t[n][m];
	    
	    return del+ins;
	} 
}