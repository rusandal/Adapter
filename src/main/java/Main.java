public class Main {
    public static void main(String[] args) {
        Inst calc = new IntsCalculator();
        System.out.println(calc.sum(3, 5));
        System.out.println(calc.mult(3, 5));
        System.out.println(calc.pow(3, 5));
    }
}
