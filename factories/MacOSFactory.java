// This is an example of a 'concrete factory' class that implements the GUIFactory interface:

package factories;

// Here are the concrete products that are created by the concrete factory.
import factory.GUIFactory;

// Button and Checkbox are the products that are created by the concrete factory.
import products.Button;
import products.Checkbox;

// MacOSButton and MacOSCheckbox are the concrete products that are created by the concrete factory.
import products.MacOSButton;
import products.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    // This block of code is the implementation of the createButton and createCheckbox methods. 
    // It uses @Override annotation to make sure that the methods are overridden correctly from the GUIFactory interface.
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
    
}
