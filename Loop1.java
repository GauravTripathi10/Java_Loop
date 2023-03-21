import java.util.Scanner; 

public class Loop1{
    public static void main(String[] args){
        // Sum of n terms
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum); 
    }
}