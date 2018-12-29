package hibernate.hibernate.pojo;

import java.util.HashSet;
import java.util.Set;

public class Grade {

	private Integer id;
	private String name;
	private Set classes=new HashSet();;
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Set getClasses() {
		return classes;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setClasses(Set classes) {
		this.classes = classes;
	}
	
}
