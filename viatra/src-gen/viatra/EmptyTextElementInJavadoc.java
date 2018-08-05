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
import java_.TextElement;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
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
 *         pattern emptyTextElementInJavadoc(Ff) {
 *         	Model(Mm);
 *         	Model.compilationUnits.commentList(Mm,Cl);
 *         	Javadoc(Cl);
 *         	Javadoc.tags.fragments(Cl,Ff);
 *         	TextElement(Ff);
 *         	TextElement.text(Ff, x);
 *         	check(x.length()==0);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class EmptyTextElementInJavadoc extends BaseGeneratedEMFQuerySpecification<EmptyTextElementInJavadoc.Matcher> {
  /**
   * Pattern-specific match representation of the viatra.emptyTextElementInJavadoc pattern,
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
    private TextElement fFf;
    
    private static List<String> parameterNames = makeImmutableList("Ff");
    
    private Match(final TextElement pFf) {
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
      return EmptyTextElementInJavadoc.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fFf};
    }
    
    @Override
    public EmptyTextElementInJavadoc.Match toImmutable() {
      return isMutable() ? newMatch(fFf) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"Ff\"=" + prettyPrintValue(fFf));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fFf);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EmptyTextElementInJavadoc.Match)) {
          EmptyTextElementInJavadoc.Match other = (EmptyTextElementInJavadoc.Match) obj;
          return Objects.equals(fFf, other.fFf);
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
    public EmptyTextElementInJavadoc specification() {
      return EmptyTextElementInJavadoc.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EmptyTextElementInJavadoc.Match newEmptyMatch() {
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
    public static EmptyTextElementInJavadoc.Match newMutableMatch(final TextElement pFf) {
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
    public static EmptyTextElementInJavadoc.Match newMatch(final TextElement pFf) {
      return new Immutable(pFf);
    }
    
    private static final class Mutable extends EmptyTextElementInJavadoc.Match {
      Mutable(final TextElement pFf) {
        super(pFf);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EmptyTextElementInJavadoc.Match {
      Immutable(final TextElement pFf) {
        super(pFf);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the viatra.emptyTextElementInJavadoc pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern emptyTextElementInJavadoc(Ff) {
   * 	Model(Mm);
   * 	Model.compilationUnits.commentList(Mm,Cl);
   * 	Javadoc(Cl);
   * 	Javadoc.tags.fragments(Cl,Ff);
   * 	TextElement(Ff);
   * 	TextElement.text(Ff, x);
   * 	check(x.length()==0);
   * }
   * </pre></code>
   * 
   * @see Match
   * @see EmptyTextElementInJavadoc
   * 
   */
  public static class Matcher extends BaseMatcher<EmptyTextElementInJavadoc.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EmptyTextElementInJavadoc.Matcher on(final ViatraQueryEngine engine) {
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
    public static EmptyTextElementInJavadoc.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_FF = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EmptyTextElementInJavadoc.Matcher.class);
    
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
     * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EmptyTextElementInJavadoc.Match> getAllMatches(final TextElement pFf) {
      return rawStreamAllMatches(new Object[]{pFf}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<EmptyTextElementInJavadoc.Match> streamAllMatches(final TextElement pFf) {
      return rawStreamAllMatches(new Object[]{pFf});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<EmptyTextElementInJavadoc.Match> getOneArbitraryMatch(final TextElement pFf) {
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
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pFf the fixed value of pattern parameter Ff, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TextElement pFf, final Consumer<? super EmptyTextElementInJavadoc.Match> processor) {
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
    public EmptyTextElementInJavadoc.Match newMatch(final TextElement pFf) {
      return EmptyTextElementInJavadoc.Match.newMatch(pFf);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Ff.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<TextElement> rawStreamAllValuesOfFf(final Object[] parameters) {
      return rawStreamAllValues(POSITION_FF, parameters).map(TextElement.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for Ff.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TextElement> getAllValuesOfFf() {
      return rawStreamAllValuesOfFf(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for Ff.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<TextElement> streamAllValuesOfFf() {
      return rawStreamAllValuesOfFf(emptyArray());
    }
    
    @Override
    protected EmptyTextElementInJavadoc.Match tupleToMatch(final Tuple t) {
      try {
          return EmptyTextElementInJavadoc.Match.newMatch((TextElement) t.get(POSITION_FF));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EmptyTextElementInJavadoc.Match arrayToMatch(final Object[] match) {
      try {
          return EmptyTextElementInJavadoc.Match.newMatch((TextElement) match[POSITION_FF]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EmptyTextElementInJavadoc.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EmptyTextElementInJavadoc.Match.newMutableMatch((TextElement) match[POSITION_FF]);
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
    public static IQuerySpecification<EmptyTextElementInJavadoc.Matcher> querySpecification() {
      return EmptyTextElementInJavadoc.instance();
    }
  }
  
  private EmptyTextElementInJavadoc() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EmptyTextElementInJavadoc instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EmptyTextElementInJavadoc.Matcher instantiate(final ViatraQueryEngine engine) {
    return EmptyTextElementInJavadoc.Matcher.on(engine);
  }
  
  @Override
  public EmptyTextElementInJavadoc.Matcher instantiate() {
    return EmptyTextElementInJavadoc.Matcher.create();
  }
  
  @Override
  public EmptyTextElementInJavadoc.Match newEmptyMatch() {
    return EmptyTextElementInJavadoc.Match.newEmptyMatch();
  }
  
  @Override
  public EmptyTextElementInJavadoc.Match newMatch(final Object... parameters) {
    return EmptyTextElementInJavadoc.Match.newMatch((java_.TextElement) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: viatra.EmptyTextElementInJavadoc (visibility: PUBLIC, simpleName: EmptyTextElementInJavadoc, identifier: viatra.EmptyTextElementInJavadoc, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: viatra.EmptyTextElementInJavadoc (visibility: PUBLIC, simpleName: EmptyTextElementInJavadoc, identifier: viatra.EmptyTextElementInJavadoc, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: viatra) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static EmptyTextElementInJavadoc INSTANCE = new EmptyTextElementInJavadoc();
    
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
    private final static EmptyTextElementInJavadoc.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_Ff = new PParameter("Ff", "java_.TextElement", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_Ff);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "viatra.emptyTextElementInJavadoc";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Ff");
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
          PVariable var_Ff = body.getOrCreateVariableByName("Ff");
          PVariable var_Mm = body.getOrCreateVariableByName("Mm");
          PVariable var_Cl = body.getOrCreateVariableByName("Cl");
          PVariable var_x = body.getOrCreateVariableByName("x");
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_Ff, parameter_Ff)
          ));
          // 	Model(Mm)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Model")));
          // 	Model.compilationUnits.commentList(Mm,Cl)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Model")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Mm, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Model", "compilationUnits")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "CompilationUnit")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "CompilationUnit", "commentList")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Comment")));
          new Equality(body, var__virtual_1_, var_Cl);
          // 	Javadoc(Cl)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cl), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Javadoc")));
          // 	Javadoc.tags.fragments(Cl,Ff)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cl), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Javadoc")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Cl, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Javadoc", "tags")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TagElement")));
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TagElement", "fragments")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "ASTNode")));
          new Equality(body, var__virtual_3_, var_Ff);
          // 	TextElement(Ff)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Ff), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TextElement")));
          // 	TextElement.text(Ff, x)
          new TypeConstraint(body, Tuples.flatTupleOf(var_Ff), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TextElement")));
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_Ff, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TextElement", "text")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_4_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
          new Equality(body, var__virtual_4_, var_x);
          // 	check(x.length()==0)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern emptyTextElementInJavadoc";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("x");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String x = (String) provider.getValue("x");
                  return evaluateExpression_1_1(x);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final String x) {
    int _length = x.length();
    boolean _equals = (_length == 0);
    return _equals;
  }
}
