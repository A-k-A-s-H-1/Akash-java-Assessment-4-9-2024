package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the shape you want to create (circle,rectangle) or type 'exit' to quit:");
            String shapeType = scanner.nextLine().toLowerCase();

            if (shapeType.equals("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            switch (shapeType) {
                case "circle":
                    System.out.println("Enter the radius of the circle:");
                    double radius = scanner.nextDouble();
                    scanner.nextLine(); 
                    Circle circle = new Circle(radius);
                    System.out.println("Area of Circle: " + circle.calculateArea());
                    break;
                case "rectangle":
                    System.out.println("Enter the width of the rectangle:");
                    double width = scanner.nextDouble();
                    System.out.println("Enter the height of the rectangle:");
                    double height = scanner.nextDouble();
                    scanner.nextLine();
                    Rectangle rectangle = new Rectangle(width, height);
                    System.out.println("Area of Rectangle: " + rectangle.calculateArea());
                    break;
                default:
                    System.out.println("Invalid shape type. Please try again.");
            }
        }

        scanner.close();
    }
    }

