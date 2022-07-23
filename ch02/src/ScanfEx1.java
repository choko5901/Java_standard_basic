import java.util.*; // scanner 라는 클래스를 사용하기 위해 임포트문 사용



public class ScanfEx1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 2. Scanner 클래스의 객체 생성 , System.in 은 화면에서 값을 받는다라는것
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		
//			System.out.println(num);
//			System.out.println(num2);
	//100 을 입력하면 초록색으로 뜨고 출력된값은 그 밑에 바로 나온다
			
	//만약에 2개의 값을 받아서 입력 하고자 하면 위에 처럼 한줄 
	// 추가하고 입력시 num 입력값 num2 입력값 을 한 칸 띄어서 입력하면 출력된다.
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		// 문자열을 정수형으로바꾸는 작업이다
		
		System.out.println(num);
		
		
		
			
	}

}
