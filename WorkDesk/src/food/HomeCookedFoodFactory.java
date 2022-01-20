package food;

public class HomeCookedFoodFactory extends FoodFactory {

	public HomeCookedFoodFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public AbstractMainDish createMainDish() {
		// TODO Auto-generated method stub
		return new NasiLemak();
	}

	@Override
	public AbstractDrink createDrink() {
		// TODO Auto-generated method stub
		return new Tea();
	}

	@Override
	public AbstractSideDish createSideDish() {
		// TODO Auto-generated method stub
		return new Yakisoba();
		
	}

}