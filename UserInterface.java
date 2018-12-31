package calculator;

import java.util.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.util.ArrayList;

import calculator.*;
import calculator.BusinessLogic;

/**
 * <p> Title: UserInterface Class. </p>
 * 
 * <p> Description: The Java/FX-based user interface for the calculator. The class works with String
 * objects and passes work to other classes to deal with all other aspects of the computation.</p>
 * 
 * <p> Copyright: Lynn Robert Carter © 2017 </p>
 * 
 * @author(baseline) Lynn Robert Carter
 * @author(additions) karthik reddy
 * 
 * @version 4.00	2017-10-17 The JavaFX-based GUI for the implementation of a calculator
 * @version 4.10	2018-03-10 The JavaFX-based GUI for the implementation of a calculator with error terms
 */

public class UserInterface
{ 
	
	/*************************************************************************************************/
	/*										Global variables				    				     */
	/*************************************************************************************************/
	
	static Group rootPopUp1;
	static Group rootPopUp2;
	static Scene scenePopUp1;
	static Scene scenePopUp2;
	static Stage stagePopUp1;
	static Stage stagePopUp2;
	
	/************************************ Accordion1_Attribites **************************************/
	TitledPane tnil1, td1, tt1, tm1, tv1, ta1, tf1, tgp1, tvol1, tara1, toth1; 
	ObservableList<Button> arrayscalar1 = FXCollections.observableArrayList();
	ObservableList<Button> arrayDistance1 = FXCollections.observableArrayList();
	ObservableList<Button> arrayTime1 = FXCollections.observableArrayList();
	ObservableList<Button> arrayMass1 = FXCollections.observableArrayList();
	ObservableList<Button> arrayVelocity1 = FXCollections.observableArrayList();
	ObservableList<Button> arrayAcceleration1 = FXCollections.observableArrayList();
	ObservableList<Button> arrayForce1 = FXCollections.observableArrayList();
	ObservableList<Button> arrayGravitationalParameter1 = FXCollections.observableArrayList();
	ObservableList<Button> arrayvolume1 = FXCollections.observableArrayList();
	ObservableList<Button> arrayarea1 = FXCollections.observableArrayList();
	ObservableList<Button> arrayother1 = FXCollections.observableArrayList();

	/************************************ Accordion2_Attribites **************************************/
	TitledPane tnil2, td2, tt2, tm2, tv2, ta2, tf2, tgp2, tvol2, tara2, toth2;
	ObservableList<Button> arrayscalar2 = FXCollections.observableArrayList();
	ObservableList<Button> arrayDistance2 = FXCollections.observableArrayList();
	ObservableList<Button> arrayTime2 = FXCollections.observableArrayList();
	ObservableList<Button> arrayMass2 = FXCollections.observableArrayList();
	ObservableList<Button> arrayVelocity2 = FXCollections.observableArrayList();
	ObservableList<Button> arrayAcceleration2 = FXCollections.observableArrayList();
	ObservableList<Button> arrayForce2 = FXCollections.observableArrayList();
	ObservableList<Button> arrayGravitationalParameter2 = FXCollections.observableArrayList();
	ObservableList<Button> arrayvolume2 = FXCollections.observableArrayList();
	ObservableList<Button> arrayarea2 = FXCollections.observableArrayList();
	ObservableList<Button> arrayother2 = FXCollections.observableArrayList();
	
	/**************************************************************************************************/
	Accordion accordion1 = new Accordion();
	Accordion accordion2 = new Accordion();
	
	
	Label labelSelectAWord = new Label("Units");
	static Button btnSelectAWord1 = new Button("Select Unit");
	
	Label labelSelectAWord1 = new Label("Units");
	static Button btnSelectAWord2 = new Button("Select Unit");
	
	/**********************************Buttons for first operand Units********************************/

	Button btnUnit_1000 = createButton ("- no unit selected - ", "0");	
	Button btnUnit_1Meter = createButton ("meter", "1");
	Button btnUnit_1KiloMeter = createButton ("kilometer", "2");
	Button btnUnit_1Feet = createButton ("feet", "3");	
	Button btnUnit_1Seconds = createButton ("seconds", "4");
	Button btnUnit_1Hours = createButton ("minutes", "5");
	Button btnUnit_1Years = createButton ("hours", "6");	
	Button btnUnit_1Grams = createButton ("grams", "7");
	Button btnUnit_1KiloGrams = createButton ("pounds", "8");
	Button btnUnit_1Pounds = createButton ("kilograms", "9");	
	Button btnUnit_1mps = createButton ("mps", "10");
	Button btnUnit_1kmph = createButton ("kmph", "11");	
	Button btnUnit_1mps2 = createButton ("mps2", "12");
	Button btnUnit_1kmph2 = createButton ("kmph2", "13");	
	Button btnUnit_1N = createButton ("Newton", "14");
	Button btnUnit_1d = createButton ("Dyne", "15");	
	Button btnUnit_1gp = createButton ("km3s-2", "16");
	Button btnUnit_1vol1 = createButton ("m3", "17");
	Button btnUnit_1vol2 = createButton ("km3", "18");
	Button btnUnit_1ara1 = createButton ("m2", "19");
	Button btnUnit_1ara2 = createButton ("km2", "20");
	Button btnUnit_1oth = createButton("sec2","21");
	Button btnUnit_1kmps = createButton ("kmps", "22");	
	Button btnUnit_1sday = createButton ("sec.day-1", "23");	

	/*********************************Buttons for second operand Units********************************/

	Button btnUnit_2000 = createButton1 ("- no unit selected - ", "0");
	Button btnUnit_2Meter = createButton1 ("meter", "1"); 
	Button btnUnit_2KiloMeter = createButton1 ("kilometer", "2");
	Button btnUnit_2Feet = createButton1 ("feet", "3");	
	Button btnUnit_2Seconds = createButton1 ("seconds", "4");
	Button btnUnit_2Hours = createButton1 ("minutes", "5");
	Button btnUnit_2Years = createButton1 ("hours", "6");	
	Button btnUnit_2Grams = createButton1 ("grams", "7");
	Button btnUnit_2KiloGrams = createButton1 ("pounds", "8");
	Button btnUnit_2Pounds = createButton1 ("kilograms", "9");	
	Button btnUnit_2mps = createButton1 ("mps", "10");
	Button btnUnit_2kmph = createButton1 ("kmph", "11");	
	Button btnUnit_2mps2 = createButton1 ("mps2", "12");
	Button btnUnit_2kmph2 = createButton1 ("kmph2", "13");	
	Button btnUnit_2N = createButton1 ("Newton", "14");
	Button btnUnit_2d = createButton1 ("Dyne", "15");	
	Button btnUnit_2gp = createButton1 ("km3s-2", "16");
	Button btnUnit_2vol1 = createButton1 ("m3", "17");
	Button btnUnit_2vol2 = createButton1 ("km3", "18");
	Button btnUnit_2ara1 = createButton1 ("m2", "19");
	Button btnUnit_2ara2 = createButton1 ("km2", "20");
	Button btnUnit_2oth = createButton1("sec2","21");
	Button btnUnit_2kmps = createButton1 ("kmps", "22");	
	Button btnUnit_2sday = createButton1 ("sec.day-1", "23");

