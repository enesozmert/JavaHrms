package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {
	
    @Id
    @GeneratedValue
    @Column(name="id")
	private int id;
    
    @Column(name="mail")
	private String mail;
	
    @Column(name="password")
	private String password;
    
    @Column(name="year_birth")
	private String yearBirth;
}
