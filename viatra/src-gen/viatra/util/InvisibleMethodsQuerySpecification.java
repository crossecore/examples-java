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
import viatra.InvisibleMethodsMatch;
import viatra.InvisibleMethodsMatcher;

/**
 * A pattern-specific query specification that can instantiate InvisibleMethodsMatcher in a type-safe way.
 * 
 * @see InvisibleMethodsMatcher
 * @see InvisibleMethodsMatch
 * 
 */
@SuppressWarnings("all")
public final class InvisibleMethodsQuerySpecification extends BaseGeneratedEMFQuerySpecification<InvisibleMethodsMatcher> {
  private InvisibleMethodsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static InvisibleMethodsQuerySpecification instance() throws ViatraQueryException {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected InvisibleMethodsMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return InvisibleMethodsMatcher.on(engine);
  }
  
  @Override
  public InvisibleMethodsMatcher instantiate() throws ViatraQueryException {
    return InvisibleMethodsMatcher.create();
  }
  
  @Override
  public InvisibleMethodsMatch newEmptyMatch() {
    return InvisibleMethodsMatch.newEmptyMatch();
  }
  
  @Override
  public InvisibleMethodsMatch newMatch(final Object... parameters) {
    return InvisibleMethodsMatch.newMatch((java_.MethodDeclaration) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link InvisibleMethodsQuerySpecification} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link InvisibleMethodsQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static InvisibleMethodsQuerySpecification INSTANCE = new InvisibleMethodsQuerySpecification();
    
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
    private final static InvisibleMethodsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pMet = new PParameter("Met", "java_.MethodDeclaration", (IInputKey)null, PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pMet);
    
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
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, (IQueryBackendFactory)null));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
          {
              PBody body = new PBody(this);
              PVariable var_Met = body.getOrCreateVariableByName("Met");
              PVariable var__Cl = body.getOrCreateVariableByName("_Cl");
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_Met, parameter_pMet)
              ));
              // 	ClassDeclaration.bodyDeclarations(_Cl, Met)
              new TypeConstraint(body, new FlatTuple(var__Cl), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "ClassDeclaration")));
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new TypeConstraint(body, new FlatTuple(var__Cl, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "AbstractTypeDeclaration", "bodyDeclarations")));
              new TypeConstraint(body, new FlatTuple(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration")));
              new Equality(body, var__virtual_0_, var_Met);
              // 	MethodDeclaration(Met)
              new TypeConstraint(body, new FlatTuple(var_Met), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
              // 	MethodDeclaration.modifier.visibility(Met,VisibilityKind::private)
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "VisibilityKind", "private").getInstance());
              new TypeConstraint(body, new FlatTuple(var_Met), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new TypeConstraint(body, new FlatTuple(var_Met, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration", "modifier")));
              new TypeConstraint(body, new FlatTuple(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Modifier")));
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new TypeConstraint(body, new FlatTuple(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Modifier", "visibility")));
              new TypeConstraint(body, new FlatTuple(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "VisibilityKind")));
              new Equality(body, var__virtual_3_, var__virtual_1_);
              bodies.add(body);
          }
          {
              PBody body = new PBody(this);
              PVariable var_Met = body.getOrCreateVariableByName("Met");
              PVariable var__Cl = body.getOrCreateVariableByName("_Cl");
              body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
                 new ExportedParameter(body, var_Met, parameter_pMet)
              ));
              // 	ClassDeclaration.bodyDeclarations(_Cl, Met)
              new TypeConstraint(body, new FlatTuple(var__Cl), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "ClassDeclaration")));
              PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
              new TypeConstraint(body, new FlatTuple(var__Cl, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "AbstractTypeDeclaration", "bodyDeclarations")));
              new TypeConstraint(body, new FlatTuple(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration")));
              new Equality(body, var__virtual_0_, var_Met);
              // 	MethodDeclaration(Met)
              new TypeConstraint(body, new FlatTuple(var_Met), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
              // 	MethodDeclaration.modifier.visibility(Met,VisibilityKind::protected)
              PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
              new ConstantValue(body, var__virtual_1_, getEnumLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "VisibilityKind", "protected").getInstance());
              new TypeConstraint(body, new FlatTuple(var_Met), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "MethodDeclaration")));
              PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
              new TypeConstraint(body, new FlatTuple(var_Met, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "BodyDeclaration", "modifier")));
              new TypeConstraint(body, new FlatTuple(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Modifier")));
              PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
              new TypeConstraint(body, new FlatTuple(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "Modifier", "visibility")));
              new TypeConstraint(body, new FlatTuple(var__virtual_3_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_", "VisibilityKind")));
              new Equality(body, var__virtual_3_, var__virtual_1_);
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