	/**************************************************************************************************/
	String outputSelectedUnit1 = "";
	int outputSelectedUnit1Index = 0;
	Button button1Selected = createButton("Select unit 1","-1");	
	String unit1Name = "- no unit selected - ";
	int unit1Index = 0;
	Unit unit1 = new Unit(0);	
	String outputSelectedUnit2 = "";
	int outputSelectedUnit2Index = 0;
	
	Button button2Selected = createButton1("Select unit 2","-1");
	
	String unit2Name = "- no unit selected - ";
	int unit2Index = 0;
	Unit unit2 = new Unit(0);
	
	String[] unitList = {"-- no unit selected --", "meter", "kilometer", "feet", "seconds", "minutes", "hours", 
			"grams", "pounds", "kilograms", "mps", "kmph", "mps2", "kmph2", "Newton", "Dyne", "km3s-2", "m3", "km3", "m2","km2", "sec2", "kmps","sec.day-1"};

	private Button createButton (String buttonText, String txtIndex) {
		Button button = new Button(buttonText);
		button.setOnAction(eve->{btnSelectAWord1.setText(button.getText());
		outputSelectedUnit1 = button.getText(); 
		outputSelectedUnit1Index = Integer.parseInt(txtIndex);
		stagePopUp1.close();});
		unit1 = new Unit(outputSelectedUnit1Index);
		return button;
	}
	
	private Button createButton1 (String buttonText, String txtIndex) {
		Button button = new Button(buttonText);
		button.setOnAction(eve1->{btnSelectAWord2.setText(button.getText());
		outputSelectedUnit2 = button.getText(); 
		outputSelectedUnit2Index = Integer.parseInt(txtIndex);
		stagePopUp2.close();});
		unit2 = new Unit(outputSelectedUnit2Index);
		return button;
	}
		
	/**********************************************************************************************

	Attributes
	
	**********************************************************************************************/

	
	/* Constants used to parameterize the graphical user interface.  We do not use a layout manager for
	   this application. Rather we manually control the location of each graphical element for exact
	   control of the look and feel. */
	private final double BUTTON_WIDTH = 60;
	private final double BUTTON_OFFSET = BUTTON_WIDTH / 2;

	// These are the application values required by the user interface
	private Label label_Doublecalculator = new Label("UNumber Calulator");
	
	/************************************ First operand field declarations *******************************************/
	
	private Label label_Operand1 = new Label("First operand");
	private Label operand1_errorterm = new Label("Error Term (Operand 1)");
	private TextField text_Operand1 = new TextField();
	private TextField text_operand1_errorterm = new TextField();
	private Label label_Unitone = new Label("Select Unit");
	private Label label_errOperand1 = new Label("");
	private Label label_errerror1 = new Label("");
	
	/************************************ second operand field declarations *******************************************/
	
	private Label label_Operand2 = new Label("Second operand");
	private Label operand2_errorterm = new Label("Error Term (Operand 2)");
	private TextField text_Operand2 = new TextField();
	private TextField text_operand2_errorterm = new TextField();
	private Label label_Unittwo = new Label("Select Unit");
	private Label label_errOperand2 = new Label("");
	private Label label_errerror2 = new Label("");
	
	/************************************ result operand field declarations *******************************************/
	
	private Label label_Result = new Label("Result");
	private Label Result_errorterm = new Label("Error Term (Result)");
	private TextField text_Result = new TextField();
	private TextField text_Result_errorterm = new TextField();
	private Label label_Unitresult = new Label("Unit");
	private TextField result_units = new TextField();
	private Label label_errResult = new Label("");
	private Label label_errerrorr = new Label("");
	
	/************************************ buttons field declarations **************************************************/
	
	private Button button_Add = new Button("+");
	private Button button_Sub = new Button("-");
	private Button button_Mpy = new Button("\u00D7");				// The multiply symbol: \u00D7
	private Button button_Div = new Button("\u00F7");				// The divide symbol: \u00F7
	private Button button_Root = new Button("\u221A");
	
	/******************************************************************************************************************/	
	
	// If the multiplication and/or division symbols do not display properly, replace the 
	// quoted strings used in the new Button constructor call with the <backslash>u00xx values
	// shown on the same line. This is the Unicode representation of those characters and will
	// work regardless of the underlying hardware being used.
	
	private double buttonSpace;		// This is the white space between the operator buttons.
	
	/* This is the link to the business logic */
	public BusinessLogic perform = new BusinessLogic();

	
	/**********************************************************************************************

	Constructors
	
	**********************************************************************************************/

