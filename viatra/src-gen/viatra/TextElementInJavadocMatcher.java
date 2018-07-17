/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java_.TextElement;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import viatra.TextElementInJavadocMatch;
import viatra.util.TextElementInJavadocQuerySpecification;

/**
 * Generated pattern matcher API of the viatra.textElementInJavadoc pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TextElementInJavadocMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern textElementInJavadoc(Ff) {
 * 	Model(Mm);
 * 	Model.compilationUnits.commentList(Mm,Cl);
 * 	Javadoc(Cl);
 * 	Javadoc.tags.fragments(Cl,Ff);
 * 	TextElement(Ff);
 * }
 * </pre></code>
 * 
 * @see TextElementInJavadocMatch
 * @see TextElementInJavadocProcessor
 * @see TextElementInJavadocQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TextElementInJavadocMatcher extends BaseMatcher<TextElementInJavadocMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TextElementInJavadocMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    TextElementInJavadocMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (TextElementInJavadocMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static TextElementInJavadocMatcher create() throws ViatraQueryException {
    return new TextElementInJavadocMatcher();
  }
  
  private final static int POSITION_FF = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TextElementInJavadocMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private TextElementInJavadocMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
   * @return matches represented as a TextElementInJavadocMatch object.
   * 
   */
  public Collection<TextElementInJavadocMatch> getAllMatches(final TextElement pFf) {
    return rawGetAllMatches(new Object[]{pFf});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
   * @return a match represented as a TextElementInJavadocMatch object, or null if no match is found.
   * 
   */
  public TextElementInJavadocMatch getOneArbitraryMatch(final TextElement pFf) {
    return rawGetOneArbitraryMatch(new Object[]{pFf});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TextElement pFf) {
    return rawHasMatch(new Object[]{pFf});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TextElement pFf) {
    return rawCountMatches(new Object[]{pFf});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TextElement pFf, final IMatchProcessor<? super TextElementInJavadocMatch> processor) {
    rawForEachMatch(new Object[]{pFf}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TextElement pFf, final IMatchProcessor<? super TextElementInJavadocMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pFf}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TextElementInJavadocMatch newMatch(final TextElement pFf) {
    return TextElementInJavadocMatch.newMatch(pFf);
  }
  
  /**
   * Retrieve the set of values that occur in matches for Ff.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<TextElement> rawAccumulateAllValuesOfFf(final Object[] parameters) {
    Set<TextElement> results = new HashSet<TextElement>();
    rawAccumulateAllValues(POSITION_FF, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Ff.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<TextElement> getAllValuesOfFf() {
    return rawAccumulateAllValuesOfFf(emptyArray());
  }
  
  @Override
  protected TextElementInJavadocMatch tupleToMatch(final Tuple t) {
    try {
        return TextElementInJavadocMatch.newMatch((TextElement) t.get(POSITION_FF));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected TextElementInJavadocMatch arrayToMatch(final Object[] match) {
    try {
        return TextElementInJavadocMatch.newMatch((TextElement) match[POSITION_FF]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected TextElementInJavadocMatch arrayToMatchMutable(final Object[] match) {
    try {
        return TextElementInJavadocMatch.newMutableMatch((TextElement) match[POSITION_FF]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<TextElementInJavadocMatcher> querySpecification() throws ViatraQueryException {
    return TextElementInJavadocQuerySpecification.instance();
  }
}
