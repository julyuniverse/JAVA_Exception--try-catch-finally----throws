import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling3 {
    public static void main(String[] args) {
        // java 7 이전까지 finally를 통해 fis.close()를 처리했지만 java 7 이상부터는 try() 내부에 바로 선언하면 해당 try-catch 문이 끝나면 자동으로 자원을 종료 즉, close 처리를 해준다.
        try (FileInputStream fis = new FileInputStream("a.txt")) {
            System.out.println("read");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("end");

        // 결과
        // java.io.FileNotFoundException: a.txt (그런 파일이나 디렉터리가 없습니다)
        //	at java.base/java.io.FileInputStream.open0(Native Method)
        //	at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        //	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        //	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
        //	at FileExceptionHandling3.main(FileExceptionHandling3.java:8)
        // end
    }
}
