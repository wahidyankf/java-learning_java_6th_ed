package ch07_collections_and_generics.examples;

public class GenericsDemo {
  public static void main(String[] args) {

    var list = new MyList<String>(2);

    list.add("Hello");

    System.out.println(list);
  }
}

class MyList<E> {
  private E[] elements;
  private int size;

  public MyList(int size) {
    this.size = size;
  }

  public void add(E e) {
    elements[size++] = e;
  }

  public Object get(int index) {
    return elements[index];
  }

  public int size() {
    return size;
  }
}