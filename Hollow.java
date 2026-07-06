import java.util.*;
public class Hollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers of rows:");
        int row = sc.nextInt();
        System.out.println("enter the valuse of coloumn:");
        int coloumn=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=coloumn;j++){
                if (i==1 || j==1|| i==4 || j==5) {
                    System.out.print("*");
                }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

