/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoladesonido;

import java.applet.AudioClip;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;
import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import static sun.audio.AudioPlayer.player;
/**
 *
 * @author juan hernandez
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;

    public FXMLDocumentController() {
       
    }
    
       
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    String totalD,autor,cancion,selecc;
	int taman,frameSize,bitrate,pista,desplazamiento=0;	
	float frameRate,balance,E0,E1,E2,E3,E4,E5,E6,E7,E8,E9,flo=0.25f,ba=0f;	
	boolean AutoReproducir=true;
	boolean	bloquear=false;	//Controla el bloqueo de la siguiente cancion para evitar saltos de cancion involuntarios.
	boolean stop = true;	//Controla que cuando selecciones una canción si esta esta en modo autoreproducción esta no salte a la siguiente canción.			
	boolean interrumpir=true;
	
	//AudioClip plonkSound = new AudioClip("http://somehost/path/plonk.aiff");
        //plonkSound.play();    
	
	
	File archivo;

	Button BBuscar= new Button();      							//Encargado de la busqueda selectiva de archivos   
	Button BStop = new Button();      	
	Button BPlay= new Button();	
	Button BEliminar = new Button();
	Button BSiguiente = new Button();
	Button BAnterior = new Button();
	Button BMute = new Button();
	Button BresetE = new Button();
	Button BBalanceR = new Button();
	
	
	
	Pane Panel1 = new Pane();	
	Pane Panel2 = new Pane();
	Pane Panel3 = new Pane();
	Pane Panel4 = new Pane();
	
	
		
	//RadioButton AutoReproducir = new RadioButton("Auto. Repro.",true);
	ListView<String> ListCanciones = new ListView<>();;
	ArrayList<String> datos = new ArrayList<>();
	String []lista;
	String [] devuelve= new String [2000];
	
	Slider SVolumen = new Slider(0,100,25);
		
	Slider SReproduccion = new Slider(0,100,25);
	Slider SBalanceo = new Slider(-100,100,0);
	
	Slider SliderE0 = new Slider(-100,100,0);
	Slider SliderE1 = new Slider(-100,100,0);
	Slider SliderE2 = new Slider(-100,100,0);	
	Slider SliderE3 = new Slider(-100,100,0);
	Slider SliderE4 = new Slider(-100,100,0);
	Slider SliderE5 = new Slider(-100,100,0);
	Slider SliderE6 = new Slider(-100,100,0);
	Slider SliderE7 = new Slider(-100,100,0);
	Slider SliderE8 = new Slider(-100,100,0);
	Slider SliderE9 = new Slider(-100,100,0);
  
	BasicPlayer player = new BasicPlayer();	
	
}
    


    
   
