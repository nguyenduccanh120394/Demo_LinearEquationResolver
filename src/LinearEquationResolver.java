import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a =");
        double a = sc.nextDouble();
        System.out.println("Nhap b= ");
        double b = sc.nextDouble();
        if (a!=0&&b!=0){
            double solution = -b/a;
            System.out.printf("The solution is : %f!",solution);
        }else{
            if (b==0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
            }
        }
    }

