public class FirstJava {
    public static void main(String[] args) {
        boolean p = false;
        boolean q = false;
        boolean resultAnd, resultOr, resultXor, resultNotQ = false;

        System.out.println("   p\t|   q\t| p & q\t| p | q\t| p ^ q\t|   !q\t|");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < 2; i++) {
            q = false;
            for (int j = 0; j < 2; j++) {
                resultAnd = p & q;
                resultOr = p | q;
                resultXor = p ^ q;
                resultNotQ = !q;
                System.out.printf("%b\t| %b\t| %b\t| %b\t| %b\t| %b\t| \n", p, q ,resultAnd, resultOr, resultXor, resultNotQ);
                q = true;
            }
            p = true;
        }
    }
}
