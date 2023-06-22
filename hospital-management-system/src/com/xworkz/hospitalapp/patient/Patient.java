package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.bloodgroup.BloodGroup;
import com.xworkz.hospitalapp.documenttype.DocumentType;
import com.xworkz.hospitalapp.gender.Gender;
import com.xworkz.hospitalapp.isinsuranceavailable.IsInsuranceAvailable;
import com.xworkz.hospitalapp.wardnumber.WardNumber;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Patient {
  private int patientId;
  private String patientName;
  public Gender gender;
  private int age;
  public BloodGroup bloodGroup;
  private String diseaseName;
  private long phoneNumber;
  private String address;
  public WardNumber wardNumber;
  public DocumentType documentType;
  private String documentNumber;
  public IsInsuranceAvailable isInsuranceAvailable;
}
