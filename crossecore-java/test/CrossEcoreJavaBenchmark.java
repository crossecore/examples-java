import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Ocllib.QuickSet;
import Ocllib.Sequence;
import Ocllib.Set;
import java_.ASTNode;
import java_.BodyDeclaration;
import java_.ClassDeclaration;
import java_.Comment;
import java_.CompilationUnit;
import java_.Java_Factory;
import java_.Java_FactoryImpl;
import java_.Java_PackageImpl;
import java_.Javadoc;
import java_.MethodDeclaration;
import java_.MethodDeclarationImpl;
import java_.Model;
import java_.TextElement;
import java_.TypeAccess;
import java_.TypeDeclaration;
import java_.VisibilityKind;


public class CrossEcoreJavaBenchmark {

	private static Model model;
	
	@BeforeClass
	public static void setUp() throws Exception {
		
		Java_PackageImpl.init();
		
		Function<TypeAccess, Boolean> kk = x->true;
		
		kk.apply(null);
		
		
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        
        resSet.getPackageRegistry().put("java_", Java_PackageImpl.eINSTANCE);
        
//		EClass x = Java_PackageImpl.Literals.FIELDDECLARATION;
//		EStructuralFeature fragments = x.getEStructuralFeature("fragments");
//		Object value = x.eGet(fragments, true);
//		List<EStructuralFeature> features = x.getEStructuralFeatures();
//		List<EStructuralFeature> allfeatures = x.getEAllStructuralFeatures();
        
//        FieldDeclaration fielddeclaration = Java_FactoryImpl.eINSTANCE.createFieldDeclaration();
//        EStructuralFeature fragments = fielddeclaration.eClass().getEStructuralFeature("fragments");
//        Object value = fielddeclaration.eGet(fragments, true);
//        
//        SuperMethodInvocation superMethodInvocation = Java_FactoryImpl.eINSTANCE.createSuperMethodInvocation();
//        EStructuralFeature arguments = superMethodInvocation.eClass().getEStructuralFeature("arguments");
//        Object val = superMethodInvocation.eGet(arguments, true);
        
        //Resource resource = resSet.getResource(URI.createURI("resources/org.eclipse.gmt.modisco.java.kyanos.xmi"), true);
        Resource resource = resSet.getResource(URI.createURI("resources/org.eclipse.jdt.core.xmi"), true);	
        model = (Model) resource.getContents().get(0);
	
	}
	
