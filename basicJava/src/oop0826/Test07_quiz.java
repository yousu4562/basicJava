package oop0826;

public class Test07_quiz {
  public static void main(String[] args) {
    //문자열 관련 연습문제
    
	  
	  /*
    String name1="KOREA";
    String name2=new String("KOREA");
    
    if(name1==name2) {
      System.out.println("같다");
    }else {
      System.out.println("다르다");
    }//if end(다르다) 
    
    if(name1.equals(name2)) {
      System.out.println("같다");
    }else {
      System.out.println("다르다");
    }//if end
    
    //String이 클래스라서 저장되는 주소의 위치가 각 String 변수마다 다르다.
    //name1변수는 1의 위치에 nmae2변수는 2의 위치에 존재해서
    //같다 연산자로 비교할수 없다.
    
    Character ch1=new Character('r');
    Character ch2='r';
    System.out.println(ch2.toString());
    System.out.println(ch2);
    */
	  
	  
//-----------------------------------------------
	  
	  
    //문제1)이메일 주소에 @문자 있으면
    //     @글자 기준으로 문자열을 분리해서 출력하고
    //     ->출력결과 : webmaster
    //               soldesk.com
    //     @문자 없다면 "이메일주소 틀림" 메세지를 출력하시오
    String email="webmaster@soldesk.com";
    
    
    /*
    // 풀이 간단
    System.out.println(email.substring(0, 9));
    System.out.println(email.substring(10, 21));
    
    // 풀이 split
    String [] word1=email.split("@");
    for(int i=0; i<word1.length;i++) {
    	System.out.println(word1[i]);
    }
    
    // 풀이 substring + indexof
    // "@"문자열이 첫번째 나오는 위치(인덱스)
    int pos = email.indexOf("@");
    // System.out.println(pos); // 9
    if(pos==-1) {//찾는 문자열이 없을때
    	System.out.println("이메일 주소 틀림");
    }else {
    	System.out.println("이메일 주소 맞음");
    	System.out.println(email.substring(0, pos));
        System.out.println(email.substring(pos+1, email.length()));	
    }
    
    */
    // 숙제
	String[] word = email.split("@");
	for(int i=0; i<word.length; i++) {
		if(word.length==2) {
			System.out.println(word[i]);
		}else {
			System.out.println("이메일 주소 틀림");
			break;
		}
	}

//-----------------------------------------------    
    //문제2)주민번호 각 숫자의 전체 합을 구하시오
    //     1+5+1+2+3+0+4+1+2+3+4+5+6=37
    //     substring()와 charAt()를 이용해서 각각 구하시오
    String jumin="1512304123456";
    
    
    //풀이
    //substring() 이용
    int hap=0;
    for(int i=0; i<jumin.length(); i++) {
    	hap=hap+Integer.parseInt(jumin.substring(i, i+1));
    }
    System.out.println(hap);
    
    //풀이
    //charAt() 이용
    int sum=0;
    for(int i=0; i<jumin.length(); i++) {
    	sum=sum+Character.getNumericValue(jumin.charAt(i));
    }
    System.out.println(sum);
    
    
    /*
	//charAt() 이용
	int hap1=0;
	int[] c1= new int[jumin.length()];
	for(int i=0; i<jumin.length(); i++) {
		c1[i] =jumin.charAt(i)-48;
		hap1=hap1+c1[i];
	}
	System.out.println("주민 번호 각 숫자의 합: " + hap1);
			
	
	//substring() 이용
	String[] ju=new String[jumin.length()];
	int[] num=new int[jumin.length()];
	int sum=0;
	for(int i=0; i<jumin.length(); i++) {
		ju[i]=jumin.substring(i, i+1);	// String배열
		switch(ju[i]) {
		case "0" : num[i] = 0; break;
		case "1" : num[i] = 1; break;
		case "2" : num[i] = 2; break;
		case "3" : num[i] = 3; break;
		case "4" : num[i] = 4; break;
		case "5" : num[i] = 5; break;
		case "6" : num[i] = 6; break;
		case "7" : num[i] = 7; break;
		case "8" : num[i] = 8; break;
		case "9" : num[i] = 9; break;
		}
		sum=sum+num[i];
	}
	System.out.println("주민 번호 각 숫자의 합: " + sum);

    */

//-------------------------------------------------------    
    //문제3-1)파일명, 확장명을 분리해서 출력하시오
    String path="d:/java0812/workspace/2020.03.10.sky.png";   
    //출력결과
    //->파일명 : 2020.03.10.sky
    //->확장명 : png
    int last_s=path.lastIndexOf("/");
    int last_d=path.lastIndexOf(".");
    System.out.println(last_s); //21
    System.out.println(last_d); //36
    //System.out.println(path.substring(22,36));
    //System.out.println(path.substring(37));
    
    String filename=path.substring(last_s+1,last_d);
    String ext=path.substring(last_d+1);
    System.out.println("파일명 : " + filename);
    System.out.println("확장명 : " + ext);
    
    
    
    //문제3-2)확장명이 이미지 파일(png, jpg, gif)인지 확인하시오
    //       맞으면 "파일이 전송되었습니다"
    //       아니면 "파일을 다시 선택해 주세요" 출력하시오
    
    //소문자로 전부치환해서 문자열비교
    ext=ext.toLowerCase();
    if(ext.equals("png") || ext.equals("jpg") || ext.equals("gif")) {
    	System.out.println("파일이 전송되었습니다.");
    }else{
    	System.out.println("파일을 다시 선택해 주세요.");
    	
    }
    
    
    
    
    

  }//main() end
}//class end
