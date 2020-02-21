package java_;
public interface ManifestEntry 
extends org.eclipse.emf.ecore.EObject
{
	
	public static com.crossecore.ocl.QuickSet<ManifestEntry> allInstances_ = new com.crossecore.ocl.QuickSet<ManifestEntry>(ManifestEntry.class);
	
		
	public static com.crossecore.ocl.QuickSet<ManifestEntry> allInstances(){
		
		com.crossecore.ocl.QuickSet<ManifestEntry> result = new com.crossecore.ocl.QuickSet<ManifestEntry>(ManifestEntry.class);
		result.addAll(ManifestEntry.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ManifestEntry> allInstances = new com.crossecore.ocl.QuickSet<ManifestEntry>(ManifestEntry.class);
	
	java.lang.String getName();
	void setName(java.lang.String value);
	com.crossecore.ocl.Set<ManifestAttribute> getAttributes();
	
}
