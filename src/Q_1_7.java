/*
 *1.7* 행렬회전 : 
 	이미지를 표현하는 N * N 행렬이 있다. 
 	이미지의 각 픽셀은 4바이트로 표현된다. 
 	이때, 이미지를 90도 회전시키는 메서드를 작성하라. 
 	행렬을 추가로 사용하지 않고서도 할 수 있겠는가?
 */

public class Q_1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] inputArr = { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		int[][] newArr = rotate90(inputArr);
		
		// 결과확인
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr.length; j++) {
				System.out.println(newArr[i][j]);
			}
			System.out.println("----------");
		}
	}
	
	public static int[][] rotate90(int[][] arr) {
		int[][] newArray = new int[arr.length][arr.length];
		
		// 기존 행렬을 세로로, 거꾸로(밑에서부터 위로) 다시 담는다.
		// 시계 방향으로 회전.i, j 역할을 바꾸면 반시계 방향도 가능
		
		for (int i = 0; i < arr.length; i ++) {
			int j = arr.length - 1;
			int column = 0;
			
			while (j >= 0) {
				newArray[i][column] = arr[j][i];
				j--;
				column ++;
			}
		}
		return newArray;
	}
}
