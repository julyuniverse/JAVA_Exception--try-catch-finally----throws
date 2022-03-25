public class ArrayIndexException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for(int i = 0; i <= 5; i++) { // index 5가 없기 때문에 오류가 남.
            System.out.println(arr[i]);
        }

        System.out.println("here"); // 오류가 나면서 시스템이 종료 되었기 때문에 해당 출력문은 출력되지 않는다.

        // 결과
        // 1
        // 2
        // 3
        // 4
        // 5
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // 	 at ArrayIndexException.main(ArrayIndexException.java:6)
    }
}
