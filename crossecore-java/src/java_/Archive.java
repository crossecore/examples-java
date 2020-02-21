package java_;
public interface Archive 
 extends NamedElement
{
	
	public static com.crossecore.ocl.QuickSet<Archive> allInstances_ = new com.crossecore.ocl.QuickSet<Archive>(Archive.class);
	
		
	public static com.crossecore.ocl.QuickSet<Archive> allInstances(){
		
		com.crossecore.ocl.QuickSet<Archive> result = new com.crossecore.ocl.QuickSet<Archive>(Archive.class);
		result.addAll(Archive.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<Archive> allInstances = new com.crossecore.ocl.QuickSet<Archive>(Archive.class);
	
	java.lang.String getOriginalFilePath();
	void setOriginalFilePath(java.lang.String value);
	com.crossecore.ocl.Set<ClassFile> getClassFiles();
	
	Manifest getManifest();
	void setManifest(Manifest value);
	
}
