/*print the following pattern 
                         1
                        232
                       34543
                      4567654
                     567898765
                      4567654
                       34543
                        232
                         1                   */

                         public class pattern26 {
                            public static void main(String[] args){
                                
                                for(int i=1;i<=5;i++){
                                    for(int j=1;j<=5-i;j++){
                                        System.out.print(" ");
                                    }
                                    int p=i;
                                    for(int j=1;j<=i;j++){
                                        System.out.print(p);
                                        p=p+1;
                            
                                    }
                                    int q=(2*i)-2;
                                    for(int j=1;j<=i-1;j++){
                                        System.out.print(q);
                                        q=q-1;
                                    }
                                    System.out.println();
                                }
                                for(int i=1;i<=4;i++){
                                    for(int j=1;j<=i;j++){
                                        System.out.print(" ");
                                    }
                                    int p=5-i;
                                    for(int j=1;j<=5-i;j++){
                                        System.out.print(p);
                                        p=p+1;
                                    }
                                    int q=8-(2*i);
                                    for(int j=1;j<=4-i;j++){
                                        System.out.print(q);
                                        q=q-1;
                                    }
                                    System.out.println();
                                }
                            }
                        }
                        