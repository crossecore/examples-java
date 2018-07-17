/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import viatra.TextElementInJavadocMatch;
import viatra.TextElementInJavadocMatcher;

/**
 * A pattern-specific query specification that can instantiate TextElementInJavadocMatcher in a type-safe way.
 * 
 * @see TextElementInJavadocMatcher
 * @see TextElementInJavadocMatch
 * 
 */
@SuppressWarnings("all")
public final class TextElementInJavadocQuerySpecification extends BaseGeneratedEMFQuerySpecification<TextElementInJavadocMatcher> {
  private TextElementInJavadocQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static TextElementInJavadocQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected TextElementInJavadocMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TextElementInJavadocMatcher.on(engine);
  }
  
  @Override
  public TextElementInJavadocMatcher instantiate() throws ViatraQueryException {
    return TextElementInJavadocMatcher.create();
  }
  
  @Override
  public TextElementInJavadocMatch newEmptyMatch() {
    return TextElementInJavadocMatch.newEmptyMatch();
  }
  
  @Override
  public TextElementInJavadocMatch newMatch(final Object... parameters) {
    return TextElementInJavadocMatch.newMatch((java_.TextElement) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link TextElementInJavadocQuerySpecification} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link TextElementInJavadocQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static TextElementInJavadocQuerySpecification INSTANCE = new TextElementInJavadocQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TextElementInJavadocQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pFf = new PParameter("Ff", "java_.TextElement", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pFf);
    
    @Override
    public String getFullyQualifiedName() {
      return "viatra.textElementInJavadoc";
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
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
          {
              PBody body = new PBody(this);
              PVariable var_Ff = body.getOrCreateVariableByName("Ff");
              PVariable var_Mm = body.getOrCreateVariableByName("Mm");
              PVariable var_Cl = body.getOrCreateVariableByName("Cl");
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_Ff, parameter_pFf)
              ));
              // 	Model(Mm)
              new TypeConstraint(body, new FlatTuple(var_Mm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Model")));
              // 	Model.compilationUnits.commentList(Mm,Cl)
              new TypeConstraint(body, new FlatTuple(var_Mm), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Model")));
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new TypeConstraint(body, new FlatTuple(var_Mm, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Model", "compilationUnits")));
              new TypeConstraint(body, new FlatTuple(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "CompilationUnit")));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "CompilationUnit", "commentList")));
              new TypeConstraint(body, new FlatTuple(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Comment")));
              new Equality(body, var__virtual_1_, var_Cl);
              // 	Javadoc(Cl)
              new TypeConstraint(body, new FlatTuple(var_Cl), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Javadoc")));
              // 	Javadoc.tags.fragments(Cl,Ff)
              new TypeConstraint(body, new FlatTuple(var_Cl), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Javadoc")));
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new TypeConstraint(body, new FlatTuple(var_Cl, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Javadoc", "tags")));
              new TypeConstraint(body, new FlatTuple(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TagElement")));
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new TypeConstraint(body, new FlatTuple(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TagElement", "fragments")));
              new TypeConstraint(body, new FlatTuple(var__virtual_3_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "ASTNode")));
              new Equality(body, var__virtual_3_, var_Ff);
              // 	TextElement(Ff)
              new TypeConstraint(body, new FlatTuple(var_Ff), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TextElement")));
              bodies.add(body);
          }
          // to silence compiler error
          if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
          throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
