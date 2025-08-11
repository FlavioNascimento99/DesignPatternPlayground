package chain_example.entities;

import chain_example.abstracts.*;

public class SupportAdvanced extends Support {
   public void dealWith(int level) {
      if (level <= 2) {
         System.out.println("Solved by Level 2 - [Advanced Support]");
      } else if (next != null) {
         next.dealWith(level);
      }
   }
}
