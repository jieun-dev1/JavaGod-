package c.inheritance; 

public class InheritanceCasting {
  public static void main(String args[]){
    InheritanceCasting inheritance = new InheritanceCasting(); 
    inheritance.objectCast2();
    }
    
//    public void objectCast() {
//      ParentCasting parent = new ParentCasting(); 
//      ChildCasting child = new ChildCasting(); 
//      ParentCasting parent2 = child; //�ڽ� Ŭ�������� �θ� Ŭ������ �� ��ȯ�� �� ������  
//      ChildCasting child2 = (ChildCasting)parent; //�θ� Ŭ�������� �ڽ� Ŭ������ �� ��ȯ�� ���� ����
//  }
  
    public void objectCast2() {
    ChildCasting child = new ChildCasting();
    ParentCasting parent2 = child; //ChildCasting�� ��ü. �θ�Ÿ�������� ����ȯ�� ������. 
    ChildCasting child2 = (ChildCasting)parent2; //parent2�� ParentCasting Ŭ������ ��ü�� ��ó�� ��������, �����δ� ChildCasting�� ��ü��. �׷��� ����ȯ�ص� ������ ����. 
    }
    
  }