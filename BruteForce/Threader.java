package practicals.BruteForce;

import static practicals.BruteForce.BruteForce.possibleStrings;


public class Threader implements Runnable {
    
    private final int maxLength;
    private final char[] alphabet;
    private final String current;
    private final long startTime;
    
    //Thread needs to have these properties
    public Threader(int ml, char[] a, String c, long st){
        maxLength = ml;
        alphabet = a;
        current = c;
        startTime = st;
    }
    
    //Running the algorithm
    @Override
    public void run(){
        possibleStrings(maxLength, alphabet, current, startTime);
    }
}