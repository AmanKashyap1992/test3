package test3;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "USER_REGISTRATION")
public class User {
		@Id
		@Column(name = "user_id")
		private int userid;
		
		@Column(name = "CREATION_DATE")
		private Date createdDate;
		
		@Column(name = "LASTUPDATED_DATE")
		private Date lastupdatedDate;

		
		@Column(name = "FIRST_NAME")
		private String firstName;
		
		@Column(name = "MIDDLE_NAME")
		private String middleName;
		
		@Column(name = "LAST_NAME")
		private String lastName;
		
		@Column(name = "GENDER")
		private String gender;
		
		@Column(name = "ADDRESS")
		private String address;
		
		@Column(name = "CITY")
		private String city;
		
		@Column(name = "STATE")
		private String state;
		
		@Column(name = "COUNTRY")
		private String country;
		
		@Column(name = "POSTAL_CODE")
		private String postalCode;
		
		@Column(name = "EMAIL")
		private String email;
		
		@Column(name = "PHONE")
		private String phoneNumber;
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getPostalCode() {
			return postalCode;
		}
		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public Date getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}
		public Date getLastupdatedDate() {
			return lastupdatedDate;
		}
		public void setLastupdatedDate(Date lastupdatedDate) {
			this.lastupdatedDate = lastupdatedDate;
		}
}
