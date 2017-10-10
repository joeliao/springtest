package org.baeldung.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="model_system_view")
public class ModelSystemView {
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name="省份")
    private String province;

	@Override
	public String toString() {
		return "SystemView [id=" + id + ", province=" + province + "]";
	}
    
    
}

