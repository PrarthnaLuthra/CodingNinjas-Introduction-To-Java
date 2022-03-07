public class WavePrint {
    
    public static void wavePrint(int mat[][]){
        int rows = mat.length;
        int cols = 0;
        if(rows!=0){
            cols = mat[0].length;
        }
        for(int j = 0;j<cols;j++){
            if(j%2==0){
                for(int i = 0;i<rows;i++){
                    System.out.print(mat[i][j]+ " ");
                }
            }
            else{
                for(int i = rows-1 ;i>=0;i--){
                    System.out.print(mat[i][j]+ " ");
                }
            }
        }

    }
}