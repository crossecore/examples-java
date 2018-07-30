package java_;
public interface Archive 
 extends NamedElement
{
	
	public static Ocllib.QuickSet<Archive> allInstances = new Ocllib.QuickSet<Archive>(Archive.class);
	
	/*
	public static Ocllib.QuickSet<Archive> allInstances_ = new Ocllib.QuickSet<Archive>(Archive.class);
	
	public static Ocllib.QuickSet<Archive> allInstancesClosure = new Ocllib.QuickSet<Archive>(Archive.class);
		
	public static Ocllib.QuickSet<Archive> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(NamedElement.allInstances_);
			allInstancesClosure.addAll(Archive.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getOriginalFilePath();
	void setOriginalFilePath(java.lang.String value);
	Ocllib.Set<ClassFile> getClassFiles();
	
	Manifest getManifest();
	void setManifest(Manifest value);
	
}
