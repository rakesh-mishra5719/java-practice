class NextPermutation {
     

    public static void nextPermutation(int[] arr) {
      int index1 = -1;
      int index2 = -1;
        int n = arr.length;
        for(int i = n-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                index1 = i;
                break;
            }
            
        }
        if(index1 == -1){
            reverse(arr,0);
            
        }
        else{
         for(int i=arr.length-1;i>=0;i--){
                if(arr[i]>arr[index1]){
                    index2=i;
                    break;
                }
            }
            swap(arr,index1,index2);
            reverse(arr,index1 +1);
        

        
        } 
    }
   public static void swap(int [] arr,int i,int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr,int start){
        int i = start;
        int j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,0,0};
        nextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}