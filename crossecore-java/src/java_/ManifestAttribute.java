package java_;
public interface ManifestAttribute 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.QuickSet<ManifestAttribute> allInstances = new Ocllib.QuickSet<ManifestAttribute>(ManifestAttribute.class);
	
	/*
	public static Ocllib.QuickSet<ManifestAttribute> allInstances_ = new Ocllib.QuickSet<ManifestAttribute>(ManifestAttribute.class);
	
	public static Ocllib.QuickSet<ManifestAttribute> allInstancesClosure = new Ocllib.QuickSet<ManifestAttribute>(ManifestAttribute.class);
		
	public static Ocllib.QuickSet<ManifestAttribute> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ManifestAttribute.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getKey();
	void setKey(java.lang.String value);
	java.lang.String getValue();
	void setValue(java.lang.String value);
	
}
