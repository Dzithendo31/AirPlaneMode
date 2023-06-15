public class reverse{
    public static void main(String[] args) {
        
        int[] arr = {2,3,4,5,6,6};
        int[] rev = new int[arr.length];

        for (int i = 0; i < rev.length; i++) {
            rev[i] = arr[arr.length-i];
        }

        //print the output
        for (int i : rev) {
            System.out.print(i);
            System.out.print(",");
        }
    }

    public static int[] reverse(int[] Original_array){

        return reversedArray;
    }
}