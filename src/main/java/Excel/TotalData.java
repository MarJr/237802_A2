package Excel;

import java.util.Arrays;

public class TotalData {

    String name[];
    String matrik[];
    String course;
    String group;
    String semester;
    String task;

    String javaKeywords[];
    int keywordsCount[][];
    int LOC[][];

    int totalkeywordsCount[][];
    int totalLOC[][];

    public TotalData(String[] name, String[] matrik, String course, String group, String semester, String task, String[] javaKeywords, int[][] keywordsCount, int[][] LOC) {
        this.name = name;
        this.matrik = matrik;
        this.course = course;
        this.group = group;
        this.semester = semester;
        this.task = task;

        this.javaKeywords = javaKeywords;
        this.keywordsCount = keywordsCount;
        this.LOC = LOC;

        sortToProperPresentation();
    }

    public void sortToProperPresentation() {
        String[] distinctMatrics = getDistMatrics();
        totalkeywordsCount = new int[distinctMatrics.length][javaKeywords.length];
        totalLOC = new int[distinctMatrics.length][3];

        for (int i = 0; i < distinctMatrics.length; i++) {
            for (int b = 0; b < keywordsCount.length; b++) {
                for (int c = 0; c < keywordsCount[b].length; c++) {
                    if (distinctMatrics[i].equals(matrik[b])) {
                        totalkeywordsCount[i][c] += keywordsCount[b][c];
                    }
                }
                if (distinctMatrics[i].equals(matrik[b])) {
                    totalLOC[i][0] += LOC[b][0];
                    totalLOC[i][1] += LOC[b][1];
                    totalLOC[i][2] += LOC[b][2];

                }
            }
        }

    }

    public int[][] getTotalLOC() {
        return totalLOC;
    }

    public int[][] getSumOfKeywords() {
        return totalkeywordsCount;
    }

    public int[] getSumOfEachMatrics() {
        int totalForEachMatrics[] = new int[getDistMatrics().length];
        for (int i = 0; i < totalkeywordsCount.length; i++) {
            for (int b = 0; b < totalkeywordsCount[i].length; b++) {
                totalForEachMatrics[i] += totalkeywordsCount[i][b];
            }
            //totalForEachMatrik[i] += totalLOC[i][0] + totalLOC[i][1] + totalLOC[i][2];
            totalForEachMatrics[i] += totalLOC[i][2];
        }
        return totalForEachMatrics;
    }

    public String[] getDistMatrics() {
        return Arrays.stream(matrik).distinct().toArray(String[]::new);
    }

}
