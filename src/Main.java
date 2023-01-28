public class Main {
    public static void main(String[] args) {


        for(int i = 0; i<=4; i++){
            for(int j = 1; j<= (4 - i); j++) {
                System.out.print(" ");

            }
            for(int m = 1 ; m<= (2*i) + 1 ; m++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i = 0 ; i <= 4-1;i++){
            for (int j = 0; j <= (i); j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (2*(4-i)-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }


    }
}
