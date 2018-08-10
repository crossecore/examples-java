package java_;
public interface LineComment 
 extends Comment
{
	
	public static Ocllib.QuickSet<LineComment> allInstances_ = new Ocllib.QuickSet<LineComment>(LineComment.class);
	
		
	public static Ocllib.QuickSet<LineComment> allInstances(){
		
		Ocllib.QuickSet<LineComment> result = new Ocllib.QuickSet<LineComment>(LineComment.class);
		result.addAll(LineComment.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<LineComment> allInstances = new Ocllib.QuickSet<LineComment>(LineComment.class);
	
	
}
