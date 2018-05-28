
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import java_.Model;
import java_.impl.Java_PackageImpl;



public class InvisibleMethodsQuery {

	@Before
	public void setUp() throws Exception {
		
		Java_PackageImpl.init();
		
		
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        
        resSet.getPackageRegistry().put("java", Java_PackageImpl.eINSTANCE);
        
        
        Resource resource = resSet.getResource(URI.createURI("model/org.eclipse.gmt.modisco.java.kyanos.xmi"), true);
        	
        Model model = (Model) resource.getContents().get(0);
	
        System.out.println(model);
        
		
	}
	
	@Test
	public void test(){
	}

	

}
