package java_;
public interface TextElement 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<TextElement> allInstances = new Ocllib.QuickSet<TextElement>(TextElement.class);
	
	/*
	public static Ocllib.QuickSet<TextElement> allInstances_ = new Ocllib.QuickSet<TextElement>(TextElement.class);
	
	public static Ocllib.QuickSet<TextElement> allInstancesClosure = new Ocllib.QuickSet<TextElement>(TextElement.class);
		
	public static Ocllib.QuickSet<TextElement> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(TextElement.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	java.lang.String getText();
	void setText(java.lang.String value);
	
}
