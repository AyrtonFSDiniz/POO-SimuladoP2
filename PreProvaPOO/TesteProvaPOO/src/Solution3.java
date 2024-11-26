import java.util.Scanner;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class Mycalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if (n % i == 0){
                sum += i;
            }
        }

        return sum;
    };

}



public class Solution3 {
    public static void main (String[] args){
        Mycalculator calc = new Mycalculator();
        Scanner scanner = new Scanner(System.in);

        int data = scanner.nextInt();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(calc.divisor_sum(data));
    }

}
