package oop0824;

public class Test03_method {
	
	public static void test() {
		test(); // 자신의 함수를 호출할수 있다.
	} // test() end
	
	public static long fact(int f) {
		if(f==0) {
			return 1;
		}else {
			return f*fact(f-1); // 재귀함수
		}// if end
	}// fact() end
	
	/*
		fact(0)
		f=0 -> f==0? true -> return 1
		fact(0) = 1
		
		fact(3)
		f=3 -> f==0? false -> else ->
		return 3*fact(2)
				 f=2 -> f==0? false -> else ->
				 return 2*fact(1)
				 	      f=1 -> f==0? false -> else ->
				 	      return 1*fact(0)
				 	      	       f=0 -> f==0? true -> return 1 ->
				 	  	  return 1*1 ->     
				 return 2*1*1 ->
		return 3*2*1*1
		fact(3) = 6	
	*/
	public static void main(String[] args) {
		// 재귀적 함수 호출
		// -> 자신이 자신의 함수를 호출할 수 있다.
		
		System.out.println(fact(3));

		
	} // main() end
} // class end
