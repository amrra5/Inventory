import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("\n******INVERTORY******");
			System.out.println("\n1- CREATE ITEM\n2- ADD ITEM\n3- REMOVE ITEM\n4- UPDATE ITEM\n5- LIST ALL ITEMS\n6- EXIT");
			int unos = sc.nextInt();
			switch(unos){
			case 1:
				System.out.println("\nInput item id:");
				int unosId = sc.nextInt();
				System.out.println("Input item name:");
				String unosName = sc.next();
				System.out.println("Input item quantity:");
				int unosQuantity = sc.nextInt();
				System.out.println("Input price of item:");
				double unosPrice = sc.nextDouble();
				ItemManager.createItem(unosId,unosName,unosQuantity, unosPrice);
				System.out.println("\nItem created...");
				break;
			case 2:
				System.out.println("\nInput item id:");
				int unosId1 = sc.nextInt();
				ItemManager.addItem(unosId1);
				System.out.println("\nItem added...");
				break;
			case 3:
				System.out.println("\nInput item id:");
				int unosId2 = sc.nextInt();
				ItemManager.removeItem(unosId2);
				System.out.println("\nItem removed...");
				break;
			case 4:
				System.out.println("\nInput item id:");
				int unosId3 = sc.nextInt();
				System.out.println("Input new price of item:");
				double newPrice = sc.nextDouble();
				ItemManager.updateItem(unosId3, newPrice);
				System.out.println("\nItem updated...");
				break;
			case 5:
				System.out.println("List of all items:");
				ItemManager.printAllItems();
				break;
			default:
				System.out.println("Exiting...");
				System.exit(unos);
				break;
			}
		}

	}

}
