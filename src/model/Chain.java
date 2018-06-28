package model;

import java.util.List;

public class Chain {

    public Chain() {
    }
    private List<String> dictionary;
    private List<String> chainFromFirstWordToDesired;
    private Branch firstWord;

    private String desiredWord;

    public Chain(List<String> dictionary, List<String> chainFromFirstWordToDesired) {
        this.dictionary = dictionary;
        this.chainFromFirstWordToDesired = chainFromFirstWordToDesired;
    }
}
