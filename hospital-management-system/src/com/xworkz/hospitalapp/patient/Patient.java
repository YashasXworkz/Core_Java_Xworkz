package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.enums.BloodGroup;
import com.xworkz.hospitalapp.enums.DocumentType;
import com.xworkz.hospitalapp.enums.Gender;
import com.xworkz.hospitalapp.location.Address;
import com.xworkz.hospitalapp.enums.WardNumber;
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
  private boolean isInsuranceAvailable;
  private Address address;
}
