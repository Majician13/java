import java.util.Scanner;

public class MathAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number: ");
        double A = sc.nextDouble();
        System.out.println("Input Second Number: ");
        Double B = sc.nextDouble();
        System.out.println("Input Operation (IE: 1:+, 2:-, 3:*, 4:/): ");
        int operator = sc.nextInt();

        sc.close();

        switch (operator) {
            case 1:
                double total = A + B;
                System.out.println(total);
                break;
            case 2:
                total = A - B;
                System.out.println(total);
                break;
            case 3:
                total = A * B;
                System.out.println(total);
                break;
            case 4:
                total = A / B;
                System.out.println(total);
                break;
        }

        
        
    }
}
