package java_.impl;


import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java_.BodyDeclaration;
import java_.ClassDeclaration;
import java_.Java_Package;
import java_.Java_Tables;
import java_.Modifier;
import java_.Test;
import java_.TypeAccess;
import java_.VisibilityKind;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanOrOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_.impl.TestImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestImpl extends MinimalEObjectImpl.Container implements Test {
	/**
	 * The cached value of the '{@link #getThrownExceptions() <em>Thrown Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> thrownExceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_Package.Literals.TEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAccess> getThrownExceptions() {
		if (thrownExceptions == null) {
			thrownExceptions = new EObjectResolvingEList<TypeAccess>(TypeAccess.class, this, Java_Package.TEST__THROWN_EXCEPTIONS);
		}
		return thrownExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BodyDeclaration> thrownExceptions2() {
		/**
		 *
		 * ClassDeclaration.allInstances()
		 * ->collect(bodyDeclarations)
		 * ->select(each | each.oclIsTypeOf(MethodDeclaration))
		 * ->select(each |
		 *   not each.modifier.oclIsUndefined() and
		 *   not each.modifier.visibility.oclIsUndefined() and
		 *   (each.modifier.visibility = VisibilityKind::private or each.modifier.visibility = VisibilityKind::protected
		 *   ))
		 * ->asSequence()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_ClassDeclaration_0 = idResolver.getClass(Java_Tables.CLSSid_ClassDeclaration, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Java_Tables.SET_CLSSid_ClassDeclaration, TYP_java__c_c_ClassDeclaration_0);
		/*@Thrown*/ BagValue.Accumulator accumulator = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_BodyDeclaration);
		/*@NonNull*/ Iterator<Object> ITERATOR__1 = allInstances.iterator();
		/*@NonInvalid*/ BagValue collect;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ ClassDeclaration _1 = (ClassDeclaration)ITERATOR__1.next();
			/**
			 * bodyDeclarations
			 */
			final /*@NonInvalid*/ List<BodyDeclaration> bodyDeclarations = _1.getBodyDeclarations();
			final /*@NonInvalid*/ OrderedSetValue BOXED_bodyDeclarations = idResolver.createOrderedSetOfAll(Java_Tables.ORD_CLSSid_BodyDeclaration, bodyDeclarations);
			//
			for (Object value : BOXED_bodyDeclarations.flatten().getElements()) {
				accumulator.add(value);
			}
		}
		/*@Thrown*/ BagValue.Accumulator accumulator_0 = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_BodyDeclaration);
		/*@NonNull*/ Iterator<Object> ITERATOR_each = collect.iterator();
		/*@NonInvalid*/ BagValue select_0;
		while (true) {
			if (!ITERATOR_each.hasNext()) {
				select_0 = accumulator_0;
				break;
			}
			/*@NonInvalid*/ BodyDeclaration each = (BodyDeclaration)ITERATOR_each.next();
			/**
			 * each.oclIsTypeOf(MethodDeclaration)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_MethodDeclaration_0 = idResolver.getClass(Java_Tables.CLSSid_MethodDeclaration, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, each, TYP_java__c_c_MethodDeclaration_0).booleanValue();
			//
			if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
				accumulator_0.add(each);
			}
		}
		/*@Thrown*/ BagValue.Accumulator accumulator_1 = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_BodyDeclaration);
		/*@NonNull*/ Iterator<Object> ITERATOR_each_0 = select_0.iterator();
		/*@Thrown*/ BagValue select;
		while (true) {
			if (!ITERATOR_each_0.hasNext()) {
				select = accumulator_1;
				break;
			}
			/*@NonInvalid*/ BodyDeclaration each_0 = (BodyDeclaration)ITERATOR_each_0.next();
			/**
			 *
			 * not each.modifier.oclIsUndefined() and
			 * not each.modifier.visibility.oclIsUndefined() and
			 * (each.modifier.visibility = VisibilityKind::private or each.modifier.visibility = VisibilityKind::protected
			 * )
			 */
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_and;
			try {
				final /*@NonInvalid*/ Modifier modifier = each_0.getModifier();
				final /*@NonInvalid*/ boolean symbol_0 = modifier == null;
				final /*@NonInvalid*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(symbol_0);
				/*@Caught*/ /*@NonNull*/ Object CAUGHT_visibility;
				try {
					if (modifier == null) {
						throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_\'::Modifier::visibility\'");
					}
					final /*@Thrown*/ VisibilityKind visibility = modifier.getVisibility();
					CAUGHT_visibility = visibility;
				}
				catch (Exception e) {
					CAUGHT_visibility = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean symbol_1 = CAUGHT_visibility instanceof InvalidValueException;
				final /*@NonInvalid*/ Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(symbol_1);
				final /*@Thrown*/ Boolean and = BooleanAndOperation.INSTANCE.evaluate(not, not_0);
				CAUGHT_and = and;
			}
			catch (Exception e) {
				CAUGHT_and = ValueUtil.createInvalidValue(e);
			}
			/*@Caught*/ /*@Nullable*/ Object CAUGHT_or;
			try {
				/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq;
				try {
					final /*@NonInvalid*/ Modifier modifier_1 = each_0.getModifier();
					if (modifier_1 == null) {
						throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_\'::Modifier::visibility\'");
					}
					final /*@Thrown*/ VisibilityKind visibility_0 = modifier_1.getVisibility();
					final /*@Thrown*/ EnumerationLiteralId BOXED_visibility_0 = Java_Tables.ENUMid_VisibilityKind.getEnumerationLiteralId(ClassUtil.nonNullState(visibility_0.getName()));
					final /*@Thrown*/ boolean eq = BOXED_visibility_0 == Java_Tables.ELITid_private;
					CAUGHT_eq = eq;
				}
				catch (Exception e) {
					CAUGHT_eq = ValueUtil.createInvalidValue(e);
				}
				/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq_0;
				try {
					final /*@NonInvalid*/ Modifier modifier_2 = each_0.getModifier();
					if (modifier_2 == null) {
						throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_\'::Modifier::visibility\'");
					}
					final /*@Thrown*/ VisibilityKind visibility_1 = modifier_2.getVisibility();
					final /*@Thrown*/ EnumerationLiteralId BOXED_visibility_1 = Java_Tables.ENUMid_VisibilityKind.getEnumerationLiteralId(ClassUtil.nonNullState(visibility_1.getName()));
					final /*@Thrown*/ boolean eq_0 = BOXED_visibility_1 == Java_Tables.ELITid_protected;
					CAUGHT_eq_0 = eq_0;
				}
				catch (Exception e) {
					CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or = BooleanOrOperation.INSTANCE.evaluate(CAUGHT_eq, CAUGHT_eq_0);
				CAUGHT_or = or;
			}
			catch (Exception e) {
				CAUGHT_or = ValueUtil.createInvalidValue(e);
			}
			final /*@Thrown*/ Boolean and_0 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_and, CAUGHT_or);
			if (and_0 == null) {
				throw new InvalidValueException("Null body for \'Bag(T).select(Bag.T[?] | Lambda T() : Boolean[1]) : Bag(T)\'");
			}
			//
			if (and_0 == ValueUtil.TRUE_VALUE) {
				accumulator_1.add(each_0);
			}
		}
		final /*@Thrown*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE.evaluate(select);
		final /*@Thrown*/ List<BodyDeclaration> ECORE_asSequence = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(BodyDeclaration.class, asSequence);
		return (EList<BodyDeclaration>)ECORE_asSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_Package.TEST__THROWN_EXCEPTIONS:
				return getThrownExceptions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Java_Package.TEST__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				getThrownExceptions().addAll((Collection<? extends TypeAccess>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Java_Package.TEST__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Java_Package.TEST__THROWN_EXCEPTIONS:
				return thrownExceptions != null && !thrownExceptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Java_Package.TEST___THROWN_EXCEPTIONS2:
				return thrownExceptions2();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TestImpl