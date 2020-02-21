package java_;
public interface ManifestAttribute 
extends org.eclipse.emf.ecore.EObject
{
	
	public static com.crossecore.ocl.QuickSet<ManifestAttribute> allInstances_ = new com.crossecore.ocl.QuickSet<ManifestAttribute>(ManifestAttribute.class);
	
		
	public static com.crossecore.ocl.QuickSet<ManifestAttribute> allInstances(){
		
		com.crossecore.ocl.QuickSet<ManifestAttribute> result = new com.crossecore.ocl.QuickSet<ManifestAttribute>(ManifestAttribute.class);
		result.addAll(ManifestAttribute.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<ManifestAttribute> allInstances = new com.crossecore.ocl.QuickSet<ManifestAttribute>(ManifestAttribute.class);
	
	java.lang.String getKey();
	void setKey(java.lang.String value);
	java.lang.String getValue();
	void setValue(java.lang.String value);
	
}
