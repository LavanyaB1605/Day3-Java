//To print the elements of an array in reverse order
public class ReverseArray {
    public static void main(String args[]) {
        int array[] = {10, 8, 6, 4, 2, 0};
        System.out.println("Elements of the given array are:");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nGiven Elements in Reverse Order:");
        for(int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+  " ");
        }
    }
}