	/**********
	 * This method initializes all of the elements of the graphical user interface. These assignments
	 * determine the location, size, font, color, and change and event handlers for each GUI object.
	 */
	public UserInterface(Pane theRoot)
	{
		
		buttonSpace = Calculator.WINDOW_WIDTH / 6;

		setupLabelUI(label_Doublecalculator, "Arial", 24, Calculator.WINDOW_WIDTH, Pos.CENTER, 0, 10);
		
		/******************************************* Setting Operand1 for UI *******************************************/
		
		setupLabelUI(label_Operand1, "Arial", 18, Calculator.WINDOW_WIDTH-10, Pos.BASELINE_LEFT, 10, 60);
		
		setupLabelUI(operand1_errorterm, "Arial", 18, Calculator.WINDOW_WIDTH-10, Pos.BASELINE_LEFT, 630, 60);
		
		setupLabelUI(label_Unitone, "Arial", 18, Calculator.WINDOW_WIDTH-10, Pos.BASELINE_LEFT, 1170, 60);
		
		setupTextUI(text_Operand1, "Arial", 18, Calculator.WINDOW_WIDTH-950, Pos.BASELINE_LEFT, 10, 82, true);
		
		text_Operand1.textProperty().addListener((observable, oldValue, newValue) -> {setOperand1(); });
		
		setupTextUI(text_operand1_errorterm, "Arial", 18, Calculator.WINDOW_WIDTH-1000, Pos.BASELINE_LEFT, 630, 82, true);
		
		text_operand1_errorterm.textProperty().addListener((observable, oldValue, newValue) -> {setOperand1_error(); });
		
		text_Operand1.setOnAction((event) -> { text_operand1_errorterm.requestFocus(); });
		
		text_operand1_errorterm.setOnAction((event) -> { text_Operand2.requestFocus(); });

		setupLabelUI(label_errOperand1, "Arial", 18, 10, Pos.BASELINE_LEFT, 10, 120);

		label_errOperand1.setTextFill(Color.RED);
		
		label_errOperand1.setAlignment(Pos.BASELINE_RIGHT);
		
		setupLabelUI(label_errerror1, "Arial", 18, 10, Pos.BASELINE_LEFT, 10, 145);

		label_errerror1.setTextFill(Color.RED);
		
		label_errerror1.setAlignment(Pos.BASELINE_RIGHT);
		
		setupButtonUI(btnSelectAWord1, "Arial", 17, 70, Pos.BASELINE_LEFT, 1170, 82);
		
		btnSelectAWord1.setOnAction(e->{stagePopUp1.showAndWait();});
		
		btnSelectAWord1.setMinWidth(320);
		
		/******************************************* Setting Operande2 for UI *******************************************/
		
		setupLabelUI(label_Operand2, "Arial", 18, Calculator.WINDOW_WIDTH-10, Pos.BASELINE_LEFT, 10, 175);

		setupLabelUI(operand2_errorterm, "Arial", 18, Calculator.WINDOW_WIDTH-10, Pos.BASELINE_LEFT, 630, 175);
		
		setupLabelUI(label_Unittwo, "Arial", 18, Calculator.WINDOW_WIDTH-10, Pos.BASELINE_LEFT, 1170, 175);
		
		setupTextUI(text_Operand2, "Arial", 18, Calculator.WINDOW_WIDTH-950, Pos.BASELINE_LEFT, 10, 197, true);
		
		text_Operand2.textProperty().addListener((observable, oldValue, newValue) -> {setOperand2(); });

		setupTextUI(text_operand2_errorterm, "Arial", 18, Calculator.WINDOW_WIDTH-1000, Pos.BASELINE_LEFT, 630, 197, true);
		
		text_operand2_errorterm.textProperty().addListener((observable, oldValue, newValue) -> {setOperand2_error(); });
		
		text_Operand2.setOnAction((event) -> { text_operand2_errorterm.requestFocus(); });
		
		text_operand2_errorterm.setOnAction((event) -> { text_Result.requestFocus(); });
		
		setupLabelUI(label_errOperand2, "Arial", 18, 10, Pos.BASELINE_LEFT, 10, 235);
		
		label_errOperand2.setTextFill(Color.RED);
		
		label_errOperand2.setAlignment(Pos.BASELINE_RIGHT);
		
		setupLabelUI(label_errerror2, "Arial", 18, 10, Pos.BASELINE_LEFT, 10, 255);
		
		label_errerror2.setTextFill(Color.RED);
		
		label_errerror2.setAlignment(Pos.BASELINE_RIGHT);
		
		setupButtonUI(btnSelectAWord2, "Arial", 17, 70, Pos.BASELINE_LEFT, 1170, 197);
		
		btnSelectAWord2.setOnAction(e->{stagePopUp2.showAndWait();});
		
		btnSelectAWord2.setMinWidth(320);
		
		/******************************************* Setting Results for UI *******************************************/
		
		setupLabelUI(label_Result, "Arial", 18, Calculator.WINDOW_WIDTH-10, Pos.BASELINE_LEFT, 10, 290);
		
		setupLabelUI(Result_errorterm, "Arial", 18, Calculator.WINDOW_WIDTH-10, Pos.BASELINE_LEFT, 630, 290);
		
		setupLabelUI(label_Unitresult, "Arial", 18, Calculator.WINDOW_WIDTH-10, Pos.BASELINE_LEFT, 1170, 290);

		setupTextUI(text_Result, "Arial", 18, Calculator.WINDOW_WIDTH-950, Pos.BASELINE_LEFT, 10, 312, false);

		setupTextUI(text_Result_errorterm, "Arial", 18, Calculator.WINDOW_WIDTH-1000, Pos.BASELINE_LEFT, 630, 312, false);

		setupTextUI(result_units, "Arial", 18, Calculator.WINDOW_WIDTH-1180, Pos.BASELINE_LEFT, 1170, 312, false);
		
		setupLabelUI(label_errResult, "Arial", 18, 10, Pos.BASELINE_LEFT, 10, 355);
		
		label_errResult.setTextFill(Color.RED);
		
		label_errResult.setAlignment(Pos.BASELINE_RIGHT);
		
		setupLabelUI(label_errerrorr, "Arial", 18, 10, Pos.BASELINE_LEFT, 10, 375);
		
		label_errerrorr.setTextFill(Color.RED);
		
		label_errerrorr.setAlignment(Pos.BASELINE_RIGHT);

		//******************************************************************************************************************************************
		// Establish the ADD "+" button, position it, and link it to methods to accomplish its work
		setupButtonUI(button_Add, "Symbol", 32, BUTTON_WIDTH, Pos.BASELINE_LEFT, 1 * buttonSpace-BUTTON_OFFSET, 400);
		button_Add.setOnAction((event) -> { addOperands(); });
		
		// Establish the SUB "-" button, position it, and link it to methods to accomplish its work
		setupButtonUI(button_Sub, "Symbol", 32, BUTTON_WIDTH, Pos.BASELINE_LEFT, 2 * buttonSpace-BUTTON_OFFSET, 400);
		button_Sub.setOnAction((event) -> { subOperands(); });
		
		// Establish the MPY "x" button, position it, and link it to methods to accomplish its work
		setupButtonUI(button_Mpy, "Symbol", 32, BUTTON_WIDTH, Pos.BASELINE_LEFT, 3 * buttonSpace-BUTTON_OFFSET, 400);
		button_Mpy.setOnAction((event) -> { mpyOperands(); });
		
		// Establish the DIV "/" button, position it, and link it to methods to accomplish its work
		setupButtonUI(button_Div, "Symbol", 32, BUTTON_WIDTH, Pos.BASELINE_LEFT, 4 * buttonSpace-BUTTON_OFFSET, 400);
		button_Div.setOnAction((event) -> { divOperands(); });
		
		// Establish the Root button, position it, and link it to methods to accomplish its work
		setupButtonUI(button_Root, "Symbol", 32, BUTTON_WIDTH, Pos.BASELINE_LEFT, 5 * buttonSpace-BUTTON_OFFSET, 400);
		button_Root.setOnAction((event) -> { rootOperands(); });
		
				
		/************************************************ Accordion1 setter ************************************/
		
		arrayscalar1 = FXCollections.observableArrayList(btnUnit_1000);
		arrayDistance1 = FXCollections.observableArrayList(btnUnit_1Meter, btnUnit_1KiloMeter, btnUnit_1Feet);
		arrayTime1 = FXCollections.observableArrayList(btnUnit_1Seconds, btnUnit_1Hours, btnUnit_1Years);
		arrayMass1 = FXCollections.observableArrayList(btnUnit_1Grams, btnUnit_1KiloGrams, btnUnit_1Pounds);
		arrayVelocity1 = FXCollections.observableArrayList(btnUnit_1mps, btnUnit_1kmph, btnUnit_1kmps);
		arrayAcceleration1 = FXCollections.observableArrayList(btnUnit_1mps2, btnUnit_1kmph2);
		arrayForce1 = FXCollections.observableArrayList(btnUnit_1N, btnUnit_1d);
		arrayGravitationalParameter1 = FXCollections.observableArrayList(btnUnit_1gp);
		arrayvolume1 = FXCollections.observableArrayList(btnUnit_1vol1,btnUnit_1vol2);
		arrayarea1 = FXCollections.observableArrayList(btnUnit_1ara1,btnUnit_1ara2);
		arrayother1 = FXCollections.observableArrayList(btnUnit_1oth, btnUnit_1sday);

		tnil1 = new TitledPane("Scalar unit", new ListView<>(arrayscalar1));
		td1 = new TitledPane("distance", new ListView<>(arrayDistance1));
		tt1 = new TitledPane("time", new ListView<>(arrayTime1));
		tm1 = new TitledPane("mass", new ListView<>(arrayMass1));
		tv1 = new TitledPane("velocity", new ListView<>(arrayVelocity1));
		ta1 = new TitledPane("acceleration", new ListView<>(arrayAcceleration1));
		tf1 = new TitledPane("force", new ListView<>(arrayForce1));
		tgp1 = new TitledPane("gravitational constant", new ListView<>(arrayGravitationalParameter1));
		tvol1 = new TitledPane("Volume", new ListView<>(arrayvolume1));
		tara1 = new TitledPane("Area", new ListView<>(arrayarea1));
		toth1 = new TitledPane("Others", new ListView<>(arrayother1));
		
		rootPopUp1 = new Group();

		accordion1.getPanes().addAll(tnil1, td1, tt1, tm1, tv1, ta1, tf1, tgp1, tvol1, tara1, toth1);
		accordion1.setMinWidth(300);
		accordion1.setMaxHeight(400);
		rootPopUp1.getChildren().addAll(accordion1);
		scenePopUp1 = new Scene(rootPopUp1, 300, 400);   
		stagePopUp1 = new Stage();
		stagePopUp1.setScene(scenePopUp1);
		stagePopUp1.setTitle("Select the Unit");	

		btnUnit_1000.setOnAction((event) -> { button1Selected = (btnUnit_1000); setOperand1(); setOperand2(); });
		btnUnit_1Meter.setOnAction((event) -> { button1Selected = (btnUnit_1Meter); setOperand1(); setOperand2(); });
		btnUnit_1KiloMeter.setOnAction((event) -> { button1Selected = (btnUnit_1KiloMeter); setOperand1(); setOperand2(); });
		btnUnit_1Feet.setOnAction((event) -> { button1Selected = (btnUnit_1Feet); setOperand1(); setOperand2(); });		
		btnUnit_1Seconds.setOnAction((event) -> { button1Selected = (btnUnit_1Seconds); setOperand1(); setOperand2(); });
		btnUnit_1Hours.setOnAction((event) -> { button1Selected = (btnUnit_1Hours); setOperand1(); setOperand2(); });
		btnUnit_1Years.setOnAction((event) -> { button1Selected = (btnUnit_1Years); setOperand1(); setOperand2(); });		
		btnUnit_1Grams.setOnAction((event) -> { button1Selected = (btnUnit_1Grams); setOperand1(); setOperand2(); });
		btnUnit_1KiloGrams.setOnAction((event) -> { button1Selected = (btnUnit_1KiloGrams); setOperand1(); setOperand2(); });
		btnUnit_1Pounds.setOnAction((event) -> { button1Selected = (btnUnit_1Pounds); setOperand1(); setOperand2(); });		
		btnUnit_1mps.setOnAction((event) -> { button1Selected = (btnUnit_1mps); setOperand1(); setOperand2(); });
		btnUnit_1kmph.setOnAction((event) -> { button1Selected = (btnUnit_1kmph); setOperand1(); setOperand2(); });
		btnUnit_1kmps.setOnAction((event) -> { button1Selected = (btnUnit_1kmps); setOperand1(); setOperand2(); });		
		btnUnit_1mps2.setOnAction((event) -> { button1Selected = (btnUnit_1mps2); setOperand1(); setOperand2(); });
		btnUnit_1kmph2.setOnAction((event) -> { button1Selected = (btnUnit_1kmph2); setOperand1(); setOperand2(); });		
		btnUnit_1N.setOnAction((event) -> { button1Selected = (btnUnit_1N); setOperand1(); setOperand2(); });
		btnUnit_1d.setOnAction((event) -> { button1Selected = (btnUnit_1d); setOperand1(); setOperand2(); });		
		btnUnit_1gp.setOnAction((event) -> { button1Selected = (btnUnit_1gp); setOperand1(); setOperand2(); });			
		btnUnit_1vol1.setOnAction((event) -> { button1Selected = (btnUnit_1vol1); setOperand1(); setOperand2(); });	
		btnUnit_1vol2.setOnAction((event) -> { button1Selected = (btnUnit_1vol2); setOperand1(); setOperand2(); });	
		btnUnit_1ara1.setOnAction((event) -> { button1Selected = (btnUnit_1ara1); setOperand1(); setOperand2(); });
		btnUnit_1ara2.setOnAction((event) -> { button1Selected = (btnUnit_1ara2); setOperand1(); setOperand2(); });
		btnUnit_1oth.setOnAction((event) -> { button1Selected = (btnUnit_1oth); setOperand1(); setOperand2(); });
		btnUnit_1sday.setOnAction((event) -> { button1Selected = (btnUnit_1sday); setOperand1(); setOperand2(); });
		/******************************************** Accordion2 setter ************************************/
		
		arrayscalar2 = FXCollections.observableArrayList(btnUnit_2000); 
		arrayDistance2 = FXCollections.observableArrayList(btnUnit_2Meter, btnUnit_2KiloMeter, btnUnit_2Feet);;
		arrayTime2 = FXCollections.observableArrayList(btnUnit_2Seconds, btnUnit_2Hours, btnUnit_2Years);
		arrayMass2 = FXCollections.observableArrayList(btnUnit_2Grams, btnUnit_2KiloGrams, btnUnit_2Pounds);
		arrayVelocity2 = FXCollections.observableArrayList(btnUnit_2mps, btnUnit_2kmph, btnUnit_2kmps);
		arrayAcceleration2 = FXCollections.observableArrayList(btnUnit_2mps2, btnUnit_2kmph2);
		arrayForce2 = FXCollections.observableArrayList(btnUnit_2N, btnUnit_2d);
		arrayGravitationalParameter2 = FXCollections.observableArrayList(btnUnit_2gp);
		arrayvolume2 = FXCollections.observableArrayList(btnUnit_2vol1,btnUnit_2vol2);
		arrayarea2 = FXCollections.observableArrayList(btnUnit_2ara1,btnUnit_2ara2);
		arrayother2 = FXCollections.observableArrayList(btnUnit_2oth, btnUnit_2sday);

		tnil2 = new TitledPane("Scalar unit", new ListView<>(arrayscalar2));
		td2 = new TitledPane("distance", new ListView<>(arrayDistance2));
		tt2 = new TitledPane("time", new ListView<>(arrayTime2));
		tm2 = new TitledPane("mass", new ListView<>(arrayMass2));
		tv2 = new TitledPane("velocity", new ListView<>(arrayVelocity2));
		ta2 = new TitledPane("acceleration", new ListView<>(arrayAcceleration2));
		tf2 = new TitledPane("force", new ListView<>(arrayForce2));
		tgp2 = new TitledPane("gravitational constant", new ListView<>(arrayGravitationalParameter2));
		tvol2 = new TitledPane("Volume", new ListView<>(arrayvolume2));
		tara2 = new TitledPane("Area", new ListView<>(arrayarea2));
		toth2 = new TitledPane("Others", new ListView<>(arrayother2));

		rootPopUp2 = new Group();

		accordion2.getPanes().addAll(tnil2, td2, tt2, tm2, tv2, ta2, tf2, tgp2, tvol2, tara2, toth2);
		accordion2.setMinWidth(300);
		accordion2.setMaxHeight(400);

		rootPopUp2.getChildren().addAll(accordion2);
		scenePopUp2 = new Scene(rootPopUp2, 300, 400);       
		stagePopUp2 = new Stage();
		stagePopUp2.setScene(scenePopUp2);
		stagePopUp2.setTitle("Select the Unit");	

		btnUnit_2000.setOnAction((event) -> { button2Selected = (btnUnit_2000); setOperand2(); setOperand1(); });
		btnUnit_2Meter.setOnAction((event) -> { button2Selected = (btnUnit_2Meter); setOperand2(); setOperand1(); });
		btnUnit_2KiloMeter.setOnAction((event) -> { button2Selected = (btnUnit_2KiloMeter); setOperand2(); setOperand1(); });
		btnUnit_2Feet.setOnAction((event) -> { button2Selected = (btnUnit_2Feet); setOperand2(); setOperand1(); });		
		btnUnit_2Seconds.setOnAction((event) -> { button2Selected = (btnUnit_2Seconds); setOperand2(); setOperand1(); });
		btnUnit_2Hours.setOnAction((event) -> { button2Selected = (btnUnit_2Hours); setOperand2(); setOperand1(); });
		btnUnit_2Years.setOnAction((event) -> { button2Selected = (btnUnit_2Years); setOperand2(); setOperand1(); });		
		btnUnit_2Grams.setOnAction((event) -> { button2Selected = (btnUnit_2Grams); setOperand2(); setOperand1(); });
		btnUnit_2KiloGrams.setOnAction((event) -> { button2Selected = (btnUnit_2KiloGrams); setOperand2(); setOperand1(); });
		btnUnit_2Pounds.setOnAction((event) -> { button2Selected = (btnUnit_2Pounds); setOperand2(); setOperand1(); });		
		btnUnit_2mps.setOnAction((event) -> { button2Selected = (btnUnit_2mps); setOperand2(); setOperand1(); });
		btnUnit_2kmph.setOnAction((event) -> { button2Selected = (btnUnit_2kmph); setOperand2(); setOperand1(); });	
		btnUnit_2kmps.setOnAction((event) -> { button2Selected = (btnUnit_2kmps); setOperand2(); setOperand1(); });	
		btnUnit_2mps2.setOnAction((event) -> { button2Selected = (btnUnit_2mps2); setOperand2(); setOperand1(); });
		btnUnit_2kmph2.setOnAction((event) -> { button2Selected = (btnUnit_2kmph2); setOperand2(); setOperand1(); });		
		btnUnit_2N.setOnAction((event) -> { button2Selected = (btnUnit_2N); setOperand2(); setOperand1(); });
		btnUnit_2d.setOnAction((event) -> { button2Selected = (btnUnit_2d); setOperand2(); setOperand1(); });		
		btnUnit_2gp.setOnAction((event) -> { button2Selected = (btnUnit_2gp); setOperand2(); setOperand1(); });		
		btnUnit_2vol1.setOnAction((event) -> { button2Selected = (btnUnit_2vol1); setOperand1(); setOperand2(); });
		btnUnit_2vol2.setOnAction((event) -> { button2Selected = (btnUnit_2vol2); setOperand1(); setOperand2(); });
		btnUnit_2ara1.setOnAction((event) -> { button2Selected = (btnUnit_2ara1); setOperand1(); setOperand2(); });
		btnUnit_2ara2.setOnAction((event) -> { button2Selected = (btnUnit_2ara2); setOperand1(); setOperand2(); });
		btnUnit_2oth.setOnAction((event) -> { button2Selected = (btnUnit_2oth); setOperand1(); setOperand2(); });
		btnUnit_2sday.setOnAction((event) -> { button2Selected = (btnUnit_2sday); setOperand1(); setOperand2(); });
		/******************************************************************************************************************************************/
		// Place all of the just-initialized GUI elements into the pane
		
		theRoot.getChildren().addAll(label_Doublecalculator, 
			label_Operand1, text_Operand1, label_errOperand1, operand1_errorterm,
			text_operand1_errorterm, label_errerror1, label_Unitone, btnSelectAWord1,
			label_Operand2, text_Operand2, label_errOperand2, operand2_errorterm,
			text_operand2_errorterm, label_errerror2, label_Unittwo, btnSelectAWord2, result_units,
			label_Result, text_Result, label_errResult, label_Unitresult, Result_errorterm, text_Result_errorterm,label_errerrorr,
			button_Add, button_Sub, button_Mpy, button_Div, button_Root);
				
		/******************************************************************************************************************************************/		
	}
	
