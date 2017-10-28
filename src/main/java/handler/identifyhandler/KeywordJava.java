package handler.identifyhandler;

import java.util.Arrays;

public class KeywordJava {

    public final String KEYWORDS[] = {"abstract", "assert", "boolean ",
        "break", "byte ", "case", "catch", "char ", "class", "const",
        "continue", "default", "do", "double ", "else", "extends", "false",
        "final", "finally", "float ", "for", "goto", "if", "implements",
        "import", "instanceof", "int ", "interface", "long ", "native",
        "new", "null", "package", "private", "protected", "public",
        "return", "short", "static", "strictfp", "super", "switch",
        "synchronized", "this", "throw", "throws", "transient", "true",
        "try", "void", "volatile", "while", "enum"};

    public int countOfKeywords[][];

    public void findKeywords(String fileContent[][]) {
        countOfKeywords = new int[fileContent.length][KEYWORDS.length];
        calculateKeyword(fileContent);
    }

    public boolean javaKeywordExists(String sentence, String search) {
        if (sentence.toLowerCase().indexOf(search.toLowerCase()) != -1) {
            return true;
        }
        return false;
    }

    public void calculateKeyword(String fileContent[][]) {
        for (int i = 0; i < fileContent.length; i++) {
            for (int b = 0; b < fileContent[i].length; b++) {

                for (int c = 0; c < KEYWORDS.length; c++) {
                    if (javaKeywordExists(fileContent[i][b], KEYWORDS[c])) {
                        countOfKeywords[i][c]++;
                    }
                }

            }
        }
    }
}
