// This is a design pattern study, focused on the Abstract Factory pattern. 
// The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

// This is the main class, that creates an abstract factory object 'GUI factory' and its products, based on user input.
package main;

import java.util.Scanner;

import factory.*;
import factories.MacOSFactory;
import factories.WindowsFactory;
import products.Button;
import products.Checkbox;

public class Main {
    public static void main(String[] args) {
        
        // Create a scanner object to read user input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an interface style (Windows/MacOS): ");
        String style = scanner.nextLine().toLowerCase();
        
        // Evaluate the user input and select the appropriate factory.
        GUIFactory factory;
        if ("windows".equals(style)) {
            // Create a concrete factory object for Windows.
            factory = new WindowsFactory();

        } else if ("macos".equals(style)) {
            // Create a concrete factory object for MacOS.
            factory = new MacOSFactory();

        } else {
            // Return an error message and return Windows as default factory.
            System.out.println("Invalid style. Using Windows as default.");
            factory = new WindowsFactory();

        }
        
        // Create concrete products using the factory object.
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        
        // Render the products.
        button.render();
        checkbox.render();
        System.out.println("Test completed successfully! \n");
        
        // Close the scanner object.
        scanner.close();
        
    }
}
