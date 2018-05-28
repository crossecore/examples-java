package java_;
public interface Package 
 extends NamedElement
{
	
	public static Ocllib.Set<Package> allInstances = new Ocllib.Set<Package>(Package.class);
	
	Ocllib.Set<AbstractTypeDeclaration> getOwnedElements();
	
	Model getModel();
	void setModel(Model value);
	Ocllib.Set<Package> getOwnedPackages();
	
	Package getPackage();
	void setPackage(Package value);
	Ocllib.Set<PackageAccess> getUsagesInPackageAccess();
	
}
