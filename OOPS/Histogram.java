class Histo{
    void histogra(int arr[],int n){
        int i;
        int j;
        int ans = 0;
        for(i = 0; i<=n-1 ; i++ ){
            int counter =arr[i]; 
            for(j = i-1;j>=0 && arr[i]<=arr[j];j--){
                counter += arr[i];
            }
            for(j = i+1;j<n && arr[j] >= arr[i];j++){
                counter += arr[i];      

            }
            ans = max(ans,counter);
            
        }
        System.out.println(ans);
    }
    int max(int ans, int counter){
        if(ans >counter){

            return ans;
        }
        return counter;
    }
}

public class Histogram {
    public static void main(String[] args) {
        int arr[]= {2,1,3,4,2,5,6,3};
        Histo obj = new Histo();
        obj.histogra(arr,arr.length);
    }
}
