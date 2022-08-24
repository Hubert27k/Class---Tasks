package Task2;

public class CountingArray {
    private int[] array1;

    public CountingArray(int[] getArray){
        array1 = getArray;
    }
    public int sum (){
        int sum = 0;
        for(int i = 0; i < array1.length; i++){
            sum += array1[i];
        }
        return sum;
    }
    public int average1(){
        int average1 = sum()/array1.length;
        return average1;

    }
    public int min(){
        int min = Integer.MAX_VALUE;
        for(int i=0; i < array1.length; i++){
            if(array1[i] < min) {
                min = array1[i];
            }
        }
       return min;
    }
    public int max(){
        int max = Integer.MIN_VALUE;
        for(int i=0; i < array1.length; i++){
            if (array1[i]>max) {
                max = array1[i];
            }
        }
        return max;

    }
}
