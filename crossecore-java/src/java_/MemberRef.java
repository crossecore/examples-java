package java_;
public interface MemberRef 
 extends ASTNode
{
	
	public static Ocllib.Set<MemberRef> allInstances = new Ocllib.Set<MemberRef>(MemberRef.class);
	
	
	NamedElement getMember();
	void setMember(NamedElement value);
	
	TypeAccess getQualifier();
	void setQualifier(TypeAccess value);
	
}
