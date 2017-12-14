package practicals.RainbowTable;

import java.io.Serializable;
import java.util.HashMap;

public class RainbowTable implements Serializable {

    public String alphabet = "";
    public int maxLength = 0;
    public int chainLength = 0;
    public HashMap pairs = new HashMap<>();

    public RainbowTable() {}

    public RainbowTable(String alphabet, int maxLength, int chainLength, HashMap pairs) {
        this.alphabet = alphabet;
        this.maxLength = maxLength;
        this.chainLength = chainLength;
        this.pairs = pairs;
    }

    public void setPairs(HashMap pairs) {
        this.pairs = pairs;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }
    
    public void setChainLength(int chainLength) {
        this.chainLength = chainLength;
    }

    public HashMap getPairs() {
        return pairs;
    }
}