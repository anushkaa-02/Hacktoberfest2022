// Frquency of charecter in string

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a String : ");
         String s1 = sc.nextLine();
         
         int[] freq = new int[256];
         Arrays.fill(freq,0);
         for(int i=0;i<s1.length();i++){
             freq[s1.charAt(i)]++;
         }
         System.out.print("The non repeating characters are : ");
        for (int i=0;i<256;i++){
            if (freq[i]>0){	//finding the character whose frequency i
	            System.out.println("Frequency of "+(char) i + " is "+frq[i]);
            }
        }
    }
}
