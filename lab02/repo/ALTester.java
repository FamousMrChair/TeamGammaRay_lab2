import java.util.ArrayList;
public class ALTester {

  public boolean sort(ArrayList<Integer> foo){
    for (int i = 0; i < foo.size()-1; i++){
      if (foo.get(i + 1) < foo.get(i)){
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
      int minVal = foo.get(i); 
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
    ALTester test = new ALTester();
    ArrayList<Integer> potato = new ArrayList<Integer>();
    System.out.println(potato);
    for (int i = 0; i < 23; i ++){
      potato.add((int)(Math.random()*23));
    }
    System.out.println(potato);
    System.out.println(test.sort(potato));
    //System.out.println(potato);
    //System.out.println(potato.size());
  }
}
