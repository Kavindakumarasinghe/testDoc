package test1;

public class Test1 {
      public static void main(String[] args) {
          
        System.out.print("********************************Simple Answer****************************************\n");
        int cols = 3;
        int max  = 9;
               
        int mainRows = max / cols + (max % cols > 0 ? 1 : 0);
              
        for (int iter = 0; iter < mainRows; iter++) {
            for (int i = 1; i <= 9; i++) {
                for (int j = iter * cols + 1; j <= Math.min(max, (iter + 1) * cols); j++) {
                    System.out.print(j + " * " + i + " = "  +(i * j) + "\t\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
