
import java.util.Collection;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
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
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java_.TypeAccess;
import java_.impl.Java_PackageImpl;



public class OclInterpreterBenchmark {

    protected OCL ocl = null;
    protected OCLHelper oclHelper = null;
    
    protected OCLExpression<EClassifier> expression = null;
    protected Query<EClassifier, EClass, EObject> query = null;
    
    private long initialUsedMemory = 0;
    private long finalUsedMemory = 0;
    private long beginTime = 0;
    private long endTime = 0;
    
    
    protected ResourceSet resourceSet = null;
    protected Resource resource = null;
    
	//@BeforeClass
	public static void beforeClass(){
		
		
		OclInterpreterBenchmark vb = new OclInterpreterBenchmark();
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
	
	@Before
	public void setUp() throws Exception {
		
		Java_PackageImpl.init();
		
        resourceSet = new ResourceSetImpl();
        
        resourceSet.getPackageRegistry().put("java_", Java_PackageImpl.eINSTANCE);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        
        resource = resourceSet.getResource(URI.createURI("model/org.eclipse.gmt.modisco.java.kyanos.xmi"), true);
        
        //resource = resourceSet.getResource(URI.createURI("model/org.eclipse.jdt.core.xmi"), true);
        
        
        ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
        oclHelper = ocl.createOCLHelper();
        
        	
	}
	
	//@After
    public void tearDown() throws Exception {
        
		
		this.resource = null;
		
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().clear();
		this.resourceSet.getPackageRegistry().clear();
		this.resourceSet = null;
		
		
        this.oclHelper = null;
        this.ocl = null;
        this.expression = null;
        this.query = null;
        
        
    }
	
	@Test
	public void thrownExceptions(){
		System.out.println("thrownExceptions");
		startWatch();
		
        oclHelper.setContext(Java_PackageImpl.eINSTANCE.getModel());
        try {
            expression = oclHelper.createQuery("ClassDeclaration.allInstances()->"
                    + "collect(bodyDeclarations)->"
                    + "select(each | each.oclIsTypeOf(MethodDeclaration))->"
                    + "collect(each | each.oclAsType(MethodDeclaration).thrownExceptions)"
                    + "->asSequence()");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        query = ocl.createQuery(expression);
        Object res = query.evaluate(resource.getContents().get(0));

        stopWatch();
        System.out.println("results: "+((Collection)res).size());

	}


			
	@Test
	public void invisibleMethods(){
		System.out.println("invisibleMethods");
		startWatch();
		
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
        query = ocl.createQuery(expression);
        Object res = query.evaluate(resource.getContents().get(0));
        stopWatch();
        System.out.println("results: "+((Collection)res).size());

	}
	
	@Test
	public void textElementInJavadoc(){
		System.out.println("textElementInJavadocQuery");
		startWatch();
		
        oclHelper.setContext(Java_PackageImpl.eINSTANCE.getModel());
        try {
            expression = oclHelper.createQuery("self.compilationUnits.commentList->"
                    + "select(each | each.oclIsTypeOf(Javadoc))->"
                    + "collect(o | o.oclAsType(Javadoc).tags).fragments->"
                    + "select(each | each.oclIsTypeOf(TextElement))->"
                    + "asSequence()");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        query = ocl.createQuery(expression);
        Object res = query.evaluate(resource.getContents().get(0));
        stopWatch();
        System.out.println("results: "+((Collection)res).size());
	}
	
	@Test
	public void emptyTextElementInJavadoc (){
		System.out.println("emptyTextElementInJavadoc");
		startWatch();
		
        
        oclHelper.setContext(Java_PackageImpl.eINSTANCE.getModel());
        try {
            expression = oclHelper.createQuery("self.compilationUnits.commentList->"
            		+ "select(each | each.oclIsTypeOf(Javadoc))->"
            		+ "collect(o | o.oclAsType(Javadoc).tags).fragments->"
            		+ "select(each | each.oclIsTypeOf(TextElement))->"
            		+ "select(each | each.oclAsType(TextElement).text.size()= 0)->"
            		+ "asSequence()");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        query = ocl.createQuery(expression);
        Object res = query.evaluate(resource.getContents().get(0));
        stopWatch();
        System.out.println("results: "+((Collection)res).size());
        
	}
	
	
	@Test
	public void grabats09(){
		System.out.println("grabats09");
		startWatch();
		
        
        oclHelper.setContext(Java_PackageImpl.eINSTANCE.getModel());
        try {
            expression = oclHelper.createQuery("TypeDeclaration.allInstances()->"
                    + "select(each | each.bodyDeclarations->"
                    + "exists(bd | bd.oclIsTypeOf(MethodDeclaration) "
                    + "and (not bd.modifier.oclIsUndefined()) " + "and bd.modifier._static "
                    + "and (not bd.oclAsType(MethodDeclaration).returnType.oclIsUndefined()) "
                    + "and bd.oclAsType(MethodDeclaration).returnType.type = each))->"
                    + "asSequence()");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        query = ocl.createQuery(expression);
        Object result = query.evaluate(resource.getContents().get(0));
        stopWatch();
			
        System.out.println("results: "+((Collection)result).size());
		
	}
	
	
	public void grabats09_(){
		
		Object res;
		long time = System.currentTimeMillis();
		
	    OCLExpression<EClassifier> expression = null;
	    Query<EClassifier, EClass, EObject> query = null;
		
        oclHelper.setContext(Java_PackageImpl.eINSTANCE.getModel());
        
        
        
        try {
            expression = oclHelper.createQuery("TypeDeclaration.allInstances()");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        query = ocl.createQuery(expression);
        res = query.evaluate(resource.getContents().get(0));
        time = System.currentTimeMillis()-time;
        System.out.println("mdt-interpreter: grabats09: "+time);
        System.out.println("mdt interpreter: grabats09 results: "+((Collection)res).size());        
       
        try {
            expression = oclHelper.createQuery("TypeDeclaration.allInstances()->"
                    + "select(each | each.bodyDeclarations->"
                    + "exists(bd | bd.oclIsTypeOf(MethodDeclaration) "
                    + "))");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        query = ocl.createQuery(expression);
        res = query.evaluate(resource.getContents().get(0));
        time = System.currentTimeMillis()-time;
        System.out.println("mdt-interpreter: grabats09: "+time);
        System.out.println("mdt interpreter: grabats09 results: "+((Collection)res).size());
        
        
        try {
            expression = oclHelper.createQuery("TypeDeclaration.allInstances()->"
                    + "select(each | each.bodyDeclarations->"
                    + "exists(bd | bd.oclIsTypeOf(MethodDeclaration) "
                    + "and (not bd.modifier.oclIsUndefined())))");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        query = ocl.createQuery(expression);
        res = query.evaluate(resource.getContents().get(0));
        time = System.currentTimeMillis()-time;
        System.out.println("mdt-interpreter: grabats09: "+time);
        System.out.println("mdt interpreter: grabats09 results: "+((Collection)res).size());
        
        
        try {
            expression = oclHelper.createQuery("TypeDeclaration.allInstances()->"
                    + "select(each | each.bodyDeclarations->"
                    + "exists(bd | bd.oclIsTypeOf(MethodDeclaration) "
                    + "and (not bd.modifier.oclIsUndefined()) " + "and bd.modifier._static))");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        query = ocl.createQuery(expression);
        res = query.evaluate(resource.getContents().get(0));
        time = System.currentTimeMillis()-time;
        System.out.println("mdt-interpreter: grabats09: "+time);
        System.out.println("mdt interpreter: grabats09 results: "+((Collection)res).size());
        
        
        try {
            expression = oclHelper.createQuery("TypeDeclaration.allInstances()->"
                    + "select(each | each.bodyDeclarations->"
                    + "exists(bd | bd.oclIsTypeOf(MethodDeclaration) "
                    + "and (not bd.modifier.oclIsUndefined()) " 
                    + "and bd.modifier._static "
                    + "and (not bd.oclAsType(MethodDeclaration).returnType.oclIsUndefined()) "
                    + "))->"
                    + "asSequence()");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        query = ocl.createQuery(expression);
        res = query.evaluate(resource.getContents().get(0));
        time = System.currentTimeMillis()-time;
        System.out.println("mdt-interpreter: grabats09: "+time);
        System.out.println("mdt interpreter: grabats09 results: "+((Collection)res).size());
	    
	    
        try {
            expression = oclHelper.createQuery("TypeDeclaration.allInstances()->"
                    + "select(each | each.bodyDeclarations->"
                    + "exists(bd | bd.oclIsTypeOf(MethodDeclaration) "
                    + "and (not bd.modifier.oclIsUndefined()) " + "and bd.modifier._static "
                    + "and (not bd.oclAsType(MethodDeclaration).returnType.oclIsUndefined()) "
                    + "and (not bd.oclAsType(MethodDeclaration).returnType.type.oclIsUndefined()) "
                    + "and bd.oclAsType(MethodDeclaration).returnType.type = each))->"
                    + "asSequence()");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        query = ocl.createQuery(expression);
        res = query.evaluate(resource.getContents().get(0));
        time = System.currentTimeMillis()-time;
        System.out.println("mdt-interpreter: grabats09: "+time);
        System.out.println("mdt interpreter: grabats09 results: "+((Collection)res).size());
        
        
        try {
            expression = oclHelper.createQuery("TypeDeclaration.allInstances()->"
                    + "select(each | each.bodyDeclarations->"
                    + "exists(bd | bd.oclIsTypeOf(MethodDeclaration) "
                    + "and (not bd.modifier.oclIsUndefined()) " + "and bd.modifier._static "
                    + "and (not bd.oclAsType(MethodDeclaration).returnType.oclIsUndefined()) "
                    + "and bd.oclAsType(MethodDeclaration).returnType.type = each))->"
                    + "asSequence()");
        } catch (ParserException e) {
            e.printStackTrace();
        }
        query = ocl.createQuery(expression);
        res = query.evaluate(resource.getContents().get(0));
        time = System.currentTimeMillis()-time;
        System.out.println("mdt-interpreter: grabats09: "+time);
        System.out.println("mdt interpreter: grabats09 results: "+((Collection)res).size());
	}	

	

}
