import java.util.ArrayList;

public class OrderedArrayList{
  public ArrayList<Integer> oal;
  public OrderedArrayList(){
    oal = new ArrayList<Integer>();
  }

  public int size(){
    return oal.size();
  }
  public String toString(){
    return oal.toString();
  }
  public int get(int index){
    return oal.get(index);
  }
  public int remove(int index){
    return oal.remove(index);
  }
  public boolean add(int val){
    int i = 0;
    while (i < oal.size()){
      if (val < oal.get(i)){
        oal.add(i,val);
        return true;
      }
      i++;
    }
    oal.add(val);
    return true;
  }

  public static void main(String[] args) {
    OrderedArrayList testing = new OrderedArrayList();
    System.out.println(testing.size());
    for (int i = 0; i < 23; i++) {
      testing.add(i);
    }
    //adding elements out of order, arraylist maintains order
    System.out.println(testing.add(1));
    System.out.println(testing.add(15));
    System.out.println(testing.add(3));
    System.out.println(testing.add(1234));
    System.out.println(testing.toString());
  }
}
