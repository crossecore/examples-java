import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.base.api.BaseIndexOptions;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.junit.Before;
import org.junit.Test;

import java_.Model;
import java_.TypeAccess;
import java_.impl.Java_PackageImpl;
import viatra.Grabats09Match;
import viatra.Grabats09Matcher;
import viatra.ThrownExceptionsMatch;
import viatra.ThrownExceptionsMatcher;


public class InvisibleMethodsQuery {

	private Model model;
	
	protected ViatraQueryEngine engine = null;
	
	@Before
	public void setUp() throws Exception {
		
		Java_PackageImpl.init();
		
		Function<TypeAccess, Boolean> kk = x->true;
		
		kk.apply(null);
		
		
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        
        resSet.getPackageRegistry().put("java_", Java_PackageImpl.eINSTANCE);
        
        Resource resource = resSet.getResource(URI.createURI("model/org.eclipse.gmt.modisco.java.kyanos.xmi"), true);
        	
        BaseIndexOptions options = new BaseIndexOptions().withDanglingFreeAssumption(false);
        EMFScope scope = new EMFScope(resSet, options);
        //engine = AdvancedViatraQueryEngine.createUnmanagedEngine(scope);
        engine = ViatraQueryEngine.on(scope);
        
        model = (Model) resource.getContents().get(0);
	
		
	}

	@Test
	public void Grabats09Query() {
		
		
        Grabats09Matcher matcher;
		try {
			long time = System.nanoTime();
			
			matcher = Grabats09Matcher.on(engine);
			Collection<Grabats09Match> matches = matcher.getAllMatches();
			System.out.println("Result set size : " + matches.size());
			
			time = System.nanoTime()-time;
			System.out.println("viatra: grabats09: "+time);
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		


	}
	
	public void InvisibleMethods() {
		


		
	}
	
	@Test
	public void TextElementInJavadoc() {
		
		
		long time = System.nanoTime();
		
		time = System.nanoTime()-time;
		System.out.println("viatra: TextElementInJavadoc: "+time);
		
	}
	
	@Test
	public void ThrownExceptions() {
		
		
		
		ThrownExceptionsMatcher matcher;
		try {
			long time = System.nanoTime();
			matcher = ThrownExceptionsMatcher.on(engine);
			Collection<ThrownExceptionsMatch> matches = matcher.getAllMatches();
			System.out.println("Result set size : " + matches.size());
			
			time = System.nanoTime()-time;
			System.out.println("viatra: ThrownExceptions: "+time);
		} catch (ViatraQueryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
