/*print the following pattern 
                1
              2 3 2
            3 4 5 4 3
          4 5 6 7 6 5 4
        5 6 7 8 9 8 7 6 5                 */

        class Pattern21{
            public static void main(String args[]){
            int i, space, rows, k=0, count = 0, count1 = 0;
            rows=5;
            for(i=1; i<=rows; ++i) {
            for(space=1; space <= rows-i; ++space) {
             System.out.print("  ");
             ++count;
            }
            while(k != 2*i-1) {
            if (count <= rows-1) {
            System.out.print(" "+(i+k));
            ++count;
            }
            else{
            ++count1;
            System.out.print(" "+(i+k-2*count1));
            }
            ++k;
            }
            count1 = count = k = 0;
            System.out.print("\n");
            }
            }
}