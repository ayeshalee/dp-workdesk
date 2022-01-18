package food;

public class WesternFoodFactory extends FoodFactory {

	public WesternFoodFactory() {
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
		return new OrangeJuice();
		
	}

	@Override
	public SideDish createSideDish() {
		// TODO Auto-generated method stub
		return new Fries();
		
	}

}