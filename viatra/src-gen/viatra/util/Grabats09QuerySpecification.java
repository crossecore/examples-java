/**
 * Generated from platform:/resource/viatra/src/viatra/queries.vql
 */
package viatra.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactory;
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
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import viatra.Grabats09Match;
import viatra.Grabats09Matcher;

/**
 * A pattern-specific query specification that can instantiate Grabats09Matcher in a type-safe way.
 * 
 * @see Grabats09Matcher
 * @see Grabats09Match
 * 
 */
@SuppressWarnings("all")
public final class Grabats09QuerySpecification extends BaseGeneratedEMFQuerySpecification<Grabats09Matcher> {
  private Grabats09QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static Grabats09QuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Grabats09Matcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return Grabats09Matcher.on(engine);
  }
  
  @Override
  public Grabats09Matcher instantiate() throws ViatraQueryException {
    return Grabats09Matcher.create();
  }
  
  @Override
  public Grabats09Match newEmptyMatch() {
    return Grabats09Match.newEmptyMatch();
  }
  
  @Override
  public Grabats09Match newMatch(final Object... parameters) {
    return Grabats09Match.newMatch((java_.TypeDeclaration) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link Grabats09QuerySpecification} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Grabats09QuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Grabats09QuerySpecification INSTANCE = new Grabats09QuerySpecification();
    
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
    private final static Grabats09QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pTt = new PParameter("Tt", "java_.TypeDeclaration", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pTt);
    
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
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
          {
              PBody body = new PBody(this);
              PVariable var_Tt = body.getOrCreateVariableByName("Tt");
              PVariable var_Bod = body.getOrCreateVariableByName("Bod");
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_Tt, parameter_pTt)
              ));
              // 	TypeDeclaration(Tt)
              new TypeConstraint(body, new FlatTuple(var_Tt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TypeDeclaration")));
              // 	TypeDeclaration.bodyDeclarations(Tt,Bod)
              new TypeConstraint(body, new FlatTuple(var_Tt), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TypeDeclaration")));
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new TypeConstraint(body, new FlatTuple(var_Tt, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "AbstractTypeDeclaration", "bodyDeclarations")));
              new TypeConstraint(body, new FlatTuple(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration")));
              new Equality(body, var__virtual_0_, var_Bod);
              // 	MethodDeclaration(Bod)
              new TypeConstraint(body, new FlatTuple(var_Bod), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
              // 	MethodDeclaration.modifier.static(Bod,true)
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, true);
              new TypeConstraint(body, new FlatTuple(var_Bod), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new TypeConstraint(body, new FlatTuple(var_Bod, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration", "modifier")));
              new TypeConstraint(body, new FlatTuple(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Modifier")));
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new TypeConstraint(body, new FlatTuple(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Modifier", "static")));
              new TypeConstraint(body, new FlatTuple(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EBoolean")));
              new Equality(body, var__virtual_3_, var__virtual_1_);
              // 	MethodDeclaration.returnType.type(Bod,Tt)
              new TypeConstraint(body, new FlatTuple(var_Bod), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
              PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
              new TypeConstraint(body, new FlatTuple(var_Bod, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration", "returnType")));
              new TypeConstraint(body, new FlatTuple(var__virtual_4_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TypeAccess")));
              PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
              new TypeConstraint(body, new FlatTuple(var__virtual_4_, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "TypeAccess", "type")));
              new TypeConstraint(body, new FlatTuple(var__virtual_5_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Type")));
              new Equality(body, var__virtual_5_, var_Tt);
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
  
  private static boolean evaluateExpression_1_1() {
    return true;
  }
}
