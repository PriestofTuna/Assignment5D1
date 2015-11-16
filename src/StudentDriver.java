import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class StudentDriver extends Application{

	public static void main(String[] args) {
		 launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {	
		Text output = new Text("Output: ");
		Text nameT = new Text("");
		
		Label title = new Label("Enter the student's grades and name below");
		Label grade1 = new Label("Enter the first grade here:");
		Label grade2 = new Label("Enter the second grade here:");
		Label grade3 = new Label("Enter the third grade here:");
		Label grade4 = new Label("Enter the fourth grade here:");
		Label name = new Label("Enter the Student's name:");
		//put at the top of the grid
		TextField num1 = new TextField();
		TextField num2 = new TextField();
		TextField num3 = new TextField();
		TextField num4 = new TextField();
		TextField sName = new TextField();
		Button calculate = new Button("Average");
		
		calculate.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
	
	String numA, numB, numC, numD, name1, gpaS; 
	int numb1,numb2,numb3,numb4;
		numA = num1.getText();
		numB = num2.getText();
		numC = num3.getText();
		numD = num4.getText();
		name1 = ("Student: " + sName.getText());
		
		numb1 = Integer.parseInt(numA);
		numb2 = Integer.parseInt(numB);
		numb3 = Integer.parseInt(numC);
		numb4 = Integer.parseInt(numD);
		
		double[] assignments = {numb1, numb2, numb3, numb4};
		
		double gpa = (assignments[0] + assignments[1] + assignments[2] + assignments[3])/assignments.length;
		gpaS = ("Their gpa is: " + Double.toString(gpa));
		Student student = new Student(name1, assignments, gpa);
	
		System.out.println(student);
		output.setText(gpaS);
		nameT.setText(name1);
			}
		});
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setVgap(40);
		grid.setHgap(0);
		
		grid.add(title, 0, 0);
		grid.add(grade1, 0, 1);
		grid.add(num1, 1, 1);
		grid.add(grade2, 0, 2);
		grid.add(num2, 1, 2);
		grid.add(grade3, 0, 3);
		grid.add(num3, 1, 3);
		grid.add(grade4, 0, 4);
		grid.add(num4, 1, 4);
		grid.add(name, 0, 5);
		grid.add(sName, 1, 5);
		grid.add(calculate, 1, 6);
		grid.add(output, 2, 7 );
		grid.add(nameT, 1, 7);
		
		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}