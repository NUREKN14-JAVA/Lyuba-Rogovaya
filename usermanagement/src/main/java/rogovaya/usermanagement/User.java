package rogovaya.usermanagement;

import java.util.Calendar;
import java.util.Date;

public class User {
	private long id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getFullName() {
		return this.getFirstName() + ", " + this.getLastName();
	}
	public Object getAge() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int currYear = calendar.get(Calendar.YEAR);
		calendar.setTime(getDateOfBirth());
		int year  = calendar.get(Calendar.YEAR);
		return currYear - year;
		
		
		
		
	}
}
