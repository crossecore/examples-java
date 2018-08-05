import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.base.api.BaseIndexOptions;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.junit.AfterClass;
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

	private static Model model;
	private static int repetitions = 100;
	
    private static long initialUsedMemory = 0;
    private static long finalUsedMemory = 0;
	
	protected static ViatraQueryEngine engine = null;
	
	@BeforeClass
	public static void setUp() throws Exception {
		
		//Thread.sleep(3000);
		
		//new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		Java_PackageImpl.init();
		
		Function<TypeAccess, Boolean> kk = x->true;
		
		kk.apply(null);
		
		
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        
        resSet.getPackageRegistry().put("java_", Java_PackageImpl.eINSTANCE);
        
        //Resource resource = resSet.getResource(URI.createURI("model/org.eclipse.gmt.modisco.java.kyanos.xmi"), true);
        Resource resource = resSet.getResource(URI.createURI("model/org.eclipse.jdt.core.xmi"), true);
        	
        BaseIndexOptions options = new BaseIndexOptions().withDanglingFreeAssumption(false);
        EMFScope scope = new EMFScope(resSet, options);
        //engine = AdvancedViatraQueryEngine.createUnmanagedEngine(scope);
        engine = ViatraQueryEngine.on(scope);
        
        model = (Model) resource.getContents().get(0);
        
        Runtime.getRuntime().gc();
    	initialUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	
		
	}
	@AfterClass
	public static void afterClass() throws Exception {
		Runtime.getRuntime().gc();
		finalUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("initialUsedMemory" +initialUsedMemory);
		System.out.println("finalUsedMemory" +finalUsedMemory);
	}

	@Test
	@Ignore
	public void grabats09Query() {
		
			
		try {
			long time = System.currentTimeMillis();
			
			Collection<viatra.Grabats09.Match> matches = Grabats09.instance().getMatcher(engine).getAllMatches();
			time = System.currentTimeMillis()-time;
			System.out.println("viatra: grabats09: "+time);
//			System.out.println("Result set size : " + matches.size());
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	@Ignore
	public void invisibleMethods() {
		
		try {
			long time = System.currentTimeMillis();
			Collection<viatra.InvisibleMethods.Match> matches = InvisibleMethods.instance().getMatcher(engine).getAllMatches();
			
			time = System.currentTimeMillis()-time;
			System.out.println("viatra: invisibleMethods: "+time);
//			System.out.println("Result set size : " + matches.size());
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	
	
	@Test
	@Ignore
	public void thrownExceptions() {
		
		try {
			long time = System.currentTimeMillis();
			Collection<viatra.ThrownExceptions.Match> matches = ThrownExceptions.instance().getMatcher(engine).getAllMatches();
			
			
			time = System.currentTimeMillis()-time;
//			System.out.println("Result set size : " + matches.size());
			System.out.println("viatra: thrownExceptions: "+time);
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void textElementInJavadoc() {
		
		try {
			long time = System.currentTimeMillis();
			Collection<viatra.TextElementInJavadoc.Match> matches = TextElementInJavadoc.instance().getMatcher(engine).getAllMatches();
//			System.out.println("Result set size : " + matches.size());
			
			time = System.currentTimeMillis()-time;
			System.out.println("viatra: textElementInJavadoc: "+time);
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	@Test
	@Ignore
	public void emptyTextElementInJavadoc() {
		
		try {
			long time = System.currentTimeMillis();
			Collection<viatra.EmptyTextElementInJavadoc.Match> matches = EmptyTextElementInJavadoc.instance().getMatcher(engine).getAllMatches();
			
			time = System.currentTimeMillis()-time;
//			System.out.println("Result set size : " + matches.size());
			System.out.println("viatra: emptyTextElementInJavadoc: "+time);
			
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


		
	}
	

}
