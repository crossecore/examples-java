package java_;
public interface ManifestEntry 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.Set<ManifestEntry> allInstances = new Ocllib.Set<ManifestEntry>(ManifestEntry.class);
	
	java.lang.String getName();
	void setName(java.lang.String value);
	Ocllib.Set<ManifestAttribute> getAttributes();
	
}
