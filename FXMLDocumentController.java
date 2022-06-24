import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
public class FXMLDocumentController implements Initializable {   
    @FXML
    private Button btnChange;    
    @FXML
    private ImageView ko;
    @FXML
    private Label lblXY;
    @FXML
    private void handleButtonAction(MouseEvent event) {
        Image img = new Image("/11134335211617275951-128.png");
        Notifications aboutNotif = Notifications.create()
        .title("SoRoSh Brand")
        .text("Sorosh Moradi")
        .position(Pos.BOTTOM_LEFT)
        .graphic(new ImageView(img))
        .hideAfter(Duration.seconds(3));
    aboutNotif.darkStyle();
    aboutNotif.show();
    while(true){
    Random R = new Random();    
    double getX = event.getX();
    double getY = event.getY();
    int setX = R.nextInt(440);
    int setY = R.nextInt(400);
    if (setX>getX+50 && setX<getX-50) {}
    if (setY>getY+50 && setY<getY-50) {}
    else{
    ko.setLayoutX(setX);
    ko.setLayoutY(setY);
    break;
    }
    }
    }
    
    @FXML
    private void moved(MouseEvent event){
    double x = event.getX();
    double y = event.getY();
    lblXY.setText(x+" , "+y);
    }
    @FXML
    private void enter(MouseEvent event){
    moved(event);
    }
    @FXML
    private void exite(MouseEvent event){
    lblXY.setText("-,-");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }     
}