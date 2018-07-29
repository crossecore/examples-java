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
import viatra.ThrownExceptionsMatch;
import viatra.ThrownExceptionsMatcher;

/**
 * A pattern-specific query specification that can instantiate ThrownExceptionsMatcher in a type-safe way.
 * 
 * @see ThrownExceptionsMatcher
 * @see ThrownExceptionsMatch
 * 
 */
@SuppressWarnings("all")
public final class ThrownExceptionsQuerySpecification extends BaseGeneratedEMFQuerySpecification<ThrownExceptionsMatcher> {
  private ThrownExceptionsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static ThrownExceptionsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ThrownExceptionsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ThrownExceptionsMatcher.on(engine);
  }
  
  @Override
  public ThrownExceptionsMatcher instantiate() throws ViatraQueryException {
    return ThrownExceptionsMatcher.create();
  }
  
  @Override
  public ThrownExceptionsMatch newEmptyMatch() {
    return ThrownExceptionsMatch.newEmptyMatch();
  }
  
  @Override
  public ThrownExceptionsMatch newMatch(final Object... parameters) {
    return ThrownExceptionsMatch.newMatch((java_.TypeAccess) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link ThrownExceptionsQuerySpecification} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link ThrownExceptionsQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ThrownExceptionsQuerySpecification INSTANCE = new ThrownExceptionsQuerySpecification();
    
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
    private final static ThrownExceptionsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEx = new PParameter("Ex", "java_.TypeAccess", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEx);
    
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
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
          {
              PBody body = new PBody(this);
              PVariable var_Ex = body.getOrCreateVariableByName("Ex");
              PVariable var_Owned = body.getOrCreateVariableByName("Owned");
              PVariable var_Body = body.getOrCreateVariableByName("Body");
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_Ex, parameter_pEx)
              ));
              // 	ClassDeclaration(Owned)
              new TypeConstraint(body, new FlatTuple(var_Owned), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "ClassDeclaration")));
              // 	ClassDeclaration.bodyDeclarations(Owned,Body)
              new TypeConstraint(body, new FlatTuple(var_Owned), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "ClassDeclaration")));
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new TypeConstraint(body, new FlatTuple(var_Owned, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "AbstractTypeDeclaration", "bodyDeclarations")));
              new TypeConstraint(body, new FlatTuple(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration")));
              new Equality(body, var__virtual_0_, var_Body);
              // 	MethodDeclaration(Body)
              new TypeConstraint(body, new FlatTuple(var_Body), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
              // 	MethodDeclaration.thrownExceptions(Body,Ex)
              new TypeConstraint(body, new FlatTuple(var_Body), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new TypeConstraint(body, new FlatTuple(var_Body, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "AbstractMethodDeclaration", "thrownExceptions")));
              new TypeConstraint(body, new FlatTuple(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TypeAccess")));
              new Equality(body, var__virtual_1_, var_Ex);
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
