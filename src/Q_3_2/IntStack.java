package Q_3_2;
/*
*3.2* *스택Min* :
기본적인 push와 pop 기능이 구현된 스택에서 최솟값을 반환하는 min함수를 추가하려고 한다. 어떻게 설계할 수 있겠는가? 
push, pop, min연산은 모두 O(1) 시간에 동작해야 한다.
*/

public class IntStack {
	private int pointer;      //포인터
	private int[] stack;      //스택
	private int max;          //최대 용량 
	private int[] minimumValue; //최솟값 
		
	//생성자
	public IntStack(int capacity) {
		pointer = 0;
		stack = new int[capacity];
		max = capacity;
	}
		
	public int push(int x) {
		if (pointer >= max) throw new OverflowException();
		
		// push 할 때 minimumValue 추가
		if (pointer == 0 || x < minimumValue[pointer-1]) {
			minimumValue[pointer] = x;
		} else {
			minimumValue[pointer] = minimumValue[pointer-1];
		}
		return stack[pointer++] = x;
	}
		
	public int pop() throws EmptyException {
		if (pointer <= 0 ) throw new EmptyException();
		minimumValue[pointer] = null;
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
