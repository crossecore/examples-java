

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.expressions.OCLExpression;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import fr.inria.atlanmod.mogwai.common.logging.MogwaiLogger;
import fr.inria.atlanmod.mogwai.neoemf.query.NeoEMFQueryResult;
import fr.inria.atlanmod.mogwai.neoemf.resource.MogwaiResource;
import fr.inria.atlanmod.mogwai.neoemf.resource.MogwaiResourceFactory;
import fr.inria.atlanmod.mogwai.neoemf.util.MogwaiURI;
import fr.inria.atlanmod.mogwai.query.MogwaiQuery;
import fr.inria.atlanmod.mogwai.query.builder.OCLQueryBuilder;
import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackendFactory;
import java_.Java_Package;

public class RunMogwaiQueryTest2 {

	private static MogwaiResource resource;
	private static int repetitions = 100;
	
	
    private long initialUsedMemory = 0;
    private long finalUsedMemory = 0;
	
	@BeforeClass
	public static void setUp() throws IOException {
		

		Java_Package.eINSTANCE.eClass();
		EPackage.Registry.INSTANCE.put(Java_Package.eNS_URI, Java_Package.eINSTANCE);
		PersistenceBackendFactoryRegistry.register(MogwaiURI.MOGWAI_SCHEME,
				BlueprintsPersistenceBackendFactory.getInstance());
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
		.put(MogwaiURI.MOGWAI_SCHEME, MogwaiResourceFactory.getInstance());
		
		URI xmiURI = URI.createURI("resources/models/org.eclipse.jdt.core.xmi");
		//URI xmiURI = URI.createURI("resources/models/org.eclipse.gmt.modisco.java.kyanos.xmi");
		URI mogwaiURI = MogwaiURI.createMogwaiURI(new File("resources/db/set1.graphdb"));

		if(!new File("resources/db/set1.graphdb").exists()) {
			
			try {
				ModelImporter.createNeoMogwaiResourceFromXMI(xmiURI, mogwaiURI);
			} catch (IOException e) {
				MogwaiLogger.error("Cannot create the Mogwai resource ({0})", mogwaiURI);
				throw e;
			}
		}
		
		resource = (MogwaiResource) rSet.createResource(MogwaiURI.createMogwaiURI(new File(
				"resources/db/set1.graphdb")));

		resource.load(Collections.emptyMap());
		
		



		/*
		if (result.isReifiable()) {
			List<EObject> reifiedResult = result.reifyResults(resource);
			for (EObject r : reifiedResult) {
				MogwaiLogger.info("\t{0}", r.toString());
			}
		} else {
			MogwaiLogger.error("Cannot reify query results");
		}
		*/

	}
	
	@Test
	@Ignore
	public void textElementInJavadocQuery(){
		
		String expression = "Model.allInstances()->any(true).compilationUnits.commentList->"
                + "select(each | each.oclIsTypeOf(Javadoc))->"
                + "collect(o | o.oclAsType(Javadoc).tags).fragments->"
                + "select(each | each.oclIsTypeOf(TextElement))->"
                + "asSequence()";
		
//		expression = "self.compilationUnits.commentList->"
//                + "select(each | each.oclIsTypeOf(Javadoc))->"
//                + "collect(o | o.oclAsType(Javadoc).tags).fragments->"
//                + "select(each | each.oclIsTypeOf(TextElement))->"
//                + "asSequence()";		
		
		
		long time = System.currentTimeMillis();
		MogwaiQuery query = OCLQueryBuilder.newBuilder().fromString(expression)
				.context(Java_Package.eINSTANCE.getModel()).build();
		NeoEMFQueryResult result = resource.query(query);
		time = System.currentTimeMillis()-time;
		System.out.println("mogwai: textElementInJavadocQuery: "+time);
		System.out.println("mogwai: textElementInJavadocQuery size: "+result.getResults().size());

	}
	
	@Test
	@Ignore
	public void throwsExceptions(){
		
		String expression = "ClassDeclaration.allInstances()->"
                + "collect(bodyDeclarations)->"
                + "select(each | each.oclIsTypeOf(MethodDeclaration))->"
                + "collect(each | each.oclAsType(MethodDeclaration).thrownExceptions)"
                + "->asSequence()";
		
		long time = System.currentTimeMillis();
		MogwaiQuery query = OCLQueryBuilder.newBuilder().fromString(expression)
				.context(Java_Package.eINSTANCE.getModel()).build();
		NeoEMFQueryResult result = resource.query(query);
		time = System.currentTimeMillis()-time;
		System.out.println("mogwai: ThrownExceptions: "+time);
		System.out.println("mogwai: ThrownExceptions size: "+result.getResults().size());

	}
	
	@Test
	@Ignore
	public void invisibleMethods(){
		
		String expression = "ClassDeclaration.allInstances()->"
                + "collect(bodyDeclarations)->"
                + "select(each | each.oclIsTypeOf(MethodDeclaration))->"
                + "select(each | (not each.modifier.oclIsUndefined()) "
                + "and (not each.modifier.visibility.oclIsUndefined()) "
                + "and (each.modifier.visibility = VisibilityKind::private "
                + "or each.modifier.visibility = VisibilityKind::protected))->"
                + "asSequence()";
		
		long time = System.currentTimeMillis();
		MogwaiQuery query = OCLQueryBuilder.newBuilder().fromString(expression)
				.context(Java_Package.eINSTANCE.getModel()).build();
		NeoEMFQueryResult result = resource.query(query);
		time = System.currentTimeMillis()-time;
		System.out.println("mogwai: invisibleMethods: "+time);
		System.out.println("mogwai: invisibleMethods size: "+result.getResults().size());

	}
	
	@Test
	public void grabats09(){
		
    	for(int i = 0; i < 5; i++) {
    		Runtime.getRuntime().gc();
    	}
    	initialUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		
			
			String expression = "TypeDeclaration.allInstances()->"
					+ "select(each | each.bodyDeclarations->"
					+ "exists(bd | bd.oclIsTypeOf(MethodDeclaration) "
					+ "and (not bd.modifier.oclIsUndefined()) " + "and bd.modifier._static "
					+ "and (not bd.oclAsType(MethodDeclaration).returnType.oclIsUndefined()) "
					+ "and bd.oclAsType(MethodDeclaration).returnType.type = each))->"
					+ "asSequence()";
			
			long time = System.currentTimeMillis();
			MogwaiQuery query = OCLQueryBuilder.newBuilder().fromString(expression)
					.context(Java_Package.eINSTANCE.getModel()).build();
			
			//MogwaiQuery query = OCLQueryBuilder.newBuilder().fromURI(URI.createURI("resources/Grabats09.ocl")).build();
			NeoEMFQueryResult result = resource.query(query);
			time = System.currentTimeMillis()-time;
			System.out.println(time);
		
    	for(int i = 0; i < 5; i++) {
    		Runtime.getRuntime().gc();
    	}
    	finalUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    	System.out.println((finalUsedMemory - initialUsedMemory) / (1024 * 1024)+" mb");
		
		//System.out.println("mogwai: grabats09: "+time);
		//System.out.println("mogwai: grabats09 size: "+result.getResults().size());

	}	
	

}
