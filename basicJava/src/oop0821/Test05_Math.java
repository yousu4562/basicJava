package oop0821;

public class Test05_Math {
  public static void main(String[] args) {
    //Math 수학클래스 

    /*
    //절대값
    System.out.println(Math.abs(-3));
    System.out.println(Math.abs(2.4));
    //소수점 올림 2.0
    System.out.println(Math.ceil(1.3));
    //소수점 버림 2.0
    System.out.println(Math.floor(2.7));
    //반올림 4
    System.out.println(Math.round(3.8));
    //큰값 5   
    System.out.println(Math.max(3, 5));
    System.out.println(Math.max(2, Math.max(4, 6)));  
    */
    
//----------------------------------------------------
    
    //난수:random값. 무작위로 발생한 값
    //난수 발생 범위 : 0.0 <= r < 1.0
    //System.out.println(Math.random());
    //System.out.println(Math.random()*2);
    
    //0 1
    System.out.println((int)(Math.random()*2));
    //0 1 2 3
    //System.out.println((int)(Math.random()*4));
    //0 1 2 3 4 5
    //System.out.println((int)(Math.random()*6));
    //0~44
    //System.out.println((int)(Math.random()*45));
    
	  
//----------------------------------------------------
    // 문제) 주사위 수의 범위 1~6 발생 시키기
	  
	 // System.out.println((int)(Math.random()*6)+1);
	  
	// 문제 ) 로또번호 범위 1~45
	  
	  System.out.println((int)(Math.random()*45)+1);
	  System.out.println((int)(Math.random()*45)+1);
	  System.out.println((int)(Math.random()*45)+1);
	  System.out.println((int)(Math.random()*45)+1);
	  System.out.println((int)(Math.random()*45)+1);
	  System.out.println((int)(Math.random()*45)+1);
	  
  }//main() end
}//class end