	/**********
	 * Private local method to initialize the standard fields for a label
	 */
	private void setupLabelUI(Label l, String ff, double f, double w, Pos p, double x, double y){
		l.setFont(Font.font(ff, f));
		l.setMinWidth(w);
		l.setAlignment(p);
		l.setLayoutX(x);
		l.setLayoutY(y);		
	}
	
	/**********
	 * Private local method to initialize the standard fields for a text field
	 */
	private void setupTextUI(TextField t, String ff, double f, double w, Pos p, double x, double y, boolean e){
		t.setFont(Font.font(ff, f));
		t.setMinWidth(w);
		t.setMaxWidth(w);
		t.setAlignment(p);
		t.setLayoutX(x);
		t.setLayoutY(y);		
		t.setEditable(e);
	}
	
	/**********
	 * Private local method to initialize the standard fields for a button
	 */
	private void setupButtonUI(Button b, String ff, double f, double w, Pos p, double x, double y){
		b.setFont(Font.font(ff, f));
		b.setMinWidth(w);
		b.setAlignment(p);
		b.setLayoutX(x);
		b.setLayoutY(y);		
	}
	
	
	/**********************************************************************************************

	User Interface Actions
	
	**********************************************************************************************/

	/**********
	 * Private local method to set the value of the first operand given a text value. The method uses the
	 * business logic class to perform the work of checking the string to see it is a valid value and if 
	 * so, saving that value internally for future computations. If there is an error when trying to convert
	 * the string into a value, the called business logic method returns false and actions are taken to
	 * display the error message appropriately.
	 */
	private void setOperand1() {
		text_Result_errorterm.setText("");
		result_units.setText("");
		text_Result.setText("");								// Any change of an operand probably invalidates
		label_Result.setText("Result");						// the result, so we clear the old result.
		label_errResult.setText("");
		if (perform.setOperand1(text_Operand1.getText())) {	// Set the operand and see if there was an error
			label_errOperand1.setText("");					// If no error, clear this operands error
			if (text_Operand2.getText().length() == 0)		// If the other operand is empty, clear its error
				label_errOperand2.setText("");				// as well.
		}
		else 												// If there's a problem with the operand, display
			label_errOperand1.setText("Operand-1 Error: "+perform.getOperand1ErrorMessage());	// the error message that was generated
		if(!button1Selected.getText().equals("Select unit 1"))
		{
		btnSelectAWord1.setText(button1Selected.getText());
		result_units.setText("");
		text_Result.setText("");
		text_Result_errorterm.setText("");
		label_errResult.setText("");									// Reset any result error messages from before
		unit1Name = button1Selected.getText();
		for(int i=0;i<unitList.length;i++) {
			if(unit1Name.equals(unitList[i])) {
				unit1Index = i;
				break;
			}
		}
		stagePopUp1.close();
		unit1 = new Unit(unit1Index);
		}
	}	
	
