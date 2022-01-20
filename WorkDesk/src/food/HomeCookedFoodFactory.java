package food;

public class HomeCookedFoodFactory extends FoodFactory {

	public HomeCookedFoodFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public MainDish createMainDish() {
		// TODO Auto-generated method stub
		return new NasiLemak();
	}

	@Override
	public Drink createDrink() {
		// TODO Auto-generated method stub
		return new Tea();
	}

	@Override
	public SideDish createSideDish() {
		// TODO Auto-generated method stub
		return new Yakisoba();
		
	}

}