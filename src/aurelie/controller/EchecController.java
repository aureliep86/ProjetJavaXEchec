package aurelie.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class EchecController implements Initializable {

    @FXML
    private GridPane gridPane;

    public void installationDesPions() {
        ImageView cavalierBlanc = new ImageView(new Image("images/CB.gif"));
        ImageView cavalierNoir = new ImageView(new Image("images/CN.gif"));
        ImageView cavalierBlanc1 = new ImageView(new Image("images/CB.gif"));
        ImageView cavalierNoir1 = new ImageView(new Image("images/CN.gif"));
        ImageView dameBlanche = new ImageView(new Image("images/DB.gif"));
        ImageView dameNoire = new ImageView(new Image("images/DN.gif"));
        ImageView fouBlanc = new ImageView(new Image("images/FB.gif"));
        ImageView fouNoir = new ImageView(new Image("images/FN.gif"));
        ImageView fouBlanc1 = new ImageView(new Image("images/FB.gif"));
        ImageView fouNoir1 = new ImageView(new Image("images/FN.gif"));
        ImageView pionBlanc = new ImageView(new Image("images/PB.gif"));
        ImageView pionBlanc1 = new ImageView(new Image("images/PB.gif"));
        ImageView pionBlanc2 = new ImageView(new Image("images/PB.gif"));
        ImageView pionBlanc3 = new ImageView(new Image("images/PB.gif"));
        ImageView pionBlanc4 = new ImageView(new Image("images/PB.gif"));
        ImageView pionBlanc5 = new ImageView(new Image("images/PB.gif"));
        ImageView pionBlanc6 = new ImageView(new Image("images/PB.gif"));
        ImageView pionBlanc7 = new ImageView(new Image("images/PB.gif"));
        ImageView pionNoir = new ImageView(new Image("images/PN.gif"));
        ImageView pionNoir1 = new ImageView(new Image("images/PN.gif"));
        ImageView pionNoir2 = new ImageView(new Image("images/PN.gif"));
        ImageView pionNoir3 = new ImageView(new Image("images/PN.gif"));
        ImageView pionNoir4 = new ImageView(new Image("images/PN.gif"));
        ImageView pionNoir5 = new ImageView(new Image("images/PN.gif"));
        ImageView pionNoir6 = new ImageView(new Image("images/PN.gif"));
        ImageView pionNoir7 = new ImageView(new Image("images/PN.gif"));
        ImageView roiBlanc = new ImageView(new Image("images/RB.gif"));
        ImageView roiNoir = new ImageView(new Image("images/RN.gif"));
        ImageView tourBlanche = new ImageView(new Image("images/TB.gif"));
        ImageView tourNoire = new ImageView(new Image("images/TN.gif"));
        ImageView tourBlanche1 = new ImageView(new Image("images/TB.gif"));
        ImageView tourNoire1 = new ImageView(new Image("images/TN.gif"));

        gridPane.add(tourNoire, 0, 0);
        gridPane.add(cavalierNoir, 1, 0);
        gridPane.add(fouNoir, 2, 0);
        gridPane.add(dameNoire, 3, 0);
        gridPane.add(roiNoir, 4, 0);
        gridPane.add(fouNoir1, 5, 0);
        gridPane.add(cavalierNoir1, 6, 0);
        gridPane.add(tourNoire1, 7, 0);

        gridPane.add(pionNoir, 0, 1);
        gridPane.add(pionNoir1, 1, 1);
        gridPane.add(pionNoir2, 2, 1);
        gridPane.add(pionNoir3, 3, 1);
        gridPane.add(pionNoir4, 4, 1);
        gridPane.add(pionNoir5, 5, 1);
        gridPane.add(pionNoir6, 6, 1);
        gridPane.add(pionNoir7, 7, 1);

        gridPane.add(pionBlanc, 0, 6);
        gridPane.add(pionBlanc1, 1, 6);
        gridPane.add(pionBlanc2, 2, 6);
        gridPane.add(pionBlanc3, 3, 6);
        gridPane.add(pionBlanc4, 4, 6);
        gridPane.add(pionBlanc5, 5, 6);
        gridPane.add(pionBlanc6, 6, 6);
        gridPane.add(pionBlanc7, 7, 6);

        gridPane.add(tourBlanche, 0, 7);
        gridPane.add(cavalierBlanc, 1, 7);
        gridPane.add(fouBlanc, 2, 7);
        gridPane.add(dameBlanche, 3, 7);
        gridPane.add(roiBlanc, 4, 7);
        gridPane.add(fouBlanc1, 5, 7);
        gridPane.add(cavalierBlanc1, 6, 7);
        gridPane.add(tourBlanche1, 7, 7);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        installationDesPions();
    }
}
