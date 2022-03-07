public class ArrangeNumbersInArray {
    public static void arrange(int[] arr, int n) {
        int size = arr.length;
        int val = 1;//for odd
        int val2=size-1;//for off n
        int val3= size;//for even n
        
        if(n==0){
            return;
        }
        
//         odd elements
    	for(int i = 0; i<=((size-1)/2); i++){
            
            arr[i] = val;
            val+=2;
        }for(int j =(((size-1)/2)+1); j<size;j++  ){
            if(n%2==0){
                arr[j]=val3;
                val3-=2;
            }else{
                arr[j]=val2;
                val2-=2;
            }
        }
    }
}