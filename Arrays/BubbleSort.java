/*
 *     Bubble Sort
 * 
 *     Idea - Large elements come to the end of array by Swapping With adjacent elements
 */

 
public class BubbleSort {

    public static void sortArray(int array[]) {
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1; j++){
                if (array[j]>array[j+1]) {
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        } 
    }

    public static void main(String args[]) {
        int array[]={8,7,6,5,4,3,2,1,0};
        sortArray(array);
        
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    
}
/*sortArray Method:
The sortArray method takes an integer array as input and sorts it using the bubble sort algorithm.
It uses two nested loops to repeatedly compare adjacent elements in the array and swap them if they are in the wrong order.
The outer loop iterates through the array from the beginning to the second-to-last element.
The inner loop iterates through the unsorted portion of the array, comparing adjacent elements and swapping them if necessary to move the largest element to the end of the unsorted portion.
This process is repeated for each element in the array, gradually "bubbling up" the largest element to its correct position.
main Method:
In the main method, an integer array array is declared and initialized with values in reverse order (from 8 to 0).
The sortArray method is called to sort the array in ascending order.
After sorting, a loop is used to iterate through the sorted array, and each element is printed to the console separated by spaces.
Overall, this code demonstrates the bubble sort algorithm, which is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the entire array is sorted in ascending order.
*/





/*
 *    Output:
 *    0 1 2 3 4 5 6 7 8
 */
