import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // Accept a number and check if it a perfect number or not.
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
              sum=sum+i;
            }
        }
        System.out.println(sum);
        if(sum==num){
            System.out.println("Perfect Number!");
        }
    }
}
