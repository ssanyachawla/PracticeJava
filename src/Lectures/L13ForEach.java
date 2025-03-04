package Lectures;
//Syntax:
// for(type var:array){
//     statements using var
// }

//type- data type of elements in array
//var- variable that holds the current element during each iteration
//array- array being iterated over


//public class L13ForEach {
//    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5};
//
//        for(int e:arr){
//            System.out.print(e+" ");
//        }
//    }
//}

public class L13ForEach {
    public static void main(String[] args) {
        int[] marks={125, 132, 95, 116, 110};
        int max=findMax(marks);
        System.out.println(""+max);
    }
    public static int findMax(int[] n){
        int maximum=n[0];

        for(int n1:n){
            if (n1 > maximum) {
                maximum=n1;
            }
        }
        return maximum;

    }
}

