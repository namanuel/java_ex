package at.namanuel;

import java.util.Map;

/**
 * Count occurrences of each word in a file.
 *
 * <P>This program counts each occurrence of a word found
 * in a file and print the results of the search in tabular
 * form to the terminal.
 *
 * <P>Usage:
 *
 *   <P><b>java</b> WordCount `file-name`
 *
 * @param	args	Terminal Arguments.
 *
 * @author 	Manuel Nagel
 * @version 1.0
 *
 */
public class WordCount {

    public static void main(String[] args) {

        // TODO (1)
        // Create an object that implements the `Map` interface
        // to store all found words (Key) and the number of their
        // occurrences (Value).
        //
        Map<String,Integer> words;
        String input = "";
        try {

            // TODO (2)
            // Setup file input handling using the first
            // terminal argument.
            //
            input = args[0];

            // TODO (3)
            // Read all words from the file.
            //




            // TODO (4)
            // Drop all words that have less than two letters.
            //

            // TODO (5.1)
            // Increment `Map` value, if the respective word (Key)
            // is already present or ...
            //


            // TODO (5.2)
            // ... create a new `Map` entry with the
            // initial count.
            //


            // TODO (6)
            // Print the results in tabular form.

            // TODO (6.1)
            // Print the table header.
            //


            // TODO (6.2)
            // Print every entry (key + value).
            //

            // TODO (7)
            // Clean up.
            //
            // Note: Closing the file inside the try-block in not ideal,
            // as an `Exception` would prevent this command from being
            // executed.


        } catch (Exception e) {

        }

    }

}
