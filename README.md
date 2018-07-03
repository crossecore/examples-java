# examples-java

This example is based on an Ecore model of the Java language itself, i.e., java.ecore. 
This Java Ecore model allows you to represent any Java program as a model. 
The Java code contained in this repository code generated from the java.ecore.
With the help of the Java Ecore model, you can describe any Java program that is imaginable.
Java model code is used by the [MoDisco](https://www.eclipse.org/MoDisco/) Eclipse project that allows you to modernize legacy Java application: You can parse the legacy Java program code into a model representation, define some model-to-model-transformations for refactoring and model-to-text transformations for code generation and in the end you get a modernized application.
With CrossEcore you could also represent any Java program in C#, TypeScript, JavaScript, Swift.

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

  





