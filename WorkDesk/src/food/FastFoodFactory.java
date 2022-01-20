package food;

public class FastFoodFactory extends FoodFactory {

	public FastFoodFactory() {
		// TODO Auto-generated constructor stub
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
