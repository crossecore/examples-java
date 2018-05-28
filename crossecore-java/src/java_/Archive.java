package java_;
public interface Archive 
 extends NamedElement
{
	
	public static Ocllib.Set<Archive> allInstances = new Ocllib.Set<Archive>(Archive.class);
	
	java.lang.String getOriginalFilePath();
	void setOriginalFilePath(java.lang.String value);
	Ocllib.Set<ClassFile> getClassFiles();
	
	Manifest getManifest();
	void setManifest(Manifest value);
	
}
