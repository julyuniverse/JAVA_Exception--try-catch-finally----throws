import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
            System.out.println("read");

            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);

            try {
                fis.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }

        System.out.println("end");

        // 결과
        // java.io.FileNotFoundException: a.txt (그런 파일이나 디렉터리가 없습니다)
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.io.FileInputStream.close()" because "fis" is null
        //	 at FileExceptionHandling.main(FileExceptionHandling.java:23)
    }
}
