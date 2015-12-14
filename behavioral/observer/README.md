# Intent

Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified
and updated automatically.

# Also known as

Dependents, publish-subscribe

# Applicability

* When an abstraction has two aspects, one dependent on the other.
* When a change to one object requires changing the others
* When an object should be able to notify other objects without making assumptions about who these objects are.


