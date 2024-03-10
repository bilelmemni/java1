
public class exp2 {

    int x = 22;

    /**
     * Innerexp2
     */
    public class Innerexp2 {
        int y = 33;

    }

    public static void main(String[] args) {

        exp2 objet1 = new exp2();
        exp2.Innerexp2 object2 = objet1.new Innerexp2();
        System.out.println(objet1.x);
        System.out.println(object2.y);

    }
}
