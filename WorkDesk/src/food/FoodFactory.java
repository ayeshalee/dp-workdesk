package food;

public abstract class FoodFactory {

//	MainDish mainDish;
//	Drink drink;
//	SideDish sideDish;
	
	public FoodFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract MainDish createMainDish();
	public abstract Drink createDrink();
	public abstract SideDish createSideDish();

}
