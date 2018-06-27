package util;

public class WordsComparator {

    public boolean areWordsTheSameLength(String firstComparableString, String secondComparableString) {
        return firstComparableString.length() == secondComparableString.length();
    }

    public boolean areWordsDifferentByOneWord(String firstComparableString,
        String secondComparableString) {
        return false;
    }
}
