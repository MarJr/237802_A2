package handler;

import handler.identifyhandler.Comment;
import handler.identifyhandler.KeywordJava;
import handler.identifyhandler.LineCode;

public class IdenAdap {

    Comment comments;
    KeywordJava javaKeywords;
    LineCode loc;

    public IdenAdap(String fileContent[][]) {
        this.loc = new LineCode();
        this.comments = new Comment();
        this.javaKeywords = new KeywordJava();

        findAll(fileContent);
    }

    public void findAll(String fileContent[][]) {
        comments.findComments(fileContent);
        javaKeywords.findKeywords(fileContent);
        loc.findLOC(fileContent);
    }

    public String getSemester() {
        return comments.semester;
    }

    public String getCourse() {
        return comments.course;
    }

    public String getGroup() {
        return comments.group;
    }

    public String getTask() {
        return comments.task;
    }

    public String[] getName() {
        String name[] = new String[comments.name.size()];
        for (int i = 0; i < comments.name.size(); i++) {
            name[i] = comments.name.get(i);
        }
        return name;
    }

    public String[] getMatrics() {
        String matrics[] = new String[comments.matrics.size()];
        for (int i = 0; i < comments.name.size(); i++) {
            matrics[i] = comments.matrics.get(i);
        }
        return matrics;
    }

    public int[][] getCountKeywords() {
        return javaKeywords.countOfKeywords;
    }

    public String[] getJavaKeywords() {
        return javaKeywords.KEYWORDS;
    }

    public int[][] getLOC() {
        return loc.loc;
    }

}
