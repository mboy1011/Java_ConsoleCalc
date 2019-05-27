import java.util.Scanner;

public class Calculator {
        private static final String DIV_ZERO = "Cannot divide any number with zero!";

        public static void main(String[] args) {
                var lp = ' ';
                do {
                        clearConsole();
                        var input = new Scanner(System.in);
                        System.out.println("*============*");
                        System.out.println("| Calculator |");
                        System.out.println("*============*");
                        System.out.println("|  [1] Add   |");
                        System.out.println("|  [2] Sub   |");
                        System.out.println("|  [3] Mul   |");
                        System.out.println("|  [4] Div   |");
                        System.out.println("|  [5] Exit  |");
                        System.out.println("*============*");
                        System.out.print("Select: ");
                        var ch = input.nextInt();
                        switch (ch) {
                        case 1:
                                System.out.println("|Addition|");
                                input(ch);
                                break;
                        case 2:
                                System.out.println("|Subtration|");
                                input(ch);
                                break;
                        case 3:
                                System.out.println("|Multiplication|");
                                input(ch);
                                break;
                        case 4:
                                System.out.println("|Division|");
                                input(ch);
                                break;
                        case 5:
                                Runtime.getRuntime().exit(0);
                                System.out.println("Bye!");
                                break;
                        default:
                                System.out.println("Not in options!");
                                break;
                        }
                        System.out.print("Do you want to try again? [Y/n]");
                        lp = input.next().charAt(0);
                } while (lp == 'Y' || lp == 'y');
        }

        public static void input(int ch) {
                var input = new Scanner(System.in);
                System.out.print("1st Digit: ");
                var a = input.nextInt();
                System.out.print("2nd Digit: ");
                var b = input.nextInt();
                if (ch == 1) {
                        System.out.println("Total: " + add(a, b));
                } else if (ch == 2) {
                        System.out.println("Total: " + sub(a, b));
                } else if (ch == 3) {
                        System.out.println("Total: " + mul(a, b));
                } else if (ch == 4) {
                        if (div(a, b) == 1) {
                                System.out.println(DIV_ZERO);
                        } else {
                                System.out.println("Total: " + div(a, b));
                        }
                }
        }

        public static int add(int a, int b) {
                return a + b;
        }

        public static int sub(int a, int b) {
                return a - b;
        }

        public static int mul(int a, int b) {
                return a * b;
        }

        public static int div(int a, int b) {
                try {
                        return a / b;
                } catch (ArithmeticException e) {
                        return 1;
                }
        }

        public final static void clearConsole() {
                try {
                        final String os = System.getProperty("os.name");

                        if (os.contains("Windows")) {
                                Runtime.getRuntime().exec("cls");
                        } else {
                                Runtime.getRuntime().exec("clear");
                                System.out.print("\033\143");
                        }
                } catch (Exception e) {
                        // TODO: handle exception
                }
        }
}
