package java_;
public interface PackageAccess 
 extends NamespaceAccess
{
	
	public static Ocllib.QuickSet<PackageAccess> allInstances = new Ocllib.QuickSet<PackageAccess>(PackageAccess.class);
	
	/*
	public static Ocllib.QuickSet<PackageAccess> allInstances_ = new Ocllib.QuickSet<PackageAccess>(PackageAccess.class);
	
	public static Ocllib.QuickSet<PackageAccess> allInstancesClosure = new Ocllib.QuickSet<PackageAccess>(PackageAccess.class);
		
	public static Ocllib.QuickSet<PackageAccess> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamespaceAccess.allInstances_);
			allInstancesClosure.addAll(PackageAccess.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	Package getPackage();
	void setPackage(Package value);
	
	PackageAccess getQualifier();
	void setQualifier(PackageAccess value);
	
}
