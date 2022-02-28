package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class JavaApplication1 {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt();
        int t =0;
        String s = "YES";
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            num.add(in.nextInt());
        }
                num.add(0,-1);
                num.add(-1);
                for(int i=2 ; i<=n ; i++){
                    t=0;
                    int dd = num.get(i);
                    int ff =num.get(i-1);
                    if(dd==ff){
                        for(int k=0 ; k<=num.size()-2 ;k++){
                            int a= num.get(k);
                            int b =num.get(k+1);
                            int c = num.get(i);
                            if(a!=c && b != c){
                                num.add(k+1,num.get(i));
                                num.remove(i);
                                i--;
                                t=1;
                                break;
                            }
                        }
                        if(t==0){
                            s = "NO";
                            break;
                        }
                    }
                }
            System.out.println(s);
        }
}