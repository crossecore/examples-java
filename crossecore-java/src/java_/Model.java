package java_;
public interface Model 
extends org.eclipse.emf.ecore.EObject
{
	
	public static com.crossecore.ocl.QuickSet<Model> allInstances_ = new com.crossecore.ocl.QuickSet<Model>(Model.class);
	
		
	public static com.crossecore.ocl.QuickSet<Model> allInstances(){
		
		com.crossecore.ocl.QuickSet<Model> result = new com.crossecore.ocl.QuickSet<Model>(Model.class);
		result.addAll(Model.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<Model> allInstances = new com.crossecore.ocl.QuickSet<Model>(Model.class);
	
	java.lang.String getName();
	void setName(java.lang.String value);
	com.crossecore.ocl.Set<Package> getOwnedElements();
	com.crossecore.ocl.Set<Type> getOrphanTypes();
	com.crossecore.ocl.Set<UnresolvedItem> getUnresolvedItems();
	com.crossecore.ocl.Set<CompilationUnit> getCompilationUnits();
	com.crossecore.ocl.Set<ClassFile> getClassFiles();
	com.crossecore.ocl.Set<Archive> getArchives();
	
}
