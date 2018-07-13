/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java_.MethodDeclaration;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import viatra.InvisibleMethodsMatch;
import viatra.util.InvisibleMethodsQuerySpecification;

/**
 * Generated pattern matcher API of the viatra.invisibleMethods pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link InvisibleMethodsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern invisibleMethods(Met) {
 * 	ClassDeclaration.bodyDeclarations(_Cl, Met);
 * 	MethodDeclaration(Met);
 * 	MethodDeclaration.modifier.visibility(Met,VisibilityKind::^private);
 * } or
 * {
 * 	ClassDeclaration.bodyDeclarations(_Cl, Met);
 * 	MethodDeclaration(Met);
 * 	MethodDeclaration.modifier.visibility(Met,VisibilityKind::protected);
 * }
 * </pre></code>
 * 
 * @see InvisibleMethodsMatch
 * @see InvisibleMethodsProcessor
 * @see InvisibleMethodsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class InvisibleMethodsMatcher extends BaseMatcher<InvisibleMethodsMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static InvisibleMethodsMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    InvisibleMethodsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (InvisibleMethodsMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static InvisibleMethodsMatcher create() throws ViatraQueryException {
    return new InvisibleMethodsMatcher();
  }
  
  private final static int POSITION_MET = 0;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(InvisibleMethodsMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private InvisibleMethodsMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMet the fixed value of pattern parameter Met, or null if not bound.
   * @return matches represented as a InvisibleMethodsMatch object.
   * 
   */
  public Collection<InvisibleMethodsMatch> getAllMatches(final MethodDeclaration pMet) {
    return rawGetAllMatches(new Object[]{pMet});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMet the fixed value of pattern parameter Met, or null if not bound.
   * @return a match represented as a InvisibleMethodsMatch object, or null if no match is found.
   * 
   */
  public InvisibleMethodsMatch getOneArbitraryMatch(final MethodDeclaration pMet) {
    return rawGetOneArbitraryMatch(new Object[]{pMet});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pMet the fixed value of pattern parameter Met, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final MethodDeclaration pMet) {
    return rawHasMatch(new Object[]{pMet});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pMet the fixed value of pattern parameter Met, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final MethodDeclaration pMet) {
    return rawCountMatches(new Object[]{pMet});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pMet the fixed value of pattern parameter Met, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final MethodDeclaration pMet, final IMatchProcessor<? super InvisibleMethodsMatch> processor) {
    rawForEachMatch(new Object[]{pMet}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pMet the fixed value of pattern parameter Met, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final MethodDeclaration pMet, final IMatchProcessor<? super InvisibleMethodsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pMet}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMet the fixed value of pattern parameter Met, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InvisibleMethodsMatch newMatch(final MethodDeclaration pMet) {
    return InvisibleMethodsMatch.newMatch(pMet);
  }
  
  /**
   * Retrieve the set of values that occur in matches for Met.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<MethodDeclaration> rawAccumulateAllValuesOfMet(final Object[] parameters) {
    Set<MethodDeclaration> results = new HashSet<MethodDeclaration>();
    rawAccumulateAllValues(POSITION_MET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Met.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<MethodDeclaration> getAllValuesOfMet() {
    return rawAccumulateAllValuesOfMet(emptyArray());
  }
  
  @Override
  protected InvisibleMethodsMatch tupleToMatch(final Tuple t) {
    try {
        return InvisibleMethodsMatch.newMatch((MethodDeclaration) t.get(POSITION_MET));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected InvisibleMethodsMatch arrayToMatch(final Object[] match) {
    try {
        return InvisibleMethodsMatch.newMatch((MethodDeclaration) match[POSITION_MET]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected InvisibleMethodsMatch arrayToMatchMutable(final Object[] match) {
    try {
        return InvisibleMethodsMatch.newMutableMatch((MethodDeclaration) match[POSITION_MET]);
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
  public static IQuerySpecification<InvisibleMethodsMatcher> querySpecification() throws ViatraQueryException {
    return InvisibleMethodsQuerySpecification.instance();
  }
}
