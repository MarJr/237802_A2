package folder;

import java.io.File;
import java.util.LinkedList;

public class FileList {

    private LinkedList<String> FileNameList;

    public FileList() {
        FileNameList = new LinkedList();
    }

    public FileList listFilesForFolder(final File folder) {

        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                this.listFilesForFolder(fileEntry);
            } else {
                addToList(fileEntry.getName());
            }
        }
        return this;
    }

    public void addToList(String fileExt) {
        if (JavaExtension(fileExt)) {
            FileNameList.add(fileExt);
        }
    }

    public String[] getFileList() {
        String arrayOfFileName[] = new String[FileNameList.size()];

        for (int i = 0; i < FileNameList.size(); i++) {
            arrayOfFileName[i] = FileNameList.get(i);
        }
        return arrayOfFileName;
    }

    @Override
    public String toString() {
        String fileNameString = "";

        for (int i = 0; i < FileNameList.size(); i++) {
            fileNameString += FileNameList.get(i);
        }
        return fileNameString;
    }

    public boolean JavaExtension(String fileExt) {
        if (fileExt.substring(fileExt.length() - 4).equalsIgnoreCase("Java")) {
            return true;
        }
        return false;
    }
}
