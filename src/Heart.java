import java.util.Scanner;

public class Heart {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        for(int i = 1; i < 7; i++) {
            for(int j = 1; j <= 7; j++) {
                if(!((i == 1 && (j == 1 || j == 4 || j == 7))
                        || (i == 4 && (j == 1 || j == 7))
                        || (i == 5 && (j <= 2 || j >= 6))
                        || (i == 6 && (j <= 3 || j >= 5)))) {
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("\n");
        }

    }
}
