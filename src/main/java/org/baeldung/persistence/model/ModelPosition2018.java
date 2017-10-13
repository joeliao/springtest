package org.baeldung.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="model_position2018")
public class ModelPosition2018 {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Override
	public String toString() {
		return "ModelPosition2018 [id=" + id + ", subsum=" + subsum + ", sum=" + sum + ", position=" + position + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getSubsum() {
		return subsum;
	}

	public void setSubsum(int subsum) {
		this.subsum = subsum;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name="小计")
    private int subsum;
    
    @Column(name="累计")
    private int sum;

    @Column(name="位次")
    private String position;    
    
    
}

