public class SecondLarge {
    public static void main(String args[]) {
        int array[] = {27, 76, 53, 97, 69};
        int first = array[1];
        int second = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > first) {
                second = first;
                first = array[i];
            }
            else if(array[i] < second && array[i] != first ) {
                second =   array[i];
            }
        }
        System.out.println("Second Largest Number of Array is:" +second);
    }
}
