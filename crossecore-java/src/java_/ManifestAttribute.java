package java_;
public interface ManifestAttribute 
extends org.eclipse.emf.ecore.EObject
{
	
	public static Ocllib.QuickSet<ManifestAttribute> allInstances_ = new Ocllib.QuickSet<ManifestAttribute>(ManifestAttribute.class);
	
		
	public static Ocllib.QuickSet<ManifestAttribute> allInstances(){
		
		Ocllib.QuickSet<ManifestAttribute> result = new Ocllib.QuickSet<ManifestAttribute>(ManifestAttribute.class);
		result.addAll(ManifestAttribute.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<ManifestAttribute> allInstances = new Ocllib.QuickSet<ManifestAttribute>(ManifestAttribute.class);
	
	java.lang.String getKey();
	void setKey(java.lang.String value);
	java.lang.String getValue();
	void setValue(java.lang.String value);
	
}
