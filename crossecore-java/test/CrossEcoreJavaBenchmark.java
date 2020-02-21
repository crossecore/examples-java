import static org.junit.Assert.assertTrue;

import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.crossecore.ocl.QuickSet;
import com.crossecore.ocl.Sequence;
import com.crossecore.ocl.Set;
import java_.ASTNode;
import java_.BodyDeclaration;
import java_.ClassDeclaration;
import java_.Comment;
import java_.CompilationUnit;
import java_.Java_Factory;
import java_.Java_FactoryImpl;
import java_.Java_PackageImpl;
import java_.Javadoc;
import java_.MethodDeclaration;
import java_.MethodDeclarationImpl;
import java_.Model;
import java_.TagElement;
import java_.TextElement;
import java_.TypeAccess;
import java_.TypeDeclaration;
import java_.VisibilityKind;


public class CrossEcoreJavaBenchmark {

    private long initialUsedMemory = 0;
    private long finalUsedMemory = 0;
    private long beginTime = 0;
    private long endTime = 0;
    private ResourceSet resourceSet;
    protected Resource resource = null;
	
	@BeforeClass
	public static void beforeClass(){
		
		//Function<TypeAccess, Boolean> kk = x->true;
		//kk.apply(null);
		
		CrossEcoreJavaBenchmark vb = new CrossEcoreJavaBenchmark();
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
        
        resource = resourceSet.getResource(URI.createURI("resources/org.eclipse.gmt.modisco.java.kyanos.xmi"), true);
        
        //resource = resourceSet.getResource(URI.createURI("resources/org.eclipse.jdt.core.xmi"), true);
	
	}
    
	@After
    public void tearDown() throws Exception {
        
		this.resource = null;
		
		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().clear();
		this.resourceSet.getPackageRegistry().clear();
		this.resourceSet = null;
		
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
		
	@Test
	public void grabats09() {
		System.out.println("grabats09");
		
		startWatch();
		
		Sequence<TypeDeclaration> result = TypeDeclaration.allInstances().
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		&& bd.getModifier().isStatic()
		&& (!(((MethodDeclaration)bd).getReturnType()==null))
		&& ((MethodDeclaration)bd).getReturnType().getType().equals(each)
		)).asSequence();
		
