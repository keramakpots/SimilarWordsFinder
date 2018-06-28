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

    public List<String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(List<String> dictionary) {
        this.dictionary = dictionary;
    }

    public List<String> getChainFromFirstWordToDesired() {
        return chainFromFirstWordToDesired;
    }

    public void setChainFromFirstWordToDesired(List<String> chainFromFirstWordToDesired) {
        this.chainFromFirstWordToDesired = chainFromFirstWordToDesired;
    }

    public Branch getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(Branch firstWord) {
        this.firstWord = firstWord;
    }

    public String getDesiredWord() {
        return desiredWord;
    }

    public void setDesiredWord(String desiredWord) {
        this.desiredWord = desiredWord;
    }
}
