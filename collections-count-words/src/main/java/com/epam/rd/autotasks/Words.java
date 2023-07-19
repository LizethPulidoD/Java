package com.epam.rd.autotasks;


import java.util.Collections;
import java.util.List;

public class Words {

    public String countWords(List<String> lines) {
        String[] singleWord;
        int wordCounter = 0;
        for (String line : lines) {
            line.replaceAll("[!.,:?\\s+;]+", " ").strip();
            singleWord = line.split(" ");
            for (String word : singleWord) {
                if (word.length() > 3) {
                    wordCounter = Collections.frequency(lines, word);
                    if (wordCounter > 10) {
                        return word + " - " + wordCounter + "\n";
                    }
                }
            }
        }
        return null;
    }
}
