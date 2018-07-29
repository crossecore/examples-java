/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java_.TypeAccess;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import viatra.ThrownExceptionsMatch;
import viatra.util.ThrownExceptionsQuerySpecification;

/**
 * Generated pattern matcher API of the viatra.thrownExceptions pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ThrownExceptionsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern thrownExceptions(Ex) {
 * 
 * 	ClassDeclaration(Owned);
 * 	ClassDeclaration.bodyDeclarations(Owned,Body);
 * 	MethodDeclaration(Body);
 * 	MethodDeclaration.thrownExceptions(Body,Ex);
 * }
 * </pre></code>
 * 
 * @see ThrownExceptionsMatch
 * @see ThrownExceptionsProcessor
 * @see ThrownExceptionsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ThrownExceptionsMatcher extends BaseMatcher<ThrownExceptionsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ThrownExceptionsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    ThrownExceptionsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (ThrownExceptionsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static ThrownExceptionsMatcher create() throws ViatraQueryException {
    return new ThrownExceptionsMatcher();
  }
  
  private final static int POSITION_EX = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ThrownExceptionsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private ThrownExceptionsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
   * @return matches represented as a ThrownExceptionsMatch object.
   * 
   */
  public Collection<ThrownExceptionsMatch> getAllMatches(final TypeAccess pEx) {
    return rawGetAllMatches(new Object[]{pEx});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
   * @return a match represented as a ThrownExceptionsMatch object, or null if no match is found.
   * 
   */
  public ThrownExceptionsMatch getOneArbitraryMatch(final TypeAccess pEx) {
    return rawGetOneArbitraryMatch(new Object[]{pEx});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TypeAccess pEx) {
    return rawHasMatch(new Object[]{pEx});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TypeAccess pEx) {
    return rawCountMatches(new Object[]{pEx});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TypeAccess pEx, final IMatchProcessor<? super ThrownExceptionsMatch> processor) {
    rawForEachMatch(new Object[]{pEx}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TypeAccess pEx, final IMatchProcessor<? super ThrownExceptionsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEx}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ThrownExceptionsMatch newMatch(final TypeAccess pEx) {
    return ThrownExceptionsMatch.newMatch(pEx);
  }
  
  /**
   * Retrieve the set of values that occur in matches for Ex.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<TypeAccess> rawAccumulateAllValuesOfEx(final Object[] parameters) {
    Set<TypeAccess> results = new HashSet<TypeAccess>();
    rawAccumulateAllValues(POSITION_EX, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Ex.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<TypeAccess> getAllValuesOfEx() {
    return rawAccumulateAllValuesOfEx(emptyArray());
  }
  
  @Override
  protected ThrownExceptionsMatch tupleToMatch(final Tuple t) {
    try {
        return ThrownExceptionsMatch.newMatch((TypeAccess) t.get(POSITION_EX));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ThrownExceptionsMatch arrayToMatch(final Object[] match) {
    try {
        return ThrownExceptionsMatch.newMatch((TypeAccess) match[POSITION_EX]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected ThrownExceptionsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return ThrownExceptionsMatch.newMutableMatch((TypeAccess) match[POSITION_EX]);
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
  public static IQuerySpecification<ThrownExceptionsMatcher> querySpecification() throws ViatraQueryException {
    return ThrownExceptionsQuerySpecification.instance();
  }
}
