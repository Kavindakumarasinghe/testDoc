package test.pkg2;
import java.util.*;

public class Test2 {
    
    public static void main(String[] args) {
        System.out.print("************************************************* Complex Answer ********************************************************");
        System.out.println();
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Input cols : ");
        int cols = sc.nextInt();
                
        System.out.print("Input rows : ");
        int rows = sc.nextInt();
        
        System.out.print("Input max  : ");
        int max = sc.nextInt();
        
        System.out.print("*************************************************************************************************************************");

        System.out.println();
        
        int mainRows = max / cols + (max % cols > 0 ? 1 : 0);
        
        for (int iter = 0; iter < mainRows; iter++) {
            for (int i = 1; i <= rows; i++) {
                for (int j = iter * cols + 1; j <= Math.min(max, (iter + 1) * cols); j++) {
                    System.out.print(j + " * " + i + " = "  +(i * j) + "\t\t");
                }
                System.out.println();
            }
           
        System.out.println("*************************************************************************************************************************");
        }
    }
    
}
