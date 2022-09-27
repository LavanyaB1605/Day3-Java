//To print the elements of an array
public class ElementArray {
    public static void main(String args[]) {
        int array[] = {10, 8, 6, 4, 2, 0, -2, -4, -6, -8};
        System.out.println("Elements of the given array are:");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
