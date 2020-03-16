import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class techmeet1
{
  public static void main(String arg[])throws Exception
   {
    mainframe frame=new mainframe();
    frame.setSize(800,600);
    frame.setVisible(true);
    frame.addWindowListener( new WindowAdapter()
     {
      public void windowClosing(WindowEvent we)
       {
        System.exit(0);
       }
     });

   } // end of main

} // end of class