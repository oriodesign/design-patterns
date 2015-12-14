# Intent

“Ensure a class only has one instance, and provide a global point of access to it.”

# Benefit

- Controlled access to sole instance

- Reduced Namespace (avoid polluting global namespace)

# Partecipants

### Singleton

– defines an Instance operation that lets clients access its unique instance. Instance is a class operation (that is, a class method in Smalltalk and a static member function in C++).

– may be responsible for creating its own unique instance.
