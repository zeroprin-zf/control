package control;

public class exercises1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int isHungry = 1;
		String food = "おにぎり";
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("腹ペコです");
		}
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
	}

}
