/*
 *1.8*  0행렬 : 
 	M * N 행렬의 한 원소가 0일 경우, 해당 원소가 속한 행과 열의 모든 원소를 0으로 설정하는 알고리즘을 작성하라.
 */

public class Q_1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] testArray = { {1,1,1,1,1},{1,1,1,1,1},{1,1,1,0,1} };
		
		int [][] res = makeZero(testArray);
		for (int m=0; m<res.length; m++) {
            for (int n=0; n<res[m].length; n++){
                System.out.print(res[m][n]);
            }
            System.out.println(" ");
        }
	}
	
	public static int[][] makeZero(int[][] mnArray){
        boolean [] row = new boolean[mnArray.length];
        boolean [] column = new boolean[mnArray[0].length];
    
        for (int m=0; m<mnArray.length; m++) {
            for (int n=0; n<mnArray[m].length; n++){
                if (mnArray[m][n] == 0) {
                    row[m] = true;
                    column[n] = true;
                }
            }
        }
        
        for (int i=0; i<row.length; i++){
            if (row[i] == true){
                for (int j=0; j<mnArray[i].length; j++){
                  mnArray[i][j] = 0; 
                }
            }
        }
        
        for (int i=0; i<column.length; i++){
            if (column[i] == true){
                for (int j=0; j<mnArray.length; j++){
                  mnArray[j][i] = 0; 
                }
            }
        }
  
        return mnArray;
    }
}
