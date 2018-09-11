package classofarrays;

public class ClassOfArrays {

    public static void main(String[] args) {
        
        int[] jacksonArray;
        jacksonArray = new int[5]; //physical size of array, indexing 0-4
        jacksonArray[0] = 13;
        jacksonArray[1] = 0;
        jacksonArray[2] = 19;
        jacksonArray[3] = 21;
        jacksonArray[4] = 220;
    }
    
    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
}
