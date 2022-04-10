package third;

import java.util.Scanner;

public class NewString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
        String result = "";
        for (String s: strings) {
            try {
                Integer.parseInt(s);
                result += s;
            } catch ( NumberFormatException e){

            }
        }
        System.out.println(result);
    }
}
