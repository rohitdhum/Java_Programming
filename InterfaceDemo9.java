interface A 
{
    int no = 11;
    void fun();

    private void Display()
    {
        
        System.out.println("Inside gun");
       
    }
    
    default void gun()
    {
        
        System.out.println("Inside gun");
       
    }
}

class Demo implements A   
{
    public void fun()
    {
        System.out.println("Inside fun");   
    } 
    private void Display()
    {
        System.out.println("Inside private Display"); 
    }
}

class InterfaceDemo9
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.fun();
        dobj.gun();
      //  dobj.Display();  //Error
    }
}