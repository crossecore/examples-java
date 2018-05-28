import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import java_.ClassDeclaration;
import java_.Java_PackageImpl;
import java_.Javadoc;
import java_.MethodDeclaration;
import java_.Model;
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
        
        
        Resource resource = resSet.getResource(URI.createURI("resources/org.eclipse.gmt.modisco.java.kyanos.xmi"), true);
        	
        resource.getContents().get(0);
	
		
	}

	@Test
	public void Grabats09Query() {
		
		TypeDeclaration.allInstances.select(
				each -> each.getBodyDeclarations().exists(
						bd -> bd.getClass().equals(MethodDeclaration.class) && 
						(!(bd.getModifier()==null)) && 
						bd.getModifier().isStatic() && 
						(! (((MethodDeclaration)bd).getReturnType()==null)) && 
						(! ((MethodDeclaration)bd).getReturnType().getType().equals(each))
					)).asSequence();
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
