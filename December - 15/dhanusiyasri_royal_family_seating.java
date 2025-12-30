import java.util.Scanner;
public class dhanusiyasri_royal_family_seating {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println((!(str.equals("null")||str.length()<=2)));
        sc.close();
    }
}