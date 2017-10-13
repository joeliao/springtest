package org.baeldung.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="model_admission2017")
public class ModelAdmission2017 {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @Override
	public String toString() {
		return "ModelAdmission2017 [id=" + id + ", colledgeCode=" + colledgeCode + ", colledgeName=" + colledgeName
				+ ", majorCode=" + majorCode + ", majorName=" + majorName + ", order=" + order + ", subject=" + subject
				+ ", number=" + number + ", avgScore=" + avgScore + ", lowestScore=" + lowestScore + ", callNumber="
				+ callNumber + ", level=" + level + ", province=" + province + ", region=" + region + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getColledgeCode() {
		return colledgeCode;
	}
	public void setColledgeCode(String colledgeCode) {
		this.colledgeCode = colledgeCode;
	}
	public String getColledgeName() {
		return colledgeName;
	}
	public void setColledgeName(String colledgeName) {
		this.colledgeName = colledgeName;
	}
	public String getMajorCode() {
		return majorCode;
	}
	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAvgScore() {
		return avgScore;
	}
	public void setAvgScore(int avgScore) {
		this.avgScore = avgScore;
	}
	public int getLowestScore() {
		return lowestScore;
	}
	public void setLowestScore(int lowestScore) {
		this.lowestScore = lowestScore;
	}
	public String getCallNumber() {
		return callNumber;
	}
	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Column(name="院校代码")
    private String colledgeCode;
    @Column(name="院校名称")
    private String colledgeName;
    @Column(name="专业代码")
    private String majorCode;
    @Column(name="专业名称")
    private String majorName;
    @Column(name="批次")
    private String order;
    @Column(name="科类")
    private String subject;
    @Column(name="人数")
    private int number;
    @Column(name="平均分")
    private int avgScore;
    @Column(name="最低分")
    private int lowestScore;
    @Column(name="名次号")
    private String callNumber;
    @Column(name="层次")
    private String level;
    @Column(name="省市")
    private String province;
    @Column(name="所在地")
    private String region;
}

