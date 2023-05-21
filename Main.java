import java.util.Scanner;

public class Main{
    static int multiplyNumber(int num1, int num2){
        return num1 * num2;
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the number 1: ");
            int n1 = in.nextInt();
            System.out.print("Enter the number 2: ");
            int n2 = in.nextInt();


            System.out.println("The result of multiplication of two number is: ");
            System.out.println(multiplyNumber(n1, n2));
        }
        
    }
}