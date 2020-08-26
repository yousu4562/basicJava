package oop0826;

class Bbs{
	private int bbsno;		//글번호
	private String writer;	//글작성자
	private String subject;	//글제목

	public Bbs() {}
	
	public int getBbsno() {
		return this.bbsno;
	}
	public void setBbsno(int bbsno) {
		this.bbsno=bbsno;
	}
	
	public String getWriter() {
		return this.writer;
	}
	public void setWriter(String writer) {
		this.writer=writer;
	}
	
	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
}//class end


class Member{
	private int memberno;	//일련번호
	private String id;		//아이디
	private String passwd; 	//비밀번호
	private String email;	//이메일
	
	public Member() {} 		//생성자 함수
	
	//getter와  setter 함수 자동 코딩 추가
	//메뉴 Source
	//-> Generate Getters and Setters
	public int getMemberno() {
		return memberno;
	}

	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		
	
}//class end


public class Test04_getset {
	public static void main(String[] args) {
		// getter와 setter함수
		/* 함수명 작성 규칙
		  	is~~~() 대부분 boolean으로 반환
		  	to~~~() to뒤의 값으로 변환
		  	get~~~() 대부분 리턴값이 존재
		  	set~~~() 원하는 값으로 변환		  	
		 */
		
		//getter 함수 작성 규칙
		//-> get 멤버변수의 첫글자를 대문자로 바꾼 후 함수명()
		
		
		//setter 함수 작성 규칙
		//-> set 멤버변수의 첫글자를 대문자로 바꾼 후 함수명()
		
		Bbs bbs=new Bbs();
		bbs.setBbsno(1);
		bbs.setWriter("무궁화");
		bbs.setSubject("오필승코리아");
		
		System.out.println(bbs.getBbsno());
		System.out.println(bbs.getWriter());
		System.out.println(bbs.getSubject());
		
	}//main() end
}//class end
