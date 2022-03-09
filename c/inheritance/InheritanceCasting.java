package c.inheritance; 

public class InheritanceCasting {
  public static void main(String args[]){
    InheritanceCasting inheritance = new InheritanceCasting(); 
    inheritance.objectCast2();
    }
    
//    public void objectCast() {
//      ParentCasting parent = new ParentCasting(); 
//      ChildCasting child = new ChildCasting(); 
//      ParentCasting parent2 = child; //자식 클래스에서 부모 클래스로 형 변환할 수 있지만  
//      ChildCasting child2 = (ChildCasting)parent; //부모 클래스에서 자식 클래스로 형 변환할 수는 없음
//  }
  
    public void objectCast2() {
    ChildCasting child = new ChildCasting();
    ParentCasting parent2 = child; //ChildCasting의 객체. 부모타입으로의 형변환은 무관함. 
    ChildCasting child2 = (ChildCasting)parent2; //parent2는 ParentCasting 클래스의 객체인 것처럼 보이지만, 실제로는 ChildCasting의 객체임. 그래서 형변환해도 문제가 없다. 
    }
    
  }