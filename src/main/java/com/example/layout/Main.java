package com.example.layout;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Group Layout - manually set position
//        Group group = new Group();
//        Button one = new Button("one one");
//        Button two = new Button("two");
//        one.setLayoutX(50);
//        one.setLayoutY(10);
//        two.layoutXProperty().bind(one.layoutXProperty().add(one.widthProperty().add(10)));
//        two.layoutYProperty().bind(one.layoutYProperty());
//        group.getChildren().addAll(one,two);
//        group.setEffect(new DropShadow());
//        group.setRotate(10);
//        Scene scene = new Scene(group, 350,200);
//        stage.setTitle("Group Layout Example");
//        stage.setScene(scene);
//        stage.show();

        //Horizontal Layout - organizes elements horizontally
//        HBox hBox = new HBox();
//        hBox.setAlignment(Pos.CENTER);
//        hBox.setSpacing(10);
//        hBox.setFillHeight(false);
//        Label label = new Label("This is label");
//        TextArea textField = new TextArea("Click");
//        hBox.getChildren().addAll(label,textField);
//        hBox.setHgrow(textField, Priority.ALWAYS); //It will stick to the horizontal edge when resize
//        hBox.setMargin(textField,new Insets(0,10,0,10));
//        Scene scene = new Scene(hBox,700,700);
//        stage.setScene(scene);
//        stage.show();

        //Vertical Layout - organizes elements vertically
//        VBox root = new VBox();
//        root.setAlignment(Pos.CENTER);
//        root.setSpacing(10);
//        Label label = new Label("This is label");
//        TextArea textArea = new TextArea("Click");
//        root.setVgrow(textArea, Priority.ALWAYS);
//        root.setMargin(textArea,new Insets(10,10,10,10));
//        root.getChildren().addAll(label,textArea);
//        Scene scene = new Scene(root,500,500);
//        stage.setScene(scene);
//        stage.show();

        //FlowPane Layout - It organizes its children in rows or columns
//        FlowPane flowPane = new FlowPane();
//        flowPane.setOrientation(Orientation.VERTICAL);
//        flowPane.setHgap(20);
//        flowPane.setVgap(30);
//        flowPane.setColumnHalignment(HPos.RIGHT);
//        Button button1 = new Button("Click1");
//        Button button2 = new Button("Click2");
//        Button button3 = new Button("Click3");
//        Button button4 = new Button("Click4");
//        TextArea textArea   = new TextArea();
//        Button button5 = new Button("Click5");
//        Button button6 = new Button("Click6");
//        flowPane.getChildren().addAll(button1,button2,button3,button4, textArea,button5,button6);
//        Scene scene = new Scene(flowPane,500,500);
//        stage.setScene(scene);
//        stage.show();





        //borderPaneLayout - space into five regions: top, bottom, left, right, and center.
//        BorderPane borderPane = new BorderPane();
//
//        //Left Nodes
//        ListView<String> FruitList = new ListView<String>();
//        ObservableList<String> items = FXCollections.observableArrayList();
//        items.add("apples");
//        items.add("bananas");
//        items.add("potato");
//        FruitList.setItems(items);
//
//        //Top Nodes
//        Label topLabel = new Label("FruitList Application");
//        topLabel.setPadding(new Insets(10));
//
//        //Bottom Nodes
//        Label bottomLabel = new Label("Recently added fruit: None");
//        bottomLabel.setPadding(new Insets(10));
//
//        //Right Nodes
//        Label rightLabel =new Label("Total number of fruit types: " + items.size());
//        rightLabel.setRotate(90);
//        rightLabel.setPadding(new Insets(0,0,0,60));
//
//        //Center Nodes -
//        TextField field = new TextField();
//        Button  button = new Button("ADD");
//        HBox centerContainer = new HBox(10,field,button);
//
//        //setting BorderPane regions
//        borderPane.setTop(topLabel);
//        borderPane.setRight(rightLabel);
//        borderPane.setBottom(bottomLabel);
//        borderPane.setCenter(centerContainer);
//        borderPane.setLeft(FruitList);
//
//        //Register Event Handlers
//        button.setOnMouseClicked(
//                mouseEvent -> {
//                    String item = field.getText();
//                    items.add(item);
//                    bottomLabel.setText("Recently added fruit: "+ item);
//                    rightLabel.setText("Total number of fruit: " + items.size());
//                    field.clear();
//                }
//        );
//
//        borderPane.getChildren().addAll();
//        Scene scene = new Scene(borderPane,700,700);
//        stage.setScene(scene);
//        stage.show();



        //StackPane Layout - on top of each other

//        StackPane stackPane = new StackPane();
//        Rectangle rectangle = new Rectangle(300,250);
//        rectangle.setFill(Color.RED);
//        Label label = new Label("Rectangle");
//        StackPane.setAlignment(label,Pos.TOP_LEFT);
//
//        stackPane.getChildren().addAll(rectangle,label);
//        Scene scene = new Scene(stackPane,500,500);
//        stage.setScene(scene);
//        stage.show();

        //TilePane - arranges in grid

        //#1example
//        TilePane tileCenter = createTilePane(Pos.CENTER);
//        TilePane tileLeft = createTilePane(Pos.BOTTOM_LEFT);
//        HBox root = new HBox(10,tileCenter,tileLeft);
//
//        Scene scene = new Scene(root,300,300);
//        stage.setScene(scene);
//        stage.show();
        //#2example
        TilePane root = new TilePane(5,5);
        Button b12 = new Button("One\nTwo");
        Button b3 = new Button("Three");
        Button b4 = new Button("Four");
        Button b5 = new Button("Five");
        Button b6 = new Button("Six");

        TilePane.setAlignment(b3,Pos.BOTTOM_RIGHT);
        root.getChildren().addAll(b12,b3,b4,b5,b6);
        root.setPrefColumns(3);
        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.show();
    }

    public TilePane createTilePane(Pos tileAlignment){
        Button[] buttons = new Button[]{
                new Button("Tiles"),
                new Button("are"),
                new Button("aligned"),
                new Button("at"),
                new Button(tileAlignment.toString())
        };

        TilePane pane = new TilePane(5,5,buttons);
        pane.setTileAlignment(tileAlignment);
        pane.setPrefColumns(3);
        return pane;
    }

    public static void main(String[] args) {
        launch();
    }

}
