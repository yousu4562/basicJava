package oop0825;

class Score{
  private String name="손흥민";//멤버변수
  private int kor, eng, mat;
  private int aver;
  
  //생성자함수를 오버로딩하면 기본생성자함수는
  //자동으로 생성되지 않는다. 그래서
  //기본생성자함수는 수동으로 생성할것을 강추!!
  public Score() {}
  
  public Score(String name, int kor, int eng, int mat) {
    this.name=name;//this.멤버변수=지역변수
    this.kor=kor;
    this.eng=eng;
    this.mat=mat;
    this.aver=(kor+eng+mat)/3;
  }//end
  
  
  public void disp() {
    //지역변수의 우선순위가 가장 높다
    //String name="박지성";//지역변수
    //System.out.println(name);     //박지성
    //this.멤버변수
    System.out.println(this.name);//손흥민
    System.out.println(this.kor);
    System.out.println(this.eng);
    System.out.println(this.mat);
    System.out.println(this.aver);
  }//disp() end
  
}//class end



public class Test03_this {
  public static void main(String[] args) {
    //this
    //->클래스 자신을 가리키는 대명사
    //->일반 지역변수와 멤버변수를 구분하기 위함
    //this()
    //->생성자 함수간의 호출
    
	  /*  
    Score one=new Score();
    one.disp();
    
    Score two=new Score("홍길동", 70, 80, 95);
    two.disp();
	   */
	  
//--------------------------------------------
	  
	  /*
	  Score kim = new Score("봉선화", 70, 85, 100);
	  Score lee = new Score("라일락", 60, 65, 30);
	  Score park = new Score("진달래", 50, 20, 90);
	  */
	  
	  //객체배열
	  Score[] score= {
			  new Score("봉선화", 70, 85, 100),
			  new Score("라일락", 60, 65, 30),
			  new Score("진달래", 50, 20, 90)
	  };
	  
	  int size=score.length; //3
	  /*
	  score[0].disp();
	  score[1].disp();
	  score[2].disp();
	  */
	  for(int i=0; i<size; i++) {
		  score[i].disp();
		  System.out.println();
	  }// for end
    
//------------------------------------------------
	  
	  Score sco=new Score();
	  // 객체생성(메모리할당) 여부를 확인할 수 있다.
	  System.out.println(sco);
	  
	  sco=null;
	  System.out.println(sco);
    
  }//main() end
}//class end
