public class Test {

  public static void main(String[]args){

    MyList<String> l = new MyList<String>();
    l.add("allah");
    l.add("hu");
    l.add("akbar");

    Iterator<String> iter = l.iterator();
    while (iter.hasNext()) {
      System.out.println(iter.next());
    }

    System.out.println();


    for (String string : l) {
       System.out.println(string);
    }
    
    System.out.println();


    Visitor<String> v = new Visitor<String>() {
    @Override
    public boolean visit (String o){
      System.out.println(o);
      return true;
    }
  };

  l.accept(v);
 }
}
