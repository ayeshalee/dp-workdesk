package food;

public class FastFoodFactory extends FoodFactory {

	public FastFoodFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public MainDish createMainDish() {
		// TODO Auto-generated method stub
		return new Burger();
	}

	@Override
	public Drink createDrink() {
		// TODO Auto-generated method stub
		return new Coke();
		
	}

	@Override
	public SideDish createSideDish() {
		// TODO Auto-generated method stub
		return new Fries();
		
	}

}
