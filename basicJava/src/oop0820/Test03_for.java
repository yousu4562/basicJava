package oop0820;

public class Test03_for {

	public static void main(String[] args) {
		// 이중반복문
		for(int a=1; a<=4; a=a+1) {
			for(int b=1; b<=4; b=b+1) {
				System.out.print("*");
				System.out.print(a);
				System.out.print(b);
			}// for end
			System.out.println();
		}// for end
		/*
		a=1 -> a<=4 true ->
		b=1 -> b<=4 true -> *ab 출력 -> b=2 ->
		b<=4 true -> *ab 출력 -> b=3 ->
		b<=4 true -> *ab 출력 -> b=4 ->
		b<=4 true -> *ab 출력 -> b=5 ->
		b<=4 false -> for b end -> 줄바꿈 -> a=2 ->
		a<=4 true -> 
		b=1 -> b<=4 true -> *ab 출력 -> b=2 ->
		b<=4 true -> *ab 출력 -> b=3 ->
		b<=4 true -> *ab 출력 -> b=4 ->
		b<=4 true -> *ab 출력 -> b=5 ->
		b<=4 false -> for b end -> 줄바꿈 -> a=3 ->
		*/
		
		// 회전수 증가
				for(int a=1; a<=4; a=a+1) {
					for(int b=1; b<=a; b=b+1) {
						System.out.print("@");
						System.out.print(a);
						System.out.print(b);
					}// for end
					System.out.println();
				}// for end
				
				
				/*
				a=1 -> a<=4 true ->
				b=1 -> b<=a(2) true -> @ab 출력 -> b=2 ->
				b<=1 false -> for b end -> 줄바꿈 -> a=2 ->
				
				a<=4 true -> 
				b=1 -> b<=a(2) true -> @ab 출력 -> b=2 ->
				b<=2 true -> @ab 출력 -> b=3 ->
				b<=2 false -> for b end -> 줄바꿈 -> a=3 ->
				
				a<=4 true ->
				b=1 -> b<=a(3) true -> @ab 출력 -> b=2 ->
				b<=3 true -> @ab 출력 -> b=3 ->
				b<=3 true -> @ab 출력 -> b=4 ->
				b<=3 false -> for b end -> 줄바꿈 -> a=4 ->
				
				a<=4 true ->
				b=1 -> b<=a(4) true -> @ab 출력 -> b=2 ->
				b<=4 true -> @ab 출력 -> b=3 ->
				b<=4 true -> @ab 출력 -> b=4 ->
				b<=4 true -> @ab 출력 -> b=5 ->
				b<=4 false -> for b end -> 줄바꿈 -> a=5 ->
				
				a<=4 false -> for a end -> 종료
				*/
		
				
		// 회전수 감소
		int a=0, b=0;
		for (a=4; a>=1; a=a-1) {
			for(b=1; b<=a; b=b+1) {
				System.out.print("#");
			}//for end
			System.out.println();
		}//for end
		
		/*
		a=4 4>=1
				b=1 1<=4 # b=b+1
					2<=4 # b=b+1
					3<=4 # b=b+1
					4<=4 # b=b+1
		a=a-1 3>=1
				b=1 1<=3 # b=b+1
					2<=3 # b=b+1
					3<=3 # b=b+1
		a=a-1 2>=1
				b=1 1<=2 # b=b+1
					2<=2 # b=b+1
		a=a-1 1>=1
				b=1 1<=1 # b=b+1
		a=a-1 0>=1 
		*/
		
		System.out.println(a+b); // 2
		// b 변수가 마지막으로 빠져나온 조건 = 2일때
		// a 변수가 마지막으로 빠져나온 저건 = 0일때
		// 따라서 a+b=2
		
		
		
		
		
		
		
				
				
				
				
	} // main() end

} // class end
