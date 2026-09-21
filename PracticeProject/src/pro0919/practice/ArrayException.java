package pro0919.practice;

public class ArrayException {
    public static void main(String[] args) {
        int myId = 2025314032;
        String myName = "허영훈";
        System.out.println("학번: " + myId + "\n" + "이름: " + myName + "\n");

        int[] intArray = new int[5];
        intArray[0] = 0;
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
                intArray[i + 1] = i + 1 + intArray[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }
    }
}
