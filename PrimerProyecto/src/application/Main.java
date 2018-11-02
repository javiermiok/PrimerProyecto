package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	private AnchorPane mypane;
	
	//modifica el método start de la clase principal
	@Override
	public void start(Stage stage) throws IOException {
		//Primero cargamos la vista FXML en el FXMLoader
		FXMLLoader loader = new FXMLLoader(getClass().getResource("PrimerFXML.fxml"));
		
		//Ahora sobre el panel mypane cargamos la vista que dejamos en el FXMLoader
		mypane = (AnchorPane) loader.load();
		
		
		
		
		// añade la escena al stage y la titula
		stage.setTitle("Primer Proyecto");
		stage.setScene(new Scene(mypane));
		stage.show();
	}
	

	
	public static void main(String[] args) {
		launch(args);
	}
}
