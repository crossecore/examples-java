package java_;
public interface MemberRef 
 extends ASTNode
{
	
	public static com.crossecore.ocl.QuickSet<MemberRef> allInstances_ = new com.crossecore.ocl.QuickSet<MemberRef>(MemberRef.class);
	
		
	public static com.crossecore.ocl.QuickSet<MemberRef> allInstances(){
		
		com.crossecore.ocl.QuickSet<MemberRef> result = new com.crossecore.ocl.QuickSet<MemberRef>(MemberRef.class);
		result.addAll(MemberRef.allInstances_);
		
		
		return result;
	}
	
	//public static com.crossecore.ocl.QuickSet<MemberRef> allInstances = new com.crossecore.ocl.QuickSet<MemberRef>(MemberRef.class);
	
	
	NamedElement getMember();
	void setMember(NamedElement value);
	
	TypeAccess getQualifier();
	void setQualifier(TypeAccess value);
	
}
