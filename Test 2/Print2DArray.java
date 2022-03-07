public class Print2DArray {
    public static void print2DArray(int input[][]) {
		int n =input.length;
        int m = 0;
        if(n!=0){
            m=input[0].length;
        }for(int i=0;i<n;i++){
            for(int count = 0; count<n-i; count++){
            for(int j=0;j<m;j++){
                
                System.out.print(input[i][j]+" ");
               
                    
            } System.out.println();
        }

	}
}
}