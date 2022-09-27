public class OddPositionArray {
    public static void main(String args[]) {
        int array[] = {862, 679, 982, 425, 562, 265, 146};
        for (int i = 0; i < array.length; i = i+2) {
            System.out.println("Elements of an array present on an odd position:" + array[i]);
        }
    }
}
