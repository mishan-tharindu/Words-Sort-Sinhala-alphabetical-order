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


                String[] sinhalaWords = getText_feild01.split("\n");

                // String[] sinhalaWords = {"මිෂාන්", "නබි", "කබි", "පස", "මිෂ", "මෂ", "මිෂා"};
                // Creating a Sinhala collator to compare and sort Sinhala words
                Collator collator = Collator.getInstance(new Locale("si", "LK"));
                collator.setStrength(Collator.PRIMARY);

                // Sorting the Sinhala words
//                Arrays.sort(sinhalaWords, collator);

                // Displaying the words in Sinhala alphabetical order
//                System.out.println("Words in Sinhala alphabetical order:");

                ArrayList<String> addWordtoStongArr= new ArrayList<String>();
                ArrayList<String> addSecondtoStringArr = new ArrayList<String>();

                String[] firstWordArr = new String[0];
                String[] afterFirstword = new String[0];


                for (String word : sinhalaWords) {

//                  System.out.println("Index of "+word+" :::"+findIndex(sinhalaWords, word));
                    String[] sinhalaSplitWords = word.split(" - ",2);

                    addWordtoStongArr.add(sinhalaSplitWords[0]);
                    addSecondtoStringArr.add(sinhalaSplitWords[1]);

                     firstWordArr = addWordtoStongArr.toArray(new String[0]);
                    afterFirstword = addSecondtoStringArr.toArray(new String[0]);

//                    System.out.println("String array ::: "+Arrays.toString(firstWordArr));

//                    System.out.println("Frist Split Word ::"+sinhalaSplitWords[0]);
//                    System.out.println("Second Words ::"+sinhalaSplitWords[1]);

//                    orderedtext.append(word+"\n");

                }

                System.out.println("String First Word array ::: "+Arrays.toString(firstWordArr));
                System.out.println("String After First Word array ::: "+Arrays.toString(afterFirstword));



            }
        });
    }

    public static void main(String[] args) {
        new Frame();


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
