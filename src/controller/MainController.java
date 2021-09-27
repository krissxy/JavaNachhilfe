package controller;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainController {


    public Button createNewWindowOnButtonClick(){
        Button newWinBtn = new Button("Drück mich für ein neues Fenster");
        newWinBtn.setOnAction(b -> createNewWindow());
        return newWinBtn;
    }

    public void createNewWindow() {
        Stage stage = new Stage();
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 250, 250);
        stage.setTitle("Ich bin eine neue Stage");
        stage.setScene(scene);
        stage.show();
    }


    public VBox createSliderAndLabel(){
        Slider fontSlider = new Slider();
        Label label = new Label("Ich bin ein Label");
        fontSlider.setMin(0);
        fontSlider.setMax(150);
        fontSlider.valueProperty().addListener(((observable, oldValue, newValue) -> {
            label.setFont(new Font(newValue.doubleValue()));
        }));
        VBox vbox = new VBox();
        vbox.getChildren().addAll(fontSlider, label);

        return vbox;

    }

    public HBox createBindingLabelAndTextField() {
        Label bindingLb = new Label("Label mit Binding ans Textfeld");
        TextField bindingTf = new TextField();
        bindingTf.setPromptText("Schreib etwas in mich hinein :)");
        bindingLb.textProperty().bind(bindingTf.textProperty());
        HBox hbox = new HBox();
        hbox.getChildren().addAll(bindingLb, bindingTf);
        return hbox;
    }
}
