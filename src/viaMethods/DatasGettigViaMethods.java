package viaMethods;

import java.util.Scanner;

public class DatasGettigViaMethods {

	static DatasGettigViaMethods getting = new DatasGettigViaMethods();
	static Datas data = new Datas();
	String name;
	String place;
	Datas datas;

	public void showMenu() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("choose correct option given below \nA for save datas \nB for print a datas \nC for Exit");
		char option = scanner.next().charAt(0);

		switch (option) {

		case 'A': {
			System.out.println("Enter your name: ");
			name = scanner.next();
			System.out.println("Enter your place: ");
			place = scanner.next();

			datas = getting.saveValues(data);
			System.out.println();
			getting.showMenu();
			break;
		}

		case 'B': {
			getting.printingValues(datas);
			System.out.println();
			getting.showMenu();
			break;
		}

		case 'C': {
			System.out.println("Exit");
			break;
		}

		default: {
			System.out.println("Select correct option A or B or C");
			System.out.println();
			getting.showMenu();
		}

		}
		scanner.close();
	}

	public Datas saveValues(Datas data) {
		data.setName(getting.name);
		data.setPlace(getting.place);
		return data;
	}

	public void printingValues(Datas datas) {
		System.out.println("name: " + datas.getName());
		System.out.println("place: " + datas.getPlace());
	}

	public static void main(String[] args) {
		getting.showMenu();
	}

}
