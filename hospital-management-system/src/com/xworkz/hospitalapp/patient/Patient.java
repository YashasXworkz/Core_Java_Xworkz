package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.bloodgroup.BloodGroup;
import com.xworkz.hospitalapp.documenttype.DocumentType;
import com.xworkz.hospitalapp.gender.Gender;
import com.xworkz.hospitalapp.isinsuranceavailable.IsInsuranceAvailable;
import com.xworkz.hospitalapp.location.Address;
import com.xworkz.hospitalapp.wardnumber.WardNumber;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Patient {
  private int patientId;
  private String patientName;
  private Gender gender;
  private int age;
  private BloodGroup bloodGroup;
  private String diseaseName;
  private long phoneNumber;
  private String patientAddress;
  private String attenderName;
  private WardNumber wardNumber;
  private DocumentType documentType;
  private String documentNumber;
  private IsInsuranceAvailable isInsuranceAvailable;
  private Address address;
}
