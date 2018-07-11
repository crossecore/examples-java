# examples-java

This example is based on an Ecore model of the Java language itself, i.e., java.ecore.
This Java Ecore model allows you to represent any Java program as a model, e.g., a Hello World program.
The Java Ecore model comes from the Eclipse project [MoDisco](https://www.eclipse.org/MoDisco/) and allows you to represent any Java program that is imaginable as a model.
MoDisco allows you to modernize legacy Java application: You can parse the legacy Java program code into a model, define some model-to-model-transformations for refactoring and model-to-text transformations for code generation and in the end you get your modernized application.
MoDisco uses a parser that parses Java program code into models that are stored in XMI format.

The code contained in this repository is generated from java.Ecore by different code generators - including CrossEcore's - to study the differences of the generated code.

You can use CrossEcore to generate C#, TypeScript, JavaScript, or Swift code from Java.ecore.
It is possible to load the XMI models that were created from Java program code by MoDisco.

## Benchmarks

### Grabats09
#### In OCL:
```javascript
TypeDeclaration.allInstances()->
 select(each | each.bodyDeclarations->
 exists(bd | bd.oclIsTypeOf(MethodDeclaration) 
 and (not bd.modifier.oclIsUndefined()) " + "and bd.modifier._static 
 and (not bd.oclAsType(MethodDeclaration).returnType.oclIsUndefined())
 and bd.oclAsType(MethodDeclaration).returnType.type = each))->
 asSequence()
```
#### CrossEcore API:
```java
TypeDeclaration.allInstances.
 select(each -> each.getBodyDeclarations().
 exists(bd -> 
 bd instanceof MethodDeclaration
 && (!(bd.getModifier()==null))
 && bd.getModifier().isStatic()
 && (!(((MethodDeclaration)bd).getReturnType()==null))
 && (!(((MethodDeclaration)bd).getReturnType().getType()==null))
 && ((MethodDeclaration)bd).getReturnType().getType().equals(each)
)).asSequence();
```

### InvisibleMethods
#### In OCL:
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
#### In OCL:
```javascript
self.compilationUnits.commentList->
 select(each | each.oclIsTypeOf(Javadoc))->
 collect(o | o.oclAsType(Javadoc).tags).fragments->
 select(each | each.oclIsTypeOf(TextElement))->
 asSequence()
```
#### CrossEcore API:
```java
self
 .getCompilationUnits()
 .collect2(Comment.class, cu->cu.getCommentList())
 .select(each->each instanceof Javadoc)
 .collect2(ASTNode.class, o->((Javadoc)o).getTags().collect2(ASTNode.class, t->t.getFragments()))
 .select(each -> each instanceof TextElement)
 .asSequence();
```

### ThrownExceptions
#### In OCL:
```javascript
ClassDeclaration.allInstances()->
 collect(bodyDeclarations)->
 select(each | each.oclIsTypeOf(MethodDeclaration))->
 collect(each | each.oclAsType(MethodDeclaration).thrownExceptions)->
 asSequence()
```

#### CrossEcore API
```java
ClassDeclaration.allInstances
 .collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations())
 .select(each->each instanceof MethodDeclaration)
 .collect2(TypeAccess.class, each->((MethodDeclaration)each).getThrownExceptions())
 .asSequence();
```  

  





