package at.namanuel;


/**
 * Utility class providing convenience function for terminal
 * control.
 *
 * @author	Alija Sabic
 * @email	sabic@technikum-wien.at
 * @version	0.1
 *
 */
public class Util {

    /**
     * `private` Constructor to prevent instantiations
     * of this utility class.
     */
    private Util() {}

    /////////////////////////////////////////////////////////////////////////////
    // vt100 commands (sf. https://www.csie.ntu.edu.tw/~r92094/c++/VT100.html) //
    /////////////////////////////////////////////////////////////////////////////
    /**	vt100 escape sequences*/
    public static final String ESC = "\033";
    /** curserhome:  `[H` - Move cursor to upper left corner. */
    public static final String CURSERHOME = "[H";
    /** clearscreen: `[2J` - Clear entire screen. */
    public static final String CLEARSCREEN = "[2J";

    /**
     * Clears the terminal screen (supporting vt100 commands).
     */
    public static void clearScreen() {
        System.out.print(ESC + CURSERHOME + ESC + CLEARSCREEN);
        System.out.flush();
    }
}

