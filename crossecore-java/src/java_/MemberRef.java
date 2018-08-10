package java_;
public interface MemberRef 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<MemberRef> allInstances_ = new Ocllib.QuickSet<MemberRef>(MemberRef.class);
	
		
	public static Ocllib.QuickSet<MemberRef> allInstances(){
		
		Ocllib.QuickSet<MemberRef> result = new Ocllib.QuickSet<MemberRef>(MemberRef.class);
		result.addAll(MemberRef.allInstances_);
		
		
		return result;
	}
	
	//public static Ocllib.QuickSet<MemberRef> allInstances = new Ocllib.QuickSet<MemberRef>(MemberRef.class);
	
	
	NamedElement getMember();
	void setMember(NamedElement value);
	
	TypeAccess getQualifier();
	void setQualifier(TypeAccess value);
	
}
