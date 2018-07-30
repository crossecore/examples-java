package java_;
public interface ManifestEntry 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.QuickSet<ManifestEntry> allInstances = new Ocllib.QuickSet<ManifestEntry>(ManifestEntry.class);
	
	/*
	public static Ocllib.QuickSet<ManifestEntry> allInstances_ = new Ocllib.QuickSet<ManifestEntry>(ManifestEntry.class);
	
	public static Ocllib.QuickSet<ManifestEntry> allInstancesClosure = new Ocllib.QuickSet<ManifestEntry>(ManifestEntry.class);
		
	public static Ocllib.QuickSet<ManifestEntry> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ManifestEntry.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getName();
	void setName(java.lang.String value);
	Ocllib.Set<ManifestAttribute> getAttributes();
	
}
