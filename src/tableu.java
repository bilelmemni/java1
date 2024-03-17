public class tableu {
    public static void main(String[] args) {

        int[] tabint = { 66, 13, 57 };
        int[][] tabint2 = { { 15, 20, 19, 18 }, { 22, 33, 44, 55 } };
        String[] tabstring = { "java", "php", "angular" };
        
          for (int i = 0; i < tabstring.length; i++) {
          System.out.println("tab" + i + "=" + tabstring[i]);
          System.out.println(tabint[i]);
          
          }
          for (String i : tabstring) {
          System.out.println(i);
          }
         
        System.out.println(tabint2.length);
        System.out.println(tabint2[0].length);
        for (int i = 0; i < tabint2.length; i++) {
            for (int j = 0; j < tabint2[i].length; j++) {
                System.out.println(tabint2[i][j]);

            }
        }

    }
}
