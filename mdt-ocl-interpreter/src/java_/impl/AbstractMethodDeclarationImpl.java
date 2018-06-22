/**
 */
package java_.impl;

import java.util.Collection;

import java_.AbstractMethodDeclaration;
import java_.AbstractMethodInvocation;
import java_.Block;
import java_.Java_Package;
import java_.MethodRef;
import java_.SingleVariableDeclaration;
import java_.TypeAccess;
import java_.TypeParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_.impl.AbstractMethodDeclarationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link java_.impl.AbstractMethodDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link java_.impl.AbstractMethodDeclarationImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link java_.impl.AbstractMethodDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link java_.impl.AbstractMethodDeclarationImpl#getUsagesInDocComments <em>Usages In Doc Comments</em>}</li>
 *   <li>{@link java_.impl.AbstractMethodDeclarationImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractMethodDeclarationImpl extends BodyDeclarationImpl implements AbstractMethodDeclaration {
	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Block body;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration> parameters;

	/**
	 * The cached value of the '{@link #getThrownExceptions() <em>Thrown Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAccess> thrownExceptions;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getUsagesInDocComments() <em>Usages In Doc Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsagesInDocComments()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodRef> usagesInDocComments;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractMethodInvocation> usages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMethodDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_Package.eINSTANCE.getAbstractMethodDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		Block oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java_Package.ABSTRACT_METHOD_DECLARATION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_Package.ABSTRACT_METHOD_DECLARATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_Package.ABSTRACT_METHOD_DECLARATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.ABSTRACT_METHOD_DECLARATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleVariableDeclaration> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<SingleVariableDeclaration>(SingleVariableDeclaration.class, this, Java_Package.ABSTRACT_METHOD_DECLARATION__PARAMETERS, Java_Package.SINGLE_VARIABLE_DECLARATION__METHOD_DECLARATION);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAccess> getThrownExceptions() {
		if (thrownExceptions == null) {
			thrownExceptions = new EObjectContainmentEList<TypeAccess>(TypeAccess.class, this, Java_Package.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS);
		}
		return thrownExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<TypeParameter>(TypeParameter.class, this, Java_Package.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodRef> getUsagesInDocComments() {
		if (usagesInDocComments == null) {
			usagesInDocComments = new EObjectWithInverseResolvingEList<MethodRef>(MethodRef.class, this, Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS, Java_Package.METHOD_REF__METHOD);
		}
		return usagesInDocComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractMethodInvocation> getUsages() {
		if (usages == null) {
			usages = new EObjectWithInverseResolvingEList<AbstractMethodInvocation>(AbstractMethodInvocation.class, this, Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES, Java_Package.ABSTRACT_METHOD_INVOCATION__METHOD);
		}
		return usages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_Package.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsagesInDocComments()).basicAdd(otherEnd, msgs);
			case Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_Package.ABSTRACT_METHOD_DECLARATION__BODY:
				return basicSetBody(null, msgs);
			case Java_Package.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case Java_Package.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return ((InternalEList<?>)getThrownExceptions()).basicRemove(otherEnd, msgs);
			case Java_Package.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				return ((InternalEList<?>)getUsagesInDocComments()).basicRemove(otherEnd, msgs);
			case Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES:
				return ((InternalEList<?>)getUsages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Java_Package.ABSTRACT_METHOD_DECLARATION__BODY:
				return getBody();
			case Java_Package.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				return getParameters();
			case Java_Package.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return getThrownExceptions();
			case Java_Package.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
				return getTypeParameters();
			case Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				return getUsagesInDocComments();
			case Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES:
				return getUsages();
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
			case Java_Package.ABSTRACT_METHOD_DECLARATION__BODY:
				setBody((Block)newValue);
				return;
			case Java_Package.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends SingleVariableDeclaration>)newValue);
				return;
			case Java_Package.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				getThrownExceptions().addAll((Collection<? extends TypeAccess>)newValue);
				return;
			case Java_Package.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				getUsagesInDocComments().clear();
				getUsagesInDocComments().addAll((Collection<? extends MethodRef>)newValue);
				return;
			case Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends AbstractMethodInvocation>)newValue);
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
			case Java_Package.ABSTRACT_METHOD_DECLARATION__BODY:
				setBody((Block)null);
				return;
			case Java_Package.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
				return;
			case Java_Package.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				return;
			case Java_Package.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				getUsagesInDocComments().clear();
				return;
			case Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES:
				getUsages().clear();
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
			case Java_Package.ABSTRACT_METHOD_DECLARATION__BODY:
				return body != null;
			case Java_Package.ABSTRACT_METHOD_DECLARATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case Java_Package.ABSTRACT_METHOD_DECLARATION__THROWN_EXCEPTIONS:
				return thrownExceptions != null && !thrownExceptions.isEmpty();
			case Java_Package.ABSTRACT_METHOD_DECLARATION__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES_IN_DOC_COMMENTS:
				return usagesInDocComments != null && !usagesInDocComments.isEmpty();
			case Java_Package.ABSTRACT_METHOD_DECLARATION__USAGES:
				return usages != null && !usages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractMethodDeclarationImpl