import java.util.Scanner;//input el 5assa b utulisateur

public class input {

    public static void main(String[] args) {
        System.out.println("please enter the msg here :");
        String msg = new Scanner(System.in).nextLine();// nda5lou input en string
        System.out.println("Result: " + msg);
        System.out.println("please enter the msg msg en number :");
        int msg1 = new Scanner(System.in).nextInt();// nda5lou input number
        System.out.println("Result2: " + msg1);

    }
}
