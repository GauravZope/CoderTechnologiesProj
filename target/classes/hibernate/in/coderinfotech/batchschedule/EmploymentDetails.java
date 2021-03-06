package hibernate.in.coderinfotech.batchschedule;
// Generated Jan 22, 2018 5:23:28 PM by Hibernate Tools 5.2.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EmploymentDetails generated by hbm2java
 */
@Entity
@Table(name = "employment_details", catalog = "coderspringmvc")
public class EmploymentDetails implements java.io.Serializable {

	private long employmentDetailsId;
	private String employer;
	private String positionHeld;
	private Date dateOfJoining;
	private Date dateOfLeaving;
	private String payWithScaleOfPay;

	public EmploymentDetails() {
	}

	public EmploymentDetails(long employmentDetailsId) {
		this.employmentDetailsId = employmentDetailsId;
	}

	public EmploymentDetails(long employmentDetailsId, String employer, String positionHeld, Date dateOfJoining,
			Date dateOfLeaving, String payWithScaleOfPay) {
		this.employmentDetailsId = employmentDetailsId;
		this.employer = employer;
		this.positionHeld = positionHeld;
		this.dateOfJoining = dateOfJoining;
		this.dateOfLeaving = dateOfLeaving;
		this.payWithScaleOfPay = payWithScaleOfPay;
	}

	@Id

	@Column(name = "EMPLOYMENT_DETAILS_ID", unique = true, nullable = false)
	public long getEmploymentDetailsId() {
		return this.employmentDetailsId;
	}

	public void setEmploymentDetailsId(long employmentDetailsId) {
		this.employmentDetailsId = employmentDetailsId;
	}

	@Column(name = "EMPLOYER", length = 100)
	public String getEmployer() {
		return this.employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	@Column(name = "POSITION_HELD", length = 50)
	public String getPositionHeld() {
		return this.positionHeld;
	}

	public void setPositionHeld(String positionHeld) {
		this.positionHeld = positionHeld;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OF_JOINING", length = 10)
	public Date getDateOfJoining() {
		return this.dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OF_LEAVING", length = 10)
	public Date getDateOfLeaving() {
		return this.dateOfLeaving;
	}

	public void setDateOfLeaving(Date dateOfLeaving) {
		this.dateOfLeaving = dateOfLeaving;
	}

	@Column(name = "PAY_WITH_SCALE_OF_PAY", length = 35)
	public String getPayWithScaleOfPay() {
		return this.payWithScaleOfPay;
	}

	public void setPayWithScaleOfPay(String payWithScaleOfPay) {
		this.payWithScaleOfPay = payWithScaleOfPay;
	}

}
