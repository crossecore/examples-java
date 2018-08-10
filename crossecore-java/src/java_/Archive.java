package java_;
public interface Archive 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<Archive> allInstances_ = new Ocllib.QuickSet<Archive>(Archive.class);
	
		
	public static Ocllib.QuickSet<Archive> allInstances(){
		
		Ocllib.QuickSet<Archive> result = new Ocllib.QuickSet<Archive>(Archive.class);
		result.addAll(Archive.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<Archive> allInstances = new Ocllib.QuickSet<Archive>(Archive.class);
	
	java.lang.String getOriginalFilePath();
	void setOriginalFilePath(java.lang.String value);
	Ocllib.Set<ClassFile> getClassFiles();
	
	Manifest getManifest();
	void setManifest(Manifest value);
	
}
