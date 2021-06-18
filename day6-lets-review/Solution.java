import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    
    
    Scanner scan = new Scanner(System.in);
    
    int t = Integer.parseInt(scan.nextLine());

    for (int j=0; j<t; j++)
    {
        String s = scan.nextLine();
        String s_odd = "";
        String s_even = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 == 0) {
                s_even += s.charAt(i);
            }
            else {
                s_odd += s.charAt(i);
            }
        }
        System.out.println(s_even + " " + s_odd);
    
    }
    
}
}