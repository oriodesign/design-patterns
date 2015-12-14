# Intent 

Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

# Also Known As

Objects for States

# Benefit 

- It localizes state-specific behavior and partitions behavior for different states. The State pattern puts all behavior associated with a particular state into one object.

- It makes state transitions explicit.

Partecipants

## Context

– maintains an instance of a ConcreteState subclass that defines the current state.

## State (TCPState)

-  defines an interface for encapsulating the behavior associated with a particular state of the Context.

## ConcreteState subclasses (TCPEstablished, TCPListen, TCPClosed)

- each subclass implements a behavior associated with a state of the Context.”