package java_;
public interface MemberRef 
 extends ASTNode
{
	
	public static Ocllib.QuickSet<MemberRef> allInstances = new Ocllib.QuickSet<MemberRef>(MemberRef.class);
	
	/*
	public static Ocllib.QuickSet<MemberRef> allInstances_ = new Ocllib.QuickSet<MemberRef>(MemberRef.class);
	
	public static Ocllib.QuickSet<MemberRef> allInstancesClosure = new Ocllib.QuickSet<MemberRef>(MemberRef.class);
		
	public static Ocllib.QuickSet<MemberRef> allInstances(){
		
		if(allInstancesClosure.isEmpty()) {
			
			allInstancesClosure.addAll(ASTNode.allInstances_);
			allInstancesClosure.addAll(MemberRef.allInstances_);
		}
		
		return allInstancesClosure;
	}
	*/
	
	
	
	NamedElement getMember();
	void setMember(NamedElement value);
	
	TypeAccess getQualifier();
	void setQualifier(TypeAccess value);
	
}
