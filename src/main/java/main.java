import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        TODO: determine if the entry is a number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        String input = scanner.nextLine();

        if (StringUtils.isNumeric(input)) {
            System.out.println("correct. entry is numeric");
        } else {
            System.out.println("wrong.entry is not numeric");

        }
//        TODO: Have the entry case flipped.
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a sentence to have it case fLiPped :");
        String input1 = scanner1.nextLine();
        System.out.println(StringUtils.swapCase(input1));
//        TODO: Reverse the entry.
        System.out.println(StringUtils.reverse(input1));
    }


}