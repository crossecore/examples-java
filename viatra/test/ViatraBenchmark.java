import static org.junit.Assert.assertTrue;

import java.lang.annotation.Repeatable;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.base.api.BaseIndexOptions;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java_.Model;
import java_.TypeAccess;
import java_.impl.Java_PackageImpl;
import viatra.EmptyTextElementInJavadoc;
import viatra.Grabats09;
import viatra.InvisibleMethods;
import viatra.TextElementInJavadoc;
import viatra.ThrownExceptions;


public class ViatraBenchmark {

	
    private long initialUsedMemory = 0;
    private long finalUsedMemory = 0;
    private long beginTime = 0;
    private long endTime = 0;
    private ResourceSet resourceSet;
    protected Resource resource = null;
	
	protected ViatraQueryEngine engine = null;
	protected BaseIndexOptions options = null;
	protected EMFScope scope = null;
	
	
	@BeforeClass
	public static void beforeClass(){
		
		
		
		ViatraBenchmark vb = new ViatraBenchmark();
		try {
			vb.setUp();
			vb.emptyTextElementInJavadoc();
			vb.tearDown();
			
			vb.setUp();
			vb.grabats09();
			vb.tearDown();
			
			vb.setUp();
			vb.invisibleMethods();
			vb.tearDown();
			
			vb.setUp();
			vb.thrownExceptions();
			vb.tearDown();
			
			vb.setUp();
			vb.textElementInJavadoc();
			vb.tearDown();
			vb = null;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Before
	public void setUp() throws Exception {
		
		Java_PackageImpl.init();
		
        // Obtain a new resource set
        resourceSet = new ResourceSetImpl();
        
        resourceSet.getPackageRegistry().put("java_", Java_PackageImpl.eINSTANCE);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        
        resource = resourceSet.getResource(URI.createURI("model/org.eclipse.gmt.modisco.java.kyanos.xmi"), true);
        
        //resource = resourceSet.getResource(URI.createURI("model/org.eclipse.jdt.core.xmi"), true);
        

        
        
        options = new BaseIndexOptions().withDanglingFreeAssumption(false);
        scope = new EMFScope(resourceSet, options);
        //engine = AdvancedViatraQueryEngine.createUnmanagedEngine(scope);
        engine = ViatraQueryEngine.on(scope);
        
	}
	
	protected void startWatch() {
		beginTime = System.currentTimeMillis();
		
	}
	
	protected void stopWatch() {
		endTime = System.currentTimeMillis();
		System.out.println(endTime - beginTime);
		
		Runtime.getRuntime().gc();
		Runtime.getRuntime().gc();
		Runtime.getRuntime().gc();
		Runtime.getRuntime().gc();
		Runtime.getRuntime().gc();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finalUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("used memory: "+(finalUsedMemory/(1024*1024)));
		
		
	}
	
	@After
    public void tearDown() throws Exception {
        
		this.resource = null;
		
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().clear();
		this.resourceSet.getPackageRegistry().clear();
		this.resourceSet = null;
		
		this.engine = null;
		
    }

	


	@Test
	public void grabats09() {
		System.out.println("grabats09");
		
		startWatch();
		Collection<viatra.Grabats09.Match> matches=null;
		try {
			
			matches = Grabats09.instance().getMatcher(engine).getAllMatches();
//			System.out.println("Result set size : " + matches.size());
			
			
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		stopWatch();
		
		
	}
	
	@Test
	public void invisibleMethods() {
		System.out.println("invisibleMethods");
		
		startWatch();
		try {
			Collection<viatra.InvisibleMethods.Match> matches = InvisibleMethods.instance().getMatcher(engine).getAllMatches();
			
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stopWatch();
		

		
	}
	
	
	@Test
	public void thrownExceptions() {
		System.out.println("thrownExceptions");
		startWatch();
		try {
			Collection<viatra.ThrownExceptions.Match> matches = ThrownExceptions.instance().getMatcher(engine).getAllMatches();
			
			
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stopWatch();
		
	}
	
	@Test
	public void textElementInJavadoc() {
		System.out.println("textElementInJavadoc");
		startWatch();
		try {
			Collection<viatra.TextElementInJavadoc.Match> matches = TextElementInJavadoc.instance().getMatcher(engine).getAllMatches();
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stopWatch();

		
	}
	
	@Test
	public void emptyTextElementInJavadoc() {
		System.out.println("emptyTextElementInJavadoc");
		startWatch();
		try {
			Collection<viatra.EmptyTextElementInJavadoc.Match> matches = EmptyTextElementInJavadoc.instance().getMatcher(engine).getAllMatches();
			
			
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stopWatch();


		
	}
	

}
