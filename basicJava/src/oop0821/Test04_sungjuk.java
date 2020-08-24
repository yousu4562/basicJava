package oop0821;

public class Test04_sungjuk {
  public static void main(String[] args) {
    //성적 프로그램
    String[] name= {"라일락","진달래","개나리","무궁화","홍길동"};
    int[] kor= {100, 50, 95, 80, 60};
    int[] eng= {100, 55, 95, 85, 40};
    int[] mat= {100, 60, 35, 90, 30};
    int size = kor.length;
    // 평균구하기
    int [] aver=new int[5];
    for(int i=0; i<size; i++) {
    	aver[i]=(kor[i]+eng[i]+mat[i])/3;
    }// for end
    
    // 등수구하기(평균을 기준으로)
    int[] rank= {1,1,1,1,1};
    for(int i=0; i<size; i++) {
    	for(int j=0; j<size; j++) {
    		if(aver[i]<aver[j]) {
    			rank[i]=rank[i]+1;
    		}// if end
    	}// for end
    }// for end
    
    // 출력하기
    for(int i=0; i<size; i++) {
    	System.out.print(name[i]+"   ");
    	System.out.print(kor[i]+"   ");
    	System.out.print(eng[i]+"   ");
    	System.out.print(mat[i]+"   ");
    	System.out.print(aver[i]+"   ");
    	System.out.print(rank[i]+"   ");
    	
        // 문제 ) 과락(평균을 기준으로)
    	//		합격, 재시험, 불합격
    	if(aver[i]>=70) {
    		if(kor[i] <= 40 || eng[i]<=40 || mat[i]<=40) {
    			System.out.print("재시험");
    		}else {
    			System.out.print(" 합격 ");
    		}// if end
    	}else {
    		System.out.print("불합격");
    	}
    	// 문제) 평균 10점당 * 1개씩 출력
    	for(int star=1; star <= aver[i]/10; star++) {
    		System.out.print("*");
    	}// for end
    	
    	/*
    	switch(aver[i]/10) {
    	case 10: System.out.print("  **********"); break;
    	case 9: System.out.print("  *********"); break;
    	case 8: System.out.print("  ********"); break;
    	case 7: System.out.print("  *******"); break;
    	case 6: System.out.print("  ******"); break;
    	case 5: System.out.print("  *****"); break;
    	case 4: System.out.print("  ****"); break;
    	case 3: System.out.print("  ***"); break;
    	case 2: System.out.print("  **"); break;
    	case 1: System.out.print("  *"); break;
    	case 0: System.out.print("  "); break;
    	}
    	*/
    	// 문제 ) 평균 95점 이상 장학생
    	if(aver[i]>=95) {
    		System.out.print(" 장학생");
    	}
    	System.out.println(); // 줄바꿈
    }// for end 
    
 
    
    
    
  }//main() end
}//class end
