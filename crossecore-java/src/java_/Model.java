package java_;
public interface Model 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.Set<Model> allInstances = new Ocllib.Set<Model>(Model.class);
	
	java.lang.String getName();
	void setName(java.lang.String value);
	Ocllib.Set<Package> getOwnedElements();
	Ocllib.Set<Type> getOrphanTypes();
	Ocllib.Set<UnresolvedItem> getUnresolvedItems();
	Ocllib.Set<CompilationUnit> getCompilationUnits();
	Ocllib.Set<ClassFile> getClassFiles();
	Ocllib.Set<Archive> getArchives();
	
}
