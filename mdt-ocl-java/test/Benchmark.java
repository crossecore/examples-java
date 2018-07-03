import static org.junit.Assert.*;

import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import java_.Java_Factory;
import java_.Model;
import java_.impl.Java_PackageImpl;


public class Benchmark {

	
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

        
        Resource resource = resSet.getResource(URI.createURI("resources/org.eclipse.gmt.modisco.java.kyanos.xmi"), true);
        	
        model = (Model) resource.getContents().get(0);
	}

	@Test
	public void thrownExceptions() {
		
		long time = System.nanoTime();
		
		java_.Test test = Java_Factory.eINSTANCE.createTest();
		test.thrownExceptions2();
		
		time = System.nanoTime()-time;
		System.out.println("mdt ocl2java: ThrownExceptions: "+time);
	}

}