	private void setOperand1_error() {
		text_Result_errorterm.setText("");
		Result_errorterm.setText("Result");
		label_errResult.setText("");
		label_errerrorr.setText("");
		if (perform.setOperand1_error(text_operand1_errorterm.getText())) {	// Set the operand and see if there was an error
			label_errerror1.setText("");					// If no error, clear this operands error
			if (text_operand2_errorterm.getText().length() == 0)		// If the other operand is empty, clear its error
				label_errerror2.setText("");				// as well.
		}
		else 												// If there's a problem with the operand, display
			label_errerror1.setText("Operand-1 (Error Term) Error:"+perform.getOperand1_error_ErrorMessage());	// the error message that was generated
	}
	
	
	
	/**********
	 * Private local method to set the value of the second operand given a text value. The logic is exactly the
	 * same as used for the first operand, above.
	 */
	private void setOperand2() {
		text_Result_errorterm.setText("");
		result_units.setText("");
		text_Result.setText("");								// See setOperand1's comments. The logic is the same!
		label_Result.setText("Result");				
		label_errResult.setText("");
		
		if (perform.setOperand2(text_Operand2.getText())) {
			label_errOperand2.setText("");
			if (text_Operand1.getText().length() == 0)
				label_errOperand1.setText("");
		}
		else
			label_errOperand2.setText("Operand-2 Error: "+perform.getOperand2ErrorMessage());
		
		if(!button2Selected.getText().equals("Select unit 2"))
		{
		btnSelectAWord2.setText(button2Selected.getText());
		result_units.setText("");
		text_Result.setText("");
		text_Result_errorterm.setText("");
		label_errResult.setText("");									// Reset any result error messages from before
		unit2Name = button2Selected.getText();
		for(int i=0;i<unitList.length;i++) {
			if(unit2Name.equals(unitList[i])) {
				unit2Index = i;
				break;
			}
		}		
		stagePopUp2.close();
		unit2 = new Unit(unit2Index);
		}
	}
	
	
	private void setOperand2_error() {
		text_Result_errorterm.setText("");								// See setOperand1's comments. The logic is the same!
		Result_errorterm.setText("Result");	
		label_errResult.setText("");
		label_errerrorr.setText("");
		if (perform.setOperand2_error(text_operand2_errorterm.getText())) {
			label_errerror2.setText("");
			if (text_operand1_errorterm.getText().length() == 0)
				label_errerror2.setText("");
		}
		else
			label_errerror2.setText("Operand-2 (Error Term) Error:"+perform.getOperand2_error_ErrorMessage());
	}
	
	
	/**********
	 * This method is called when an binary operation button has been pressed. It assesses if there are issues 
	 * with one of the binary operands or they are not defined. If not return false (there are no issues)
	 * 
	 * @return	True if there are any issues that should keep the calculator from doing its work.
	 */
	private boolean singleOperandIssues() {
		String errorMessage1 = perform.getOperand1ErrorMessage();	// Fetch the error messages, if there are any
		if (errorMessage1.length() > 0) {						// Check the first.  If the string is not empty
			label_errOperand1.setText(errorMessage1);			// there's an error message, so display it.
			
		}														// Signal there are issues
		
		// If the code reaches here, neither the first nor the second has an error condition. The following code
		// check to see if the operands are defined.
		if (!perform.getOperand1Defined()) {						// Check to see if the first operand is defined
			label_errOperand1.setText("No value found");			// If not, this is an issue for a binary operator
			if (!perform.getOperand2Defined()) {					// Now check the second operand. It is is also
				label_errOperand2.setText("No value found");		// not defined, then two messages should be displayed
				return true;										// Signal there are issues
			}
			return true;
		}
		
		return false;											// Signal there are no issues with the operands
	}														// Signal there are issues
	
	
	/**********
	 * This method is called when an binary operation button has been pressed. It assesses if there are issues 
	 * with either of the binary operands or they are not defined. If not return false (there are no issues)
	 * 
	 * @return	True if there are any issues that should keep the calculator from doing its work.
	 */
	private boolean binaryOperandIssues() {
		String errorMessage1 = perform.getOperand1ErrorMessage();	// Fetch the error messages, if there are any
		String errorMessage2 = perform.getOperand2ErrorMessage();
		if (errorMessage1.length() > 0) {						// Check the first.  If the string is not empty
			label_errOperand1.setText(errorMessage1);			// there's an error message, so display it.
			if (errorMessage2.length() > 0) {					// Check the second and display it if there is
				label_errOperand2.setText(errorMessage2);		// and error with the second as well.
				return true;										// Return true when both operands have errors
			}
			else {
				return true;										// Return true when only the first has an error
			}
		}
		else if (errorMessage2.length() > 0) {					// No error with the first, so check the second
			label_errOperand2.setText(errorMessage2);			// operand. If non-empty string, display the error
			return true;											// message and return true... the second has an error
		}														// Signal there are issues
		
		// If the code reaches here, neither the first nor the second has an error condition. The following code
		// check to see if the operands are defined.
		if (!perform.getOperand1Defined()) {						// Check to see if the first operand is defined
			label_errOperand1.setText("No value found");			// If not, this is an issue for a binary operator
			if (!perform.getOperand2Defined()) {					// Now check the second operand. It is is also
				label_errOperand2.setText("No value found");		// not defined, then two messages should be displayed
				return true;										// Signal there are issues
			}
			return true;
		} else if (!perform.getOperand2Defined()) {				// If the first is defined, check the second. Both
			label_errOperand2.setText("No value found");			// operands must be defined for a binary operator.
			return true;											// Signal there are issues
		}
		
		return false;											// Signal there are no issues with the operands
	}

