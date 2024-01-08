import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class Frame extends JFrame{
    private JPanel MainPanel;
    private JTextArea textArea1;
    private JButton clickHereButton;
    private JTextArea orderedtext;

    public Frame()
    {

//        String getText_feild01 = "";
        setContentPane(MainPanel);
        setSize(1080, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        clickHereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getText_feild01 = textArea1.getText();


                String[] sinhalaWords = getText_feild01.split("\n");
//                String[] sinhalaWords = {"මිෂාන්", "නබි", "කබි", "පස", "මිෂ", "මෂ", "මිෂා"};
                // Creating a Sinhala collator to compare and sort Sinhala words
                Collator collator = Collator.getInstance(new Locale("si", "LK"));
                collator.setStrength(Collator.PRIMARY);

                // Sorting the Sinhala words
                Arrays.sort(sinhalaWords, collator);

                // Displaying the words in Sinhala alphabetical order
                System.out.println("Words in Sinhala alphabetical order:");
                for (String word : sinhalaWords) {
//                    System.out.println(word);
                    orderedtext.append(word+"\n");
                }


//                System.out.println(getText_feild01);
            }
        });
    }

    public static void main(String[] args) {
        new Frame();


    }

    public void getTextareaTex()
    {
        String getText_feild01 = textArea1.getText();

        System.out.println(getText_feild01);
    }

}
