package Q_3_1;

/*
*3.1* 한 개로 세개 : 배열 한개로 스택 세 개를 어떻게 구현할지 설명하라.
 */

public class ThreeIntStacks {
	
		private int numberOfStacks = 3; // 3개 스택
		
		public int[] pointers; //포인터
		private int[] stack; //스택
		private int max; //최대 용량 
		
		//생성자
		public ThreeIntStacks(int capacity) {
			stack = new int[capacity];
			max = capacity / numberOfStacks;
			pointers = new int[] {0, max*2, max*3};
		}
		
		public int push(int stackNumber, int x) { // stackNumber : 1,2,3
			int thisPointer =  pointers[stackNumber-1];
			int thisMax = max * stackNumber;
			
			if ( thisPointer >= thisMax ) throw new OverflowException();
						
			return stack[thisPointer++] = x;
		}
		
		public int pop(int stackNumber) throws EmptyException {
			int thisPointer =  pointers[stackNumber-1];
			int thisMinimum = max * (stackNumber-1);
			
			if (thisPointer <= thisMinimum ) throw new EmptyException();
				
			return stack[--thisPointer];
		}
		
		public class OverflowException extends RuntimeException {
			public OverflowException() {}
		}
		
		public class EmptyException extends RuntimeException {
			public EmptyException() {}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub	
		}
}