	/*******************************************************************************************************
	 * This portion of the class defines the actions that take place when the various calculator
	 * buttons (add, subtract, multiply, and divide) are pressed.
	 */

	/**********
	 * This is the add routine
	 * 
	 */
	private void addOperands()
	{
		// Check to see if both operands are defined and valid
		if (binaryOperandIssues()) 									
			return;
		
		if(unit1.checkIfValidForAddition(unit2))
		{
			perform.setOperand1WithConversion(unit1.getMetricMultiplier());
			perform.setOperand2WithConversion(unit2.getMetricMultiplier());
			
			UNumber m_v = perform.addition();
			UNumber e_v = perform.er_addition();
			
			String mainans = CalculatorValue.Result_toString(m_v.toString(),e_v.toString());
			
			String lines[] = mainans.split("\\r?\\n");
			
			String theAnswer = lines[1];						
			String etheAnswer = lines[0];
			label_errResult.setText("");								
			label_errerrorr.setText("");
			if(((perform.getOperand1_error_ErrorMessage()).length()==0)&&((perform.getOperand2_error_ErrorMessage()).length()==0))
			{
				
				if (theAnswer.length() > 0)
				{	
					String ggwp = unit1.getResultantUnitAfterAddition(unit2).getUnit();
					result_units.setText(ggwp);
					text_Result.setText(theAnswer);							
					label_Result.setText("Sum");							
				}
				else
				{
					result_units.setText("");
					text_Result.setText("");												
					label_Result.setText("Result");							
					label_errResult.setText(perform.getResultErrorMessage());	
				}
				
				if (etheAnswer.length() > 0)
				{
					text_Result_errorterm.setText(etheAnswer);						
					Result_errorterm.setText("Sum");							
				}
				else
				{														
					text_Result_errorterm.setText("");											
					Result_errorterm.setText("Result");							
					label_errerrorr.setText(perform.getResult_errorErrorMessage());	
				}			
			}
		}
		else
		{
			result_units.setText("");
			text_Result.setText("");
			text_Result_errorterm.setText("");											
			Result_errorterm.setText("Result");							
			label_errResult.setText("Addition is not possible, as units are differed");	
		}
	}

