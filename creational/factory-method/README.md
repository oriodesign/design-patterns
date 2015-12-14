# Intent

“Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.”

# Also known as

Virtual Constructor

# Benefit

- provides hooks for subclasses

- connects parallel class hierarchies

# Partecipants


## Product (Document)

- defines the interface of objects the factory method creates.

## ConcreteProduct (MyDocument)

– implements the Product interface.

## Creator (Application)

– declares the factory method, which returns an object of type Product. Creator may also define a default implementation of the factory method that returns a default ConcreteProduct object.

– may call the factory method to create a Product object.

# ConcreteCreator (MyApplication)

– overrides the factory method to return an instance of a ConcreteProduct.”
