package java_;
public interface TextElement 
 extends ASTNode
{
	
	public static Ocllib.Set<TextElement> allInstances = new Ocllib.Set<TextElement>(TextElement.class);
	
	java.lang.String getText();
	void setText(java.lang.String value);
	
}
