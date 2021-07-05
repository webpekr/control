package controll;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
//		키보드로 정수(단) 입력받아서 구구단 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("단 입력 : ");

		int dan = 0, tot = 0, i = 1;

		dan = sc.nextInt();// 키보드 정수 입력
		sc.close();
		System.out.println(dan + " 단 ");

		while (i < 10) {
			System.out.println(dan + " * " + i + " =  " + dan * i);
			i++;
		}

		System.out.println("");
		i = 0;
		while (i <= dan) {
			tot += i;
			i++;
		}

		System.out.println("1에서 " + dan + "까지 합은 " + tot + " 입니다.");
		System.out.println("");
//		String result="";
//		result = (dan%2>0)?"홀수":"짝수";
//      System.out.println(dan +"는 " +result+" 입니다.");

		i = 1;

		while (i <= dan) {
			if (i % 2 > 0) {
				System.out.println(i + "는 홀수 입니다.");
			} else {
				System.out.println(i + "는 짝수 입니다.");
			}
			i++;
		}
	}
}
