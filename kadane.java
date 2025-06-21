public class Second_greatest {
    public int getSecondLargest(int[] arr) {
        int greatest = arr[0];
        for(int i=0; i<=arr.length; i++){
           if(arr[i]<greatest){
               greatest = arr[i];
           } 
           else{
               return -1;
           }
        }// Code Here
        return greatest;
    }
    
    public static void main (string[] args){
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println("The greatest element in array is : " +getSecondLargest(arr));
    }
}
