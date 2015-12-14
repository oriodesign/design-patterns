# Intent

“Separate the construction of a complex object from its representation so that the same construction process can create different representations.”

# Also known as

# Benefit

- It lets you vary a product's internal representation

- It isolate code for construction and representation

- It gives you a finer control of construction process

# Partecipants

## Builder 
specifies an abstract interface for creating parts of a Product object.

## ConcreteBuilder 
constructs and assembles parts of the product by implementing the Builder interface.
defines and keeps track of the representation it creates.
provides an interface for retrieving the product (e.g., GetASCIIText, Get-Text Widget).

## Director 
constructs an object using the Builder interface.

## Product
represents the complex object under construction. ConcreteBuilder builds the product’s internal representation and defines the process by which it’s assembled.”
