public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseableObj obj = new AutoCloseableObj();

        try (obj) {
            // AutoCloseable을 구현한 클래스인 AutoCloseableObj가 잘 불리는지 확인
            // closing...

            // 강제로 exception 발생
            throw new Exception();
        } catch (Exception e) {
            System.out.println("exception");
        }

        System.out.println("end");

        // 결과
        // closing...
        // exception
        // end
    }
}
