public class MajorityElements {
    public static int Print(int arr[]){
        int majCount = arr.length/2;

        for(int i=0; i<arr.length; i++){
            int count =0 ;
            for(int j=0; j<arr.length ;j++){
                if (arr[j] == arr[i]){
                count ++;


            }
        }
        if(count > majCount){
            return arr[i];
        }

    }
    return -1;
}
    public static void main(String args[]){
        int arr[] = {3,2,3, 3,4};
        System.out.println(Print(arr));
    
}
}
