package no.ntnu.idatt1002.controller;

import javafx.fxml.FXML;
import no.ntnu.idatt1002.scene.SceneSwitcher;

public class HelpCategoryController extends MenuController {
    @FXML
    private void goBackClick() {
        SceneSwitcher.setView("help");
    }
}