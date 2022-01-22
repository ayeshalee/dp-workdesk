package food;

public class FastFoodFactory extends FoodFactory {

	public FastFoodFactory() {
		this.name = "Fast Food";
	}

	@Override
	public AbstractMainDish createMainDish() {
		// TODO Auto-generated method stub
		return new Burger();
	}

	@Override
	public AbstractDrink createDrink() {
		// TODO Auto-generated method stub
		return new Coke();
		
	}

	@Override
	public AbstractSideDish createSideDish() {
		// TODO Auto-generated method stub
		return new Fries();
		
	}

}
