package java_;
public interface Manifest 
extends org.eclipse.emf.ecore.EObject
{
	
	public static com.crossecore.ocl.QuickSet<Manifest> allInstances_ = new com.crossecore.ocl.QuickSet<Manifest>(Manifest.class);
	
		
	public static com.crossecore.ocl.QuickSet<Manifest> allInstances(){
		
		com.crossecore.ocl.QuickSet<Manifest> result = new com.crossecore.ocl.QuickSet<Manifest>(Manifest.class);
		result.addAll(Manifest.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<Manifest> allInstances = new com.crossecore.ocl.QuickSet<Manifest>(Manifest.class);
	
	com.crossecore.ocl.Set<ManifestAttribute> getMainAttributes();
	com.crossecore.ocl.Set<ManifestEntry> getEntryAttributes();
	
}
