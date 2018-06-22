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

import Ocllib.Set;
import java_.ClassDeclaration;
import java_.FieldDeclaration;
import java_.Java_Factory;
import java_.Java_FactoryImpl;
import java_.Java_Package;
import java_.Java_PackageImpl;
import java_.Javadoc;
import java_.MethodDeclaration;
import java_.Model;
import java_.SuperMethodInvocation;
import java_.TextElement;
import java_.TypeDeclaration;
import java_.VisibilityKind;


public class InvisibleMethodsQuery {

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
        	
        resource.getContents().get(0);
	
		
	}

	@Test
	public void Grabats09Query() {
		
		EcorePackage x;
		
		
		Set<TypeDeclaration> allInstances = TypeDeclaration.allInstances;
		System.out.println(allInstances.size());
		/*
		TypeDeclaration.allInstances.select(
				each -> each.getBodyDeclarations().exists(
						bd -> bd.getClass().equals(MethodDeclaration.class) && 
						(!(bd.getModifier()==null)) && 
						bd.getModifier().isStatic() && 
						(! (((MethodDeclaration)bd).getReturnType()==null)) && 
						(! ((MethodDeclaration)bd).getReturnType().getType().equals(each))
					)).asSequence();
		
		*/
	}
	
	public void InvisibleMethods() {
		
		ClassDeclaration.allInstances
		.collect(cd -> cd.getBodyDeclarations())
		.flatten()/* manually added*/
		.select(each -> each.getClass().equals(MethodDeclaration.class))
		.select(each -> 
			! (each.getModifier()==null) 
			&& !(each.getModifier().getVisibility() == null) 
			&& (each.getModifier().getVisibility().equals(VisibilityKind.PRIVATE) || each.getModifier().getVisibility().equals(VisibilityKind.PROTECTED)))
		.asSequence() 
		;
		
	}
	
	public void TextElementInJavadoc() {
		
		Model self=null;
		
		self.getCompilationUnits().collect(cu->cu.getCommentList()).
		select(each->each.getClass().equals(Javadoc.class))
		.collect(o->((Javadoc)o).getTags().collect(t->t.getFragments()))
		.select(each -> each.getClass().equals(TextElement.class))
		.asSequence();
		
	}
	
	public void ThrownExceptions() {
		
		ClassDeclaration.allInstances
		.collect(cd->cd.getBodyDeclarations())
		.select(each->each.getClass().equals(MethodDeclaration.class))
		.collect(each->((MethodDeclaration)each).getThrownExceptions())
		.asSequence();
		
	}
	
	

}
