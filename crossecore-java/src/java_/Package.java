package java_;
public interface Package 
 extends NamedElement
{
	
	public static com.crossecore.ocl.QuickSet<Package> allInstances_ = new com.crossecore.ocl.QuickSet<Package>(Package.class);
	
		
	public static com.crossecore.ocl.QuickSet<Package> allInstances(){
		
		com.crossecore.ocl.QuickSet<Package> result = new com.crossecore.ocl.QuickSet<Package>(Package.class);
		result.addAll(Package.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<Package> allInstances = new com.crossecore.ocl.QuickSet<Package>(Package.class);
	
	com.crossecore.ocl.Set<AbstractTypeDeclaration> getOwnedElements();
	
	Model getModel();
	void setModel(Model value);
	com.crossecore.ocl.Set<Package> getOwnedPackages();
	
	Package getPackage();
	void setPackage(Package value);
	com.crossecore.ocl.Set<PackageAccess> getUsagesInPackageAccess();
	
}
