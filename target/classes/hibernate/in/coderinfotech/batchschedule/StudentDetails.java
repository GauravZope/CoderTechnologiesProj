package hibernate.in.coderinfotech.batchschedule;
// Generated Jan 22, 2018 5:23:28 PM by Hibernate Tools 5.2.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * StudentDetails generated by hbm2java
 */
@Entity
@Table(name = "student_details", catalog = "coderspringmvc")
public class StudentDetails implements java.io.Serializable {

	private long studentId;
	private PersonDetails personDetails;
	private Set<FeesDetails> feesDetailses = new HashSet<FeesDetails>(0);

	public StudentDetails() {
	}

	public StudentDetails(long studentId) {
		this.studentId = studentId;
	}

	public StudentDetails(long studentId, PersonDetails personDetails, Set<FeesDetails> feesDetailses) {
		this.studentId = studentId;
		this.personDetails = personDetails;
		this.feesDetailses = feesDetailses;
	}

	@Id

	@Column(name = "STUDENT_ID", unique = true, nullable = false)
	public long getStudentId() {
		return this.studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STUDENT_PERSON_DETAILS_ID")
	public PersonDetails getPersonDetails() {
		return this.personDetails;
	}

	public void setPersonDetails(PersonDetails personDetails) {
		this.personDetails = personDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentDetails")
	public Set<FeesDetails> getFeesDetailses() {
		return this.feesDetailses;
	}

	public void setFeesDetailses(Set<FeesDetails> feesDetailses) {
		this.feesDetailses = feesDetailses;
	}

}
