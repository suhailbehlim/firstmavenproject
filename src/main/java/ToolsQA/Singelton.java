package ToolsQA;

class Singelton {
    //step- make a private property 
    private static Singelton instance = new Singelton();
  
    //step- make a private constructor so that we cannot instantiate the class
    private Singelton(){}
  
    //step-make public static method for instance
    public static Singelton getInstance(){
       return instance;
    }
  
    public void printMessage(){
       System.out.println("Hello from Singleton object!!!");
    }
 }
  
  class Main {
    public static void main(String[] args) {
  
       Singelton object = Singelton.getInstance();
  
       //show the message
       object.printMessage();
    }
 }