public class SWAP{
    public static void main(String[] args){
        // Swap Two Variable using third variable
        int a=10;
        int b=14;
        System.out.println(" The value of a ="+ a +" the value of b = " + b);
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("a:"+ a +" b:"+ b +" c:"+ c);
    }
}