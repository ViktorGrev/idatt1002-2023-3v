package no.ntnu.idatt1002.controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import no.ntnu.idatt1002.Scenes.SceneSwitcher;
import no.ntnu.idatt1002.dao.Database;
import no.ntnu.idatt1002.dao.UserDAO;
import no.ntnu.idatt1002.data.User;

public class LoginController {

    private static final UserDAO userDAO = Database.getUserDAO();

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Text loginFeedback;

    @FXML
    private void loginButtonClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        try {
            User user = userDAO.authenticate(username, password);
            SceneSwitcher.setView("homepage");
        } catch (Exception e) {
            loginFeedback.setText(e.getLocalizedMessage());
        }
    }

    @FXML
    private void signupButtonClick() {
        SceneSwitcher.setView("signup");
    }
}
