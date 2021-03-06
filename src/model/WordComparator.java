package model;

import java.util.Comparator;

// Class inherited by Comparator class to compare two Word objects
public class WordComparator implements Comparator<Word> {

    @Override
    public int compare(Word o1, Word o2) {
        return o1.getWord().compareTo(o2.getWord());
    }
}
