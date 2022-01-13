package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Lines extends Application{

	public Lines() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//Creating a line object         
		Line line = new Line();
		line.setStartX(100.0); 
		line.setStartY(150.0); 
		line.setEndX(500.0); 
		line.setEndY(150.0);
		
		Group root = new Group(line);
	}

}
