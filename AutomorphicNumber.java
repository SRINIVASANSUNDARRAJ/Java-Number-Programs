package basics;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First value :");
        int l = sc.nextInt();
        System.out.print("Enter the Last value :");
        int h = sc.nextInt();
        int pos=0;
        for(int i=l;i<=h;i++){
            int temp=i;
            int square=temp*temp;
            int count=0;
            while(temp>0){
                count++;
                temp/=10;
            }
            int a=(int)Math.pow(10,count);
            int b=square%a;
            if(i==b) {
                pos++;
                if(pos%3==0) System.out.println(i+" automorphic Number");
            }
        }
    }
}