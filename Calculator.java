import java.util.*;
public class Calculator {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter 1st value:");
     int a=sc.nextInt();
     System.out.println("enter 2nd value:");
     int b=sc.nextInt();
     System.out.println("choose a button:");
     int button=sc.nextInt();
     int sum = (a+b);
     int subs = (a-b);
     int multi = (a*b);
     int module = (a%b);
     double div = (a/b);
     switch (button) {
        case 1:
            System.out.println("addition is:");
            System.out.println(sum);
            break;
        case 2:
            System.out.println("substraction is:");
            System.out.println(subs);
            break;
        case 3:
            System.out.println("multiplications is:");
            System.out.println(multi);
            break;
        case 4:
            System.out.println("reminder is:");
            System.out.println(module);
            break;
        case 5:
            System.out.println("division is:");
            System.out.println(div);
            break;
        default:
            System.out.println("choose a valid button");
     }  
    }
}
