public class RowWiseSum {
   
	public static void rowWiseSum(int[][] mat) {
        int sum = 0;
        
		for(int i = 0; i<mat.length; i++){
            sum = 0;
            for(int j = 0; j<mat[i].length; j++){
                sum+= mat[i][j];
                
            }
            System.out.print(sum+" ");
        }
        
	}

}