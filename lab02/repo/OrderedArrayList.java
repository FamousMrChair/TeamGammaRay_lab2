import java.util.ArrayList;

public class OrderedArrayList{
  private ArrayList<Integer> oal;
  public OrderedArrayList(){
    oal = new ArrayList<Integer>();
  }

  public int size(){
    return oal.size();
  }
  public String toString(){
    return oal.toString();
  }
  public Integer get(int index){
    return oal.get(index);
  }
  public Integer remove(int index){
    return oal.remove(index);
  }
  public boolean addLinear(Integer val){
    int i = 0;
    int s = oal.size();
    while (i < s){
      if (val < oal.get(i)){
        oal.add(i,val);
        return true;
      }
      i++;
    }
    oal.add(val);
    return true;
  }

  public void addBinary(Integer val) {
    int min = 0;
    int max = size();
    int index = (size() - 1) / 2;
    while (min != max) {
      if (val > oal.get(index)) {
        min = index;
        max = size() - 1;
        index = (int) Math.floor((max - min) / 2);
      } else {
        max = index;
        min = 0;
        index = (int) Math.floor((max - min) / 2);
      }
      System.out.println(min + "," + max + "," + index);
    }
    oal.add(index, val);
  }

  public static void main(String[] args) {
    OrderedArrayList testing = new OrderedArrayList();
    System.out.println(testing.size());
    for (int i = 0; i < 23; i++) {
      testing.addLinear(i);
    }
    //adding elements out of order, arraylist maintains order
    testing.addLinear((Integer)1);
    testing.addLinear(15);
    testing.addLinear(3);
    testing.addLinear(1234);
    System.out.println(testing.size());
    System.out.println(testing.toString());
    testing.addBinary(25);
    System.out.println(testing.toString());
  }
}
