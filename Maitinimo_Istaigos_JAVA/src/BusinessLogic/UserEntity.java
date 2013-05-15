/**
 * 
 */
package BusinessLogic;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Benas
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class UserEntity {
	private String Name;
	private String Surname;
	private int Age;
	
	public void setName(String name) {
		Name = name;
	}
	public String getName() {
		return Name;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getSurname() {
		return Surname;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getAge() {
		return Age;
	}
	
	@Override
	public String toString(){
		return this.Name + " " + this.Surname + " " + Integer.toString(this.Age);
	}
}