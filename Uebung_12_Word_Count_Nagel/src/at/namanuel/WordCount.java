package at.namanuel;


import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Count occurrences of each word in a file.
 * <p>
 * <P>This program counts each occurrence of a word found
 * in a file and print the results of the search in tabular
 * form to the terminal.
 * <p>
 * <P>Usage:
 * <p>
 * <P><b>java</b> WordCount `file-name`
 *
 * @author Manuel Nagel
 * @version 1.0
 */
public class WordCount {

    public static void main(String[] args) {

        // TODO (1)
        // Create an object that implements the `Map` interface
        // to store all found words (Key) and the number of their
        // occurrences (Value).
        //
        Map<String, Integer> words = new HashMap<>();
        String line;
        FileReader fr = null;
        Scanner sr = null;
        try {

            // TODO (2)
            // Setup file input handling using the first
            // terminal argument.
            //
            fr = new FileReader(args[0]);

            sr = new Scanner(fr);

            while (sr.hasNext()) {
                line = sr.nextLine();

                if (!line.trim().equals("")) {
                    // TODO (3)
                    // Read all words from the file.
                    //
                    String[] helper = line.split(" ");
                    for (String word : helper) {
                        if (word == null || word.trim().equals("") || word.length() == 1) {
                            // TODO (4)
                            // Drop all words that have less than two letters.
                            //
                            //word (.length)
                            continue;
                        }
                        // TODO (5.2)
                        // ... create a new `Map` entry with the
                        // initial count.
                        //
                        String processed = word.toLowerCase();
                        processed = processed.replaceAll("[\\W0-9]", "");
                        processed = processed.replace("\\\\r\\\\n|\\\\r|\\\\n","");
                        if (words.containsKey(processed)) {
                            words.put(processed, words.get(processed) + 1);
                        } else {
                            words.put(processed, 1);
                        }
                    }
                }
            }
            //System.out.println("Unsorted: " + words);
            // TODO (5.2)
            // ... create a new `Map` entry with the
            // initial count.
            //
            List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(words.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });

            // TODO (6.1)
            // Print the table header.
            //
            System.out.println("|----------------------------------|");
            System.out.println("| Word                     |  Count|");
            System.out.println("|----------------------------------|");
            for(Map.Entry<String, Integer> item : list){
                // TODO (6)
                // Print the results in tabular form.
                // TODO (6.2)
                // Print every entry (key + value).
                //
                System.out.printf("| %-24s |     %02d|\n", item.getKey(), item.getValue());
            }
            System.out.println("|----------------------------------|");

            // TODO (7)
            // Clean up.
            //
            // Note: Closing the file inside the try-block in not ideal,
            // as an `Exception` would prevent this command from being
            // executed.
            sr.close();
            fr.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                fr.close();
                sr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}




