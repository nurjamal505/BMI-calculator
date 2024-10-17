package org.example.bmicalculatorapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.MenuItem;
import javafx.application.Platform;

public class HelloController {

    @FXML
    private TextField weightField; // Text field for entering weight

    @FXML
    private TextField heightField; // Text field for entering height

    @FXML
    private ToggleGroup NewToggleGroup; // Toggle group for radio buttons (metric/English)

    @FXML
    private RadioButton metricRadio; // Radio button for metric system

    @FXML
    private RadioButton englishRadio; // Radio button for English system

    @FXML
    private Label statusLabel; // Label for displaying BMI result or status message

    @FXML
    private Label bmiStatusLabel; // New label for displaying BMI status (Underweight, Normal, etc.)

    @FXML
    private MenuItem clearMenuItem; // Menu item for clearing fields

    @FXML
    private MenuItem exitMenuItem; // Menu item for exiting the application

    @FXML
    private MenuItem aboutMenuItem; // Menu item for showing help/about info

    // Method to calculate BMI
    @FXML
    protected void calculateBMI() {
        try {
            // Parse the input values for weight and height
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            double bmi; // Variable to store calculated BMI

            // Check which radio button is selected and calculate BMI accordingly
            if (metricRadio.isSelected()) {
                // BMI formula for the metric system (kg/m^2)
                bmi = weight / Math.pow(height / 100, 2); // Convert height from cm to m
            } else if (englishRadio.isSelected()) {
                // BMI formula for the English system ((lb/in^2) * 703)
                bmi = (weight / Math.pow(height, 2)) * 703; // No conversion needed for height (inches)
            } else {
                // If no unit system is selected, prompt the user
                statusLabel.setText("Please select a unit system.");
                return; // Exit the method early if no selection
            }

            // Determine the BMI status (underweight, normal, etc.)
            String bmiStatus = determineBMIStatus(bmi);

            // Display the calculated BMI and status in the labels
            statusLabel.setText(String.format("Your BMI is %.2f.", bmi));
            bmiStatusLabel.setText("Status: " + bmiStatus); // Update the new label with the BMI status

        } catch (NumberFormatException e) {
            // Handle invalid input (non-numeric values)
            statusLabel.setText("Please enter valid numbers for weight and height.");
            bmiStatusLabel.setText(""); // Clear the status label in case of an error
        }
    }

    // Method to determine the BMI status based on the calculated BMI value
    private String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight"; // BMI < 18.5
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal"; // BMI between 18.5 and 24.9
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight"; // BMI between 25 and 29.9
        } else {
            return "Obese"; // BMI >= 30
        }
    }

    // Method to clear input fields
    @FXML
    private void clearFields() {
        weightField.clear(); // Clear the weight input field
        heightField.clear(); // Clear the height input field
        statusLabel.setText(""); // Clear the BMI result label
        bmiStatusLabel.setText(""); // Clear the BMI status label
        NewToggleGroup.selectToggle(null); // Deselect any radio buttons
    }

    // Method to exit the application
    @FXML
    private void exitApplication() {
        Platform.exit(); // Close the application
    }

    // Method to show about/help information
    @FXML
    private void showAbout() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("About BMI Calculator");
        alert.setHeaderText(null);
        alert.setContentText("This application calculates your Body Mass Index (BMI) based on your weight and height.\n\n"
                + "Enter your weight and height, select the unit system, and click 'Calculate BMI' to see your results.\n\n"
                + "Developed by Osmonalieva Nurjamal");
        alert.showAndWait(); // Show the alert dialog
    }

    // Method called when the "Calculate BMI" button is clicked
    @FXML
    public void onCalculateButtonClick(ActionEvent actionEvent) {
        // Call the method to calculate BMI when the button is pressed
        calculateBMI();
    }

    // Method called when the "Clear" menu item is clicked
    @FXML
    public void onClearMenuItemClick(ActionEvent actionEvent) {
        clearFields(); // Call the clearFields method
    }

    // Method called when the "Exit" menu item is clicked
    @FXML
    public void onExitMenuItemClick(ActionEvent actionEvent) {
        exitApplication(); // Call the exitApplication method
    }

    // Method called when the "About" menu item is clicked
    @FXML
    public void onAboutMenuItemClick(ActionEvent actionEvent) {
        showAbout(); // Call the showAbout method
    }

    public ToggleGroup getNewToggleGroup() {
        return NewToggleGroup;
    }

    public void setNewToggleGroup(ToggleGroup newToggleGroup) {
        NewToggleGroup = newToggleGroup;
    }
}
