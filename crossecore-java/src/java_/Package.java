package java_;
public interface Package 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<Package> allInstances_ = new Ocllib.QuickSet<Package>(Package.class);
	
		
	public static Ocllib.QuickSet<Package> allInstances(){
		
		Ocllib.QuickSet<Package> result = new Ocllib.QuickSet<Package>(Package.class);
		result.addAll(Package.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<Package> allInstances = new Ocllib.QuickSet<Package>(Package.class);
	
	Ocllib.Set<AbstractTypeDeclaration> getOwnedElements();
	
	Model getModel();
	void setModel(Model value);
	Ocllib.Set<Package> getOwnedPackages();
	
	Package getPackage();
	void setPackage(Package value);
	Ocllib.Set<PackageAccess> getUsagesInPackageAccess();
	
}
