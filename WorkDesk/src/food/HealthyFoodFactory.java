package food;

public class HealthyFoodFactory extends FoodFactory {

	public HealthyFoodFactory() {
		this.name = "Healthy Food";
	}

	@Override
	public AbstractMainDish createMainDish() {
		// TODO Auto-generated method stub
		return new Salad();
	}

	@Override
	public AbstractDrink createDrink() {
		// TODO Auto-generated method stub
		return new OrangeJuice();
	}

	@Override
	public AbstractSideDish createSideDish() {
		// TODO Auto-generated method stub
		return new Apple();
		
	}

}