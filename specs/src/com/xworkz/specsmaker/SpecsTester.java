package com.xworkz.specsmaker;

import com.xworkz.specsmaker.frames.Frames;
import com.xworkz.specsmaker.specs.Specs;

public class SpecsTester {
  public static void main(String[] args) {
    Frames frames = new Frames();
    Specs specs = new Specs(frames);
    
    specs.frames.adjustFrames();
  }
}
