/*print the following pattern 
                1
              2 3 2
            3 4 5 4 3
          4 5 6 7 6 5 4
        5 6 7 8 9 8 7 6 5                 */

public class pattern21{
  public static void main(String[] args){
   
    for(int i=1;i<=5;i++){
      
      for(int j=1;j<=5-i;j++){
        System.out.print(" ");
      }
      int p=i;
      for(int j=1;j<=i;j++){
        System.out.print(p+"");
        p=p+1;
      }
      int q=(2*i)-2;
      for(int j=1;j<=i-1;j++){
        System.out.print(q+"");
        q=q-1;
      }
      
      System.out.println();
    }
  }
}