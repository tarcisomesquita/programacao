
public class mainPonto {
   public float x,y;
   public mainPonto(float ax,float ay) {
      this.x = ax; this.y = ay;
   }
   
   public void move(float dx,float dy) {
      this.x+=dx; this.y+=dy;
   }
   
   public String toString() {
      return "("+this.x+","+this.y+")"; // (x,y)
   }
   
   public void mostra() {
      System.out.println("("+this.x+","+this.y+")");
   }
   
   public boolean igual(mainPonto outro) {
      return ((outro.x == this.x) && (outro.y == this.y)); // this == outro?
   }
}
