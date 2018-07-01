import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import Ocllib.OrderedSet;
import Ocllib.Sequence;
import Ocllib.Set;
import java_.BodyDeclaration;
import java_.ClassDeclaration;
import java_.FieldDeclaration;
import java_.InterfaceDeclaration;
import java_.Java_Factory;
import java_.Java_FactoryImpl;
import java_.Java_Package;
import java_.Java_PackageImpl;
import java_.Javadoc;
import java_.MethodDeclaration;
import java_.Model;
import java_.SuperMethodInvocation;
import java_.TextElement;
import java_.Type;
import java_.TypeAccess;
import java_.TypeDeclaration;
import java_.VisibilityKind;


public class InvisibleMethodsQuery {

	private Model model;
	
	@Before
	public void setUp() throws Exception {
		
		Java_PackageImpl.init();
		
		
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
        
        FieldDeclaration fielddeclaration = Java_FactoryImpl.eINSTANCE.createFieldDeclaration();
        EStructuralFeature fragments = fielddeclaration.eClass().getEStructuralFeature("fragments");
        Object value = fielddeclaration.eGet(fragments, true);
        
        SuperMethodInvocation superMethodInvocation = Java_FactoryImpl.eINSTANCE.createSuperMethodInvocation();
        EStructuralFeature arguments = superMethodInvocation.eClass().getEStructuralFeature("arguments");
        Object val = superMethodInvocation.eGet(arguments, true);
        
        Resource resource = resSet.getResource(URI.createURI("resources/org.eclipse.gmt.modisco.java.kyanos.xmi"), true);
        	
        model = (Model) resource.getContents().get(0);
	
		
	}

	//@Test
	public void Grabats09Query() {
		
		/*
		TypeDeclaration.allInstances()->size()
		 */
		Set<TypeDeclaration> result1 = TypeDeclaration.allInstances;
		System.out.println(result1.size());
		
		/*
		TypeDeclaration.allInstances()->
		select(each | each.bodyDeclarations->
		exists(bd | 
		bd.oclIsTypeOf(MethodDeclaration)
		))->size()
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
		
		Set<TypeDeclaration> result6 = TypeDeclaration.allInstances.
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		&& bd.getModifier().isStatic()
		&& (!(((MethodDeclaration)bd).getReturnType()==null))
		&& (!(((MethodDeclaration)bd).getReturnType().getType()==null))
		&& ((MethodDeclaration)bd).getReturnType().getType().equals(each)
		));
		System.out.println(result6.size());
		


	}
	
	public void InvisibleMethods() {
		
		/*
		ClassDeclaration.allInstances
		.collect(cd -> cd.getBodyDeclarations())
		.flatten()/ * manually added* /
		.select(each -> each.getClass().equals(MethodDeclaration.class))
		.select(each -> 
			! (each.getModifier()==null) 
			&& !(each.getModifier().getVisibility() == null) 
			&& (each.getModifier().getVisibility().equals(VisibilityKind.PRIVATE) || each.getModifier().getVisibility().equals(VisibilityKind.PROTECTED)))
		.asSequence() 
		;
		
		*/
		
	}
	
	
	public void TextElementInJavadoc() {
		
		/*
		model.getCompilationUnits().collect(cu->cu.getCommentList()).
		select(each->each.getClass().equals(Javadoc.class))
		.collect(o->((Javadoc)o).getTags().collect(t->t.getFragments()))
		.select(each -> each.getClass().equals(TextElement.class))
		.asSequence();
		*/
		
	}
	
	@Test
	public void ThrownExceptions() {
		
		Set<ClassDeclaration> result1 = ClassDeclaration.allInstances;
		System.out.println(result1.size());
		
		Set<BodyDeclaration> result2 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations());
		System.out.println(result2.size());
		
		Set<BodyDeclaration> result3 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations()).select(each->each instanceof MethodDeclaration);
		System.out.println(result3.size());
		
		Set<TypeAccess> result4 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations()).select(each->each instanceof MethodDeclaration).collect2(TypeAccess.class, each->((MethodDeclaration)each).getThrownExceptions());
		System.out.println(result4.size());
		
		Sequence<TypeAccess> result5 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations()).select(each->each instanceof MethodDeclaration).collect2(TypeAccess.class, each->((MethodDeclaration)each).getThrownExceptions()).asSequence();
		System.out.println(result5.size());
		
		/*
		System.out.println(ClassDeclaration.allInstances
		.collect2(cd->cd.getBodyDeclarations())
		.select(each->each instanceof MethodDeclaration)
		.collect(each->((MethodDeclaration)each).getThrownExceptions())
		.asSequence().size());
		
		*/
	}
	
	

}
