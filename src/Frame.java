import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;
import java.util.*;

public class Frame extends JFrame{
    private JPanel MainPanel;
    private JTextArea textArea1;
    private JButton clickHereButton;
    private JTextArea orderedtext;

    public Frame()
    {

        setContentPane(MainPanel);
        setTitle("Sinhala Words Listing Alphabetical Order");
        setSize(1080, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);



        clickHereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getText_feild01 = textArea1.getText();

                String encoding = "UTF-8";

                // Array of Sinhala words (including hyphenated words)
//                String[] sinhalaWords = {
//                        "නමස්කාරය", "කරුණාකර", "ස්තූතියි", "ආයුබෝවන්",
//                        "සුබ-උදෑසනක්", "සුබ-දවසක්", "සුබ-රාත්‍රියක්", "ආයුබෝවන්-කරුණාකර", "අම්මා-කාර", "අම්මා-ඇර", "අමමා-ආර"
//                };
                String[] sinhalaWords = getText_feild01.split("\n");

                // Sort the words based on the alphabetical order of all characters in the first word
                Arrays.sort(sinhalaWords, (word1, word2) -> {
                    // Extract first words before hyphens
                    String firstPart1 = word1.split("-")[0];
                    String firstPart2 = word2.split("-")[0];

                    // Compare characters one by one until a difference is found
                    int n1 = firstPart1.length();
                    int n2 = firstPart2.length();
                    for (int i = 0; i < Math.min(n1, n2); i++) {
                        int comparison = Character.compare(firstPart1.charAt(i), firstPart2.charAt(i));
                        if (comparison != 0) return comparison;
                    }

                    // Handle different word lengths
                    return n1 - n2;
                });

                // Print the sorted words with proper encoding
                for (String word : sinhalaWords) {
//                    System.out.println(word);
                    orderedtext.append(word+"\n");
                }


            }
        });
    }

    public static void main(String[] args) {
        new Frame();


    }

    public static void secondmethode()
    {
        String encoding = "UTF-8";

        // Array of Sinhala words (including hyphenated words)
//        String[] sinhalaWords = getText_feild01.split("\n");

                String[] sinhalaWords = {
                        "නමස්කාරය", "කරුණාකර", "ස්තූතියි", "ආයුබෝවන්",
                        "සුබ-උදෑසනක්", "සුබ-දවසක්", "සුබ-රාත්‍රියක්", "ආයුබෝවන්-කරුණාකර", "අම්මා - කාර", "අම්මා - ඇර", "අමමා - ආර", "ඇය - අම්මා", "01 - ඇය - අම්මා"
                };

        // Sort the words based on the first word before the hyphen
        Arrays.sort(sinhalaWords, (word1, word2) -> {
            // Split words if hyphenated
            String[] parts1 = word1.split("-");
            String[] parts2 = word2.split("-");
            // Compare first words based on Sinhala character order
            int comparison = Character.compare(parts1[0].charAt(0), parts2[0].charAt(0));
            if (comparison != 0) return comparison;
            // If first words are identical, compare remaining parts (if any)
            if (parts1.length > 1 && parts2.length > 1) {
                comparison = Arrays.compare(parts1, 1, parts1.length, parts2, 1, parts2.length);
                if (comparison != 0) return comparison;
            }
            // Handle different word lengths and hyphen usage
            return word1.length() - word2.length();
        });

        // Print the sorted words with proper encoding
        for (String word : sinhalaWords) {
//                    System.out.println(word);
//            orderedtext.append(word+"\n");
        }
    }


    public static void oldcode()
    {
//
//                String[] sinhalaWords = getText_feild01.split("\n");
//
//                // String[] sinhalaWords = {"මිෂාන්", "නබි", "කබි", "පස", "මිෂ", "මෂ", "මිෂා"};
//                // Creating a Sinhala collator to compare and sort Sinhala words
//                Collator collator = Collator.getInstance(new Locale("si", "LK"));
//                collator.setStrength(Collator.PRIMARY);
//
//                // Sorting the Sinhala words
//        //                Arrays.sort(sinhalaWords, collator);
//
//                // Displaying the words in Sinhala alphabetical order
//        //                System.out.println("Words in Sinhala alphabetical order:");
//
//                ArrayList<String> addWordtoStongArr= new ArrayList<String>();
//                ArrayList<String> addSecondtoStringArr = new ArrayList<String>();
//
//                String[] firstWordArr = new String[0];
//                String[] afterFirstword = new String[0];
//
//
//                for (String word : sinhalaWords) {
//
//        //                  System.out.println("Index of "+word+" :::"+findIndex(sinhalaWords, word));
//                    String[] sinhalaSplitWords = word.split(" - ",2);
//
//                    addWordtoStongArr.add(sinhalaSplitWords[0]);
//                    addSecondtoStringArr.add(sinhalaSplitWords[1]);
//
//                    firstWordArr = addWordtoStongArr.toArray(new String[0]);
//                    afterFirstword = addSecondtoStringArr.toArray(new String[0]);
//
//        //                    System.out.println("String array ::: "+Arrays.toString(firstWordArr));
//
//        //                    System.out.println("Frist Split Word ::"+sinhalaSplitWords[0]);
//        //                    System.out.println("Second Words ::"+sinhalaSplitWords[1]);
//
//        //                    orderedtext.append(word+"\n");
//
//                }
//
//                System.out.println("String First Word array ::: "+Arrays.toString(firstWordArr));
//                System.out.println("String After First Word array ::: "+Arrays.toString(afterFirstword));
//
//
    }

    public static int findIndex(String arr[],String t)
    {
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }

    public void getTextareaTex()
    {
        String getText_feild01 = textArea1.getText();

        System.out.println(getText_feild01);
    }

}
