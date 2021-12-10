import java.util.ArrayList;
public class ALTester {
  public boolean sort(ArrayList<Integer> foo){
    for (int i = 0; i < foo.length; i++){
      if (foo[i + 1] < foo[i]){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    ArrayList<Integer> potato = new ArrayList<Integer>();
    System.out.println(potato);
    for (int i = 0; i < 23; i ++){
      potato.add((int)(Math.random()*23));
    }
    System.out.println(potato);
    System.out.println(sort(potato));
  }
}
