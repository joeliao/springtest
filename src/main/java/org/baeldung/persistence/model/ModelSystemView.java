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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPlannedNumber() {
		return plannedNumber;
	}

	public void setPlannedNumber(int plannedNumber) {
		this.plannedNumber = plannedNumber;
	}

	public String getSelectedTest() {
		return selectedTest;
	}

	public void setSelectedTest(String selectedTest) {
		this.selectedTest = selectedTest;
	}

	public String getMajorCategory() {
		return majorCategory;
	}

	public void setMajorCategory(String majorCategory) {
		this.majorCategory = majorCategory;
	}

	public String getTuition() {
		return tuition;
	}

	public void setTuition(String tuition) {
		this.tuition = tuition;
	}

	public String getCollegeType() {
		return collegeType;
	}

	public void setCollegeType(String collegeType) {
		this.collegeType = collegeType;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getLastOrder() {
		return lastOrder;
	}

	public void setLastOrder(String lastOrder) {
		this.lastOrder = lastOrder;
	}

	public String getLastAdmission() {
		return lastAdmission;
	}

	public void setLastAdmission(String lastAdmission) {
		this.lastAdmission = lastAdmission;
	}

	public String getLastAdmissionScore() {
		return lastAdmissionScore;
	}

	public void setLastAdmissionScore(String lastAdmissionScore) {
		this.lastAdmissionScore = lastAdmissionScore;
	}

	public String getLastPosition() {
		return lastPosition;
	}

	public void setLastPosition(String lastPosition) {
		this.lastPosition = lastPosition;
	}

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name="省份")
    private String province;
    
    @Column(name="城市")
    private String city;

    @Column(name="院校代码")
    private String colledgeCode;
    
    @Column(name="院校名称")
    private String colledgeName;
    
    @Column(name="专业代码")
    private String majorCode;
    
    @Column(name="专业名称")
    private String majorName;
    
    @Column(name="学制")
    private int years;
    
    @Column(name="本专科")
    private String level;
    
    @Column(name="计划数")
    private int plannedNumber;
    
    @Override
	public String toString() {
		return "ModelSystemView [id=" + id + ", province=" + province + ", city=" + city + ", colledgeCode="
				+ colledgeCode + ", colledgeName=" + colledgeName + ", majorCode=" + majorCode + ", majorName="
				+ majorName + ", years=" + years + ", level=" + level + ", plannedNumber=" + plannedNumber
				+ ", selectedTest=" + selectedTest + ", majorCategory=" + majorCategory + ", tuition=" + tuition
				+ ", collegeType=" + collegeType + ", note=" + note + ", lastOrder=" + lastOrder + ", lastAdmission="
				+ lastAdmission + ", lastAdmissionScore=" + lastAdmissionScore + ", lastPosition=" + lastPosition + "]";
	}

	@Column(name="选考科目要求")
    private String selectedTest;
    
    @Column(name="专业大类")
    private String majorCategory;
    
    @Column(name="收费标准")
    private String tuition;
    
    @Column(name="学校类别")
    private String collegeType;
    
    @Column(name="备注")
    private String note;
    
    @Column(name="上年批次")
    private String lastOrder;
    
    @Column(name="上年录取数")
    private String lastAdmission;
    
    @Column(name="上年录取平均分")
    private String lastAdmissionScore;
    
    @Column(name="上年段位")
    private String lastPosition;
    
    
}

