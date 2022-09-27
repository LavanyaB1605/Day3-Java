//To print the largest element in an array
public class LargestArray {
    public static void main(String args[]) {
        int array[] = {28, 70, 69, 16, 42};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        System.out.println("Largest Element of this Array:" +max);
    }
}
