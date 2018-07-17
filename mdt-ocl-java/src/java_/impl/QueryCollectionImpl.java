/**
 */
package java_.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java_.ASTNode;
import java_.BodyDeclaration;
import java_.ClassDeclaration;
import java_.Comment;
import java_.CompilationUnit;
import java_.Java_Package;
import java_.Java_Tables;
import java_.Javadoc;
import java_.MethodDeclaration;
import java_.Model;
import java_.Modifier;
import java_.QueryCollection;
import java_.TagElement;
import java_.TextElement;
import java_.Type;
import java_.TypeAccess;
import java_.TypeDeclaration;

import java_.VisibilityKind;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanOrOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QueryCollectionImpl extends MinimalEObjectImpl.Container implements QueryCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_Package.Literals.QUERY_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BodyDeclaration> thrownExceptions() {
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
				final /*@NonInvalid*/ boolean oclIsUndefined = modifier == null;
				final /*@NonInvalid*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsUndefined);
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
				final /*@NonInvalid*/ boolean oclIsUndefined_0 = CAUGHT_visibility instanceof InvalidValueException;
				final /*@NonInvalid*/ Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(oclIsUndefined_0);
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
	@SuppressWarnings("unchecked")
	public EList<TypeDeclaration> grabats09() {
		/**
		 *
		 * TypeDeclaration.allInstances()
		 * ->select(each |
		 *   each.bodyDeclarations->exists(bd |
		 *     bd.oclIsTypeOf(MethodDeclaration) and
		 *     not bd.modifier.oclIsUndefined() and bd.modifier.static and
		 *     not bd.oclAsType(MethodDeclaration)
		 *     .returnType.oclIsUndefined() and
		 *     bd.oclAsType(MethodDeclaration).returnType.type = each))
		 * ->asSequence()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_TypeDeclaration_0 = idResolver.getClass(Java_Tables.CLSSid_TypeDeclaration, null);
		final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, Java_Tables.SET_CLSSid_TypeDeclaration, TYP_java__c_c_TypeDeclaration_0);
		/*@Thrown*/ SetValue.Accumulator accumulator = ValueUtil.createSetAccumulatorValue(Java_Tables.SET_CLSSid_TypeDeclaration);
		/*@NonNull*/ Iterator<Object> ITERATOR_each = allInstances.iterator();
		/*@Thrown*/ SetValue select;
		while (true) {
			if (!ITERATOR_each.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ TypeDeclaration each = (TypeDeclaration)ITERATOR_each.next();
			/**
			 *
			 * each.bodyDeclarations->exists(bd |
			 *   bd.oclIsTypeOf(MethodDeclaration) and
			 *   not bd.modifier.oclIsUndefined() and bd.modifier.static and
			 *   not bd.oclAsType(MethodDeclaration)
			 *   .returnType.oclIsUndefined() and
			 *   bd.oclAsType(MethodDeclaration).returnType.type = each)
			 */
			final /*@NonInvalid*/ List<BodyDeclaration> bodyDeclarations = each.getBodyDeclarations();
			final /*@NonInvalid*/ OrderedSetValue BOXED_bodyDeclarations = idResolver.createOrderedSetOfAll(Java_Tables.ORD_CLSSid_BodyDeclaration, bodyDeclarations);
			/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
			/*@NonNull*/ Iterator<Object> ITERATOR_bd = BOXED_bodyDeclarations.iterator();
			/*@Thrown*/ Boolean exists;
			while (true) {
				if (!ITERATOR_bd.hasNext()) {
					if (accumulator_0 == null) {
						exists = null;
					}
					else if (accumulator_0 == ValueUtil.FALSE_VALUE) {
						exists = ValueUtil.FALSE_VALUE;
					}
					else {
						throw (InvalidValueException)accumulator_0;
					}
					break;
				}
				/*@NonInvalid*/ BodyDeclaration bd = (BodyDeclaration)ITERATOR_bd.next();
				/**
				 *
				 * bd.oclIsTypeOf(MethodDeclaration) and
				 * not bd.modifier.oclIsUndefined() and bd.modifier.static and
				 * not bd.oclAsType(MethodDeclaration)
				 * .returnType.oclIsUndefined() and
				 * bd.oclAsType(MethodDeclaration).returnType.type = each
				 */
				/*@Caught*/ /*@Nullable*/ Object CAUGHT_and_2;
				try {
					/*@Caught*/ /*@Nullable*/ Object CAUGHT_and_1;
					try {
						/*@Caught*/ /*@Nullable*/ Object CAUGHT_and_0;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_MethodDeclaration_0 = idResolver.getClass(Java_Tables.CLSSid_MethodDeclaration, null);
							final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, bd, TYP_java__c_c_MethodDeclaration_0).booleanValue();
							/*@NonInvalid*/ Boolean and;
							if (oclIsTypeOf) {
								final /*@NonInvalid*/ Modifier modifier = bd.getModifier();
								final /*@NonInvalid*/ boolean oclIsUndefined = modifier == null;
								final /*@NonInvalid*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsUndefined);
								and = not;
							}
							else {
								and = ValueUtil.FALSE_VALUE;
							}
							/*@Caught*/ /*@NonNull*/ Object CAUGHT_symbol_0;
							try {
								final /*@NonInvalid*/ Modifier modifier_0 = bd.getModifier();
								if (modifier_0 == null) {
									throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_\'::Modifier::static\'");
								}
								final /*@Thrown*/ boolean symbol_0 = modifier_0.isStatic();
								CAUGHT_symbol_0 = symbol_0;
							}
							catch (Exception e) {
								CAUGHT_symbol_0 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_0 = BooleanAndOperation.INSTANCE.evaluate(and, CAUGHT_symbol_0);
							CAUGHT_and_0 = and_0;
						}
						catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						/*@Caught*/ /*@Nullable*/ Object CAUGHT_returnType;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_MethodDeclaration_1 = idResolver.getClass(Java_Tables.CLSSid_MethodDeclaration, null);
							final /*@Thrown*/ MethodDeclaration oclAsType = ClassUtil.nonNullState((MethodDeclaration)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, bd, TYP_java__c_c_MethodDeclaration_1));
							final /*@Thrown*/ TypeAccess returnType = oclAsType.getReturnType();
							CAUGHT_returnType = returnType;
						}
						catch (Exception e) {
							CAUGHT_returnType = ValueUtil.createInvalidValue(e);
						}
						final /*@NonInvalid*/ boolean oclIsUndefined_0 = (CAUGHT_returnType == null) || (CAUGHT_returnType instanceof InvalidValueException);
						final /*@NonInvalid*/ Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(oclIsUndefined_0);
						final /*@Thrown*/ Boolean and_1 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_and_0, not_0);
						CAUGHT_and_1 = and_1;
					}
					catch (Exception e) {
						CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
					}
					/*@Caught*/ /*@NonNull*/ Object CAUGHT_eq;
					try {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_MethodDeclaration_2 = idResolver.getClass(Java_Tables.CLSSid_MethodDeclaration, null);
						final /*@Thrown*/ MethodDeclaration oclAsType_0 = ClassUtil.nonNullState((MethodDeclaration)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, bd, TYP_java__c_c_MethodDeclaration_2));
						final /*@Thrown*/ TypeAccess returnType_0 = oclAsType_0.getReturnType();
						if (returnType_0 == null) {
							throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_\'::TypeAccess::type\'");
						}
						final /*@Thrown*/ Type type = returnType_0.getType();
						final /*@Thrown*/ boolean eq = type.equals(each);
						CAUGHT_eq = eq;
					}
					catch (Exception e) {
						CAUGHT_eq = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and_2 = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_and_1, CAUGHT_eq);
					CAUGHT_and_2 = and_2;
				}
				catch (Exception e) {
					CAUGHT_and_2 = ValueUtil.createInvalidValue(e);
				}
				//
				if (CAUGHT_and_2 == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
					exists = ValueUtil.TRUE_VALUE;
					break;														// Stop immediately
				}
				else if (CAUGHT_and_2 == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
					;															// Carry on
				}
				else if (CAUGHT_and_2 == null) {								// Abnormal null body evaluation result
					if (accumulator_0 == ValueUtil.FALSE_VALUE) {
						accumulator_0 = null;										// Cache a null failure
					}
				}
				else if (CAUGHT_and_2 instanceof InvalidValueException) {		// Abnormal exception evaluation result
					accumulator_0 = CAUGHT_and_2;									// Cache an exception failure
				}
				else {															// Impossible badly typed result
					accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
				}
			}
			if (exists == null) {
				throw new InvalidValueException("Null body for \'Set(T).select(Set.T[?] | Lambda T() : Boolean[1]) : Set(T)\'");
			}
			//
			if (exists == ValueUtil.TRUE_VALUE) {
				accumulator.add(each);
			}
		}
		final /*@Thrown*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE.evaluate(select);
		final /*@Thrown*/ List<TypeDeclaration> ECORE_asSequence = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(TypeDeclaration.class, asSequence);
		return (EList<TypeDeclaration>)ECORE_asSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BodyDeclaration> invisibleMethods() {
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
				final /*@NonInvalid*/ boolean oclIsUndefined = modifier == null;
				final /*@NonInvalid*/ Boolean not = BooleanNotOperation.INSTANCE.evaluate(oclIsUndefined);
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
				final /*@NonInvalid*/ boolean oclIsUndefined_0 = CAUGHT_visibility instanceof InvalidValueException;
				final /*@NonInvalid*/ Boolean not_0 = BooleanNotOperation.INSTANCE.evaluate(oclIsUndefined_0);
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
	@SuppressWarnings("unchecked")
	public EList<ASTNode> textElementInJavadoc(final Model self_) {
		/**
		 *
		 * self_.compilationUnits.commentList->select(each |
		 *   each.oclIsTypeOf(Javadoc))
		 * ->collect(o | o.oclAsType(Javadoc).tags)
		 * .fragments->select(each | each.oclIsTypeOf(TextElement))
		 * ->asSequence()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		if (self_ == null) {
			throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_\'::Model::compilationUnits\'");
		}
		final /*@Thrown*/ List<CompilationUnit> compilationUnits = self_.getCompilationUnits();
		final /*@Thrown*/ SetValue BOXED_compilationUnits = idResolver.createSetOfAll(Java_Tables.SET_CLSSid_CompilationUnit, compilationUnits);
		/*@Thrown*/ BagValue.Accumulator accumulator = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_Comment);
		/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_compilationUnits.iterator();
		/*@Thrown*/ BagValue collect_1;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				collect_1 = accumulator;
				break;
			}
			/*@NonInvalid*/ CompilationUnit _1 = (CompilationUnit)ITERATOR__1.next();
			/**
			 * commentList
			 */
			final /*@NonInvalid*/ List<Comment> commentList = _1.getCommentList();
			final /*@NonInvalid*/ OrderedSetValue BOXED_commentList = idResolver.createOrderedSetOfAll(Java_Tables.ORD_CLSSid_Comment, commentList);
			//
			for (Object value : BOXED_commentList.flatten().getElements()) {
				accumulator.add(value);
			}
		}
		/*@Thrown*/ BagValue.Accumulator accumulator_0 = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_Comment);
		/*@NonNull*/ Iterator<Object> ITERATOR_each = collect_1.iterator();
		/*@Thrown*/ BagValue select_0;
		while (true) {
			if (!ITERATOR_each.hasNext()) {
				select_0 = accumulator_0;
				break;
			}
			/*@NonInvalid*/ Comment each = (Comment)ITERATOR_each.next();
			/**
			 * each.oclIsTypeOf(Javadoc)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_Javadoc_0 = idResolver.getClass(Java_Tables.CLSSid_Javadoc, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, each, TYP_java__c_c_Javadoc_0).booleanValue();
			//
			if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
				accumulator_0.add(each);
			}
		}
		/*@Thrown*/ BagValue.Accumulator accumulator_1 = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_TagElement);
		/*@NonNull*/ Iterator<Object> ITERATOR_o = select_0.iterator();
		/*@Thrown*/ BagValue collect_0;
		while (true) {
			if (!ITERATOR_o.hasNext()) {
				collect_0 = accumulator_1;
				break;
			}
			/*@NonInvalid*/ Comment o = (Comment)ITERATOR_o.next();
			/**
			 * o.oclAsType(Javadoc).tags
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_Javadoc_1 = idResolver.getClass(Java_Tables.CLSSid_Javadoc, null);
			final /*@Thrown*/ Javadoc oclAsType = ClassUtil.nonNullState((Javadoc)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, o, TYP_java__c_c_Javadoc_1));
			final /*@Thrown*/ List<TagElement> tags = oclAsType.getTags();
			final /*@Thrown*/ OrderedSetValue BOXED_tags = idResolver.createOrderedSetOfAll(Java_Tables.ORD_CLSSid_TagElement, tags);
			//
			for (Object value : BOXED_tags.flatten().getElements()) {
				accumulator_1.add(value);
			}
		}
		/*@Thrown*/ BagValue.Accumulator accumulator_2 = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_ASTNode);
		/*@NonNull*/ Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
		/*@Thrown*/ BagValue collect;
		while (true) {
			if (!ITERATOR__1_0.hasNext()) {
				collect = accumulator_2;
				break;
			}
			/*@NonInvalid*/ TagElement _1_0 = (TagElement)ITERATOR__1_0.next();
			/**
			 * fragments
			 */
			final /*@NonInvalid*/ List<ASTNode> fragments = _1_0.getFragments();
			final /*@NonInvalid*/ OrderedSetValue BOXED_fragments = idResolver.createOrderedSetOfAll(Java_Tables.ORD_CLSSid_ASTNode, fragments);
			//
			for (Object value : BOXED_fragments.flatten().getElements()) {
				accumulator_2.add(value);
			}
		}
		/*@Thrown*/ BagValue.Accumulator accumulator_3 = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_ASTNode);
		/*@NonNull*/ Iterator<Object> ITERATOR_each_0 = collect.iterator();
		/*@Thrown*/ BagValue select;
		while (true) {
			if (!ITERATOR_each_0.hasNext()) {
				select = accumulator_3;
				break;
			}
			/*@NonInvalid*/ ASTNode each_0 = (ASTNode)ITERATOR_each_0.next();
			/**
			 * each.oclIsTypeOf(TextElement)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_TextElement_0 = idResolver.getClass(Java_Tables.CLSSid_TextElement, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, each_0, TYP_java__c_c_TextElement_0).booleanValue();
			//
			if (oclIsTypeOf_0 == ValueUtil.TRUE_VALUE) {
				accumulator_3.add(each_0);
			}
		}
		final /*@Thrown*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE.evaluate(select);
		final /*@Thrown*/ List<ASTNode> ECORE_asSequence = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(ASTNode.class, asSequence);
		return (EList<ASTNode>)ECORE_asSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ASTNode> emptyTextElementInJavadoc(final Model self_) {
		/**
		 *
		 * self_.compilationUnits.commentList->select(each |
		 *   each.oclIsTypeOf(Javadoc))
		 * ->collect(o | o.oclAsType(Javadoc).tags)
		 * .fragments->select(each | each.oclIsTypeOf(TextElement))
		 * ->select(each | each.oclAsType(TextElement).text.size() = 0)
		 * ->asSequence()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		if (self_ == null) {
			throw new InvalidValueException("Null source for \'\'http://www.eclipse.org/MoDisco/Java/0.2.incubation/java_\'::Model::compilationUnits\'");
		}
		final /*@Thrown*/ List<CompilationUnit> compilationUnits = self_.getCompilationUnits();
		final /*@Thrown*/ SetValue BOXED_compilationUnits = idResolver.createSetOfAll(Java_Tables.SET_CLSSid_CompilationUnit, compilationUnits);
		/*@Thrown*/ BagValue.Accumulator accumulator = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_Comment);
		/*@NonNull*/ Iterator<Object> ITERATOR__1 = BOXED_compilationUnits.iterator();
		/*@Thrown*/ BagValue collect_1;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				collect_1 = accumulator;
				break;
			}
			/*@NonInvalid*/ CompilationUnit _1 = (CompilationUnit)ITERATOR__1.next();
			/**
			 * commentList
			 */
			final /*@NonInvalid*/ List<Comment> commentList = _1.getCommentList();
			final /*@NonInvalid*/ OrderedSetValue BOXED_commentList = idResolver.createOrderedSetOfAll(Java_Tables.ORD_CLSSid_Comment, commentList);
			//
			for (Object value : BOXED_commentList.flatten().getElements()) {
				accumulator.add(value);
			}
		}
		/*@Thrown*/ BagValue.Accumulator accumulator_0 = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_Comment);
		/*@NonNull*/ Iterator<Object> ITERATOR_each = collect_1.iterator();
		/*@Thrown*/ BagValue select_1;
		while (true) {
			if (!ITERATOR_each.hasNext()) {
				select_1 = accumulator_0;
				break;
			}
			/*@NonInvalid*/ Comment each = (Comment)ITERATOR_each.next();
			/**
			 * each.oclIsTypeOf(Javadoc)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_Javadoc_0 = idResolver.getClass(Java_Tables.CLSSid_Javadoc, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, each, TYP_java__c_c_Javadoc_0).booleanValue();
			//
			if (oclIsTypeOf == ValueUtil.TRUE_VALUE) {
				accumulator_0.add(each);
			}
		}
		/*@Thrown*/ BagValue.Accumulator accumulator_1 = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_TagElement);
		/*@NonNull*/ Iterator<Object> ITERATOR_o = select_1.iterator();
		/*@Thrown*/ BagValue collect_0;
		while (true) {
			if (!ITERATOR_o.hasNext()) {
				collect_0 = accumulator_1;
				break;
			}
			/*@NonInvalid*/ Comment o = (Comment)ITERATOR_o.next();
			/**
			 * o.oclAsType(Javadoc).tags
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_Javadoc_1 = idResolver.getClass(Java_Tables.CLSSid_Javadoc, null);
			final /*@Thrown*/ Javadoc oclAsType = ClassUtil.nonNullState((Javadoc)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, o, TYP_java__c_c_Javadoc_1));
			final /*@Thrown*/ List<TagElement> tags = oclAsType.getTags();
			final /*@Thrown*/ OrderedSetValue BOXED_tags = idResolver.createOrderedSetOfAll(Java_Tables.ORD_CLSSid_TagElement, tags);
			//
			for (Object value : BOXED_tags.flatten().getElements()) {
				accumulator_1.add(value);
			}
		}
		/*@Thrown*/ BagValue.Accumulator accumulator_2 = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_ASTNode);
		/*@NonNull*/ Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
		/*@Thrown*/ BagValue collect;
		while (true) {
			if (!ITERATOR__1_0.hasNext()) {
				collect = accumulator_2;
				break;
			}
			/*@NonInvalid*/ TagElement _1_0 = (TagElement)ITERATOR__1_0.next();
			/**
			 * fragments
			 */
			final /*@NonInvalid*/ List<ASTNode> fragments = _1_0.getFragments();
			final /*@NonInvalid*/ OrderedSetValue BOXED_fragments = idResolver.createOrderedSetOfAll(Java_Tables.ORD_CLSSid_ASTNode, fragments);
			//
			for (Object value : BOXED_fragments.flatten().getElements()) {
				accumulator_2.add(value);
			}
		}
		/*@Thrown*/ BagValue.Accumulator accumulator_3 = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_ASTNode);
		/*@NonNull*/ Iterator<Object> ITERATOR_each_0 = collect.iterator();
		/*@Thrown*/ BagValue select_0;
		while (true) {
			if (!ITERATOR_each_0.hasNext()) {
				select_0 = accumulator_3;
				break;
			}
			/*@NonInvalid*/ ASTNode each_0 = (ASTNode)ITERATOR_each_0.next();
			/**
			 * each.oclIsTypeOf(TextElement)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_TextElement_0 = idResolver.getClass(Java_Tables.CLSSid_TextElement, null);
			final /*@NonInvalid*/ boolean oclIsTypeOf_0 = OclAnyOclIsTypeOfOperation.INSTANCE.evaluate(executor, each_0, TYP_java__c_c_TextElement_0).booleanValue();
			//
			if (oclIsTypeOf_0 == ValueUtil.TRUE_VALUE) {
				accumulator_3.add(each_0);
			}
		}
		/*@Thrown*/ BagValue.Accumulator accumulator_4 = ValueUtil.createBagAccumulatorValue(Java_Tables.BAG_CLSSid_ASTNode);
		/*@NonNull*/ Iterator<Object> ITERATOR_each_1 = select_0.iterator();
		/*@Thrown*/ BagValue select;
		while (true) {
			if (!ITERATOR_each_1.hasNext()) {
				select = accumulator_4;
				break;
			}
			/*@NonInvalid*/ ASTNode each_1 = (ASTNode)ITERATOR_each_1.next();
			/**
			 * each.oclAsType(TextElement).text.size() = 0
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_java__c_c_TextElement_1 = idResolver.getClass(Java_Tables.CLSSid_TextElement, null);
			final /*@Thrown*/ TextElement oclAsType_0 = ClassUtil.nonNullState((TextElement)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, each_1, TYP_java__c_c_TextElement_1));
			final /*@Thrown*/ String text = oclAsType_0.getText();
			final /*@Thrown*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(text);
			final /*@Thrown*/ boolean eq = size.equals(Java_Tables.INT_0);
			//
			if (eq == ValueUtil.TRUE_VALUE) {
				accumulator_4.add(each_1);
			}
		}
		final /*@Thrown*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE.evaluate(select);
		final /*@Thrown*/ List<ASTNode> ECORE_asSequence = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(ASTNode.class, asSequence);
		return (EList<ASTNode>)ECORE_asSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Java_Package.QUERY_COLLECTION___THROWN_EXCEPTIONS:
				return thrownExceptions();
			case Java_Package.QUERY_COLLECTION___GRABATS09:
				return grabats09();
			case Java_Package.QUERY_COLLECTION___INVISIBLE_METHODS:
				return invisibleMethods();
			case Java_Package.QUERY_COLLECTION___TEXT_ELEMENT_IN_JAVADOC__MODEL:
				return textElementInJavadoc((Model)arguments.get(0));
			case Java_Package.QUERY_COLLECTION___EMPTY_TEXT_ELEMENT_IN_JAVADOC__MODEL:
				return emptyTextElementInJavadoc((Model)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //QueryCollectionImpl
