package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		System.out.println("숫자를 맟춰보세요 ^.~");
		System.out.println("(1부터100까지)");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			Random r = new Random();
			int guessNumber = r.nextInt(100) + 1;

			int a = 100;
			int b = 1;
			int c = 0;

			while (true) {
				System.out.print(++c + ">>");
				int guess = scanner.nextInt();

				if (guess > guessNumber) {
					System.out.println(" 더 낮게 ");
					a = guess;
				} else if (guess < guessNumber) {
					System.out.println(" 더 높게 ");
				} else {
					System.out.println(" 맞았습니다 :) ");
					break;
				}
			}
			System.out.println("다시하겠습니가?(y/n)>>");
			String yesNo = scanner.next();
			if ("y".equals(yesNo) == false) {
				break;
			}
		}

		scanner.close();

	}

}

// "다시 하시겠습니까(y/n)>>"에 대한 대답으로 사용자가 "y"나 "n"을 입력받고
// 비교하기 위해 다음의 코드를 사용합니다.
//
// String answer = scanner.next();
// if( answer.equlas("y") ){
// //종료하도록 작성한다.
// }
