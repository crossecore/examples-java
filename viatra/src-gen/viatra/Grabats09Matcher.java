/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java_.TypeDeclaration;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import viatra.Grabats09Match;
import viatra.util.Grabats09QuerySpecification;

/**
 * Generated pattern matcher API of the viatra.grabats09 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link Grabats09Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern grabats09(Tt) {
 * 	TypeDeclaration(Tt);
 * 	TypeDeclaration.bodyDeclarations(Tt,Bod);
 * 	MethodDeclaration(Bod);
 * 	MethodDeclaration.modifier.^static(Bod,true);
 * 	MethodDeclaration.returnType.type(Bod,Tt);
 * }
 * </pre></code>
 * 
 * @see Grabats09Match
 * @see Grabats09Processor
 * @see Grabats09QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class Grabats09Matcher extends BaseMatcher<Grabats09Match> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static Grabats09Matcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    Grabats09Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (Grabats09Matcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static Grabats09Matcher create() throws ViatraQueryException {
    return new Grabats09Matcher();
  }
  
  private final static int POSITION_TT = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Grabats09Matcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private Grabats09Matcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
   * @return matches represented as a Grabats09Match object.
   * 
   */
  public Collection<Grabats09Match> getAllMatches(final TypeDeclaration pTt) {
    return rawGetAllMatches(new Object[]{pTt});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
   * @return a match represented as a Grabats09Match object, or null if no match is found.
   * 
   */
  public Grabats09Match getOneArbitraryMatch(final TypeDeclaration pTt) {
    return rawGetOneArbitraryMatch(new Object[]{pTt});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TypeDeclaration pTt) {
    return rawHasMatch(new Object[]{pTt});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TypeDeclaration pTt) {
    return rawCountMatches(new Object[]{pTt});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TypeDeclaration pTt, final IMatchProcessor<? super Grabats09Match> processor) {
    rawForEachMatch(new Object[]{pTt}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TypeDeclaration pTt, final IMatchProcessor<? super Grabats09Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTt}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public Grabats09Match newMatch(final TypeDeclaration pTt) {
    return Grabats09Match.newMatch(pTt);
  }
  
  /**
   * Retrieve the set of values that occur in matches for Tt.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<TypeDeclaration> rawAccumulateAllValuesOfTt(final Object[] parameters) {
    Set<TypeDeclaration> results = new HashSet<TypeDeclaration>();
    rawAccumulateAllValues(POSITION_TT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Tt.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<TypeDeclaration> getAllValuesOfTt() {
    return rawAccumulateAllValuesOfTt(emptyArray());
  }
  
  @Override
  protected Grabats09Match tupleToMatch(final Tuple t) {
    try {
        return Grabats09Match.newMatch((TypeDeclaration) t.get(POSITION_TT));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Grabats09Match arrayToMatch(final Object[] match) {
    try {
        return Grabats09Match.newMatch((TypeDeclaration) match[POSITION_TT]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected Grabats09Match arrayToMatchMutable(final Object[] match) {
    try {
        return Grabats09Match.newMutableMatch((TypeDeclaration) match[POSITION_TT]);
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
  public static IQuerySpecification<Grabats09Matcher> querySpecification() throws ViatraQueryException {
    return Grabats09QuerySpecification.instance();
  }
}
