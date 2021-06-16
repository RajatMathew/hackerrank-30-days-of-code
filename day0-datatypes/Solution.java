import java.util.Scanner;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

      
        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        // This is done to avoid errors while using nextLine().
        // Read more at https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
        String c = scan.nextLine();
        
    
        System.out.println((i+a) + "\n" + (d+b) + "\n" + (s.concat(c)));

       
        scan.close();
    }
}