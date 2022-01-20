package food;

public class WesternFoodFactory extends FoodFactory {

	public WesternFoodFactory() {
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
		return new OrangeJuice();
		
	}

	@Override
	public AbstractSideDish createSideDish() {
		// TODO Auto-generated method stub
		return new Fries();
		
	}

}
