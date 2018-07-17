/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import viatra.Grabats09Matcher;
import viatra.InvisibleMethodsMatcher;
import viatra.TextElementInJavadocMatcher;
import viatra.ThrownExceptionsMatcher;
import viatra.util.Grabats09QuerySpecification;
import viatra.util.InvisibleMethodsQuerySpecification;
import viatra.util.TextElementInJavadocQuerySpecification;
import viatra.util.ThrownExceptionsQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in queries.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file queries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package viatra, the group contains the definition of the following patterns: <ul>
 * <li>invisibleMethods</li>
 * <li>thrownExceptions</li>
 * <li>grabats09</li>
 * <li>textElementInJavadoc</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() throws ViatraQueryException {
    querySpecifications.add(InvisibleMethodsQuerySpecification.instance());
    querySpecifications.add(ThrownExceptionsQuerySpecification.instance());
    querySpecifications.add(Grabats09QuerySpecification.instance());
    querySpecifications.add(TextElementInJavadocQuerySpecification.instance());
  }
  
  public InvisibleMethodsQuerySpecification getInvisibleMethods() throws ViatraQueryException {
    return InvisibleMethodsQuerySpecification.instance();
  }
  
  public InvisibleMethodsMatcher getInvisibleMethods(final ViatraQueryEngine engine) throws ViatraQueryException {
    return InvisibleMethodsMatcher.on(engine);
  }
  
  public ThrownExceptionsQuerySpecification getThrownExceptions() throws ViatraQueryException {
    return ThrownExceptionsQuerySpecification.instance();
  }
  
  public ThrownExceptionsMatcher getThrownExceptions(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ThrownExceptionsMatcher.on(engine);
  }
  
  public Grabats09QuerySpecification getGrabats09() throws ViatraQueryException {
    return Grabats09QuerySpecification.instance();
  }
  
  public Grabats09Matcher getGrabats09(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Grabats09Matcher.on(engine);
  }
  
  public TextElementInJavadocQuerySpecification getTextElementInJavadoc() throws ViatraQueryException {
    return TextElementInJavadocQuerySpecification.instance();
  }
  
  public TextElementInJavadocMatcher getTextElementInJavadoc(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TextElementInJavadocMatcher.on(engine);
  }
}
