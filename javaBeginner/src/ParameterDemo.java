public class ParameterDemo {
    public static void main(String[] args) {
        CheckNumber e = new CheckNumber();

        if(e.isEven(10)) System.out.println("10 is even");

        if(e.isEven(9)) System.out.println("9 is even");

        if(e.isEven(8)) System.out.println("8 is even");
    }
}
