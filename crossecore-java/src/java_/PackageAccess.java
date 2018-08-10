package java_;
public interface PackageAccess 
 extends NamespaceAccess
{
	
	public static Ocllib.QuickSet<PackageAccess> allInstances_ = new Ocllib.QuickSet<PackageAccess>(PackageAccess.class);
	
		
	public static Ocllib.QuickSet<PackageAccess> allInstances(){
		
		Ocllib.QuickSet<PackageAccess> result = new Ocllib.QuickSet<PackageAccess>(PackageAccess.class);
		result.addAll(PackageAccess.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<PackageAccess> allInstances = new Ocllib.QuickSet<PackageAccess>(PackageAccess.class);
	
	
	Package getPackage();
	void setPackage(Package value);
	
	PackageAccess getQualifier();
	void setQualifier(PackageAccess value);
	
}
