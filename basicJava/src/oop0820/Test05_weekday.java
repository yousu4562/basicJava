package oop0820;

public class Test05_weekday {
  public static void main(String[] args) {
    // 요일 구하는 프로그램
    int cYear=2020, cMonth=8, cDate=20;
    
    /*
     	서기 1년 1월 1일 ~ 2020년 8월 20일 -> 총 날짜 수
    	총날수%7 => 0일 1월 2화 3수 4목 5금 6토
    		1.1.1 ~ 1.1.1
       		1%7=1 -> 월       
    */
    
    // 1 단계) -> 서기 1년~서기 2019년
    // 윤년 += 366
    // 평년 =+ 365
    
    int hap=0;
    for(int y=1; y<cYear; y++) {
    	if (y%4==0 && y%100!=0 || y%400==0) {
    		hap=hap+366;
    	}else {
    		hap=hap+365;
    	}// if end
    }// for end
    
    
    // 2단계 -> 1~7월
    // 1,3,5,7,8,10,12 += 31
    // 4, 6, 9, 11 += 30
    // 2 += 28(평년) or 29(윤년)
    int [] mon = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if (cYear%4==0 && cYear%100!=0 || cYear%400==0) {
    	mon[2]=29;
    }//if end
    for(int m=1; m<cMonth; m++) {
    	hap=hap+mon[m];
    }// for end
 
    // 3단계 -> 8월 20일
     // += 20
    hap=hap+cDate;  
    
    switch(hap%7) {
    case 0: System.out.println(cYear+"년 "+cMonth+"월 "+cDate+"일 : 일요일"); break;
    case 1: System.out.println(cYear+"년 "+cMonth+"월 "+cDate+"일 : 월요일"); break;
    case 2: System.out.println(cYear+"년 "+cMonth+"월 "+cDate+"일 : 화요일"); break;
    case 3: System.out.println(cYear+"년 "+cMonth+"월 "+cDate+"일 : 수요일"); break;
    case 4: System.out.println(cYear+"년 "+cMonth+"월 "+cDate+"일 : 목요일"); break;
    case 5: System.out.println(cYear+"년 "+cMonth+"월 "+cDate+"일 : 금요일"); break;
    case 6: System.out.println(cYear+"년 "+cMonth+"월 "+cDate+"일 : 토요일"); break;
    
    }
  }//main() end
}//class() end
