package food;

public abstract class FoodFactory {

	AbstractMainDish mainDish;
	AbstractDrink drink;
	AbstractSideDish sideDish;
	String name;
	
	public FoodFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract AbstractMainDish createMainDish();
	public abstract AbstractDrink createDrink();
	public abstract AbstractSideDish createSideDish();
	
	public final void createFoodFamily() {
		mainDish = this.createMainDish();
		drink = this.createDrink();
		sideDish = this.createSideDish();
	}

	public AbstractMainDish getMainDish() {
		return mainDish;
	}
	
	public AbstractDrink getDrink() {
		return drink;
	}

	public AbstractSideDish getSideDish() {
		return sideDish;
	}
	
	public String getName() {
		return this.name;
	}
}
