package basics;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the range:");
            int l=sc.nextInt();
            int h=sc.nextInt();
            int pos=0;
            for(int i=l;i<=h;i++){
                int n=i;
                int temp=n;
                int sum=0;
                int count=0;
                while(n>0){
                    n/=10;
                    count++;
                }
                n=temp;
                while(n>0){
                    int r=n%10;
                    sum+=(int)(Math.pow(r,count));
                    n/=10;
                }
                if(sum==temp){
                    pos++;
                    if(pos%2==0){
                        System.out.println(temp+" BASICS.Armstrong");
                    }
                }
            }
        }
    }
