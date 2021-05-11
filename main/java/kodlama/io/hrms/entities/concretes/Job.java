package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "jobs")
@Data
public class Job {
	@Id
	@GeneratedValue
	@Column(name = "id")
	int id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "category")
	String category;
	
	public Job() {}

	public Job(int id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}
	
	

}
