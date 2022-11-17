//typecasting in java 

import java.util.*;
public class Tyc1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //implicit type casting--smaller data type to bigger data type 
        
        int x='a'; //char value to int 
        System.out.println(x); //97

        double d=10; //int value to double 
        System.out.println(d); //10.0

        long l=12; //int type data in long 
        System.out.println(l); //12

        float p=12369874;  //long data type in float 
        System.out.println(p); //1.2369874E7

        double r=1.2; //float type data in double 
        System.out.println(r);  //1.2

        //explicit type casting--bigger data type to smaller data type 

        int y=125;
        System.out.println(y); //125
        byte b=(byte)y; //conversion of int to byte 
        System.out.println(b);   //125

        int z=139;
        System.out.println(z); //139
        System.out.println((byte)z); //-117

        



    }
}