	/**********
	 * This is the subtract routine
	 * 
	 */
	private void subOperands()
	{
		if (binaryOperandIssues()) 									
			return;		
		
		if(unit1.checkIfValidForSubtraction(unit2))
		{
			perform.setOperand1WithConversion(unit1.getMetricMultiplier());
			perform.setOperand2WithConversion(unit2.getMetricMultiplier());
			
			UNumber m_v = perform.subtraction();
			UNumber e_v = perform.er_subtraction();
			
			String mainans = CalculatorValue.Result_toString(m_v.toString(),e_v.toString());
			
			String lines[] = mainans.split("\\r?\\n");
			String theAnswer = lines[1];					
			String etheAnswer = lines[0];
			label_errResult.setText("");								
			label_errerrorr.setText("");
			
			if(((perform.getOperand1_error_ErrorMessage()).length()==0)&&((perform.getOperand2_error_ErrorMessage()).length()==0))
			{
				if (theAnswer.length() > 0) {
					String ggwp = unit1.getResultantUnitAfterSubtraction(unit2).getUnit();
					result_units.setText(ggwp);
					text_Result.setText(theAnswer);							
					label_Result.setText("Difference");				
				}
				else
				{		
					result_units.setText("");
					text_Result.setText("");												
					label_Result.setText("Result");							
					label_errResult.setText(perform.getResultErrorMessage());	
				}	
				if (etheAnswer.length() > 0) {								
					text_Result_errorterm.setText(etheAnswer);							
					Result_errorterm.setText("Difference");							
				}
				else {														
					text_Result_errorterm.setText("");												
					Result_errorterm.setText("Result");							
					label_errerrorr.setText(perform.getResult_errorErrorMessage());	
				}
			}
		}
		else
		{
			result_units.setText("");
			text_Result.setText("");
			text_Result_errorterm.setText("");											
			Result_errorterm.setText("Result");							
			label_errResult.setText("Subtraction is not possible, as units are differed");	
		}
	}

