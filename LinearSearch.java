class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9};
        int target = 7;
        int ans = linear(arr, target);
        System.out.println(ans);
    }
    static int linear(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}