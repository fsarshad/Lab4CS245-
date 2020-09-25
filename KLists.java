import java.util.Arrays;


// Your implementation must be encapsulated in a Java class called “KLists”.
// The entire implementation must be contained within this class.
// The file in which this class is written must be named KLists.java.
public class KLists {
    // implementation must contain one public function with the following header:
    public static double [] mergeKLists(double[][] outerArray){
        int size = 0;
        //size of the super sorted array
        for (int i = 0; i < outerArray.length; i++){
            size = size + outerArray[i].length;
        }
        double [] array = new double[size];
        int index = 0;
        //checks the outerArray length
        //returns Sorted Array
        for (int i = 0; i < outerArray.length; i++){
            for (int j = 0; j < outerArray [i].length; j++){
                array [index] = outerArray [i][j];
                  index++;
            }
        }
        return sort(array);
    }

    // used the selection sort algorithm...Origionaly, I was going to do merge sort but
    // by the time i finished
    // and ran it didn't pick up duplicate numbers and did not give me the right
    // output. So I scratched that and created this method below.
    // A selection sort method. The examples ended up working with selection sort.
    // Also i realized that merge sort was to complicated.
    // I had like a ton of the methods required for merge sort like left right and merge. But it was not working
    // So decided to switch it to selection sort and realized I should have done this from the start.
    static double [] sort(double array[])
    {
        int size = array.length;
        for (int i = 0; i < size-1; i++)
        {
            int smallest = i;
            for (int j = i+1; j < size; j++)
                if (array[j] < array[smallest])
                    smallest = j;
            double variable =  array[smallest];
            array[smallest] = array[i];
            array[i] = variable;
        }
        return array;
    }

    // this is where you will enter in the array.
    // I am so sorry about this but you will have to use squigally brackets instead of
    // normal brackets to run the program. So everytime you copy in the array list you will
    // have to switch it to Squigally brackets.It is shown on line 52.
    // SORRY!!! :(

    public static void main(String[] args){
        double [][] outerArray = new double[][] {{1.1, 4.4, 5.5}, {1.1, 3.3, 4.4}, {2.2, 6.6}};
        System.out.print(Arrays.toString(mergeKLists(outerArray)));
    }
}
