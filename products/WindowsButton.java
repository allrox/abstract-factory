// This is a 'concrete product'. It implements the Button interface.
package products;

public class WindowsButton implements Button{

    // This block is the implementation of the render method. It uses @Override annotation to make sure that the method is overridden correctly from the Button interface.
    @Override
    public void render() {
        System.out.println("Rendering button using Windows style");
    }
    
}
