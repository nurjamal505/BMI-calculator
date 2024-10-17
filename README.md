# **BMI Calculator App**

## **Project Description**

This **BMI Calculator** is a simple desktop application built using **JavaFX**. The application allows users to calculate their **Body Mass Index (BMI)** by entering their weight and height, and selecting the unit system (**Metric** or **English**). Based on the entered values, it computes the BMI and provides a status such as **"Underweight," "Normal," "Overweight," or "Obese."** The application also includes a **menu bar** with options to clear input fields, exit the application, and display help on how to use the app.

## **Features**

- **Metric and English Systems**: Choose between the Metric system (kg, cm) and the English system (lbs, inches).
- **BMI Status**: Categorizes the BMI into ranges: **Underweight**, **Normal**, **Overweight**, and **Obese**.
- **Menu Bar**: Options to clear inputs, exit, and display help information.
- **Error Handling**: Handles invalid input (e.g., non-numeric entries) and prompts users to correct their input.

## **Technologies Used**

- **JavaFX**: For creating the user interface.
- **Java**: For handling the backend logic and user input processing.

## **How to Use**

1. **Enter Your Weight**: Input your weight in either kilograms or pounds.
2. **Enter Your Height**: Input your height in either centimeters or inches.
3. **Select Unit System**: Choose between **Metric** or **English** by selecting the respective radio button.
4. **Calculate BMI**: Click the **"Calculate BMI"** button to see your BMI and its category.
5. **Menu Options**:
   - **Clear**: Resets all fields.

   - **Exit**: Closes the application.
   - **About**: Displays help on how to use the calculator.

## **Screenshots**

Here are some screenshots showcasing the application with various inputs:

### **Example 1: Metric System (Normal BMI)**  
![Metric Normal BMI](screenshots/metric_normal_bmi.png)
- **Weight**: 70 kg  
- **Height**: 175 cm  
- **BMI**: 22.86 (**Normal**)
![Снимок экрана 2024-10-17 233148](https://github.com/user-attachments/assets/345b1995-a59b-4e59-9716-a368a6fa9cdc)

---

### **Example 2: English System (Underweight BMI)**  
![English Underweight BMI](screenshots/english_underweight_bmi.png)
- **Weight**: 100 lbs  
- **Height**: 70 inches  
- **BMI**: 14.39 (**Underweight**)
![Снимок экрана 2024-10-17 233226](https://github.com/user-attachments/assets/61c03871-4ca8-4477-a006-ba3005300418)

---

### **Example 3: Error Handling (Invalid Input)**  
![Error Handling](screenshots/error_handling.png)
- **Weight**: `abc` (Invalid input)  
- **Height**: 175 cm  
- **Error Message**: "Please enter valid numbers for weight and height."
![Снимок экрана 2024-10-17 233258](https://github.com/user-attachments/assets/07028cec-5241-4bbd-b411-5f5509c6301c)

---

## **Installation and Setup**

Follow these steps to run the project locally:

1. Clone this repository:
   ```bash
   git clone https://github.com/nurjamal505/BMICalculatorApp
   ```
2. Open the project in your preferred IDE (such as **IntelliJ IDEA** or **Eclipse**).
3. Ensure that you have set up the **JavaFX SDK** in your environment.
4. Run the `HelloApplication.java` file to launch the application.
