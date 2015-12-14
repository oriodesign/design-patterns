# Intent

Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

# Also Known As

Kit

# Benefit

- Isolate concrete class

- It makes exchanging product families easily

- It promote consistency among products

# Participants

###  AbstractFactory
Declares an interface for operations that create abstract product objects.

### ConcreteFactory
implements the operations to create concrete product objects.

### AbstractProduct
declares an interface for a type of product object.

### ConcreteProduct (MotifWindow, MotifScrollBar)
defines a product object to be created by the corresponding concrete factory.
implements the AbstractProduct interface.

### Client
– uses only interfaces declared by AbstractFactory and AbstractProduct classes.”
