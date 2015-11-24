package wordcount;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileChooserExample extends Application {

	WordCount counter;

	@Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    VBox pane = new VBox(10);
    pane.setAlignment(Pos.CENTER);
    Button btSort = new Button("Sort by alphabetical order");
    btSort.setOnAction(e -> {

    	TreeMap<String, Integer> sortedByCount = new TreeMap<>(counter.getCountMap());
    	ListView<String> list = new ListView<String>();
		ObservableList<String> items =FXCollections.observableArrayList();
		list.setItems(items);

		Set<Entry<String, Integer>> entries = sortedByCount.entrySet();
		for(Entry<String, Integer> entry : entries){
			items.add(entry.getKey()+": "+entry.getValue());
		}
		pane.getChildren().clear();
		pane.getChildren().add(list);


    });



    Button btOK = new Button("Open File Chooser");
    btOK.setOnAction(e -> {
    	FileChooser fileChooser = new FileChooser();
    	fileChooser.setTitle("Open Resource File");
    	File file = fileChooser.showOpenDialog(primaryStage);
    	if(file!=null){
    		Path path = Paths.get(file.toURI());
    		Charset charset = Charset.forName("US-ASCII");
    		List<String> lines = new ArrayList<String>();
    		try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
    		lines = Files.readAllLines(path, charset);
    		} catch (IOException x) {
    		    //System.err.format("IOException: %s%n", x);
    			return;
    		}
    		counter = new WordCount(lines);

    		ListView<String> list = new ListView<String>();
    		ObservableList<String> items =FXCollections.observableArrayList();
    		list.setItems(items);

    		Set<Entry<String, Integer>> entries = counter.getCountMap().entrySet();
    		for(Entry<String, Integer> entry : entries){
    			items.add(entry.getKey()+": "+entry.getValue());
    		}
    		pane.getChildren().add(list);

    	}
    });
    pane.getChildren().addAll(btSort);
    pane.getChildren().addAll(btOK);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("HandleEvent"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}

