package com.office.member;

public class MemberDto {

	private int memNo;	
	private String memId;
	private String memPw;
	private String memMai;
	private String memPhone;
	private String memRegDate;
	private String memModDate;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int memNo, String memId, String memPw, String memMai, String memPhone, String memRegDate,
			String memModDate) {
		
		this.memNo = memNo;
		this.memId = memId;
		this.memPw = memPw;
		this.memMai = memMai;
		this.memPhone = memPhone;
		this.memRegDate = memRegDate;
		this.memModDate = memModDate;
	}
	
	public MemberDto(String memId, String memPw, String memMai, String memPhone) {
		
		this.memId = memId;
		this.memPw = memPw;
		this.memMai = memMai;
		this.memPhone = memPhone;
		
	}

	public int getMemNo() {
		return memNo;
	}

	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemMai() {
		return memMai;
	}

	public void setMemMai(String memMai) {
		this.memMai = memMai;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	public String getMemRegDate() {
		return memRegDate;
	}

	public void setMemRegDate(String memRegDate) {
		this.memRegDate = memRegDate;
	}

	public String getMemModDate() {
		return memModDate;
	}

	public void setMemModDate(String memModDate) {
		this.memModDate = memModDate;
	}
	
	
	
	
	
}
