/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */


/**
     *
     * @return the string
     */
public class ReclamationProject {
    /**
    *@param a is the length
    *@param b is the length as well
    * @return the string
    */
    static String doit(final String a, final String b) {
        String aTwo = a;
        String bTwo = b;
        if (a.length() > b.length()) {
            String c = a;
            aTwo = b; bTwo = c;
            }
        String r = "";

        /*
         * For loop with i
         */
        for (int i = 0; i < aTwo.length();) {
            for (int j = aTwo.length() - i; j > 0; j--) {
                for (int k = 0; k < bTwo.length() - j; k++) {
                   if (aTwo.regionMatches(i, b, k, j) && j > r.length()) {
                            r = a.substring(i, i + j);
                        }
                }
            } return r; }
        return r;
    }
}
