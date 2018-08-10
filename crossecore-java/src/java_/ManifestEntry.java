package java_;
public interface ManifestEntry 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.QuickSet<ManifestEntry> allInstances_ = new Ocllib.QuickSet<ManifestEntry>(ManifestEntry.class);
	
		
	public static Ocllib.QuickSet<ManifestEntry> allInstances(){
		
		Ocllib.QuickSet<ManifestEntry> result = new Ocllib.QuickSet<ManifestEntry>(ManifestEntry.class);
		result.addAll(ManifestEntry.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ManifestEntry> allInstances = new Ocllib.QuickSet<ManifestEntry>(ManifestEntry.class);
	
	java.lang.String getName();
	void setName(java.lang.String value);
	Ocllib.Set<ManifestAttribute> getAttributes();
	
}
