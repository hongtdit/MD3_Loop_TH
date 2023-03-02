import java.util.Scanner;
public class th4 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        n1 = input.nextInt();
        System.out.println("Enter b: ");
        n2 = input.nextInt();
        int gcd = 1;
        if (n1 == 0) {
            System.out.println(n2);
        }
        if (n2 == 0) {
            System.out.println(n1);
        }
        for (int i = 1; i <= n1 && i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }
            }
            System.out.printf("Ước chung lớn nhất của %d và %d là: %d", n1, n2, gcd);
        }
    }

//        if (n1 == 0) {
//            System.out.println(n2);
//        }
//        if (n2 == 0) {
//            System.out.println(n1);
//        }
//        int n;
//        for (n = 0; ((n1 | n2) & 1) == 0; n++) {
//            n1 >>= 1;
//            n2 >>= 1;
//        }
//        while ((n1 & 1) == 0) {
//            n1 >>= 1;
//        }
//        do {
//            while ((n2 & 1) == 0) {
//                n2 >>= 1;
//            }
//            if (n1 > n2) {
//                int temp = n1;
//                n1 = n2;
//                n2 = temp;
//            }
//            n2 = (n2 - n1);
//        } while (n2 != 0);
//        System.out.println(n1<<n) ;
//    }

//    }