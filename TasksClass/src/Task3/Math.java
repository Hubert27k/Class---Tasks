package Task3;

public class Math {
    public static final double PI = 3.14;

    public static double circumferenceCircle(double r){
        return 2* PI* r;
    }
    public static double fieldCircle(double r){
        return PI*r*r;
    }
    public static double circumferenceRectangle(double a, double b){
        return 2* (a+b);
    }
    public static double fieldRectangle(double a, double b){
        return a * b;
    }
    public static int sum (int[] array1){
        int sum = 0;
        for(int i = 0; i < array1.length; i++){
            sum += array1[i];
        }
        return sum;
    }
    public static int average1(int[] array1){
        int average1 = sum(array1)/array1.length;
        return average1;

    }
    public static int min(int[] array1){
        int min = Integer.MAX_VALUE;
        for(int i=0; i < array1.length; i++){
            if(array1[i] < min) {
                min = array1[i];
            }
        }
        return min;
    }
    public static int max(int[] array1){
        int max = Integer.MIN_VALUE;
        for(int i=0; i < array1.length; i++){
            if (array1[i]>max) {
                max = array1[i];
            }
        }
        return max;

    }
}
