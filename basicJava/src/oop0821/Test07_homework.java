package oop0821;

public class Test07_homework {

	public static void main(String[] args) {
		 //과제1) 각행의 모음의 갯수를 구하시오
	    
		
		char[][] ch= {
	         {'R','e','d'}
	        ,{'G','r','e','e','n'}
	        ,{'B','l','u','e'}
	        ,{'O','r','a','n','g','e'}
	    };
	   
		
		System.out.println("과제 1)");
	    int sizer = ch.length; // 행의 갯수
	    int [] mo = new int[sizer]; // 모음의 갯수
	    
	    for(int r=0; r<sizer; r++) {
	    	int sizec= ch[r].length; // 열의 갯수
	    	for(int c=0; c<sizec; c++) {
	    		switch(ch[r][c]) {
	    		case 'a' :
	    		case 'e' :
	    		case 'i' :
	    		case 'o' :
	    		case 'u' :
	    		case 'A' :
	    		case 'E' :
	    		case 'I' :
	    		case 'O' :
	    		case 'U' : mo[r]++;
	    		}// switch end
	    	}// for end
	    System.out.println(r + 1 +"행의 모음 갯수 : " + mo[r]+ "개");
	    }// for end
	    System.out.println();
	   
		
	    
	    
		// 풀이
	    System.out.println("풀이");
		int size=ch.length; // 4 행의 갯수
		for (int r=0; r<size; r++) {
			int mo1 = 0 ;
			int col=ch[r].length; // 각 행의 열의 갯수
			for(int c=0; c<col; c++) {
				// 각 문자를 전부 소문자로 바꿔서 진행
				char word=ch[r][c];
				if(word >= 'A' && word <= 'Z') {
					word = (char)(word+32); // 소문자로 변환
				}// if end
				
				switch(word) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': mo1++;
				}// switch end
			}// for end
			System.out.println("ch["+r+"]행 모음 갯수 : " + mo1+ "개");
			mo1 = 0;
		}// for end
		System.out.println();
	   
	   
	//----------------------------------    
	    
		//과제)대각선 방향의 각 요소의 합을 구하시오
	    //    대각선 ↘ 방향의 합 : 3+5+9
	    //    대각선 ↙ 방향의 합 : 1+5+7
	    int[][] num= {
	         {3, 2, 1}
	        ,{4, 5, 6}
	        ,{7, 8, 9}
	    };
	   
	    System.out.println("과제 2)");
	    int numr = num.length; //3
	    int sum1 = 0;
	    int sum2 = 0;
	    // 대각선 ↘ 방향의 합
	    for(int r=0; r<numr; r++) {
	    int numc = num[r].length;
	    	for(int c=0; c<numc; c++) {
	    		if(r==c) {
	    			sum1 = sum1 + num[r][c];
	    		}// if end
	    	}// for end
	    }// for end
	    System.out.println("대각선 ↘ 방향의 합 : " + sum1);
	   
	    // 대각선 ↙ 방향의 합
	    for(int r=0; r<numr; r++) {
	    int numc = num[r].length;
	    	for(int c=0; c<numc; c++) {
	    		if((r+c)==2) {
	    			sum2 = sum2 + num[r][c];
	    		}// if end
	    	} // for end
	    }// for end
	    System.out.println("대각선 ↙ 방향의 합 : " + sum2);
	    System.out.println();
	    
	    
	    // 풀이
	    System.out.println("풀이");
	    int hap1=0; // ↘
	    int hap2=0; // ↙
	    for(int i=0; i<=2; i++) {
	    	hap1=hap1+num[i][i];
	    	hap2=hap2+num[i][2-i];
	    }// for end
	    
	    System.out.println("대각선 ↘방향의 합 : " + hap1);
	    System.out.println("대각선 ↙방향의 합 : " + hap2);
	    
	}// main() end 
}// class end