	/**********
	 * This is the multiply routine
	 * 
	 */
	private void mpyOperands()
	{
		if (binaryOperandIssues()) 									
			return;			
	
		if(unit1.checkIfValidForMultiplication(unit2))
		{
			
			perform.setOperand1WithConversion(unit1.getMetricMultiplier());
			perform.setOperand2WithConversion(unit2.getMetricMultiplier());
			
			UNumber m_v = perform.multiplication();
			
			
			UNumber e_v = perform.er_multiplication();
			
	
			if(e_v==null)
			{
				e_v=new UNumber("0");
			}
			String mainans = CalculatorValue.Result_toString(m_v.toString(),e_v.toString());
			
			String lines[] = mainans.split("\\r?\\n");

			String theAnswer = lines[1];				
			String etheAnswer = lines[0];
			label_errResult.setText("");								
			label_errerrorr.setText("");

			if(((perform.getOperand1_error_ErrorMessage()).length()==0)&&((perform.getOperand2_error_ErrorMessage()).length()==0))
			{

				if (theAnswer.length() > 0) {
					String ggwp = unit1.getResultantUnitAfterMultiplication(unit2).getUnit();
					result_units.setText(ggwp);
					text_Result.setText(theAnswer);							
					label_Result.setText("Multiplied Value");			
				}
				else {			
					result_units.setText("");
					text_Result.setText("");												
					label_Result.setText("Result");							
					label_errResult.setText(perform.getResultErrorMessage());	
				}
				if (etheAnswer.length() > 0) {								
					text_Result_errorterm.setText(etheAnswer);							
					Result_errorterm.setText("Multiplied error Value");							
				}
				else {														
					text_Result_errorterm.setText("");												
					Result_errorterm.setText("Result");							
					label_errerrorr.setText(perform.getResult_errorErrorMessage());	
				}
			}
		}
		else
		{
			result_units.setText("");
			text_Result.setText("");
			text_Result_errorterm.setText("");											
			Result_errorterm.setText("Result");							
			label_errResult.setText("Multiplication is not possible, as units are differed");	
		}
	}

	/**********
	 * This is the divide routine.  If the divisor is zero, the divisor is declared to be invalid.
	 * 
	 */
	private void divOperands(){

		if (binaryOperandIssues()) 									
			return;													

		if(unit1.checkIfValidForDivision(unit2))
		{
			perform.setOperand1WithConversion(unit1.getMetricMultiplier());
			perform.setOperand2WithConversion(unit2.getMetricMultiplier());
		
			String t1 = perform.division();
			String t2 = perform.er_division();
			String theAnswer = "";
			String etheAnswer = "";
			if(t1 != "" && t2 != "")
			{			
				String mainans = CalculatorValue.Result_toString(t1,t2);

				String lines[] = mainans.split("\\r?\\n");
				theAnswer = lines[1];						
				etheAnswer = lines[0];
			}
			else
			{
				theAnswer = t1;
				etheAnswer = t2;
			}
			label_errResult.setText("");								

			if(((perform.getOperand1_error_ErrorMessage()).length()==0)&&((perform.getOperand2_error_ErrorMessage()).length()==0))
			{
				if (theAnswer.length() > 0)
				{	
					String ggwp = unit1.getResultantUnitAfterMultiplication(unit2).getUnit();
					result_units.setText(ggwp);
					text_Result.setText(theAnswer);							
					label_Result.setText("Divided Value");					
				}
				else
				{		
					result_units.setText("");
					text_Result.setText("");												
					label_Result.setText("Result");							
					label_errResult.setText(perform.getResultErrorMessage());	

				}
				if (etheAnswer.length() > 0)
				{								
					text_Result_errorterm.setText(etheAnswer);							
					Result_errorterm.setText("Divided Value");							
				}
				else
				{														
					text_Result_errorterm.setText("");												
					Result_errorterm.setText("Result");							
					label_errerrorr.setText(perform.getResult_errorErrorMessage());	
				}
			}
		}
		else
		{
			result_units.setText("");
			text_Result.setText("");
			text_Result_errorterm.setText("");											
			Result_errorterm.setText("Result");							
			label_errResult.setText("Division is not possible, as units are differed");	
		}
	}
	
	/**********
	 * This is the square root routine.  If the input is negative, the output is declared to be invalid.
	 * 
	 */
	private void rootOperands()
	{		
		if (singleOperandIssues()) 									
			return;
		
		
		if(unit1.checkIfValidForSquareroot(unit2))
		{
			String t1 = perform.rooting();
			String t2 = perform.er_rooting();
			String theAnswer = "";
			String etheAnswer = "";	

			if(t1 != "" && t2 != "")
			{		
				String mainans = CalculatorValue.Result_toString(t1,t2);		
				String lines[] = mainans.split("\\r?\\n");
				theAnswer = lines[1];						
				etheAnswer = lines[0];
			}
			else
			{
				theAnswer = t1;
				etheAnswer = t2;
			}
			label_errResult.setText("");
			label_errOperand2.setText("");
			text_Operand2.setText("");
			label_errerror2.setText("");
			text_operand2_errorterm.setText("");		

			if (theAnswer.length() > 0)
			{
				String ggwp = unit1.getResultantUnitAfterMultiplication(unit2).getUnit();
				result_units.setText(ggwp);
				text_Result.setText(theAnswer);							
				label_Result.setText("Resultant Value");					
			}
			else
			{			
				result_units.setText("");
				text_Result.setText("");												
				label_Result.setText("Result");							
				label_errResult.setText(perform.getResultErrorMessage());	
			}
			if (etheAnswer.length() > 0)
			{										
				text_Result_errorterm.setText(etheAnswer);							
				Result_errorterm.setText("Resultant Value");							
			}
			else
			{		
				text_Result_errorterm.setText("");												
				Result_errorterm.setText("Result");							
				label_errerrorr.setText(perform.getResult_errorErrorMessage());	
			}
		}
		else
		{
			result_units.setText("");
			text_Result.setText("");
			text_Result_errorterm.setText("");											
			Result_errorterm.setText("Result");							
			label_errResult.setText("Square root is not possible, as root of that unit is not possible");	
		}
	}
}