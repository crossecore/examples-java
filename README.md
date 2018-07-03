# examples-java

This example is based on an Ecore model of the Java language itself, i.e., java.ecore. 
This Java Ecore model allows you to represent any Java program as a model. 
The Java code contained in this repository code generated from the java.ecore.
With the help of the Java Ecore model, you can describe any Java program that is imaginable.
Java model code is used by the [MoDisco](https://www.eclipse.org/MoDisco/) Eclipse project that allows you to modernize legacy Java application: You can parse the legacy Java program code into a model representation, define some model-to-model-transformations for refactoring and model-to-text transformations for code generation and in the end you get a modernized application.
With CrossEcore you could also represent any Java program in C#, TypeScript, JavaScript, Swift.

## Benchmarks

### Grabats09
```javascript
TypeDeclaration.allInstances()->
 select(each | each.bodyDeclarations->
 exists(bd | bd.oclIsTypeOf(MethodDeclaration) 
 and (not bd.modifier.oclIsUndefined()) " + "and bd.modifier._static 
 and (not bd.oclAsType(MethodDeclaration).returnType.oclIsUndefined())
 and bd.oclAsType(MethodDeclaration).returnType.type = each))->
 asSequence()
```
### InvisibleMethods
```javascript
ClassDeclaration.allInstances()->
 collect(bodyDeclarations)->
 select(each | each.oclIsTypeOf(MethodDeclaration))->
 select(each | (not each.modifier.oclIsUndefined()) 
 and (not each.modifier.visibility.oclIsUndefined()) 
 and (each.modifier.visibility = VisibilityKind::private 
 or each.modifier.visibility = VisibilityKind::protected))->
 asSequence()
```

### TextElementInJavadoc
```javascript
self.compilationUnits.commentList->
 select(each | each.oclIsTypeOf(Javadoc))->
 collect(o | o.oclAsType(Javadoc).tags).fragments->
 select(each | each.oclIsTypeOf(TextElement))->
 asSequence()
```

### ThrownExceptions
```javascript
ClassDeclaration.allInstances()->
 collect(bodyDeclarations)->
 select(each | each.oclIsTypeOf(MethodDeclaration))->
 collect(each | each.oclAsType(MethodDeclaration).thrownExceptions)->
 asSequence()
```






