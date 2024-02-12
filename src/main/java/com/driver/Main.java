package com.driver;

public class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
public class B extends A{
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
  B obj = new B();
  String ans = obj.meth();
  System.out.println(ans);
}