/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asg2;

import Excel.Generate;
import Excel.TotalData;
import handler.IdenAdap;
import handler.Scan;
import folder.FileList;
import folder.Path;
import java.io.File;

public class Main {

    public static final String PATHFOLDER = "testfile";
    public static final String FILENAME = "Result.xlsx";

    public static void main(String[] args) {

        File file = new File(Path.getPath(PATHFOLDER));
        FileList listFile = new FileList();
        String arrayListFile[] = listFile.listFilesForFolder(file).getFileList();

        Scan scanFile = new Scan();
        String fileContent[][] = scanFile.getFileContent(arrayListFile, PATHFOLDER);
        int numberOfFiles = scanFile.getNumberOfFiles();

        IdenAdap identify = new IdenAdap(fileContent);

        String[] javaKeywords = identify.getJavaKeywords();
        int[][] countKeywords = identify.getCountKeywords();

        int[][] LOC = identify.getLOC();

        String name[] = identify.getName();
        String matrics[] = identify.getMatrics();
        String course = identify.getCourse();
        String group = identify.getGroup();
        String semester = identify.getSemester();
        String task = identify.getTask();

        TotalData totaldata = new TotalData(name, matrics, course, group, semester, task, javaKeywords, countKeywords, LOC);
        int sumOfKeywords[][] = totaldata.getSumOfKeywords();
        String[] distMatrics = totaldata.getDistMatrics();
        int[] totalMatrics = totaldata.getSumOfEachMatrics();

        int[][] totalLOC = totaldata.getTotalLOC();
        Generate generate = new Generate(FILENAME);
        generate.setHeader(semester, course, group, task).setKeyword(javaKeywords);
        generate.setData(sumOfKeywords, javaKeywords, distMatrics, totalLOC, totalMatrics);
        generate.processDataObject().createExcel().write();
    }

}
