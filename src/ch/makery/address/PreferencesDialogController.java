package ch.makery.address;

import javafx.fxml.FXML;
import javafx.stage.Stage;

/**
 * @author Abdallah Abdelazim
 */
public class PreferencesDialogController {

    private Stage dialogStage;
    // Reference to the main application
    private Main main;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Stage getDialogStage() {
        return dialogStage;

    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }



    @FXML
    private void handleOK(){

        dialogStage.close();
    }

    @FXML
    private void handleCancel(){
        dialogStage.close();
    }
}
