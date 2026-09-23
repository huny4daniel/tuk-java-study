package pro0921.practice;

public class IrregularArray {
    public static void main(String[] args) {
        int myId = 2025314032;
        String myName = "허영훈";
        System.out.println("학번: " + myId + "\n" + "이름: " + myName + "\n");

        int intArray[][] = new int[4][];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = new int[i + 1];
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = (i + 1) * 10 + (j + 1);
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
