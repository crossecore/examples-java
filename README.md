# examples-java

This example is based on an Ecore model of the Java language itself, i.e., java.ecore.
This Java Ecore model allows you to represent any Java program as a model, e.g., a Hello World program.
The Java Ecore model comes from the Eclipse project [MoDisco](https://www.eclipse.org/MoDisco/) and allows you to represent any Java program that is imaginable as a model.
MoDisco allows you to modernize legacy Java application: You can parse the legacy Java program code into a model, define some model-to-model-transformations for refactoring and model-to-text transformations for code generation and in the end you get your modernized application.
MoDisco uses a parser that parses Java program code into models that are stored in XMI format.

The code contained in this repository is generated from java.Ecore by different code generators - including CrossEcore's - to study the differences of the generated code.

You can use CrossEcore to generate C#, TypeScript, JavaScript, or Swift code from Java.ecore.
It is possible to load the XMI models that were created from Java program code by MoDisco.
