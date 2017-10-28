package handler.identifyhandler;

public class LineCode {

    public int loc[][];

    public void findLOC(String fileContent[][]) {
        loc = new int[fileContent.length][3];
        calculateForEmptyLine(fileContent);
    }

    public void calculateForEmptyLine(String fileContent[][]) {
        for (int i = 0; i < fileContent.length; i++) {
            for (int b = 0; b < fileContent[i].length; b++) {

                if (fileContent[i][b] == null || fileContent[i][b].isEmpty() || fileContent[i][b].trim().length() == 0) {
                    loc[i][0]++;

                } else if (fileContent[i][b].contains("//")) {
                    loc[i][1]++;

                } else {
                    loc[i][2]++;
                }
            }
        }
    }

}
