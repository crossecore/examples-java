/**
 */
package java_.impl;

import java.util.Collection;

import java_.Block;
import java_.CatchClause;
import java_.Java_Package;
import java_.TryStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link java_.impl.TryStatementImpl#getBody <em>Body</em>}</li>
 *   <li>{@link java_.impl.TryStatementImpl#getFinally <em>Finally</em>}</li>
 *   <li>{@link java_.impl.TryStatementImpl#getCatchClauses <em>Catch Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryStatementImpl extends StatementImpl implements TryStatement {
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
	 * The cached value of the '{@link #getFinally() <em>Finally</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinally()
	 * @generated
	 * @ordered
	 */
	protected Block finally_;

	/**
	 * The cached value of the '{@link #getCatchClauses() <em>Catch Clauses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatchClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<CatchClause> catchClauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Java_Package.Literals.TRY_STATEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java_Package.TRY_STATEMENT__BODY, oldBody, newBody);
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
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_Package.TRY_STATEMENT__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_Package.TRY_STATEMENT__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.TRY_STATEMENT__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getFinally() {
		return finally_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinally(Block newFinally, NotificationChain msgs) {
		Block oldFinally = finally_;
		finally_ = newFinally;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Java_Package.TRY_STATEMENT__FINALLY, oldFinally, newFinally);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinally(Block newFinally) {
		if (newFinally != finally_) {
			NotificationChain msgs = null;
			if (finally_ != null)
				msgs = ((InternalEObject)finally_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Java_Package.TRY_STATEMENT__FINALLY, null, msgs);
			if (newFinally != null)
				msgs = ((InternalEObject)newFinally).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Java_Package.TRY_STATEMENT__FINALLY, null, msgs);
			msgs = basicSetFinally(newFinally, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Java_Package.TRY_STATEMENT__FINALLY, newFinally, newFinally));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CatchClause> getCatchClauses() {
		if (catchClauses == null) {
			catchClauses = new EObjectContainmentEList<CatchClause>(CatchClause.class, this, Java_Package.TRY_STATEMENT__CATCH_CLAUSES);
		}
		return catchClauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Java_Package.TRY_STATEMENT__BODY:
				return basicSetBody(null, msgs);
			case Java_Package.TRY_STATEMENT__FINALLY:
				return basicSetFinally(null, msgs);
			case Java_Package.TRY_STATEMENT__CATCH_CLAUSES:
				return ((InternalEList<?>)getCatchClauses()).basicRemove(otherEnd, msgs);
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
			case Java_Package.TRY_STATEMENT__BODY:
				return getBody();
			case Java_Package.TRY_STATEMENT__FINALLY:
				return getFinally();
			case Java_Package.TRY_STATEMENT__CATCH_CLAUSES:
				return getCatchClauses();
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
			case Java_Package.TRY_STATEMENT__BODY:
				setBody((Block)newValue);
				return;
			case Java_Package.TRY_STATEMENT__FINALLY:
				setFinally((Block)newValue);
				return;
			case Java_Package.TRY_STATEMENT__CATCH_CLAUSES:
				getCatchClauses().clear();
				getCatchClauses().addAll((Collection<? extends CatchClause>)newValue);
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
			case Java_Package.TRY_STATEMENT__BODY:
				setBody((Block)null);
				return;
			case Java_Package.TRY_STATEMENT__FINALLY:
				setFinally((Block)null);
				return;
			case Java_Package.TRY_STATEMENT__CATCH_CLAUSES:
				getCatchClauses().clear();
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
			case Java_Package.TRY_STATEMENT__BODY:
				return body != null;
			case Java_Package.TRY_STATEMENT__FINALLY:
				return finally_ != null;
			case Java_Package.TRY_STATEMENT__CATCH_CLAUSES:
				return catchClauses != null && !catchClauses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TryStatementImpl
