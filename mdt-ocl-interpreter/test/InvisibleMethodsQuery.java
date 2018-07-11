
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.junit.Before;
import org.junit.Test;

import java_.FieldDeclaration;
import java_.Java_Factory;
import java_.Java_Package;
import java_.Model;
import java_.impl.Java_FactoryImpl;
import java_.impl.Java_PackageImpl;



public class InvisibleMethodsQuery {

	
    protected OCL ocl = null;
    protected OCLHelper oclHelper = null;
    
    protected OCLExpression<EClassifier> expression = null;
    protected Query<EClassifier, EClass, EObject> query = null;
    
    protected Resource resource = null;
	
	@Before
	public void setUp() throws Exception {
		
		Java_PackageImpl.init();
		
		
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        
        resSet.getPackageRegistry().put("java_", Java_PackageImpl.eINSTANCE);
        
        FieldDeclaration fielddeclaration = Java_Factory.eINSTANCE.createFieldDeclaration();
        EStructuralFeature fragments = fielddeclaration.eClass().getEStructuralFeature("fragments");
        Object value = fielddeclaration.eGet(fragments, true);
        
		//EClass x = Java_PackageImpl.eINSTANCE.getFieldDeclaration();
//		EStructuralFeature fragments = x.getEStructuralFeature("fragments");
//		Object value = x.eGet(fragments, true);
//		List<EStructuralFeature> features = x.getEStructuralFeatures();
//		List<EStructuralFeature> allfeatures = x.getEAllStructuralFeatures();
        
        resource = resSet.getResource(URI.createURI("model/org.eclipse.gmt.modisco.java.kyanos.xmi"), true);
        	
        Model model = (Model) resource.getContents().get(0);
	
        System.out.println(model);
        
        

        
		
	}
	
	@Test
	public void Grabats09Query(){
		long time = System.nanoTime();
		
        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
        this.oclHelper = ocl.createOCLHelper();
        
        oclHelper.setContext(Java_PackageImpl.eINSTANCE.getModel());
        try {
            expression = oclHelper.createQuery("ClassDeclaration.allInstances()->"
                    + "collect(bodyDeclarations)->"
                    + "select(each | each.oclIsTypeOf(MethodDeclaration))->"
                    + "select(each | (not each.modifier.oclIsUndefined()) "
                    + "and (not each.modifier.visibility.oclIsUndefined()) "
                    + "and (each.modifier.visibility = VisibilityKind::private "
                    + "or each.modifier.visibility = VisibilityKind::protected))->"
                    + "asSequence()");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        this.query = ocl.createQuery(expression);
        Object res = query.evaluate(resource.getContents().get(0));
        time = System.nanoTime()-time;
        System.out.println("mdt-interpreter: grabats09: "+time);


	}
	
	
	@Test
	public void ThrowsExceptions(){
		long time = System.nanoTime();
		
        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
        this.oclHelper = ocl.createOCLHelper();
        
        oclHelper.setContext(Java_PackageImpl.eINSTANCE.getModel());
        try {
            expression = oclHelper.createQuery("ClassDeclaration.allInstances()->collect(bodyDeclarations)->select(each | each.oclIsTypeOf(MethodDeclaration))->select(each | (not each.modifier.oclIsUndefined()) and (not each.modifier.visibility.oclIsUndefined()) and (each.modifier.visibility = VisibilityKind::private or each.modifier.visibility = VisibilityKind::protected))->asSequence()");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        this.query = ocl.createQuery(expression);
        Object res = query.evaluate(resource.getContents().get(0));
        time = System.nanoTime()-time;
        System.out.println("mdt-interpreter: ThrowsExceptions: "+time);


	}
		
	

	

}
