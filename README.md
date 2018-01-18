# MVC
Implementation of the architectural pattern Model View Controller through the composition of the design patterns Observer, Strategy and Composite.

# Overview
According to [Wikipedia](https://en.wikipedia.org/wiki/Model–view–controller), the Model–view–controller (MVC) is a software architectural pattern commonly used for developing user interfaces that divides an application into three interconnected parts. This is done to separate internal representations of information from the ways information is presented to, and accepted from, the user. The MVC design pattern decouples these major components allowing for efficient code reuse and parallel development.

* The **model** is the central component of the pattern. It expresses the application's behavior in terms of the problem domain, independent of the user interface. It directly manages the data, logic and rules of the application.
* A **view** can be any output representation of information, such as a chart or a diagram. Multiple views of the same information are possible, such as a bar chart for management and a tabular view for accountants.
* The third part or section, the **controller**, accepts input and converts it to commands for the model or view

<p align="center">
  <img height="200" src="https://developer.apple.com/library/content/documentation/General/Conceptual/DevPedia-CocoaCore/Art/model_view_controller_2x.png">
</p>

## A Design Pattern Composition
We can think at the MVC as a composition of three different design patterns. Taking a closer look to these components:

- Model uses the **Observer** pattern to keep controllers synchronized with its state.
- View and Controller use the **Strategy** pattern: we can think at View as a context where all the controllers, which encapsulate a particular behaviour, can operate.
- View also uses internally the **Composite** pattern to handle in a uniform way all the elements that make up the interface.  

# Implementation
Here it is shown only the UML class diagram of the design choice.
For further implementation details please refer to the document [Relazione.pdf](https://github.com/tmscarla/MVC/blob/master/Relazione.pdf), although in italian.

![Image](https://github.com/tmscarla/MVC/blob/master/Images/UML%20approfondimento.png)
