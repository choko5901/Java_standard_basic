
public class PrintfEx1 {

	public static void main(String[] args) {
	
		
	System.out.println(10/3);
	// 10 /3 은 3.333 인데 이떄 실행하면 3이 나온다 왜냐하면 
	// 10도 정수이고 3도 정수 이기 때문에 결과 값도 정수로 출력된다 
	// 우리가 원하는 3.333 을 얻을려면 둘중에 하나를 실수형으로 변환
	System.out.println(10.0/3);
	// 이런걸 출력 형태를 정해주어  출력하기 위해 printf를 사용
	
	//printf 는 줄바꿈을 자동으로 인지 하지않아 %n을 사용한다
	
	System.out.printf("%d%n",15);
	System.out.printf("%#o%n",15);
	System.out.printf("%#x%n",15);
	//d 는 10진수 o 8진수 x 16진수를 15로 나타낸거고 앞에 
	//각 진수앞에 접두사를 붙이고 싶으면ㄴ지시 앞에 #을 넣어주면된다
	System.out.printf("%s%n",Integer.toBinaryString(15));
	
	float f=123.456789f;
	double g=123.456789f;
	System.out.printf("%f%n", f);
	System.out.printf("%f%n", g);
	//double float 보다 정밀도가 더 높다
	System.out.printf("%e%n", g);
	//이번에 g값을 지수 형태로 나타내기
	System.out.printf("%g%n", g);
	//간략하게 소수점 포함 7자리로 나타내는걸 확인 가능
	
	
	System.out.printf("[%5d]%n",10);
	// 10진수 10을 5자리까지 나타내라 그럼 3자리가 비니 값의 3자리는 공백으로 처리된다
	System.out.printf("[%-5d]%n",10);
	// %-를 할면 왼쪽 정렬이 된다.
	System.out.printf("[%05d]%n",10);
	// %0을 하면 공백 자리에 공백 대신 0이 들어간다
	
	System.out.printf("[%5d]%n",1234567);
	
	// 만약 지정한 값 이상을 값을 입력하면 5자리만 나타내는게 아닌 초과해서 그냥 출력된다
	
	double d =1.23456789;
	System.out.printf("%14.10f%n",d);
	//전체 14자리중 소수점아래가 10자리 차지한다 라는 형식 그럼 끝자리 2자리가 비는데 그럼 0으로 채워짐
	System.out.printf("%14.6f%n",d);
	// 소수점 아래 6자리만출력이 되는거지 실제로는 1.23456789가 모두 저장되어있다 출력만 그래보이는거
	// 그럼 정수부분 앞자리는 8자리인데 1 하자리만 차지하니 그나머지는 전부 공백으로 처리됨
	System.out.printf("%.6f%n",d);
	//정수 부분 자리를 생략하면 정수부분은 모두 출력한다는 뜻이고 그래도 소수점 자리수는 6자리로 표현
	
	
	
	System.out.printf("[%s]%n", "www.codechobo.com");
	//문자열 나타내는 지시자 s 
	System.out.printf("[%20s]%n", "www.codechobo.com");
	// 문자열 출력자리수 지정 만약 빈자리가 있으면 공백으로 처리가된다
	System.out.printf("[%-20s]%n", "www.codechobo.com");
	// 위의 동시에 왼족 정력 후 남은 자리는 공백으로 처리됨
	System.out.printf("[%.10s]%n", "www.codechobo.com");
	//출력 하는 글자수를 제한하여 출력을 하도록 하는 것이다.
	

	
	

	
	
	
	
	

	}

}
