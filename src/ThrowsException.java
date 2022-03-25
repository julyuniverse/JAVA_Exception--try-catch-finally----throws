import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    // throws로 설정하면 해당 메서드, 즉 loadClass() 메서드에서 예외 처리를 하는 것이 아니라 이 메서드를 호출해서 사용하는 쪽에서 예외 처리를 하라는 것.
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생
        Class c = Class.forName(className); // ClassNotFoundException 발생
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();

        // loadClass() 메서드에서 throws를 설정하였기 때문에 호출해서 사용하는 쪽에서 예외 처리를 해야 한다.
        try {
            test.loadClass("a2.txt", "java.lang.Stringgggggg");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) { // 위 두 개의 exception 처리 말고도 어떤 오류가 발생될지 모를 때에는 Exception가 최상위 클래스이기 때문에 Exception 클래스로 받아서 처리하여도 된다.
            System.out.println(e);
        }

        try {
            test.loadClass("a2.txt", "java.lang.Stringgggggg");
        } catch (FileNotFoundException | ClassNotFoundException e) { // 여러 개의 예외가 발생하는 경우 예외들을 묶어서 하나의 방법으로 처리
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("end");

        // 결과
        // java.lang.ClassNotFoundException: java.lang.Stringgggggg
        // java.lang.ClassNotFoundException: java.lang.Stringgggggg
        // end
    }
}
