package org.baeldung.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="model_majorname")
public class ModelMajorName {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	@Override
	public String toString() {
		return "ModeMajorName [id=" + id + ", colledgeCode2017=" + colledgeCode2017 + ", colledgeName2017="
				+ colledgeName2017 + ", majorCode2017=" + majorCode2017 + ", majorName2017=" + majorName2017
				+ ", colledgeCode2016=" + colledgeCode2016 + ", colledgeName2016=" + colledgeName2016
				+ ", majorCode2016=" + majorCode2016 + ", majorName2016=" + majorName2016 + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getColledgeCode2017() {
		return colledgeCode2017;
	}
	public void setColledgeCode2017(String colledgeCode2017) {
		this.colledgeCode2017 = colledgeCode2017;
	}
	public String getColledgeName2017() {
		return colledgeName2017;
	}
	public void setColledgeName2017(String colledgeName2017) {
		this.colledgeName2017 = colledgeName2017;
	}
	public String getMajorCode2017() {
		return majorCode2017;
	}
	public void setMajorCode2017(String majorCode2017) {
		this.majorCode2017 = majorCode2017;
	}
	public String getMajorName2017() {
		return majorName2017;
	}
	public void setMajorName2017(String majorName2017) {
		this.majorName2017 = majorName2017;
	}
	public String getColledgeCode2016() {
		return colledgeCode2016;
	}
	public void setColledgeCode2016(String colledgeCode2016) {
		this.colledgeCode2016 = colledgeCode2016;
	}
	public String getColledgeName2016() {
		return colledgeName2016;
	}
	public void setColledgeName2016(String colledgeName2016) {
		this.colledgeName2016 = colledgeName2016;
	}
	public String getMajorCode2016() {
		return majorCode2016;
	}
	public void setMajorCode2016(String majorCode2016) {
		this.majorCode2016 = majorCode2016;
	}
	public String getMajorName2016() {
		return majorName2016;
	}
	public void setMajorName2016(String majorName2016) {
		this.majorName2016 = majorName2016;
	}
	@Column(name="2017院校代码")
    private String colledgeCode2017;
    @Column(name="2017院校名称")
    private String colledgeName2017;
    @Column(name="2017专业代码")
    private String majorCode2017;
    @Column(name="2017专业名称")
    private String majorName2017;
    @Column(name="2016院校代码")
    private String colledgeCode2016;
    @Column(name="2016院校名称")
    private String colledgeName2016;
    @Column(name="2016专业代码")
    private String majorCode2016;
    @Column(name="2016专业名称")
    private String majorName2016;
}

