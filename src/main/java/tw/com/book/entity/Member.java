package tw.com.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblmember")
public class Member {
	@Id
	@Column(name="id")
	private Integer id;
  
	@Column(name="email", length=100, nullable=false)
	private String email;
  
	@Column(name="password", length=30)
	private String password;
	
	@Column(name="address", length=30)
	private String address;
	
	@Column(name="cellphone", length=30)
	private String cellphone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
}
