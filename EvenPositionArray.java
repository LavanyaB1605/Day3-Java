//To print the elements of an array present on an even position
public class EvenPositionArray {
    public static void main(String args[]) {
        int array[] = {98, 40, 23, 16, 42, 65};
        for (int i = 1; i < array.length; i = i+2) {
            System.out.println("Elements of an array present on an even position:" + array[i]);
        }
    }
}
