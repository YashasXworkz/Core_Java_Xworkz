package com.xworkz.vidhanasoudhahall;

import com.xworkz.vidhanasoudhahall.cabinet.Cabinet;
import com.xworkz.vidhanasoudhahall.vidhanasoudha.VidhanaSoudha;

public class VidhanaSoudhaTester {
  public static void main(String[] args) {
    Cabinet cabinet = new Cabinet();
    VidhanaSoudha vidhanaSoudha = new VidhanaSoudha(cabinet);
    
    vidhanaSoudha.cabinet.conductMeeting();
  }
}
