import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling2 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
            System.out.println("read");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return; // 여기서 return을 하면 해당 try-catch 문 이후 실행문은 실행되지 않지만 해당 try-catch 문의 finally는 항상 불린다.
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("finally");
        }

        System.out.println("end");

        // 결과
        // java.io.FileNotFoundException: a.txt (그런 파일이나 디렉터리가 없습니다)
        // finally
    }
}
