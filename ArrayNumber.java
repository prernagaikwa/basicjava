//finding largest number in arrsy
// public class ArrayNumber {
//     public static void  main(String[] args){
//         int[] arr = {10,3,11,7,99,45};
//         int largest = arr[0];
//         for(int i =0 ;i < arr.length ; i++){
//             if( arr[i] > largest){
//                 largest = arr[i];
//             }
//         }
//         System.out.println("largest number is :" +largest);
//     }
// }


//reverse the array
// public class ArrayNumber {
//     public static void main(String[] args){
//         int[] arr ={4,5,3,7,2};
//         int start =0;
//         int end = arr.length -1;
//         while(start < end){
//             int temp =arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start ++;
//             end --;
//         }

//         for(int num : arr){
//             System.out.print(num + " ");
//         }
//     }
// }




//finding duplicate element in array
// public class ArrayNumber {
//     public static void main(String[] args){
//         int[] arr = {1,4,4,2,1,6,8,6};
//         for(int i=0; i<arr.length ; i++){
//             for(int j=i+1 ; j<arr.length ; j++){
//                 if(arr[i] == arr[j]){
//                     System.out.println("Duplicate elements:" + arr[j]);
//                 }
//             }
//         }
//     }




//sorting an array without using sort() function 
public class ArrayNumber{
  public static void main(String[] args){
    int[] arr = { 4,2,5,7,3,9,1,6,8};
    for(int i =0; i<arr.length-1; i++){
        for(int j =0; j<arr.length-i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp ; 
            }
        }
    }
    for(int num : arr){
        System.out.print(num + " ");
    }
  }  
}

     
