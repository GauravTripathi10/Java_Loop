import java.util.Scanner;

public class  Loop2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            //  Factorial of a number
            int n=sc.nextInt();
            int fact=1;
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            System.out.println(fact);
        }
    }
}
