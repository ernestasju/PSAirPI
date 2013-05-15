/**
 * 
 */
package Web;

import BusinessLogic.UserEntity;
import BusinessLogic.OwnerEntity;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Benas
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class UserController extends Pagecontroller {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private UserEntity userEntity;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private OwnerEntity ownerentity;
	
	public String ProcessUserInformation()
	{
		if(this.userEntity != null){
			return this.userEntity.toString();
		} else {
			return null;
		}
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}
}