
public class Ex3_11 {

	public static void main(String[] args) {
		
		
		double pi = 3.141592;
		
		System.out.println(pi);
		
		System.out.println(pi*1000);
		
		System.out.println(Math.round(pi*1000)/1000); //3
		
		System.out.println(pi*1000/1000.0); // 3.142
		
		double shortPi = Math.round(pi * 1000) / 1000.0;
		 
		System.out.println(shortPi);
		
		
		double pi2 = 3.141592; // 3.141을 얻을려면
		
		System.out.println(pi2*1000);
		System.out.println((int)(pi2*1000)); // 일부러 값손실을 내서 3141만 남김
		System.out.println((int)(pi2*1000)/1000.0); // 다시 실수인 1000.0으로 나누어 실수형태로 3.141을 나타냄
		
		
	}

}
