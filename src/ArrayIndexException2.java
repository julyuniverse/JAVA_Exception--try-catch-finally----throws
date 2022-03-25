public class ArrayIndexException2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i <= 5; i++) { // index 5가 없기 때문에 오류가 남.
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException 클래스를 활용
            System.out.println(e.getMessage());
            System.out.println(e);
        }

        System.out.println("here"); // 예외 처리를 했기 때문에 해당 출력문은 출력이 된다.

        // 결과
        // 1
        // 2
        // 3
        // 4
        // 5
        // Index 5 out of bounds for length 5
        // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // here
    }
}
