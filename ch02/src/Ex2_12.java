
public class Ex2_12 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0)-'0');
		//문자열 3을 문자 3으로 변경하는 것 그후  -'0' 은 문자3에서 문자 0을 뺴면
		// 숫자 3이 된다 결론은 문자열 에서 문자 문자에서 숫자로 바꿈
		
		System.out.println('3'-'0' +1);
		// 문자3에서 문자0을빼면 숫자 3이 되고 숫자 1과 더하니 연산 가능해 4
		System.out.println(Integer.parseInt("3") + 1);
		// 문자열 3을 숫자 3을 바꾸고 숫자1과 더하니 연산 가능해 4
		System.out.println("3" + 1);
		// 문자열 더하기 숫자는 숫자가 문자로 변경되어 문자열 더하기 문자열 이된다
		// 그럼 31로 나온다
		System.out.println(3 + '0');
		// 숫자에다가 문자 0을 더하면 문자 3이됩니다 근데 51 나온경우는
		// 문자 3이 숫자로 48이라 51이 나오는데 진짜 3을 해줄려면 아래 와같다
		System.out.println((char)(3 + '0'));
		// 추후 형변환 할때 자세히 배워보자



	}

}
