

public class HW_sem1 {
    public static void main (String args[]) {
        int a = 10;
        int b = 0;
        arithmeticExcep(a, b);
    }

        public static void arithmeticExcep (int a,int b){
            try {
                int c = a / b;
                System.out.println("Result = " + c);
            } catch (ArithmeticException e) {
                System.out.println("На 0 делить нельзя");
            }
        }
    }

