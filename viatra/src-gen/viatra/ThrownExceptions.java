/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java_.TypeAccess;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern thrownExceptions(Ex) {
 *         
 *         	ClassDeclaration(Owned);
 *         	ClassDeclaration.bodyDeclarations(Owned,Body);
 *         	MethodDeclaration(Body);
 *         	MethodDeclaration.thrownExceptions(Body,Ex);
 *         	
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class ThrownExceptions extends BaseGeneratedEMFQuerySpecification<ThrownExceptions.Matcher> {
  /**
   * Pattern-specific match representation of the viatra.thrownExceptions pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private TypeAccess fEx;
    
    private static List<String> parameterNames = makeImmutableList("Ex");
    
    private Match(final TypeAccess pEx) {
      this.fEx = pEx;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Ex".equals(parameterName)) return this.fEx;
      return null;
    }
    
    public TypeAccess getEx() {
      return this.fEx;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Ex".equals(parameterName) ) {
          this.fEx = (TypeAccess) newValue;
          return true;
      }
      return false;
    }
    
    public void setEx(final TypeAccess pEx) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEx = pEx;
    }
    
    @Override
    public String patternName() {
      return "viatra.thrownExceptions";
    }
    
    @Override
    public List<String> parameterNames() {
      return ThrownExceptions.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEx};
    }
    
    @Override
    public ThrownExceptions.Match toImmutable() {
      return isMutable() ? newMatch(fEx) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Ex\"=" + prettyPrintValue(fEx));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fEx);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ThrownExceptions.Match)) {
          ThrownExceptions.Match other = (ThrownExceptions.Match) obj;
          return Objects.equals(fEx, other.fEx);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public ThrownExceptions specification() {
      return ThrownExceptions.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ThrownExceptions.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ThrownExceptions.Match newMutableMatch(final TypeAccess pEx) {
      return new Mutable(pEx);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ThrownExceptions.Match newMatch(final TypeAccess pEx) {
      return new Immutable(pEx);
    }
    
    private static final class Mutable extends ThrownExceptions.Match {
      Mutable(final TypeAccess pEx) {
        super(pEx);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ThrownExceptions.Match {
      Immutable(final TypeAccess pEx) {
        super(pEx);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the viatra.thrownExceptions pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern thrownExceptions(Ex) {
   * 
   * 	ClassDeclaration(Owned);
   * 	ClassDeclaration.bodyDeclarations(Owned,Body);
   * 	MethodDeclaration(Body);
   * 	MethodDeclaration.thrownExceptions(Body,Ex);
   * 	
   * }
   * </pre></code>
   * 
   * @see Match
   * @see ThrownExceptions
   * 
   */
  public static class Matcher extends BaseMatcher<ThrownExceptions.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ThrownExceptions.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static ThrownExceptions.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_EX = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ThrownExceptions.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ThrownExceptions.Match> getAllMatches(final TypeAccess pEx) {
      return rawStreamAllMatches(new Object[]{pEx}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ThrownExceptions.Match> streamAllMatches(final TypeAccess pEx) {
      return rawStreamAllMatches(new Object[]{pEx});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ThrownExceptions.Match> getOneArbitraryMatch(final TypeAccess pEx) {
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
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEx the fixed value of pattern parameter Ex, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TypeAccess pEx, final Consumer<? super ThrownExceptions.Match> processor) {
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
    public ThrownExceptions.Match newMatch(final TypeAccess pEx) {
      return ThrownExceptions.Match.newMatch(pEx);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Ex.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<TypeAccess> rawStreamAllValuesOfEx(final Object[] parameters) {
      return rawStreamAllValues(POSITION_EX, parameters).map(TypeAccess.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Ex.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TypeAccess> getAllValuesOfEx() {
      return rawStreamAllValuesOfEx(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Ex.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<TypeAccess> streamAllValuesOfEx() {
      return rawStreamAllValuesOfEx(emptyArray());
    }
    
    @Override
    protected ThrownExceptions.Match tupleToMatch(final Tuple t) {
      try {
          return ThrownExceptions.Match.newMatch((TypeAccess) t.get(POSITION_EX));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ThrownExceptions.Match arrayToMatch(final Object[] match) {
      try {
          return ThrownExceptions.Match.newMatch((TypeAccess) match[POSITION_EX]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ThrownExceptions.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ThrownExceptions.Match.newMutableMatch((TypeAccess) match[POSITION_EX]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<ThrownExceptions.Matcher> querySpecification() {
      return ThrownExceptions.instance();
    }
  }
  
  private ThrownExceptions() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ThrownExceptions instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ThrownExceptions.Matcher instantiate(final ViatraQueryEngine engine) {
    return ThrownExceptions.Matcher.on(engine);
  }
  
  @Override
  public ThrownExceptions.Matcher instantiate() {
    return ThrownExceptions.Matcher.create();
  }
  
  @Override
  public ThrownExceptions.Match newEmptyMatch() {
    return ThrownExceptions.Match.newEmptyMatch();
  }
  
  @Override
  public ThrownExceptions.Match newMatch(final Object... parameters) {
    return ThrownExceptions.Match.newMatch((java_.TypeAccess) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: viatra.ThrownExceptions (visibility: PUBLIC, simpleName: ThrownExceptions, identifier: viatra.ThrownExceptions, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: viatra.ThrownExceptions (visibility: PUBLIC, simpleName: ThrownExceptions, identifier: viatra.ThrownExceptions, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ThrownExceptions INSTANCE = new ThrownExceptions();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ThrownExceptions.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Ex = new PParameter("Ex", "java_.TypeAccess", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Ex);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "viatra.thrownExceptions";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Ex");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_Ex = body.getOrCreateVariableByName("Ex");
          PVariable var_Owned = body.getOrCreateVariableByName("Owned");
          PVariable var_Body = body.getOrCreateVariableByName("Body");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Ex, parameter_Ex)
          ));
          // 	ClassDeclaration(Owned)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Owned), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "ClassDeclaration")));
          // 	ClassDeclaration.bodyDeclarations(Owned,Body)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Owned), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "ClassDeclaration")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Owned, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "AbstractTypeDeclaration", "bodyDeclarations")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration")));
          new Equality(body, var__virtual_0_, var_Body);
          // 	MethodDeclaration(Body)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Body), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
          // 	MethodDeclaration.thrownExceptions(Body,Ex)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Body), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Body, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "AbstractMethodDeclaration", "thrownExceptions")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TypeAccess")));
          new Equality(body, var__virtual_1_, var_Ex);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
