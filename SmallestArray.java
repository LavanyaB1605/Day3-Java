//To print the smallest element in an array
public class SmallestArray {
    public static void main(String args[]) {
        int array[] = {98, 40, 23, 16, 42};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        System.out.println("Largest Element of this Array:" +min);
    }
}

