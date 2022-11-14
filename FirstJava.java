public class FirstJava {
    public static void main(String[] args) {
        boolean p = false;
        boolean q = false;
        boolean r = false;
        System.out.println("   p\t|   q\t|  r");
        System.out.println("------------------------");
        for (int i = 0; i < 2; i++) {
            q = false;
            for (int j = 0; j < 2; j++) {
                r = p & q;
                System.out.printf("%b\t| %b\t| %b \n", p, q ,r);
                q = true;
            }
            p = true;
        }
    }
}
