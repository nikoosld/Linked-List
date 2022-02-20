package list;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList list = new LinkedList();
		boolean control = true;
		while (control) {
			System.out.println("*******************************************************");
			System.out.println("Hello");
			System.out.println("1)Make a new linked list");
			System.out.println("2)Show the list");
			System.out.println("3)Purge the list");
			System.out.println("4)Recursive-Reverse the list");
			System.out.println("5)Reverse the list");
			System.out.println("0)Exit");
			System.out.println("Choose your number");
			int option = scanner.nextInt();
			scanner.nextLine();
			control = false;
			while (control == false) {
				if (option >= 0 && option <= 5) {
					control = true;
				} else {
					System.out.println("Please Enter a Valid Number: ");
					option = scanner.nextInt();
					scanner.nextLine();
				}
				switch (option) {
				case 1:
					list = new LinkedList();
					for (int i = 0; i < 10; i++) {
						System.out.println("Please enter your data:");
						int n = scanner.nextInt();
						list.Insert(n);
					}
					break;
				case 2:
					list.show();
					break;
				case 3:
					list.PurgeList();
					break;
				case 4:
					Node p = list.first;
					list.first = list.RecursiveR(p);
					list.show();
					break;
				case 5:
					list.first = list.Reverse();
					list.show();
					break;
				case 0:
					return;
				}
			}

		}
	}
}
