import java.util.ArrayList;
import java.util.Collections;

public class arrylist {
    public static void main(String[] args) {

        ArrayList<Integer> tab = new ArrayList<Integer>();
        tab.add(55);
        tab.add(22);
        tab.add(33);
        tab.set(0, 88);
        System.out.println(tab);
        System.out.println(tab.indexOf(22));
        System.out.println(tab.get(2));
        for (int i = 0; i < tab.size(); i++) {
            System.out.println(tab.get(i));
        }

        Collections.sort(tab);// tartib les int
        System.out.println(tab);
    }
}
