package in.coderinfotech.batchschedule;
// Generated Jan 20, 2018 8:05:27 PM by Hibernate Tools 5.2.6.Final

import java.util.Date;

/**
 * FeesDetails generated by hbm2java
 */
public class FeesDetails implements java.io.Serializable {

	private long feesDetailsId;
	private StudentDetails studentDetails;
	private Date feesPaidDate;
	private String feesReceiptNo;
	private String amount;
	private String tuitionFeesRemaining;

	public FeesDetails() {
	}

	public FeesDetails(long feesDetailsId) {
		this.feesDetailsId = feesDetailsId;
	}

	public FeesDetails(long feesDetailsId, StudentDetails studentDetails, Date feesPaidDate, String feesReceiptNo,
			String amount, String tuitionFeesRemaining) {
		this.feesDetailsId = feesDetailsId;
		this.studentDetails = studentDetails;
		this.feesPaidDate = feesPaidDate;
		this.feesReceiptNo = feesReceiptNo;
		this.amount = amount;
		this.tuitionFeesRemaining = tuitionFeesRemaining;
	}

	public long getFeesDetailsId() {
		return this.feesDetailsId;
	}

	public void setFeesDetailsId(long feesDetailsId) {
		this.feesDetailsId = feesDetailsId;
	}

	public StudentDetails getStudentDetails() {
		return this.studentDetails;
	}

	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	public Date getFeesPaidDate() {
		return this.feesPaidDate;
	}

	public void setFeesPaidDate(Date feesPaidDate) {
		this.feesPaidDate = feesPaidDate;
	}

	public String getFeesReceiptNo() {
		return this.feesReceiptNo;
	}

	public void setFeesReceiptNo(String feesReceiptNo) {
		this.feesReceiptNo = feesReceiptNo;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTuitionFeesRemaining() {
		return this.tuitionFeesRemaining;
	}

	public void setTuitionFeesRemaining(String tuitionFeesRemaining) {
		this.tuitionFeesRemaining = tuitionFeesRemaining;
	}

}
