package chain_example.entities;

import chain_example.abstracts.Support;

public class SupportBasic extends Support {
   public void dealWith(int level) {
      if (level <= 1) {
         System.out.println("Solved by Level 1 - [Basic Support]");
      } else if (next != null) {
         next.dealWith(level);
      }
   }
}
