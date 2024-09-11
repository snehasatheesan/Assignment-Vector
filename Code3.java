 //3. Write a Java program that initializes a `Vector` of strings with the values {"red", "green", "blue", "yellow"}.
    // Convert the vector to an array, print the array, then convert the array back to a vector and print the resulting vector.
package vector;
import java.util.Arrays;
import java.util.Vector;

public class Code3 {
   
    public static void main(String[] args) {
        Vector<String> sc=new Vector<>();
        sc.add("red");
        sc.add("green");
        sc.add("blue");
        sc.add("yellow");

        System.out.println("Converting Vector to Array: ");
        String arr[]=new String[sc.size()];
        sc.copyInto(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Converting Array to Vector: \n"+new Vector<>(Arrays.asList(arr)));
    }
}
