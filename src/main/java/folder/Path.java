package folder;

import java.io.File;
import java.nio.file.Paths;
import java.util.LinkedList;

public class Path {
    
    public static String getPath(String folderName) {
        return System.getProperty("user.dir") + File.separator + folderName;
    }

}
