// Write a Java method to count all vowels in a string

import java.util.*;
public class Pra4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String p=sc.nextLine();
        System.out.println(count(p));
    }
    public static int count(String p){
        int count=0;
        for(int i=0;i<p.length();i++){
            char r=p.charAt(i);
            if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'||r=='A'||r=='E'||r=='I'||r=='O'||r=='U'){
                count++;
            }
        }
        return count;
    }
}
