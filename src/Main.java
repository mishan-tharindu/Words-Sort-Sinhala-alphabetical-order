import javax.sound.sampled.Line;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static void main(String[] args) {
//
//        System.out.println("Paste Your Words :::");
////        wordOrder();
//
//        ChartoString();
//
////        String words = unicodemethode02();
//
//        System.out.println(convertToString(unicodemethode02()));
//
//    }

    public static void wordOrder()
    {
        String scanword;
        Scanner scannerwords = new Scanner(System.in);

        scanword = scannerwords.nextLine().trim();

       char wordchar = scanword.charAt(0);

       int a = (int) wordchar;

        System.out.println(a);

    }

    public static void ChartoString()
    {
        int intscanword;
        Scanner scannerwords = new Scanner(System.in);
        intscanword = scannerwords.nextInt();

        char intwordchar = (char) intscanword;

        System.out.println(intwordchar);


    }

//    Using Regular Exception

    public static String convertToUnicode(String input) {
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
//            sb.append("\\u").append(Integer.toHexString((int) c));
            sb.append("\\u").append((int) c);
        }

        return sb.toString();
    }

    public static String unicodemethode02(){

        String input = "මිෂාන්\n" +
                "නබි\n" +
                "කබි";

        String unicodeOutput = convertToUnicode(input);
        System.out.println("Unicode Output: " + unicodeOutput);

        return  unicodeOutput;
    }

    public static String convertToString(String stringWord)
    {
        String stringWords = stringWord.replace("\\","");
        String[] stringArr = stringWords.split("u");

        String text ="";
        char a = 0;

        for (int i = 1; i < stringArr.length; i++) {

            int valhex = Integer.parseInt(stringArr[i], 10);

            a = (char) valhex;

            text += (char) valhex;

            System.out.println(a);
            System.out.println("Text:: "+text);
        }

        return text;

    }




}