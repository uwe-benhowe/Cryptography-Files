/*Links used
https://stackoverflow.com/questions/27894586/how-to-multi-thread-a-brute-force-java-password-program
https://codereview.stackexchange.com/questions/41510/calculate-all-possible-combinations-of-given-characters
https://azure.microsoft.com/en-us/pricing/calculator/#virtual-machines1
https://ubuntuforums.org/showthread.php?t=1703661
 */
package practicals.BruteForce;

import java.io.*;
import java.security.*;

public class BruteForce {

    public static int numHashes = 0;
    public static int hashesFound = 0;
    public static String[] hashes; 

//        "c2543fff3bfa6f144c2f06a7de6cd10c0b650cae"
//        "b47f363e2b430c0647f14deea3eced9b0ef300ce"
//        "e74295bfc2ed0b52d40073e8ebad555100df1380"
//        "0f7d0d088b6ea936fb25b477722d734706fe8b40"
//        "77cfc481d3e76b543daf39e7f9bf86be2e664959"
//        "5cc48a1da13ad8cef1f5fad70ead8362aabc68a1"
//        "4bcc3a95bdd9a11b28883290b03086e82af90212"
//        "7302ba343c5ef19004df7489794a0adaee68d285"
//        "21e7133508c40bbdf2be8a7bdc35b7de0b618ae4"
//        "6ef80072f39071d4118a6e7890e209d4dd07e504"
//        "02285af8f969dc5c7b12be72fbce858997afe80a"
//        "57864da96344366865dd7cade69467d811a7961b"

    public static void possibleStrings(int maxLength, char[] alphabet, String currentString, long startTime) {
        if (currentString.length() == maxLength) {
            checkForMatch(currentString, startTime);
        } else {
            //Looping through alphabet
            for (char c : alphabet) {
                
                //Building string
                String oldCurr = currentString;
                currentString += c;
                
                //Recersuriszing the algorithm
                possibleStrings(maxLength, alphabet, currentString, startTime);
                currentString = oldCurr;
            }
        }
    }

    //Checking for a match
    public static void checkForMatch(String input, long startTime) {
        String SHA1hash = SHA1(input);

        for (String hash : hashes) {
            if (SHA1hash.equals(hash)) {
                final long endTime = System.currentTimeMillis();
                Interface.txtaHashes.append("Found '" + input + "' in " + formatTime(startTime, endTime) + "\n");
                hashesFound++;
                if (numHashes == hashesFound) {
                    //Stopping if matches are found
                    Interface.txtaHashes.append("Found all the hashes!\nPress clear to start again.\n");
                    Interface.t1.interrupt();
                    Interface.t2.interrupt();
                    Interface.t3.interrupt();
                    Interface.t4.interrupt();
                    Interface.btnClear.setEnabled(true);
                    Interface.btnStop.setEnabled(false);
                }
            }
        }
    }

    //Formatting time so user can read it
    public static String formatTime(long start, long end) {
        long milis = end - start;
        long second = (milis / 1000) % 60;
        long minute = (milis / (1000 * 60)) % 60;
        long hour = (milis / (1000 * 60 * 60)) % 24;
        long newMilis = (milis % 1000);
        String time = String.format("%02d:%02d:%02d:%d", hour, minute, second, newMilis);
        return time;
    }

    
    //Sha1  functions
    private static String convertToHex(byte[] data) {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            int halfbyte = (data[i] >>> 4) & 0x0F;
            int two_halfs = 0;
            do {
                if ((0 <= halfbyte) && (halfbyte <= 9)) {
                    buf.append((char) ('0' + halfbyte));
                } else {
                    buf.append((char) ('a' + (halfbyte - 10)));
                }
                halfbyte = data[i] & 0x0F;
            } while (two_halfs++ < 1);
        }
        return buf.toString();
    }

    public static String SHA1(String text) {

        byte[] sha1hash = new byte[40];
        
        try {
            MessageDigest md;
            md = MessageDigest.getInstance("SHA-1");
            md.update(text.getBytes("iso-8859-1"), 0, text.length());
            sha1hash = md.digest();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            System.out.println(ex);
        }
        return convertToHex(sha1hash);
    }
}
