package food;

public abstract class FoodFactory {

	public FoodFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract MainDish createMainDish();
	public abstract Drink createDrink();
	public abstract SideDish createSideDish();

}
