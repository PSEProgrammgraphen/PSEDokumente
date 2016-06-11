package gui;

import java.io.File;
import java.util.LinkedList;
import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import joana.MethodGraphLayout;
import parameter.ParameterDialogGenerator;
import parameter.Settings;

/**
 * Main application of GAns.
 * 
 * @author Nicolas
 */
public class GAnsApplication extends Application {

	private StructureView structureView;
	private InformationView informationView;
	private TabPane graphViewTabPane;
	private Stage primaryStage;
	private MenuBar menuBar;

	// Mapped TabId zum Controller.
	private LinkedList<GraphViewEventHandler> graphViewControllerList;

	private File currentFile;
	private MethodGraphLayout methodlayout = new MethodGraphLayout();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		graphViewControllerList = new LinkedList<GraphViewEventHandler>();

		this.primaryStage = primaryStage;
		primaryStage.setTitle("Graph von Ansicht - Graphviewer");

		VBox rootLayout = new VBox();
		Scene scene = new Scene(rootLayout, 800, 600);

		menuBar = new MenuBar();
		setupMenuBar();

		SplitPane mainViewLayout = new SplitPane();
		mainViewLayout.setDividerPosition(0, 0.75);
		graphViewTabPane = new TabPane();
		addTab("Test");

		SplitPane treeInfoLayout = new SplitPane();
		treeInfoLayout.setOrientation(Orientation.VERTICAL);
		treeInfoLayout.setDividerPosition(0, 0.6);
		structureView = new StructureView();
		informationView = new InformationView();
		treeInfoLayout.getItems().addAll(structureView, informationView);

		mainViewLayout.getItems().addAll(graphViewTabPane, treeInfoLayout);
		rootLayout.getChildren().addAll(menuBar, mainViewLayout);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void importClicked() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Select a graph file");
		currentFile = fileChooser.showOpenDialog(primaryStage);
		addTab(currentFile.getName());
		// TODO: Workspacedialog öffnen, Einlesen der Datei triggern, addTab mit
		// neuem graphen öffnen
	}

	private void exportClicked() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Select an export location");
		File saveFile = fileChooser.showSaveDialog(primaryStage);
		// TODO: Daten aus Model/ViewController ziehen und Exportieren der Datei
		// triggern.
	}

	private void addTab(String name) {
		Group group = new Group();
		GraphView graphView = new GraphView();

		group.getChildren().add(graphView);
		// Die Oberfläche die gezogen und gezoomed werden kann.
		Pane pane = new Pane(group);

		GraphViewEventHandler graphViewEventHandler = new GraphViewEventHandler(graphView);
		pane.addEventFilter(MouseEvent.MOUSE_PRESSED, graphViewEventHandler.getOnMousePressedEventHandler());
		pane.addEventFilter(MouseEvent.MOUSE_DRAGGED, graphViewEventHandler.getOnMouseDraggedEventHandler());
		pane.addEventFilter(ScrollEvent.ANY, graphViewEventHandler.getOnScrollEventHandler());

		// TODO: kann vermutlich weg
		graphViewControllerList.add(graphViewEventHandler);

		Tab tab = new Tab(name);
		tab.setContent(pane);
		graphViewTabPane.getTabs().add(tab);
		graphViewTabPane.getSelectionModel().select(tab);

		graphView.addGrid();
	}

	private void setupMenuBar() {
		Menu menuFile = new Menu("File");
		MenuItem importItem = new MenuItem("Import");
		importItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				importClicked();
			}
		});
		MenuItem exportItem = new MenuItem("Export");
		exportItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				exportClicked();
			}
		});
		MenuItem exitItem = new MenuItem("Exit");
		exitItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
		menuFile.getItems().addAll(importItem, exportItem, exitItem);

		Menu menuEdit = new Menu("Layout");
		Menu changeLayoutItem = new Menu("Layout algorithms");
		// Experimental ------
        MenuItem methodGraph = new MenuItem("MethodGraphLayout");
        changeLayoutItem.getItems().add(methodGraph);
        changeLayoutItem.setOnAction(new EventHandler<ActionEvent>() {
        	@Override public void handle(ActionEvent e) {
        		openParameterDialog(methodlayout.getSettings());

            }
        });
        // ------------
		// TODO: In diesem Menü müssen die unterstützten Algorithmen eingfügt
		// werden.
		MenuItem layoutPropertiesItem = new MenuItem("Properties");
		menuEdit.getItems().addAll(changeLayoutItem, layoutPropertiesItem);

		Menu menuView = new Menu("View");
		MenuItem testItem = new MenuItem("test");
		testItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				openTestDialog();
			}
		});
		menuView.getItems().add(testItem);

		menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
	}
	private void openParameterDialog(Settings settings)
	{
		GridPane root = new GridPane();
		ColumnConstraints c1 = new ColumnConstraints();
		ColumnConstraints c2 = new ColumnConstraints();
		c1.setPercentWidth(50);
		c2.setPercentWidth(50);
		root.getColumnConstraints().add(c1);
		root.getColumnConstraints().add(c2);
		new ParameterDialogGenerator(root, settings);
		Stage stage = new Stage();
		stage.setTitle("Settings");
		stage.setScene(new Scene(root, 450, 450));
		stage.show();
	}
	private void openTestDialog() {
		Dialog<TestContainer> dialog = new Dialog<TestContainer>();
		dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
		HBox layout = new HBox();
		TextField xCoordinate = new TextField();
		TextField yCoordinate = new TextField();
		TextField textField = new TextField();
		layout.getChildren().addAll(xCoordinate, yCoordinate, textField);
		dialog.getDialogPane().setContent(layout);
//		dialog.setResultConverter(dialogButton -> {
//			if (dialogButton == ButtonType.OK) {
//				return new TestContainer(xCoordinate.getText(), yCoordinate.getText(), textField.getText());
//			}
//			return null;
//		});

		Optional<TestContainer> result = dialog.showAndWait();

		//böse böse :D
		Pane pane = ((Pane) graphViewTabPane.getSelectionModel().getSelectedItem().getContent());
		Group group = ((Group) pane.getChildren().get(pane.getChildren().size() - 1));
		((GraphView) group.getChildren().get(group.getChildren().size() - 1))
				.setNode(Double.parseDouble(result.get().x), Double.parseDouble(result.get().y), result.get().text);
	}

	private class TestContainer {
		public TestContainer(String x, String y, String text) {
			this.x = x;
			this.y = y;
			this.text = text;
		}

		public String x;
		public String y;
		public String text;
	}
}
