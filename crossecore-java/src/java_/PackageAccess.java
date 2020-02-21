package java_;
public interface PackageAccess 
 extends NamespaceAccess
{
	
	public static com.crossecore.ocl.QuickSet<PackageAccess> allInstances_ = new com.crossecore.ocl.QuickSet<PackageAccess>(PackageAccess.class);
	
		
	public static com.crossecore.ocl.QuickSet<PackageAccess> allInstances(){
		
		com.crossecore.ocl.QuickSet<PackageAccess> result = new com.crossecore.ocl.QuickSet<PackageAccess>(PackageAccess.class);
		result.addAll(PackageAccess.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<PackageAccess> allInstances = new com.crossecore.ocl.QuickSet<PackageAccess>(PackageAccess.class);
	
	
	Package getPackage();
	void setPackage(Package value);
	
	PackageAccess getQualifier();
	void setQualifier(PackageAccess value);
	
}
