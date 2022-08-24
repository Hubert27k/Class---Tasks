import Task1.Developer;
import Task2.CountingArray;
import Task3.Math;


public class TasksClass {
    public static void main(String[] args){
        /*Task.1 Create a class named "Developer" with:

        a) fields: name, lastName, language, earnings

        b) methods: getName (), getLastName (), getLanguage (), getFee (), which will return data from the corresponding fields

        c) constructor, accepting and setting values for all fields of the class with arguments: giveName, giveLastName, giveLanguage, giveEarnings

        d) fields will be private and methods and constructor will be public

        e) test everything in main: create an object with the completed data and call methods by printing the data to the screen

         */
        System.out.println();
        System.out.println("Task1");
        Developer developer1 = new Developer("Hubert","Kwiatkowski","English", 3000);
        System.out.println("Name of developer1: " + developer1.getName()+" "+ developer1.getLastName());
        System.out.println("Language: "+developer1.getLanguage());
        System.out.println("Eatnings: "+developer1.getEarnings());

        /*
        Task2
        Write a class that will take an array in the constructor and will have four methods:
        - counting the sum of all elements from the array
        - counting the average
        - finding the min value
        - finding the max value

        Each method should return the result as an int.
        Create a field that stores the array. Assume there will be only integers in the array.
        The fields will be private and the methods and constructor will be public.
        Name the class, field and methods as you see fit.
        Test it all in main.
         */
        System.out.println();
        System.out.println("Task2");
        int [] array = {2, 325, 8, 22, 50};
        CountingArray counting = new CountingArray(array);
        System.out.println("Sum: "+counting.sum());
        System.out.println("Average: "+counting.average1());
        System.out.println("Min value: "+ counting.min());
        System.out.println("Max value: " + counting.max() );

        /*
        Task3
        Create your own class called "Math". Add the counting methods in it:
        - circumference and area of the circle (takes the radius of the circle as an argument to the method)
        - circumference and area of the rectangle (takes the length of a and b side as arguments to the method)

        Make the methods static and return a result of the appropriate type.
        Additionally, create a static, constant field in the class that will hold the value PI = 3.14.
        Use your PI to calculate the circle.
        The fields and methods will be public.

        Extra Task:
        If you want, you can extend your Math class with the methods from task 2.
        However, you have to remember to slightly rewrite them so that they can be static methods.
         */
        System.out.println();
        System.out.println("Task3");
        System.out.println("circumference of the circle: "+ Math.circumferenceCircle(20));
        System.out.println("circumference of the rectangle: "+ Math.circumferenceRectangle(20, 30));
        System.out.println("field of the circle: "+ Math.fieldCircle(20));
        System.out.println("field of the rectangle: "+ Math.fieldRectangle(20, 30));

        System.out.println();
        System.out.println("Extra task");
        int[] arr = {1,5,6,7,9};
        System.out.println("Average: "+ Math.average1(arr));


    }
}
