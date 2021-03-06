# Design-patterns
JAVA design patterns

### Creational Design patterns
1. Abstract Factory Pattern
2. Factory Pattern
3. #### Singleton : [code here](https://github.com/kdheeraj-cse/design-patterns/tree/main/src/org/dheeraj/creational/singleton)
         A Single object instance across the JVM.
         Early Initialization - Object is intialized when class is defined
         Late Initialization - whenever object is needed, object is initialized
         
         Singleton can be breaked by
         1. Clone - to prevent override clone method and throw clonennotsupported exception
         2. Serailization - to prevent use protected Object readresolve method, which returns instance
         3. Reflection - to prevent use ENUMS, as ENUMS constructor are accessible by JVM only.
         
4. Prototype
5. Builder

### Structural Design Patterns
1. Adapter
2. Composite
3. Bridge
4. Filter
5. Decorator
6. Facade
7. Flyweight
8. Proxy

### Behavioral Design Pattern
1. Interpreter
2. #### Chain of Responsibility : 
        chain of responsibility pattern, Sender sends a request to a chain of objects, and any 
        object in the chain can handle the request. this reduce the coupling of sender to its receiver
3. #### Iterator : 
        For a collection,provide the abstraction to iterate it, so the iteration process should 
        not be dependent on the underlying collection.
4. #### Strategy : [code here](https://github.com/kdheeraj-cse/design-patterns/tree/main/src/org/dheeraj/behavioral/strategy) 
        Frequently changing behavior should be code externally and their super implementation must
        be passed as a member variable (Composition), So the behavior can be decided at the runtime.
5. Visitor
6. Template method/pattern
7. Command


