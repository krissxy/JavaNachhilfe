package view;

import controller.MainController;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainWindow extends BorderPane {

    private MainController mainController = new MainController();

    public MainWindow() {
        this.setCenter(createCenter());
    }

    private VBox createCenter() {
        HBox lbAndTfBox = mainController.createBindingLabelAndTextField();
        VBox sliderBox = mainController.createSliderAndLabel();
        Button openNewWindow = mainController.createNewWindowOnButtonClick();
        VBox centerBox = new VBox();
        centerBox.getChildren().addAll(lbAndTfBox, sliderBox, openNewWindow);
        return centerBox;
    }







}
