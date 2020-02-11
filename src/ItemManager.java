import java.util.ArrayList;




public class ItemManager {

	static ArrayList<Item> listOfItems = new ArrayList<>();
	
	public static void createItem(int id,String name,int quantity,double price){
		listOfItems.add(new Item(id,name,quantity,price));
	}
	
	public static void addItem(int id){
		for(Item e: listOfItems){
			if(e.getId() == id){
				e.setQuantity(e.getQuantity() + 1);
			}
		}
	}
	
	public static void removeItem(int id){
		/*for(Item e: listOfItems){
			if(e.getId() == id){
				listOfItems.remove(e);
			}
		}*/
		java.util.Iterator<Item> iterator = listOfItems.iterator();
		Item izbacena = null;
		while(iterator.hasNext()){
			izbacena = iterator.next();
			if(izbacena.getId()== id){
				iterator.remove();
			}
		}
	}
	
	public static void updateItem(int id, double newPrice){
		for(Item e: listOfItems){
			if(e.getId() == id){
				e.setPrice(newPrice);
			}
		}
	}
	
	public static void printAllItems(){
		for(Item e: listOfItems){
			System.out.println(e.toString());
		}
	}
}
