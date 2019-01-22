import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        dirTree(new File("C:/Users/gene/Documents/Scripts"));
    }

    public static void dirTree(File dir) {
        File[] subdirs=dir.listFiles();
        for(File subdir: subdirs) {
            if (subdir.isDirectory()) {
                dirTree(subdir);
            } else {
                doFile(subdir);
            }
        }
    }

    public static void doFile(File file) {
        System.out.println(file.getAbsolutePath());
    }
}
