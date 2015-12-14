# Intent

Define a family of algorythms, encapsulate each one, and make them interchangeable. 
Strategy lets the algorythm vary independently from clients that use it.

# Also known as 

Policy

# Applicability

* Many related classes differ only in their behaviour. 
* You need different variant of an algorithm. 
* An algorithm uses data that clients shouldn't know about. 


# Partecipants

* Strategy 
* ConcreteStrategy
* Context