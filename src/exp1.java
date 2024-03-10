public class exp1 {
    void hello() { // void matraj3li 7ata retour
        System.out.println("hello world");
    }

    public void hello2(String arg) {
        System.out.println(arg);

    }

    public int somme(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        exp1 e1 = new exp1();// najmou naccsidiw lel ttout lrs fontio fil class exp1
        e1.hello();
        e1.hello2("hello bolbol");
        int resultat;
        resultat = e1.somme(25, 15);
        System.out.println(resultat);

    }
}
