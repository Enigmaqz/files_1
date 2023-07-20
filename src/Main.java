import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String logFileName;
        String[] rootFolders = {"src", "res", "savegames", "temp"};
        for (int i = 0; i <= rootFolders.length - 1; i++) {
            logFileName = "/Users/Shared/Games/" + rootFolders[i];
            File dir = new File(logFileName);
            if (dir.mkdir()) {
                //System.out.println("Каталог " + logFileName + " создан");
                sb.append("Каталог " + logFileName + " создан\n");
            }
        }

        String[] srcFolders = {"main", "test"};
        for (int i = 0; i <= srcFolders.length - 1; i++) {
            logFileName = "/Users/Shared/Games/src/" + srcFolders[i];
            File dir = new File(logFileName);
            if (dir.mkdir()) {
                //System.out.println("Каталог " + logFileName + " создан");
                sb.append("Каталог " + logFileName + " создан\n");
            }
        }

        String[] mainFiles = {"Main.java", "Utils.java"};
        for (int i = 0; i <= mainFiles.length - 1; i++) {
            logFileName = "/Users/Shared/Games/src/main/" + mainFiles[i];
            File myFile = new File(logFileName);
            try {
                if (myFile.createNewFile()) {
                    //System.out.println("Файл " + logFileName + " был создан");
                    sb.append("Файл " + logFileName + " был создан\n");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        String[] resFolders = {"drawables", "vectors", "icons"};
        for (int i = 0; i <= resFolders.length - 1; i++) {
            logFileName = "/Users/Shared/Games/res/" + resFolders[i];
            File dir = new File(logFileName);
            if (dir.mkdir()) {
                //System.out.println("Каталог " + logFileName + " создан");
                sb.append("Каталог " + logFileName + " создан\n");
            }
        }

        logFileName = "/Users/Shared/Games/temp/temp.txt";
        File myFile = new File(logFileName);
        try {
            if (myFile.createNewFile()) {
                //System.out.println("Файл " + logFileName + " был создан");
                sb.append("Файл " + logFileName + " был создан");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String text = sb.toString();
        try (FileOutputStream fos = new FileOutputStream(logFileName)) {
            byte[] bytes = text.getBytes();
            fos.write(bytes, 0, bytes.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}