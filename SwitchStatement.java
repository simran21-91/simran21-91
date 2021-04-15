import java.util.Scanner;

public class SwitchStatement {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1=input.nextInt();
        System.out.println("Enter number 2:");
        int num2=input.nextInt();
        System.out.println("Enter a choice");
        int choice=input.nextInt();

        switch (choice) {
            case 1:
                int add = num1 + num2;
                System.out.println("Sum of two numbers is: " + add);
                break;

            case 2:
                double sub=num1-num2;
                System.out.println("Difference of two numbers is :" + sub);
                break;

                case 3:
                    int mul=num1*num2;
                    System.out.println("Product of two nos is :" + mul);
                    break;


            case 4:
                int div=num1/num2;
                System.out.println("Division of two numbers is: "+ div);
                break;
            default:
                System.out.println("Invalid choice! Choose another choice");


        }


    }
}
