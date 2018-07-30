package java_;
public interface Model 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.QuickSet<Model> allInstances = new Ocllib.QuickSet<Model>(Model.class);
	
	/*
	public static Ocllib.QuickSet<Model> allInstances_ = new Ocllib.QuickSet<Model>(Model.class);
	
	public static Ocllib.QuickSet<Model> allInstancesClosure = new Ocllib.QuickSet<Model>(Model.class);
		
	public static Ocllib.QuickSet<Model> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(Model.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getName();
	void setName(java.lang.String value);
	Ocllib.Set<Package> getOwnedElements();
	Ocllib.Set<Type> getOrphanTypes();
	Ocllib.Set<UnresolvedItem> getUnresolvedItems();
	Ocllib.Set<CompilationUnit> getCompilationUnits();
	Ocllib.Set<ClassFile> getClassFiles();
	Ocllib.Set<Archive> getArchives();
	
}
