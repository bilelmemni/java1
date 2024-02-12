public class firstProject {
    public static void main(String[] args) {
        // les attribut
        byte mybyte = 120;// max de pyte 127 et min-128
        short myshort = 20000;// max 32000
        int myint;
        myint = 152;// affectation des variable
        long mylong = 524155555555555554L;// max 19chiffre avel L majuscule

        System.out.println("my byte is : \n" + mybyte);
        System.out.println("my short is : \n" + myshort);
        System.out.println("my int is : \n" + myint);
        System.out.println("my long is : \n" + mylong);
        // exemple
        int x;
        x = 10;
        x += 5;// x+=5==x=x+5
        System.out.println(x);
        int x1 = 15, x2 = 20, x3 = 15;
        System.out.println(x1 != x2);
        System.out.println((x1 == x2) && (x1 == x3));
        System.out.println((x1 == x2) || (x1 == x3));
        System.out.println(++x1);
        System.out.println(x1);
        // exemple 2
        String greating = "helloworld";
        System.out.println(greating.length());
        System.out.println(greating.toUpperCase());
        System.out.println(greating.indexOf("l"));
        System.out.println(Math.min(5, 15));
        // exemple 3
        int time = 20;
        String result;

        if (time < 18) {
            System.out.println("bilel");
        } else {
            System.out.println("hella");
        }
        // nafsha nektbouha b methode o5ra
        result = (time < 18) ? "bilel" : "hela";
        System.out.println(result);
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("thesday");
                break;
            case 3:
                System.out.println("wendsday");
                break;
            case 4:
                System.out.println("thersday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("please entrer number entre 1 et 7");
                break;
        }
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        int j = 3;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);
    }

}
