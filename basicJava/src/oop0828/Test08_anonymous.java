package oop0828;

interface IMessage{
	public void msgPrint();
}//interface end

class Message implements IMessage{
	@Override
	public void msgPrint() {
		System.out.println("Message클래스");
	}
}//class end

public class Test08_anonymous {
	public static void main(String[] args) {
		//익명 내부 클래스 Anonymous class
		
		//인터페이스는 직접 객체 생성할 수 없다.
		//IMessage msg =new IMessage(); 에러
		
		//1) 구현한 클래스
		Message msg=new Message();
		msg.msgPrint();
		
		//2) 다형성
		IMessage imess=new Message();
		imess.msgPrint();
		
		//3) 익명개체
		//-> 필요한 곳에서 일시적으로 생성
		//-> 이벤트
		//-> 모바일앱, JavaScript, jQuery등에서 많이 사용된다.
		//-> 예)$("button").click(function)(){})  // jQuery
		IMessage mess=new IMessage() {
			@Override
			public void msgPrint() {
				System.out.println("익명객체");
			}
		};
		
		mess.msgPrint();
	}//main() end
}//class end
