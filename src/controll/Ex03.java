package controll;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
//		Ű����� ����(��) �Է¹޾Ƽ� ������ ���
		Scanner sc = new Scanner(System.in);

		System.out.print("�� �Է� : ");

		int dan = 0, tot = 0, i = 1;

		dan = sc.nextInt();// Ű���� ���� �Է�
		sc.close();
		System.out.println(dan + " �� ");

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

		System.out.println("1���� " + dan + "���� ���� " + tot + " �Դϴ�.");
		System.out.println("");
//		String result="";
//		result = (dan%2>0)?"Ȧ��":"¦��";
//      System.out.println(dan +"�� " +result+" �Դϴ�.");

		i = 1;

		while (i <= dan) {
			if (i % 2 > 0) {
				System.out.println(i + "�� Ȧ�� �Դϴ�.");
			} else {
				System.out.println(i + "�� ¦�� �Դϴ�.");
			}
			i++;
		}
	}
}
