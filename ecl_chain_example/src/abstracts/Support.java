package abstracts;

public abstract class Support {
   protected Support next;
   public void setNext(Support next) {
      this.next = next;
   }
   public abstract void dealWith(int level);
}
