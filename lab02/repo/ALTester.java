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
  public static ArrayList<Integer> arrange(ArrayList<Integer> foo){
    ArrayList<Integer> Sorted = new ArrayList<Integer>();
    ArrayList<Integer> Hold = new ArrayList<Integer>();
    for (int i = 0; i < foo.size(); i ++){
      Hold.add(foo.get(i));
    }
    System.out.println("Sorted:" + Sorted.size());
    for (int i = 0; i < foo.size(); i ++){
      int minVal = foo.get(i); // This line is fucked up bro
      for (int j = 0; j < Hold.size(); j ++){
        if (Hold.get(j) < minVal){
          minVal = foo.get(j);
        }
      }
      System.out.println("minVal " + minVal);
      Hold.remove(0);
      System.out.println("Hold "+Hold);
      Sorted.add(minVal);
    }
    System.out.println(Sorted);
    return Sorted;
  }
  public static void main(String[] args){
    ArrayList<Integer> potato = new ArrayList<Integer>();
    System.out.println(potato);
    for (int i = 0; i < 3; i ++){
      potato.add((int)(Math.random()*23));
    }
    System.out.println(potato);
    System.out.println(arrange(potato));
    //System.out.println(potato);
    //System.out.println(potato.size());
  }
}
