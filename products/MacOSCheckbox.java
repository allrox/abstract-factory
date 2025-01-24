// This is a 'concrete product'. It implements the Checkbox interface.
package products;

public class MacOSCheckbox implements Checkbox{

    // This block is the implementation of the render method. It uses @Override annotation to make sure that the method is overridden correctly from the Button interface.
    @Override
    public void render() {
        System.out.println("Rendering checkbox using MacOS style ");
    }
    
}
