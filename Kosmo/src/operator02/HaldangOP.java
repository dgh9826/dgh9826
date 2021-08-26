package operator02;

public class HaldangOP {

	public static void main(String[] args) {
		/*
		 * [할당(대입)연산자]
		 * =: 변수 = 값(변수)
		 * 오른쪽에 있는 값을 왼쪽의 변수에 할당(대입)한다.
		 * [복합대입연산자(축약표현)]
		 * +=, -=, *=,%=,/=..등등
		 * 변수 += 값(변수2) => 변수1 = 변수1+값 혹은 변수1 = 변수1+변수2
		 */
		//1]할당(대입)연산자
		int num1;//변수 선언
		//지역변수는 반드시 초기화 후 사용
		//int num2=num1+1;[x]초기화 안해서 오류
		num1 = 100;//값을 대입
		System.out.println(num1);
		int num2;
		num2 = num1;//변수 num1에 저장된 값을 대입
		System.out.println(num2);
		//10=num1;[x]
		
	}

}
