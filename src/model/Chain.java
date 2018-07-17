package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import util.WordsComparator;

public class Chain {

    private List<String> dictionary;
    private List<String> chainFromFirstWordToDesired;
    private Branch firstWord;
    private String desiredWord;
    private Branch lastBranch;
    private final int LAST_ELEMENT = 1;

    public Chain(List<String> dictionary, List<String> chainFromFirstWordToDesired) {
        this.dictionary = dictionary;
        this.chainFromFirstWordToDesired = chainFromFirstWordToDesired;
        this.firstWord = new Branch(chainFromFirstWordToDesired.get(0), null);
        this.desiredWord = chainFromFirstWordToDesired.get(1);
        this.buildBranch(firstWord);
    }

    private void writeChildrens(Branch branch) {
        List<String> currentDictionary = new ArrayList<>(dictionary);
        currentDictionary.removeAll(branch.returnParentData());
        List<Branch> children = new LinkedList<>();
        String data = branch.getData();

        for (String st : currentDictionary) {
            if (WordsComparator.areWordsDifferentByOneWord(data, st)) {
                children.add(new Branch(st, branch));
            }
        }
        branch.setChildren(children);
        if(!branch.getChildren().isEmpty()) {
            if(checkIfCurrentBranchEndIsDifferentByOneWordFromDesiredWord(branch)) {
                findShortestSuitableChain();
            }
        }
    }

    private boolean checkIfCurrentBranchEndIsDifferentByOneWordFromDesiredWord(Branch branch) {
        return WordsComparator
            .areWordsDifferentByOneWord(branch.getChildren().get(branch.getChildren().size()-LAST_ELEMENT).getData(), desiredWord);
    }

    private void buildBranch(Branch branch) {
        writeChildrens(branch);
        List<Branch> children = branch.getChildren();
        if (children.size() > 0) {
            for (Branch child : children) {
                buildBranch(child);
            }
        }
    }

    private void findSuitableChains(Branch branch, Map<Integer, List<String>> map) {
        List<Branch> children = branch.getChildren();
        if(children!=null) {
            if (children.size() > 0) {
                for (Branch child : children) {
                    if (child.getData().equals(desiredWord)) {
                        int i = map.size();
                        map.put(i, child.returnParentData());
                    } else {
                        findSuitableChains(child, map);
                    }
                }
            }
        }
    }

    public void print() {
        firstWord.print();
    }

    public void findShortestSuitableChain() {
        Map<Integer, List<String>> map = new LinkedHashMap<>();
        findSuitableChains(firstWord, map);

        int shortChainIndex = 0;
        int dictionarySize = dictionary.size();
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() < dictionarySize) {
                dictionarySize = entry.getValue().size();
                shortChainIndex = entry.getKey();
            }
        }
        Collections.reverse(map.get(shortChainIndex));
        List<String> list = new ArrayList<>(map.get(shortChainIndex));
        printListsElements(list);
        System.exit(0);
    }

    private void printListsElements(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------");
    }
}
