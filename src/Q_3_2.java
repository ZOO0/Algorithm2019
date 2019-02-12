public class Q_3_2 {

	public class IntStack {
		private int pointer; //포인터
		private int[] stack; //스택
		private int max; //최대 용량 
		private int minimumValue; //최솟값 
		
		//생성자
		public IntStack(int capacity) {
			pointer = 0;
			stack = new int[capacity];
			max = capacity;
		}
		
		public int push(int x) {
			if (pointer >= max) throw new OverflowException();
			
			// push 할 때 minimumValue 초기화 
			if (pointer == 0 || x < minimumValue) {
				minimumValue = x;
			}
						
			return stack[pointer++] = x;
		}
		
		public int pop() throws EmptyException {
			if (pointer <= 0 ) throw new EmptyException();
			
			// pop 할 때 minimumValue 가 문젠데............
			
						
			return stack[--pointer];
		}
		
		public int min() {
			return minimumValue;
		}
		
		public class OverflowException extends RuntimeException {
			public OverflowException() {}
		}
		
		public class EmptyException extends RuntimeException {
			public EmptyException() {}
		}
	}
	
	
}
