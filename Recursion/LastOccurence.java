 public class LastOccurence{
    public static int LastOcc(int arr[], int key, int i){
        if(i == arr.length-1){
            return -1;
        }
        int isfound = LastOcc(arr, key, i+1);

        if(isfound == -1 && arr[i] == key){
            return i;
        }
       return isfound;
    }  
        public static void main(String[] args){
            int arr[] = {5,4,6,7,8,9,4,2,3};
            System.out.println(LastOcc(arr, 4, 0));
        }
    
}