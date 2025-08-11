package main;

import abstracts.Support;
import chain_example.entities.SupportAdvanced;
import chain_example.entities.SupportBasic;

public class Main {
   public static void main(String[] args) {
      Support basic     = new SupportBasic();
      Support advanced  = new SupportAdvanced();

      basic.setNext(advanced);

      basic.dealWith(1);
      basic.dealWith(2);
      basic.dealWith(3);
   }
}
