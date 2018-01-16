<p align="center">
  <img height="250" src="https://developer.apple.com/library/content/documentation/General/Conceptual/DevPedia-CocoaCore/Art/model_view_controller_2x.png">
</p>

# MVC
Implementation of the architectural pattern Model View Controller through the composition of the design patterns Observer, Strategy and Composite.

# Overview
According to [Wikipedia](https://en.wikipedia.org/wiki/Model–view–controller), the Model–view–controller (MVC) is a software architectural pattern commonly used for developing user interfaces that divides an application into three interconnected parts. This is done to separate internal representations of information from the ways information is presented to, and accepted from, the user.[1][2] The MVC design pattern decouples these major components allowing for efficient code reuse and parallel development.

* The model is the central component of the pattern. It expresses the application's behavior in terms of the problem domain, independent of the user interface.[6] It directly manages the data, logic and rules of the application.
* A view can be any output representation of information, such as a chart or a diagram. Multiple views of the same information are possible, such as a bar chart for management and a tabular view for accountants.
* The third part or section, the controller, accepts input and converts it to commands for the model or view

![Image](https://github.com/tmscarla/MVC/blob/master/Images/UML%20approfondimento.png)
