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
import java_.TypeDeclaration;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
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
 *         pattern grabats09(Tt) {
 *         	TypeDeclaration(Tt);
 *         	TypeDeclaration.bodyDeclarations(Tt,Bod);
 *         	MethodDeclaration(Bod);
 *         	MethodDeclaration.modifier.^static(Bod,true);
 *         	MethodDeclaration.returnType.type(Bod,Tt);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Grabats09 extends BaseGeneratedEMFQuerySpecification<Grabats09.Matcher> {
  /**
   * Pattern-specific match representation of the viatra.grabats09 pattern,
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
    private TypeDeclaration fTt;
    
    private static List<String> parameterNames = makeImmutableList("Tt");
    
    private Match(final TypeDeclaration pTt) {
      this.fTt = pTt;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Tt".equals(parameterName)) return this.fTt;
      return null;
    }
    
    public TypeDeclaration getTt() {
      return this.fTt;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Tt".equals(parameterName) ) {
          this.fTt = (TypeDeclaration) newValue;
          return true;
      }
      return false;
    }
    
    public void setTt(final TypeDeclaration pTt) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTt = pTt;
    }
    
    @Override
    public String patternName() {
      return "viatra.grabats09";
    }
    
    @Override
    public List<String> parameterNames() {
      return Grabats09.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fTt};
    }
    
    @Override
    public Grabats09.Match toImmutable() {
      return isMutable() ? newMatch(fTt) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Tt\"=" + prettyPrintValue(fTt));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fTt);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Grabats09.Match)) {
          Grabats09.Match other = (Grabats09.Match) obj;
          return Objects.equals(fTt, other.fTt);
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
    public Grabats09 specification() {
      return Grabats09.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Grabats09.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Grabats09.Match newMutableMatch(final TypeDeclaration pTt) {
      return new Mutable(pTt);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Grabats09.Match newMatch(final TypeDeclaration pTt) {
      return new Immutable(pTt);
    }
    
    private static final class Mutable extends Grabats09.Match {
      Mutable(final TypeDeclaration pTt) {
        super(pTt);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Grabats09.Match {
      Immutable(final TypeDeclaration pTt) {
        super(pTt);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the viatra.grabats09 pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
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
   * @see Match
   * @see Grabats09
   * 
   */
  public static class Matcher extends BaseMatcher<Grabats09.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Grabats09.Matcher on(final ViatraQueryEngine engine) {
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
    public static Grabats09.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_TT = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Grabats09.Matcher.class);
    
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
     * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Grabats09.Match> getAllMatches(final TypeDeclaration pTt) {
      return rawStreamAllMatches(new Object[]{pTt}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Grabats09.Match> streamAllMatches(final TypeDeclaration pTt) {
      return rawStreamAllMatches(new Object[]{pTt});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Grabats09.Match> getOneArbitraryMatch(final TypeDeclaration pTt) {
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
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pTt the fixed value of pattern parameter Tt, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TypeDeclaration pTt, final Consumer<? super Grabats09.Match> processor) {
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
    public Grabats09.Match newMatch(final TypeDeclaration pTt) {
      return Grabats09.Match.newMatch(pTt);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Tt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<TypeDeclaration> rawStreamAllValuesOfTt(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TT, parameters).map(TypeDeclaration.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Tt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TypeDeclaration> getAllValuesOfTt() {
      return rawStreamAllValuesOfTt(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Tt.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<TypeDeclaration> streamAllValuesOfTt() {
      return rawStreamAllValuesOfTt(emptyArray());
    }
    
    @Override
    protected Grabats09.Match tupleToMatch(final Tuple t) {
      try {
          return Grabats09.Match.newMatch((TypeDeclaration) t.get(POSITION_TT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Grabats09.Match arrayToMatch(final Object[] match) {
      try {
          return Grabats09.Match.newMatch((TypeDeclaration) match[POSITION_TT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Grabats09.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Grabats09.Match.newMutableMatch((TypeDeclaration) match[POSITION_TT]);
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
    public static IQuerySpecification<Grabats09.Matcher> querySpecification() {
      return Grabats09.instance();
    }
  }
  
  private Grabats09() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Grabats09 instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Grabats09.Matcher instantiate(final ViatraQueryEngine engine) {
    return Grabats09.Matcher.on(engine);
  }
  
  @Override
  public Grabats09.Matcher instantiate() {
    return Grabats09.Matcher.create();
  }
  
  @Override
  public Grabats09.Match newEmptyMatch() {
    return Grabats09.Match.newEmptyMatch();
  }
  
  @Override
  public Grabats09.Match newMatch(final Object... parameters) {
    return Grabats09.Match.newMatch((java_.TypeDeclaration) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: viatra.Grabats09 (visibility: PUBLIC, simpleName: Grabats09, identifier: viatra.Grabats09, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: viatra.Grabats09 (visibility: PUBLIC, simpleName: Grabats09, identifier: viatra.Grabats09, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Grabats09 INSTANCE = new Grabats09();
    
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
    private final static Grabats09.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Tt = new PParameter("Tt", "java_.TypeDeclaration", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Tt);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "viatra.grabats09";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Tt");
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
          PVariable var_Tt = body.getOrCreateVariableByName("Tt");
          PVariable var_Bod = body.getOrCreateVariableByName("Bod");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Tt, parameter_Tt)
          ));
          // 	TypeDeclaration(Tt)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Tt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TypeDeclaration")));
          // 	TypeDeclaration.bodyDeclarations(Tt,Bod)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Tt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TypeDeclaration")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Tt, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "AbstractTypeDeclaration", "bodyDeclarations")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration")));
          new Equality(body, var__virtual_0_, var_Bod);
          // 	MethodDeclaration(Bod)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Bod), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
          // 	MethodDeclaration.modifier.^static(Bod,true)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, true);
          new TypeConstraint(body, Tuples.flatTupleOf(var_Bod), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Bod, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration", "modifier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Modifier")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Modifier", "static")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EBoolean")));
          new Equality(body, var__virtual_3_, var__virtual_1_);
          // 	MethodDeclaration.returnType.type(Bod,Tt)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Bod), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Bod, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration", "returnType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TypeAccess")));
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TypeAccess", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Type")));
          new Equality(body, var__virtual_5_, var_Tt);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1() {
    return true;
  }
}
