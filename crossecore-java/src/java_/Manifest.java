package java_;
public interface Manifest 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.QuickSet<Manifest> allInstances_ = new Ocllib.QuickSet<Manifest>(Manifest.class);
	
		
	public static Ocllib.QuickSet<Manifest> allInstances(){
		
		Ocllib.QuickSet<Manifest> result = new Ocllib.QuickSet<Manifest>(Manifest.class);
		result.addAll(Manifest.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<Manifest> allInstances = new Ocllib.QuickSet<Manifest>(Manifest.class);
	
	Ocllib.Set<ManifestAttribute> getMainAttributes();
	Ocllib.Set<ManifestEntry> getEntryAttributes();
	
}
