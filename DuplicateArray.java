public class DuplicateArray {
    public static void main(String args[]) {
        int array[] = {2, 4, 8, 4, 9, 2, 7, 9};
        System.out.println("Duplicate elements of an array are:");
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j])
                    System.out.println(array[j]);
            }
        }
    }
}
