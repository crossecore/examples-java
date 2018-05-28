package java_;
public interface Manifest 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.Set<Manifest> allInstances = new Ocllib.Set<Manifest>(Manifest.class);
	
	Ocllib.Set<ManifestAttribute> getMainAttributes();
	Ocllib.Set<ManifestEntry> getEntryAttributes();
	
}
