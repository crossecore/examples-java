/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra;

import java.util.Arrays;
import java.util.List;
import java_.TextElement;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import viatra.util.EmptyTextElementInJavadocQuerySpecification;

/**
 * Pattern-specific match representation of the viatra.emptyTextElementInJavadoc pattern,
 * to be used in conjunction with {@link EmptyTextElementInJavadocMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EmptyTextElementInJavadocMatcher
 * @see EmptyTextElementInJavadocProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EmptyTextElementInJavadocMatch extends BasePatternMatch {
  private TextElement fFf;
  
  private static List<String> parameterNames = makeImmutableList("Ff");
  
  private EmptyTextElementInJavadocMatch(final TextElement pFf) {
    this.fFf = pFf;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Ff".equals(parameterName)) return this.fFf;
    return null;
  }
  
  public TextElement getFf() {
    return this.fFf;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Ff".equals(parameterName) ) {
        this.fFf = (TextElement) newValue;
        return true;
    }
    return false;
  }
  
  public void setFf(final TextElement pFf) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fFf = pFf;
  }
  
  @Override
  public String patternName() {
    return "viatra.emptyTextElementInJavadoc";
  }
  
  @Override
  public List<String> parameterNames() {
    return EmptyTextElementInJavadocMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fFf};
  }
  
  @Override
  public EmptyTextElementInJavadocMatch toImmutable() {
    return isMutable() ? newMatch(fFf) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Ff\"=" + prettyPrintValue(fFf)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fFf == null) ? 0 : fFf.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
        return true;
    if (!(obj instanceof EmptyTextElementInJavadocMatch)) { // this should be infrequent
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof IPatternMatch)) {
            return false;
        }
        IPatternMatch otherSig  = (IPatternMatch) obj;
        if (!specification().equals(otherSig.specification()))
            return false;
        return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    EmptyTextElementInJavadocMatch other = (EmptyTextElementInJavadocMatch) obj;
    if (fFf == null) {if (other.fFf != null) return false;}
    else if (!fFf.equals(other.fFf)) return false;
    return true;
  }
  
  @Override
  public EmptyTextElementInJavadocQuerySpecification specification() {
    try {
        return EmptyTextElementInJavadocQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
         // This cannot happen, as the match object can only be instantiated if the query specification exists
         throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static EmptyTextElementInJavadocMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EmptyTextElementInJavadocMatch newMutableMatch(final TextElement pFf) {
    return new Mutable(pFf);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EmptyTextElementInJavadocMatch newMatch(final TextElement pFf) {
    return new Immutable(pFf);
  }
  
  private static final class Mutable extends EmptyTextElementInJavadocMatch {
    Mutable(final TextElement pFf) {
      super(pFf);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EmptyTextElementInJavadocMatch {
    Immutable(final TextElement pFf) {
      super(pFf);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
