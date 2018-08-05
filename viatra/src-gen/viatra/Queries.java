/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import viatra.EmptyTextElementInJavadoc;
import viatra.Grabats09;
import viatra.InvisibleMethods;
import viatra.TextElementInJavadoc;
import viatra.ThrownExceptions;

/**
 * A pattern group formed of all public patterns defined in queries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file queries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package viatra, the group contains the definition of the following patterns: <ul>
 * <li>invisibleMethods</li>
 * <li>thrownExceptions</li>
 * <li>grabats09</li>
 * <li>textElementInJavadoc</li>
 * <li>emptyTextElementInJavadoc</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Queries instance() {
    if (INSTANCE == null) {
        INSTANCE = new Queries();
    }
    return INSTANCE;
  }
  
  private static Queries INSTANCE;
  
  private Queries() {
    querySpecifications.add(InvisibleMethods.instance());
    querySpecifications.add(ThrownExceptions.instance());
    querySpecifications.add(Grabats09.instance());
    querySpecifications.add(TextElementInJavadoc.instance());
    querySpecifications.add(EmptyTextElementInJavadoc.instance());
  }
  
  public InvisibleMethods getInvisibleMethods() {
    return InvisibleMethods.instance();
  }
  
  public InvisibleMethods.Matcher getInvisibleMethods(final ViatraQueryEngine engine) {
    return InvisibleMethods.Matcher.on(engine);
  }
  
  public ThrownExceptions getThrownExceptions() {
    return ThrownExceptions.instance();
  }
  
  public ThrownExceptions.Matcher getThrownExceptions(final ViatraQueryEngine engine) {
    return ThrownExceptions.Matcher.on(engine);
  }
  
  public Grabats09 getGrabats09() {
    return Grabats09.instance();
  }
  
  public Grabats09.Matcher getGrabats09(final ViatraQueryEngine engine) {
    return Grabats09.Matcher.on(engine);
  }
  
  public TextElementInJavadoc getTextElementInJavadoc() {
    return TextElementInJavadoc.instance();
  }
  
  public TextElementInJavadoc.Matcher getTextElementInJavadoc(final ViatraQueryEngine engine) {
    return TextElementInJavadoc.Matcher.on(engine);
  }
  
  public EmptyTextElementInJavadoc getEmptyTextElementInJavadoc() {
    return EmptyTextElementInJavadoc.instance();
  }
  
  public EmptyTextElementInJavadoc.Matcher getEmptyTextElementInJavadoc(final ViatraQueryEngine engine) {
    return EmptyTextElementInJavadoc.Matcher.on(engine);
  }
}
