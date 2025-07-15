// Name: Modisane Gomolemo
// Student Number: MDSGOM004
// ShapeMaker, which draws either a rectangle, circle or triangle with an option of colors and filling
// Date: 6 October 2024

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ShapeMaker {

    // Main frames for each window and components
    private static JFrame frame1;
    private static JFrame frame2;
    private static JFrame frame3;
    private static JFrame error;
    private static JLabel label1;
    private static JComboBox<String> bShape;
    private static JComboBox<String> bColor;
    private static JComboBox<String> bFill;
    private static JTextField xField;
    private static JTextField yField;
    private static JTextField radiusField;
    private static JTextField widthField;
    private static JTextField heightField;
    private static JTextField side1;
    private static JTextField side2;
    private static JTextField side3;
    private static JButton nextButton2;
    private static JButton prevButton;
    private static JButton okayButton;
    private static JButton nextButton;

    // Array of comboBox options
    private static String shapes[] = { "None", "Circle", "Rectangle", "Triangle" };
    private static String colors[] = { "None", "Black", "Blue", "Red", "Green" };
    private static String fill[] = { "None", "Filled", "Unfilled" };

    // Strings for storing selected options of the comboBox
    private static String selectedShape;
    private static String selectedColor;
    private static String selectedFill;

    // Storage for the perimeter and are of the shape
    private static double area;
    private static double perimeter;

    public static void main(String[] args) {

        // Frame1 its size and title including font for the title
        frame1 = new JFrame("ShapeMaker");
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.setSize(350, 500);

        // The title
        label1 = new JLabel("        ShapeMaker");
        Font f1 = new Font("SansSerif", Font.BOLD, 30);// The font of the title
        label1.setFont(f1);
        frame1.setLayout(new BorderLayout());
        frame1.add(label1, BorderLayout.NORTH);

        // Components of the shape selection, color and whether its filled;
        bShape = new JComboBox<String>(shapes);
        bColor = new JComboBox<String>(colors);
        bFill = new JComboBox<String>(fill);

        // Panel for shape combo box and label
        JPanel shapePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        shapePanel.add(new JLabel("What are we drawing?"));
        shapePanel.add(bShape);

        // Panel for color combo box and Label
        JPanel colorPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        colorPanel.add(new JLabel("Color?"));
        colorPanel.add(bColor);

        // Panel for filling combo box and label
        JPanel fillPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        fillPanel.add(new JLabel("Fill/Unfilled?"));
        fillPanel.add(bFill);

        // Main panel for all 3 panels
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(shapePanel);
        mainPanel.add(colorPanel);
        mainPanel.add(fillPanel);

        // "Next" button
        JPanel buttonPanel = new JPanel();
        nextButton = new JButton("Next");
        buttonPanel.add(nextButton);

        // Listener for "next" button
        shapeListener nextPanel = new shapeListener();
        nextButton.addActionListener(nextPanel);

        // adding the main panel and the button panel to the first frame
        frame1.add(mainPanel, BorderLayout.CENTER);
        frame1.add(buttonPanel, BorderLayout.SOUTH);
        frame1.setVisible(true);

    }

    // Listener for "Next Button"
    private static class shapeListener implements ActionListener {// made it static allows me to instantiate it without
                                                                  // instantiating the main class // requiring an
                                                                  // instance of the outer class
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == nextButton) {
                selectedShape = (String) bShape.getSelectedItem();// converts to shape object
                selectedColor = (String) bColor.getSelectedItem();
                selectedFill = (String) bFill.getSelectedItem();

                // Validaates to ensure an option has been picked for each comboBox
                if (selectedColor.equals("None") || selectedShape.equals("None") || selectedFill.equals("None")) {
                    errorFrame();// displays error frame

                } else {
                    dimensionFrame();// displays the next frame "frame2"
                }
            }

        }
    }

    private static void errorFrame() {

        error = new JFrame("Error");
        error.setSize(400, 150);
        JLabel errorMessage = new JLabel("Make sure you selected the Shape/Color/Filling of the shape");
        error.add(errorMessage);

        // Make color of button yellow with black foreground
        okayButton = new JButton("Okay");
        okayButton.setBackground(Color.YELLOW);
        okayButton.setForeground(Color.BLACK);

        // add button to error frame
        error.add(okayButton, BorderLayout.SOUTH);

        // makes sure that the error frame only disappears when the "okay" button is
        // pressed
        error.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame1.setVisible(false);// frame 1 is hidden
        error.setVisible(true);

        // Listener for the okay Button
        okayButton.addActionListener(new BackAndOkayButtton());
    }

    private static void dimensionFrame() {

        // frame 2 for taking dimensions and position
        frame2 = new JFrame("Dimensions and Position");
        frame2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame2.setSize(400, 300);
        frame2.setLayout(new GridLayout(6, 2));

        // X coordinate input
        frame2.add(new JLabel("X-Coordinate:"));
        xField = new JTextField(10);
        frame2.add(xField);

        // Y coordinate input
        frame2.add(new JLabel("Y-Coordinate:"));
        yField = new JTextField(10);
        frame2.add(yField);

        // frame1 is hidden
        frame1.setVisible(false);

        // adds custom components to the frame depending on the type of shape chosen
        if (selectedShape.equals("Circle")) {
            frame2.add(new JLabel("Radius:"));
            radiusField = new JTextField(10);
            frame2.add(radiusField);
            frame2.add(new JPanel());
            frame2.add(new JPanel());
            frame2.add(new JPanel());
            frame2.add(new JPanel());// These 4 empyty panels are to make sure the nexButtton2 and prevbutton are at
                                     // the last row

        } else if (selectedShape.equals("Rectangle")) {
            frame2.add(new JLabel("Width:"));
            widthField = new JTextField(10);
            // JPanel widthPanel = new JPanel(new BorderLayout());
            // widthPanel.add(widthField, BorderLayout.CENTER);
            frame2.add(widthField);

            frame2.add(new JLabel("Height:"));
            heightField = new JTextField(10);
            frame2.add(heightField);
            frame2.add(new JPanel());
            frame2.add(new JPanel());// this two extra panels is to make sure the prevButton and nextbutton2 are at
                                     // the last row
        } else if (selectedShape.equals("Triangle")) {
            frame2.add(new JLabel("Side 1:"));
            side1 = new JTextField(10);
            frame2.add(side1);

            frame2.add(new JLabel("Side 2"));
            side2 = new JTextField(10);
            frame2.add(side2);

            frame2.add(new JLabel("Side 3"));
            side3 = new JTextField(10);
            frame2.add(side3);

        }
        // NextButton which will be used to create the third frame
        nextButton2 = new JButton("Next");
        nextButton2.setBackground(Color.GREEN);// colors and forground
        nextButton2.setForeground(Color.WHITE);
        nextButton2.addActionListener(new shapeListener2());// Listener for the nextButton2

        // PerevButton returns us to the main frame(frame1)
        prevButton = new JButton("Back");
        prevButton.setBackground(Color.RED);
        prevButton.setForeground(Color.WHITE);
        prevButton.addActionListener(new BackAndOkayButtton());// Listener for the prevButton, returns to the main

        //
        JPanel backLabel = new JPanel();
        backLabel.add(prevButton);
        frame2.add(backLabel);// created panel for button and added it to frame2
        JPanel nextLabel = new JPanel();
        nextLabel.add(nextButton2);
        frame2.add(nextLabel);// created panel for button and added it to frame2

        frame2.setVisible(true);

    }

    // Listener for the "Next" button in the second frame
    private static class shapeListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == nextButton2) {
                // creates a "shape" object and calculates the area, perimeter and also draws
                // the shape specified in frame2
                if (selectedShape.equals("Circle")) {
                    Circle circle = new Circle(Double.parseDouble(radiusField.getText()), selectedColor,
                            selectedFill.equals("Fill"));
                    area = circle.getArea();
                    perimeter = circle.getPerimeter();

                    draw("Circle", circle);// takes in the shape name and the object as args
                } else if (selectedShape.equals("Rectangle")) {
                    Rectangle rectangle = new Rectangle(Double.parseDouble(widthField.getText()),
                            Double.parseDouble(heightField.getText()), selectedColor, selectedFill.equals("Fill"));
                    area = rectangle.getArea();
                    perimeter = rectangle.getPerimeter();
                    draw("Rectangle", rectangle);
                } else if (selectedShape.equals("Triangle")) {
                    Triangle triangle = new Triangle(Double.parseDouble(side1.getText()),
                            Double.parseDouble(side2.getText()), Double.parseDouble(side3.getText()), selectedColor,
                            selectedFill.equals("Fill"));
                    area = triangle.getArea();
                    perimeter = triangle.getPerimeter();
                    draw("Triangle", triangle);
                }

            }
        }

    }

    private static void draw(String shapeName, Shape shape) {
        frame3 = new JFrame(shapeName + " Drawing");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(1920, 1080);
        frame3.setLayout(new BorderLayout());
        // frame3.add(new ShapePanel(shape), BorderLayout.CENTER);

        JPanel infoPanel = new JPanel();// Panel where we will be storing all the info about the shape
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));

        // creating a label for shape and coordinates and adding it to the infoPanel
        JLabel shapeLabel = new JLabel("Shape: " + shapeName);
        infoPanel.add(shapeLabel);
        JLabel coordinatesLabel = new JLabel("Coordinates: (" + xField.getText() + ", " + yField.getText() + ")");
        infoPanel.add(coordinatesLabel);

        // checks whether the object given as args is an instance of a the cirlce,
        // rectangle or triangle class to creaate custom labels to add to frame3
        if (shape instanceof Circle) {
            JLabel radiusLabel = new JLabel("Radius: " + radiusField.getText());
            infoPanel.add(radiusLabel);
        } else if (shape instanceof Rectangle) {
            JLabel widthLabel = new JLabel("Width: " + widthField.getText());
            JLabel heigthLabel = new JLabel("Heigth: " + heightField.getText());
            infoPanel.add(widthLabel);
            infoPanel.add(heigthLabel);

        } else if (shape instanceof Triangle) {
            JLabel side1Label = new JLabel("Side 1: " + side1.getText());
            JLabel side2Label = new JLabel("Side 2: " + side2.getText());
            JLabel side3Label = new JLabel("Side 3: " + side3.getText());
            infoPanel.add(side1Label);
            infoPanel.add(side2Label);
            infoPanel.add(side3Label);
        }

        // creating and adding labels of the area and perimeter
        JLabel areaLabel = new JLabel("Area: " + area);
        JLabel perimeterLabel = new JLabel("Perimeter: " + perimeter);
        infoPanel.add(areaLabel);
        infoPanel.add(perimeterLabel);

        // adds the shape drawn into frame3
        frame3.add(new ShapePanel(shape), BorderLayout.CENTER);

        // adds the the infoPanel to frame3
        frame3.add(infoPanel, BorderLayout.NORTH);

        // frame2 is hidden and frame3 is visible
        frame2.setVisible(false);
        frame3.setVisible(true);
    }

    // class that we use to draw the shaapes
    private static class ShapePanel extends JPanel {
        private Shape shape;// Stores the shape

        public ShapePanel(Shape shape) {
            this.shape = shape; // Constructor for te shape class
        }

        // overriding the painComponent class to draw the shapes
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);// default color is black

            // checks what color the shape is so it can set the color to that of the shape
            if (shape.getColor().equals("Red")) {
                g.setColor(Color.RED);
            } else if (shape.getColor().equals("Blue")) {
                g.setColor(Color.BLUE);
            } else if (shape.getColor().equals("Green")) {
                g.setColor(Color.GREEN);
            }

            // Checks whether shape is instance of a circle, rectangle or triangle so that
            // it can custom shapes
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;// since its an instance of shape then it can be converted to a circle
                                               // object making it easier for us to check whether it is filled
                int radius = (int) circle.getRadius();
                int x = Integer.parseInt(xField.getText());
                int y = Integer.parseInt(yField.getText());
                circle.setFilled(bFill.getSelectedItem().equals("Filled"));// updates the objects filling
                if (circle.isFilled()) {// if its filled then it will draw a filled circle
                    g.fillOval(x, y, radius * 2, radius * 2);
                } else {
                    g.drawOval(x, y, radius * 2, radius * 2);
                }
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;// since its an instance of shape then it can be converted to a
                                                        // rectangle
                                                        // object making it easier for us to check whether it is filled
                int x = Integer.parseInt(xField.getText());
                int y = Integer.parseInt(yField.getText());
                int width = Integer.parseInt(widthField.getText());
                int height = Integer.parseInt(heightField.getText());
                rectangle.setFilled(bFill.getSelectedItem().equals("Filled"));// updated whether the rectaangle is
                                                                              // filled
                if (rectangle.isFilled()) {
                    g.fillRect(x, y, width, height);
                } else {
                    g.drawRect(x, y, width, height);
                }

            } else if (shape instanceof Triangle) {
                Triangle triangle = (Triangle) shape;// since its an instance of shape then it can be converted to a
                                                     // triangle
                                                     // object making it easier for us to check whether it is filled
                int x = Integer.parseInt(xField.getText());
                int y = Integer.parseInt(yField.getText());
                triangle.setFilled(bFill.getSelectedItem().equals("Filled"));// updates whether the triangle is filled
                                                                             // or not
                int[] xPoints = { x, x + Integer.parseInt(side1.getText()), x + Integer.parseInt(side2.getText()) };
                int[] yPoints = { y, y, y - (int) (Math.sqrt(Math.pow(Integer.parseInt(side2.getText()), 2)
                        - Math.pow(Integer.parseInt(side1.getText()) / 2, 2))) };
                if (triangle.isFilled()) {
                    g.fillPolygon(xPoints, yPoints, 3);
                } else {
                    g.drawPolygon(xPoints, yPoints, 3);
                }

            }
        }
    }

    // Listner for the back button of the second frame and okay button of the error
    // frame
    private static class BackAndOkayButtton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == prevButton) {
                frame2.dispose();// frame2 is destroyed if the user presses "Back"
                frame1.setVisible(true);// making frame1 visible again
            }
            if (e.getSource() == okayButton) {
                error.dispose();// error frame is destroyed if the user presses "Okay"
                frame1.setVisible(true);// making frame1 visible again
            }

        }
    }

}