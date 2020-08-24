package oop0819;

public class Test05_quiz {

	public static void main(String[] args) {
		// 연습문제
		// 문제 1) 지폐갯수.py 참조
		// 1년 : 365일 ?시간 ?분 ?초 365.242
		
		/*
			1분 : 60초
			1시간 : 60분*60초 => 3600초
			1일 : 24시간*3600초 => 86400
			1년 : 365.242일*86400초 => 31556908.8
		*/
		
		double year = 365.242;
		// 1년이 몇초인지 계산
		
		
		int total = (int)(year*86400);
		
		int day = total/86400;
		System.out.println(day + "일");
		
		total = total%86400;
		System.out.println(total);
		int hour = total/3600;
		System.out.println(hour+ "시간");
		
		total = total%3600;
		System.out.println(total);
		int min = total/60;
		System.out.println(min + "분");
		
		int sec = total%60;
		System.out.println(sec + "초");
			
		System.out.println("1년 "+year+"일 은 "+day+"일 "+hour+"시간 "+min+"분 "+sec+"초 입니다.");
			
			
		/*
		int day=(int)(year/1);
		double var1=(year%1*24);
		int hour=(int)var1;
		double var2=(var1%1*60);
		int min=(int)var2;
		double var3=(var2%1*60);
		int sec=(int)var3;
		
		System.out.println(year+"은 "+day+"일 "+hour+"시간 "+min+"분 "+sec+"초 입니다.");
		 */
		
		
		// 문제 2)
		// 어느 달팽이는 낮에는 3cm올라가고
		// 밤에는 2.5cm 내려온다고 할때
		// 달팽이가 13cm의 나무 꼭대기에 올라가려면
		// 며칠이 걸리는지 구하시오.
		/*
		double AM = 3, PM = 2.5;
		double tree = 13;
		double h = 0;
		double d = 0;
		
		while (h < 13) {
			h = h + AM;
			d = d + 0.5;
			if (h >= 13) {
				break;
			}
			h = h - PM;
			d = d + 0.5;
		}
		if (d%2!=0){
		System.out.println("달팽이가 꼭대기에 도달하는데 "+ ((int)d+ 1) + "일 걸렸다.");
		}else{
		System.out.println("달팽이가 꼭대기에 도달하는데 "+ (int)d + "일 걸렸다.");
		}
		*/
		
		int count=0;		// 며칠
		double snail=0.0;	// 달팽이
		
		while (true) {
			count=count+1;
			snail=snail+3.0;	// 낮에 3cm올라감
			if(snail>=13) {
				break;
			}else {
				snail=snail-2.5;
			}
		} // while end
		System.out.println("달팽이가 꼭대기에 도달하는데 "+ count + "일 걸렸다.");
		
//-----------------------------------------------------------------------------
		/* 문제)
		 	1/2 - 2/3 + 3/4 - 4/5 + 5/6 ... 99/100 = ?
		 */
		// switch 이용
		
		
		double a=1, b=a+1, result=0;
		
		while (true) {
			switch ((int)a%2){
			case 0 : result = result - (a/b); break;
			case 1 : result = result + (a/b); break;
			}
			a=a+1;
			b=a+1;
			
			if (a>=100) {
				break;
			}
		} // while end

		System.out.println("문제의 답은 : " + result);

		
		
		
		double hap=0.0;
		boolean flag=false;
		int c=1;
		while(c<100) {
			if(flag) {
				hap=hap-(c/(double)(c+1));
				flag=false;	
			}else {
			hap=hap+(c/(double)(c+1));
			flag=true;
			}
			c=c+1;
		}// while end
		System.out.println(hap);
		
		
		
		
		
		
		
		
		
		
		
		
	}// main() end

}// class end
