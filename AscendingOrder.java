public class AscendingOrder {
    public static void main(String args[]) {
        int array[] = {36, 99, 44, 87, 65};
        int order = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    order = array[i];
                    array[i] = array[j];
                    array[j] = order;
                }
            }
        }
        System.out.println();
        System.out.printf("Array Arranged in Ascending Order \n");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
