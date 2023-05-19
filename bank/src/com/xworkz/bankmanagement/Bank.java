package com.xworkz.bankmanagement;

public class Bank {
  private int bankId; //1
  private long accountNo;  //9876543210987654
  private String bankName;  //SBI
  private String accountType;  //Salary
  private String ifscCode;  //SBI4567890
  private String location;  //Bengaluru
  
  public int getBankId() {
    return bankId;
  }
  
  public void setBankId(int bankId) {
    this.bankId = bankId;
  }
  
  public long getAccountNo() {
    return accountNo;
  }
  
  public void setAccountNo(long accountNo) {
    this.accountNo = accountNo;
  }
  
  public String getBankName() {
    return bankName;
  }
  
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }
  
  public String getAccountType() {
    return accountType;
  }
  
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }
  
  public String getIfscCode() {
    return ifscCode;
  }
  
  public void setIfscCode(String ifscCode) {
    this.ifscCode = ifscCode;
  }
  
  public String getLocation() {
    return location;
  }
  
  public void setLocation(String location) {
    this.location = location;
  }
}
