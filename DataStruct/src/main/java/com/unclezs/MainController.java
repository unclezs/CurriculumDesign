package com.unclezs;

import com.unclezs.flight.ui.MainFlight;
import com.unclezs.parkingLot.ui.MainParkingLot;
import com.unclezs.queryTel.ui.MainTel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;

/*
 *@author unclezs.com
 *@date 2019.06.10 21:33
 */
public class MainController implements Initializable {
    @FXML Button flight;
    @FXML Button tel;
    @FXML Button park;
    @FXML Hyperlink csdn_blog;
    private final static Stage flightStage=new Stage();
    private final static Stage telStage=new Stage();
    private final static Stage parkStage=new Stage();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        flight.setOnMouseClicked(e->{
            try {
                MainFlight mainFlight=new MainFlight();
                mainFlight.start(flightStage);
                flightStage.setOnCloseRequest(ev->{
                    Main.mainStage.show();
                });
                Main.mainStage.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        park.setOnMouseClicked(e->{
            try {
                MainParkingLot mainParkingLot=new MainParkingLot();
                mainParkingLot.start(parkStage);
                parkStage.setOnCloseRequest(ev->{
                    Main.mainStage.show();
                });
                Main.mainStage.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        tel.setOnMouseClicked(e->{
            try {
                MainTel mainTel=new MainTel();
                mainTel.start(telStage);
                telStage.setOnCloseRequest(ev->{
                    Main.mainStage.show();
                });
                Main.mainStage.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        csdn_blog.setOnMouseClicked(e->{
            try {
                Desktop.getDesktop().browse(new URI("https://blog.csdn.net/qq_42006120"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
}