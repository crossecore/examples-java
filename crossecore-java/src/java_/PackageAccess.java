package java_;
public interface PackageAccess 
 extends NamespaceAccess
{
	
	public static Ocllib.Set<PackageAccess> allInstances = new Ocllib.Set<PackageAccess>(PackageAccess.class);
	
	
	Package getPackage();
	void setPackage(Package value);
	
	PackageAccess getQualifier();
	void setQualifier(PackageAccess value);
	
}
