package food;

public class HomeCookedFoodFactory extends FoodFactory {

	public HomeCookedFoodFactory() {
		this.name = "Home Cooked Food";
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