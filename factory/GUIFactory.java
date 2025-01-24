// This is an Abstract Factory, it defines the interface for new related object families creation.

package factory;

import products.Button;
import products.Checkbox;

// The Abstract Factory interface declares a set of methods that return different abstract products. These products are called a family and are related by a high-level theme or concept. Products of one family are usually able to collaborate among themselves. A family of products may have several variants, but the products of one variant are incompatible with products of another.
public interface GUIFactory {

    // Note that the return type is the interface, not the concrete class. This is a key point of the Abstract Factory pattern.
    Button createButton();
    Checkbox createCheckbox();

}