		stopWatch();
		System.out.println("items: "+result.size());
				
	}
	

	public void grabats09Query2() {
		
		/*
		TypeDeclaration.allInstances()->size()
		339 OK
		 */
		QuickSet<TypeDeclaration> result1 = TypeDeclaration.allInstances();
		System.out.println(result1.size());
		
		/*
		TypeDeclaration.allInstances()->
		select(each | each.bodyDeclarations->
		exists(bd | 
		bd.oclIsTypeOf(MethodDeclaration)
		))->size()
		241 OK
		 */
		
		Set<TypeDeclaration> result2 = TypeDeclaration.allInstances().
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		));
		System.out.println(result2.size());
		
		
		/*
		TypeDeclaration.allInstances()->
		select(each | each.bodyDeclarations->
		exists(bd | 
		bd.oclIsTypeOf(MethodDeclaration)
		and (not bd.modifier.oclIsUndefined()) 
		))->size()
		132 OK
		*/
		
		Set<TypeDeclaration> result3 = TypeDeclaration.allInstances().
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		));
		System.out.println(result3.size());
		
		
		/*
		TypeDeclaration.allInstances()->
		select(each | each.bodyDeclarations->
		exists(bd | 
		bd.oclIsTypeOf(MethodDeclaration)
		and (not bd.modifier.oclIsUndefined()) 
		and bd.modifier._static 
		))->size()
		2 OK
		*/
		
		Set<TypeDeclaration> result4 = TypeDeclaration.allInstances().
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		&& bd.getModifier().isStatic()
		));
		System.out.println(result4.size());
		
		/*
		TypeDeclaration.allInstances()->
		select(each | each.bodyDeclarations->
		exists(bd | 
		bd.oclIsTypeOf(MethodDeclaration)
		and (not bd.modifier.oclIsUndefined()) 
		and bd.modifier._static 
		and (not bd.oclAsType(MethodDeclaration).returnType.oclIsUndefined()) 
		))->size()
		2 OK
		*/
		
		Set<TypeDeclaration> result5 = TypeDeclaration.allInstances().
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		&& bd.getModifier().isStatic()
		&& (!(((MethodDeclaration)bd).getReturnType()==null))
		));
		System.out.println(result5.size());
		
		
		Set<TypeDeclaration> result5x = TypeDeclaration.allInstances().
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		&& bd.getModifier().isStatic()
		&& (!(((MethodDeclaration)bd).getReturnType()==null))
		&& (!(((MethodDeclaration)bd).getReturnType().getType().equals(each)))
		));
		System.out.println(result5x.size());
		
		/*
		TypeDeclaration.allInstances()->
		select(each | each.bodyDeclarations->
		exists(bd | 
		bd.oclIsTypeOf(MethodDeclaration)
		and (not bd.modifier.oclIsUndefined()) 
		and bd.modifier._static 
		and (not bd.oclAsType(MethodDeclaration).returnType.oclIsUndefined()) 
		and bd.oclAsType(MethodDeclaration).returnType.type = each)
		)
		*/
		long time = System.currentTimeMillis();
		Sequence<TypeDeclaration> result6 = TypeDeclaration.allInstances().
		select(each -> each.getBodyDeclarations().
		exists(bd -> 
		bd instanceof MethodDeclaration
		&& (!(bd.getModifier()==null))
		&& bd.getModifier().isStatic()
		&& (!(((MethodDeclaration)bd).getReturnType()==null))
		&& (!(((MethodDeclaration)bd).getReturnType().getType()==null))
		&& ((MethodDeclaration)bd).getReturnType().getType().equals(each)
		)).asSequence();
		time = System.currentTimeMillis()-time;
		System.out.println("crossecore: grabats09: "+time);
		System.out.println("crossecore: grabats09 size: "+result6.size());

	}
	
	@Test
	public void invisibleMethods() {
		System.out.println("invisibleMethods");
		
		
//		Set<ClassDeclaration> result1 = ClassDeclaration.allInstances;
//		System.out.println(result1.size());
//
//		
//		Set<BodyDeclaration> result2 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd -> cd.getBodyDeclarations());
//		System.out.println(result2.size());
//		
//		Set<BodyDeclaration> result3 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd -> cd.getBodyDeclarations()).select(each -> each instanceof MethodDeclaration);
//		System.out.println(result3.size());
//		
//		
//		Set<BodyDeclaration> result4 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd -> cd.getBodyDeclarations()).select(each -> each.getClass().equals(MethodDeclaration.class)).select(each -> 
//		! (each.getModifier()==null));
//		System.out.println(result4.size());
//		
//		Set<BodyDeclaration> result5 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd -> cd.getBodyDeclarations()).select(each -> each.getClass().equals(MethodDeclaration.class)).select(each -> 
//		! (each.getModifier()==null) 
//		&& !(each.getModifier().getVisibility() == null));
//		System.out.println(result5.size());
//		
//		Set<BodyDeclaration> result6 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd -> cd.getBodyDeclarations()).select(each -> each.getClass().equals(MethodDeclaration.class)).select(each -> 
//		! (each.getModifier()==null) 
//		&& !(each.getModifier().getVisibility() == null) 
//		&& (each.getModifier().getVisibility().equals(VisibilityKind.PRIVATE) || each.getModifier().getVisibility().equals(VisibilityKind.PROTECTED)));
//		System.out.println(result6.size());
		
		startWatch();
		
		Sequence<BodyDeclaration> result = ClassDeclaration.allInstances()
		.collect2(BodyDeclaration.class, cd -> cd.getBodyDeclarations())
		.select(each -> each.getClass().equals(MethodDeclarationImpl.class))
		.select(each -> 
			! (each.getModifier()==null) 
			&& !(each.getModifier().getVisibility() == null) 
			&& (each.getModifier().getVisibility().equals(VisibilityKind.PRIVATE) || each.getModifier().getVisibility().equals(VisibilityKind.PROTECTED)))
		.asSequence() 
		;
		
		stopWatch();
		System.out.println("items: "+result.size());
		
		
		
	}
	
	@Test
	public void textElementInJavadoc() {
		System.out.println("textElementInJavadoc");
		
//		long time = System.currentTimeMillis();
//		Set<CompilationUnit> result1 = model.getCompilationUnits();
//		time = System.currentTimeMillis()-time;
//		System.out.println("crossecore: TextElementInJavadoc1: "+time);
//		
//		time = System.currentTimeMillis();
//		Set<Comment> result2 = model.getCompilationUnits().collect2(Comment.class, cu->cu.getCommentList());
//		time = System.currentTimeMillis()-time;
//		System.out.println("crossecore: TextElementInJavadoc2: "+time);
//		
//		time = System.currentTimeMillis();
//		Set<Comment> result3 = model.getCompilationUnits().collect2(Comment.class, cu->cu.getCommentList()).select(each->each instanceof Javadoc);
//		time = System.currentTimeMillis()-time;
//		System.out.println("crossecore: TextElementInJavadoc3: "+time);
//
//		time = System.currentTimeMillis();
//		Set<TagElement> result35 = model.getCompilationUnits().collect2(Comment.class, cu->cu.getCommentList()).select(each->each instanceof Javadoc).collect2(ASTNode.class, o->((Javadoc)o).getTags());
//		time = System.currentTimeMillis()-time;
//		System.out.println("crossecore: TextElementInJavadoc3.5: "+time);
//		
//		time = System.currentTimeMillis();
//		Set<ASTNode> result4 = model.getCompilationUnits().collect2(Comment.class, cu->cu.getCommentList()).select(each->each instanceof Javadoc).collect2(ASTNode.class, o->((Javadoc)o).getTags().collect2(ASTNode.class, t->t.getFragments()));
//		time = System.currentTimeMillis()-time;
//		System.out.println("crossecore: TextElementInJavadoc4: "+time);
//		
//		time = System.currentTimeMillis();
//		Set<ASTNode> result5 = model.getCompilationUnits().collect2(Comment.class, cu->cu.getCommentList()).select(each->each instanceof Javadoc).collect2(ASTNode.class, o->((Javadoc)o).getTags().collect2(ASTNode.class, t->t.getFragments())).select(each -> each instanceof TextElement);
//		time = System.currentTimeMillis()-time;
//		System.out.println("crossecore: TextElementInJavadoc5: "+time);
		
		startWatch();
		Sequence<ASTNode> result = ((Model)resource.getContents().get(0))
		.getCompilationUnits()
		.collect2(Comment.class, cu->cu.getCommentList())
		.select(each->each instanceof Javadoc)
		.collect2(ASTNode.class, 
			o->((Javadoc)o).getTags()
			.collect2(ASTNode.class, t->t.getFragments()))
		.select(each -> each instanceof TextElement)
		.asSequence();
		
		stopWatch();
		System.out.println("items: "+result.size());
		
	}
	
	@Test
	public void emptyTextElementInJavadoc() {
		System.out.println("emptyTextElementInJavadoc");
		
		startWatch();
		Sequence<ASTNode> result = ((Model)resource.getContents().get(0))
		.getCompilationUnits()
		.collect2(Comment.class, cu->cu.getCommentList())
		.select(each->each instanceof Javadoc)
		.collect2(ASTNode.class, o->((Javadoc)o).getTags().collect2(ASTNode.class, t->t.getFragments()))
		.select(each -> each instanceof TextElement)
		.select(each -> ((TextElement)each).getText().length()==0)
		.asSequence();
		
		stopWatch();
		System.out.println("items: "+result.size());
		
	}	
	
	
	@Test
	public void thrownExceptions() {
		System.out.println("thrownExceptions");
		
//		Set<ClassDeclaration> result1 = ClassDeclaration.allInstances;
//		System.out.println(result1.size());
//		Set<BodyDeclaration> result2 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations());
//		System.out.println(result2.size());
//		Set<BodyDeclaration> result3 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations()).select(each->each instanceof MethodDeclaration);
//		System.out.println(result3.size());
//		Set<TypeAccess> result4 = ClassDeclaration.allInstances.collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations()).select(each->each instanceof MethodDeclaration).collect2(TypeAccess.class, each->((MethodDeclaration)each).getThrownExceptions());
//		System.out.println(result4.size());
		
		startWatch();
		Sequence<TypeAccess> result = ClassDeclaration.allInstances().collect2(BodyDeclaration.class, cd->cd.getBodyDeclarations()).select(each->each instanceof MethodDeclaration).collect2(TypeAccess.class, each->((MethodDeclaration)each).getThrownExceptions()).asSequence();
		stopWatch();
		//System.out.println("crossecore: thrownExceptions size: "+result5.size());
		
		
		
		/*
		System.out.println(ClassDeclaration.allInstances
		.collect2(cd->cd.getBodyDeclarations())
		.select(each->each instanceof MethodDeclaration)
		.collect(each->((MethodDeclaration)each).getThrownExceptions())
		.asSequence().size());
		
		*/
		System.out.println("items: "+result.size());
	}
	
	

}
