package java_;
public interface TextElement 
 extends ASTNode
{
	
	public static com.crossecore.ocl.QuickSet<TextElement> allInstances_ = new com.crossecore.ocl.QuickSet<TextElement>(TextElement.class);
	
		
	public static com.crossecore.ocl.QuickSet<TextElement> allInstances(){
		
		com.crossecore.ocl.QuickSet<TextElement> result = new com.crossecore.ocl.QuickSet<TextElement>(TextElement.class);
		result.addAll(TextElement.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<TextElement> allInstances = new com.crossecore.ocl.QuickSet<TextElement>(TextElement.class);
	
	java.lang.String getText();
	void setText(java.lang.String value);
	
}
