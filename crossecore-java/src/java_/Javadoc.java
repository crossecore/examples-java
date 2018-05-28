package java_;
public interface Javadoc 
 extends Comment
{
	
	public static Ocllib.Set<Javadoc> allInstances = new Ocllib.Set<Javadoc>(Javadoc.class);
	
	Ocllib.OrderedSet<TagElement> getTags();
	
}
