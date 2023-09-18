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
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        String b=new StringBuilder(S).reverse().toString();
        int n=S.length();
        
        int[][] t=new int[n+1][n+1];
        
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(i==0||j==0){
                    t[i][j]=0;
                }
            }
        }
        
        for(int i=1;i<t.length;i++){
            for(int j=1;j<t[0].length;j++){
                if(S.charAt(i-1)==b.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                }else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        
        return t[n][n];
    }
}