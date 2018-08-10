package java_;
public interface TextElement 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<TextElement> allInstances_ = new Ocllib.QuickSet<TextElement>(TextElement.class);
	
		
	public static Ocllib.QuickSet<TextElement> allInstances(){
		
		Ocllib.QuickSet<TextElement> result = new Ocllib.QuickSet<TextElement>(TextElement.class);
		result.addAll(TextElement.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<TextElement> allInstances = new Ocllib.QuickSet<TextElement>(TextElement.class);
	
	java.lang.String getText();
	void setText(java.lang.String value);
	
}
