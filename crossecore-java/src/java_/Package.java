package java_;
public interface Package 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<Package> allInstances = new Ocllib.QuickSet<Package>(Package.class);
	
	/*
	public static Ocllib.QuickSet<Package> allInstances_ = new Ocllib.QuickSet<Package>(Package.class);
	
	public static Ocllib.QuickSet<Package> allInstancesClosure = new Ocllib.QuickSet<Package>(Package.class);
		
	public static Ocllib.QuickSet<Package> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Package.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.Set<AbstractTypeDeclaration> getOwnedElements();
	
	Model getModel();
	void setModel(Model value);
	Ocllib.Set<Package> getOwnedPackages();
	
	Package getPackage();
	void setPackage(Package value);
	Ocllib.Set<PackageAccess> getUsagesInPackageAccess();
	
}
