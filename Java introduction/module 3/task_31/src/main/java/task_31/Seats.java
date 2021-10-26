package task_31;

public class Seats {
     final private int number;
     final private int row;
     private boolean isFree;

     public Seats(int number, int row, boolean isFree) {
          this.number = number;
          this.row = row;
          this.isFree = isFree;
     }
}
