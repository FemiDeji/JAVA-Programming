public class JavaArrays {
    public static void main(String[]args){
        // data_type[]name_of_array = {elem1, elem2, ...};
//        int[] numbers = {1, 2, 3, 4, 5};
//        int size = 5;
//
//        //indexing
//        for (int i = 0; i < size; i++){
//            System.out.println(numbers[i]);
//        }

       // multi-dimensional arrays
        int[][] numbers = {{1, 2}, {3, 4}, {5, 6}};


       // nested for loops
       for (int i = 0; i <= 2; i++){
           for (int j = 0; j <= 1; j++){
               System.out.print(numbers[i][j] + " ");
           }
           System.out.println();
       }
    }
}
