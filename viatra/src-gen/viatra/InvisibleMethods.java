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
import java_.MethodDeclaration;
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
 *         pattern invisibleMethods(Met) {
 *         	ClassDeclaration.bodyDeclarations(_Cl, Met);
 *         	MethodDeclaration(Met);
 *         	MethodDeclaration.modifier.visibility(Met,VisibilityKind::^private);
 *         } or
 *         {
 *         	ClassDeclaration.bodyDeclarations(_Cl, Met);
 *         	MethodDeclaration(Met);
 *         	MethodDeclaration.modifier.visibility(Met,VisibilityKind::protected);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class InvisibleMethods extends BaseGeneratedEMFQuerySpecification<InvisibleMethods.Matcher> {
  /**
   * Pattern-specific match representation of the viatra.invisibleMethods pattern,
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
    private MethodDeclaration fMet;
    
    private static List<String> parameterNames = makeImmutableList("Met");
    
    private Match(final MethodDeclaration pMet) {
      this.fMet = pMet;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("Met".equals(parameterName)) return this.fMet;
      return null;
    }
    
    public MethodDeclaration getMet() {
      return this.fMet;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("Met".equals(parameterName) ) {
          this.fMet = (MethodDeclaration) newValue;
          return true;
      }
      return false;
    }
    
    public void setMet(final MethodDeclaration pMet) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fMet = pMet;
    }
    
    @Override
    public String patternName() {
      return "viatra.invisibleMethods";
    }
    
    @Override
    public List<String> parameterNames() {
      return InvisibleMethods.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fMet};
    }
    
    @Override
    public InvisibleMethods.Match toImmutable() {
      return isMutable() ? newMatch(fMet) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Met\"=" + prettyPrintValue(fMet));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fMet);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof InvisibleMethods.Match)) {
          InvisibleMethods.Match other = (InvisibleMethods.Match) obj;
          return Objects.equals(fMet, other.fMet);
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
    public InvisibleMethods specification() {
      return InvisibleMethods.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static InvisibleMethods.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pMet the fixed value of pattern parameter Met, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static InvisibleMethods.Match newMutableMatch(final MethodDeclaration pMet) {
      return new Mutable(pMet);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pMet the fixed value of pattern parameter Met, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static InvisibleMethods.Match newMatch(final MethodDeclaration pMet) {
      return new Immutable(pMet);
    }
    
    private static final class Mutable extends InvisibleMethods.Match {
      Mutable(final MethodDeclaration pMet) {
        super(pMet);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends InvisibleMethods.Match {
      Immutable(final MethodDeclaration pMet) {
        super(pMet);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the viatra.invisibleMethods pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
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
   * @see Match
   * @see InvisibleMethods
   * 
   */
  public static class Matcher extends BaseMatcher<InvisibleMethods.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static InvisibleMethods.Matcher on(final ViatraQueryEngine engine) {
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
    public static InvisibleMethods.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_MET = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(InvisibleMethods.Matcher.class);
    
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
     * @param pMet the fixed value of pattern parameter Met, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<InvisibleMethods.Match> getAllMatches(final MethodDeclaration pMet) {
      return rawStreamAllMatches(new Object[]{pMet}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pMet the fixed value of pattern parameter Met, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<InvisibleMethods.Match> streamAllMatches(final MethodDeclaration pMet) {
      return rawStreamAllMatches(new Object[]{pMet});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pMet the fixed value of pattern parameter Met, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<InvisibleMethods.Match> getOneArbitraryMatch(final MethodDeclaration pMet) {
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
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pMet the fixed value of pattern parameter Met, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final MethodDeclaration pMet, final Consumer<? super InvisibleMethods.Match> processor) {
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
    public InvisibleMethods.Match newMatch(final MethodDeclaration pMet) {
      return InvisibleMethods.Match.newMatch(pMet);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Met.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<MethodDeclaration> rawStreamAllValuesOfMet(final Object[] parameters) {
      return rawStreamAllValues(POSITION_MET, parameters).map(MethodDeclaration.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Met.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<MethodDeclaration> getAllValuesOfMet() {
      return rawStreamAllValuesOfMet(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Met.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<MethodDeclaration> streamAllValuesOfMet() {
      return rawStreamAllValuesOfMet(emptyArray());
    }
    
    @Override
    protected InvisibleMethods.Match tupleToMatch(final Tuple t) {
      try {
          return InvisibleMethods.Match.newMatch((MethodDeclaration) t.get(POSITION_MET));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected InvisibleMethods.Match arrayToMatch(final Object[] match) {
      try {
          return InvisibleMethods.Match.newMatch((MethodDeclaration) match[POSITION_MET]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected InvisibleMethods.Match arrayToMatchMutable(final Object[] match) {
      try {
          return InvisibleMethods.Match.newMutableMatch((MethodDeclaration) match[POSITION_MET]);
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
    public static IQuerySpecification<InvisibleMethods.Matcher> querySpecification() {
      return InvisibleMethods.instance();
    }
  }
  
  private InvisibleMethods() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static InvisibleMethods instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvisibleMethods.Matcher instantiate(final ViatraQueryEngine engine) {
    return InvisibleMethods.Matcher.on(engine);
  }
  
  @Override
  public InvisibleMethods.Matcher instantiate() {
    return InvisibleMethods.Matcher.create();
  }
  
  @Override
  public InvisibleMethods.Match newEmptyMatch() {
    return InvisibleMethods.Match.newEmptyMatch();
  }
  
  @Override
  public InvisibleMethods.Match newMatch(final Object... parameters) {
    return InvisibleMethods.Match.newMatch((java_.MethodDeclaration) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: viatra.InvisibleMethods (visibility: PUBLIC, simpleName: InvisibleMethods, identifier: viatra.InvisibleMethods, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: viatra.InvisibleMethods (visibility: PUBLIC, simpleName: InvisibleMethods, identifier: viatra.InvisibleMethods, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static InvisibleMethods INSTANCE = new InvisibleMethods();
    
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
    private final static InvisibleMethods.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Met = new PParameter("Met", "java_.MethodDeclaration", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Met);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "viatra.invisibleMethods";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Met");
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
          PVariable var_Met = body.getOrCreateVariableByName("Met");
          PVariable var__Cl = body.getOrCreateVariableByName("_Cl");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Met, parameter_Met)
          ));
          // 	ClassDeclaration.bodyDeclarations(_Cl, Met)
          new TypeConstraint(body, Tuples.flatTupleOf(var__Cl), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "ClassDeclaration")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__Cl, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "AbstractTypeDeclaration", "bodyDeclarations")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration")));
          new Equality(body, var__virtual_0_, var_Met);
          // 	MethodDeclaration(Met)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Met), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
          // 	MethodDeclaration.modifier.visibility(Met,VisibilityKind::^private)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "VisibilityKind", "private").getInstance());
          new TypeConstraint(body, Tuples.flatTupleOf(var_Met), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Met, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration", "modifier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Modifier")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Modifier", "visibility")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "VisibilityKind")));
          new Equality(body, var__virtual_3_, var__virtual_1_);
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_Met = body.getOrCreateVariableByName("Met");
          PVariable var__Cl = body.getOrCreateVariableByName("_Cl");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Met, parameter_Met)
          ));
          // 	ClassDeclaration.bodyDeclarations(_Cl, Met)
          new TypeConstraint(body, Tuples.flatTupleOf(var__Cl), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "ClassDeclaration")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__Cl, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "AbstractTypeDeclaration", "bodyDeclarations")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration")));
          new Equality(body, var__virtual_0_, var_Met);
          // 	MethodDeclaration(Met)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Met), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
          // 	MethodDeclaration.modifier.visibility(Met,VisibilityKind::protected)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "VisibilityKind", "protected").getInstance());
          new TypeConstraint(body, Tuples.flatTupleOf(var_Met), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Met, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration", "modifier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Modifier")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Modifier", "visibility")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "VisibilityKind")));
          new Equality(body, var__virtual_3_, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
