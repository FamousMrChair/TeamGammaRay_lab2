import java.util.ArrayList;
public class ALTester {
  public static void main(String[] args){
    ArrayList potato = new ArrayList();
    System.out.println(potato);
    for (int i = 0; i < 23; i ++){
      potato.add((int)(Math.random()*23));
    }
    System.out.println(potato);
  }
}
