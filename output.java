import java.util.Scanner;
public class output {
    public static void main(String[] args) {
        MethodsCurrency m1 = new MethodsCurrency();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select 1 for rupee conversion");
        System.out.println("Select 2 for dollar conversion");
        System.out.println("Select 3 for euro conversion");
        System.out.println("Please enter your option");
        int option = sc.nextInt();
        System.out.println("Please enter amount");
        double amount = sc.nextDouble();

        switch (option){
            case 1:
                m1.rupee(amount);
                break;
            case 2:
                m1.Dollar(amount);
                break;
            case 3:
                m1.euro(amount);
                break;
            default:
                System.out.println("Please enter Valid option");
        }
    }
}
