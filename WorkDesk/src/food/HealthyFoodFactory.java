package food;

public class HealthyFoodFactory extends FoodFactory {

	public HealthyFoodFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public MainDish createMainDish() {
		// TODO Auto-generated method stub
		return new Salad();
	}

	@Override
	public Drink createDrink() {
		// TODO Auto-generated method stub
		return new OrangeJuice();
	}

	@Override
	public SideDish createSideDish() {
		// TODO Auto-generated method stub
		return new Apple();
		
	}

}