	@Test
	public void grabats09Query() {
		
		
		
		long time = System.currentTimeMillis();
		Sequence<TypeDeclaration> result6 = TypeDeclaration.allInstances.
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		&& bd.getModifier().isStatic()
		&& (!(((MethodDeclaration)bd).getReturnType()==null))
		&& (!(((MethodDeclaration)bd).getReturnType().getType()==null))
		&& ((MethodDeclaration)bd).getReturnType().getType().equals(each)
		)).asSequence();
		time = System.currentTimeMillis()-time;
		System.out.println("crossecore: grabats09: "+time);
		System.out.println("crossecore: grabats09 size: "+result6.size());

	}
	

	public void grabats09Query2() {
		
		/*
		TypeDeclaration.allInstances()->size()
		339 OK
		 */
		QuickSet<TypeDeclaration> result1 = TypeDeclaration.allInstances;
		System.out.println(result1.size());
		
		/*
		TypeDeclaration.allInstances()->
		select(each | each.bodyDeclarations->
		exists(bd | 
		bd.oclIsTypeOf(MethodDeclaration)
		))->size()
		241 OK
		 */
		
		Set<TypeDeclaration> result2 = TypeDeclaration.allInstances.
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		));
		System.out.println(result2.size());
		
		
		/*
		TypeDeclaration.allInstances()->
		select(each | each.bodyDeclarations->
		exists(bd | 
		bd.oclIsTypeOf(MethodDeclaration)
		and (not bd.modifier.oclIsUndefined()) 
		))->size()
		132 OK
		*/
		
		Set<TypeDeclaration> result3 = TypeDeclaration.allInstances.
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		));
		System.out.println(result3.size());
		
		
		/*
		TypeDeclaration.allInstances()->
		select(each | each.bodyDeclarations->
		exists(bd | 
		bd.oclIsTypeOf(MethodDeclaration)
		and (not bd.modifier.oclIsUndefined()) 
		and bd.modifier._static 
		))->size()
		2 OK
		*/
		
		Set<TypeDeclaration> result4 = TypeDeclaration.allInstances.
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		&& bd.getModifier().isStatic()
		));
		System.out.println(result4.size());
		
		/*
		TypeDeclaration.allInstances()->
		select(each | each.bodyDeclarations->
		exists(bd | 
		bd.oclIsTypeOf(MethodDeclaration)
		and (not bd.modifier.oclIsUndefined()) 
		and bd.modifier._static 
		and (not bd.oclAsType(MethodDeclaration).returnType.oclIsUndefined()) 
		))->size()
		2 OK
		*/
		
		Set<TypeDeclaration> result5 = TypeDeclaration.allInstances.
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		&& bd.getModifier().isStatic()
		&& (!(((MethodDeclaration)bd).getReturnType()==null))
		));
		System.out.println(result5.size());
		
		
		Set<TypeDeclaration> result5x = TypeDeclaration.allInstances.
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		&& bd.getModifier().isStatic()
		&& (!(((MethodDeclaration)bd).getReturnType()==null))
		&& (!(((MethodDeclaration)bd).getReturnType().getType().equals(each)))
		));
		System.out.println(result5x.size());
		
		/*
		TypeDeclaration.allInstances()->
		select(each | each.bodyDeclarations->
		exists(bd | 
		bd.oclIsTypeOf(MethodDeclaration)
		and (not bd.modifier.oclIsUndefined()) 
		and bd.modifier._static 
		and (not bd.oclAsType(MethodDeclaration).returnType.oclIsUndefined()) 
		and bd.oclAsType(MethodDeclaration).returnType.type = each)
		)
		*/
		long time = System.currentTimeMillis();
		Sequence<TypeDeclaration> result6 = TypeDeclaration.allInstances.
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		&& bd.getModifier().isStatic()
		&& (!(((MethodDeclaration)bd).getReturnType()==null))
		&& (!(((MethodDeclaration)bd).getReturnType().getType()==null))
		&& ((MethodDeclaration)bd).getReturnType().getType().equals(each)
		)).asSequence();
		time = System.currentTimeMillis()-time;
		System.out.println("crossecore: grabats09: "+time);
		System.out.println("crossecore: grabats09 size: "+result6.size());

	}
	@Test
	public void invisibleMethods() {
		
		
//		Set<ClassDeclaration> result1 = ClassDeclaration.allInstances;
//		System.out.println(result1.size());
//
//		
//		Set<BodyDeclaration> result2 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd -> cd.getBodyDeclarations());
//		System.out.println(result2.size());
//		
//		Set<BodyDeclaration> result3 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd -> cd.getBodyDeclarations()).select(each -> each instanceof MethodDeclaration);
//		System.out.println(result3.size());
//		
//		
//		Set<BodyDeclaration> result4 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd -> cd.getBodyDeclarations()).select(each -> each.getClass().equals(MethodDeclaration.class)).select(each -> 
//		! (each.getModifier()==null));
//		System.out.println(result4.size());
//		
//		Set<BodyDeclaration> result5 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd -> cd.getBodyDeclarations()).select(each -> each.getClass().equals(MethodDeclaration.class)).select(each -> 
//		! (each.getModifier()==null) 
//		&& !(each.getModifier().getVisibility() == null));
//		System.out.println(result5.size());
//		
//		Set<BodyDeclaration> result6 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd -> cd.getBodyDeclarations()).select(each -> each.getClass().equals(MethodDeclaration.class)).select(each -> 
//		! (each.getModifier()==null) 
//		&& !(each.getModifier().getVisibility() == null) 
//		&& (each.getModifier().getVisibility().equals(VisibilityKind.PRIVATE) || each.getModifier().getVisibility().equals(VisibilityKind.PROTECTED)));
//		System.out.println(result6.size());
		
		long time = System.currentTimeMillis();
		Sequence<BodyDeclaration> result7 = ClassDeclaration.allInstances
		.collect2(BodyDeclaration.class, cd -> cd.getBodyDeclarations())
		.select(each -> each.getClass().equals(MethodDeclarationImpl.class))
		.select(each -> 
			! (each.getModifier()==null) 
			&& !(each.getModifier().getVisibility() == null) 
			&& (each.getModifier().getVisibility().equals(VisibilityKind.PRIVATE) || each.getModifier().getVisibility().equals(VisibilityKind.PROTECTED)))
		.asSequence() 
		;
		time = System.currentTimeMillis()-time;
		
		System.out.println("crossecore: invisibleMethods: "+time);
		System.out.println("crossecore: invisibleMethods size: "+result7.size());
	}
	
	@Test
	public void textElementInJavadoc() {
		
//		Set<CompilationUnit> result1 = model.getCompilationUnits();
//		
//		Set<Comment> result2 = model.getCompilationUnits().collect2(Comment.class, cu->cu.getCommentList());
//		
//		Set<Comment> result3 = model.getCompilationUnits().collect2(Comment.class, cu->cu.getCommentList()).select(each->each instanceof Javadoc);
//		
//		Set<ASTNode> result4 = model.getCompilationUnits().collect2(Comment.class, cu->cu.getCommentList()).select(each->each instanceof Javadoc).collect2(ASTNode.class, o->((Javadoc)o).getTags().collect2(ASTNode.class, t->t.getFragments()));
//		
//		Set<ASTNode> result5 = model.getCompilationUnits().collect2(Comment.class, cu->cu.getCommentList()).select(each->each instanceof Javadoc).collect2(ASTNode.class, o->((Javadoc)o).getTags().collect2(ASTNode.class, t->t.getFragments())).select(each -> each instanceof TextElement);
		
		long time = System.currentTimeMillis();
		Sequence<ASTNode> result = model
		.getCompilationUnits()
		.collect2(Comment.class, cu->cu.getCommentList())
		.select(each->each instanceof Javadoc)
		.collect2(ASTNode.class, o->((Javadoc)o).getTags().collect2(ASTNode.class, t->t.getFragments()))
		.select(each -> each instanceof TextElement)
		.asSequence();
		
		time = System.currentTimeMillis()-time;
		System.out.println("crossecore: TextElementInJavadoc: "+time);
		System.out.println("crossecore: TextElementInJavadoc size: "+result.size());
		
	}
	
	@Test
	public void thrownExceptions() {
		
//		Set<ClassDeclaration> result1 = ClassDeclaration.allInstances;
//		System.out.println(result1.size());
//		Set<BodyDeclaration> result2 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations());
//		System.out.println(result2.size());
//		Set<BodyDeclaration> result3 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations()).select(each->each instanceof MethodDeclaration);
//		System.out.println(result3.size());
//		Set<TypeAccess> result4 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations()).select(each->each instanceof MethodDeclaration).collect2(TypeAccess.class, each->((MethodDeclaration)each).getThrownExceptions());
//		System.out.println(result4.size());
		
		long time = System.currentTimeMillis();
		Sequence<TypeAccess> result5 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations()).select(each->each instanceof MethodDeclaration).collect2(TypeAccess.class, each->((MethodDeclaration)each).getThrownExceptions()).asSequence();
		time = System.currentTimeMillis()-time;
		System.out.println("crossecore: thrownExceptions: "+time);
		System.out.println("crossecore: thrownExceptions size: "+result5.size());
		
		/*
		System.out.println(ClassDeclaration.allInstances
		.collect2(cd->cd.getBodyDeclarations())
		.select(each->each instanceof MethodDeclaration)
		.collect(each->((MethodDeclaration)each).getThrownExceptions())
		.asSequence().size());
		
		*/
	}
	
	

}
