import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        // Print the sum of all even & odd numbers in a range seperately.
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int evenSum=0;
        int oddSum=0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                evenSum=evenSum+i;
            }
            else{
                oddSum=oddSum+i;
            }
        }
        System.out.println("The Sum of Even numbers : "+evenSum);
        System.out.println("The Sum of odd numbers : "+oddSum);
    }
    
}
