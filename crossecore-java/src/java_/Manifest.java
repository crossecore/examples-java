package java_;
public interface Manifest 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.QuickSet<Manifest> allInstances = new Ocllib.QuickSet<Manifest>(Manifest.class);
	
	/*
	public static Ocllib.QuickSet<Manifest> allInstances_ = new Ocllib.QuickSet<Manifest>(Manifest.class);
	
	public static Ocllib.QuickSet<Manifest> allInstancesClosure = new Ocllib.QuickSet<Manifest>(Manifest.class);
		
	public static Ocllib.QuickSet<Manifest> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(Manifest.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	Ocllib.Set<ManifestAttribute> getMainAttributes();
	Ocllib.Set<ManifestEntry> getEntryAttributes();
	
}
