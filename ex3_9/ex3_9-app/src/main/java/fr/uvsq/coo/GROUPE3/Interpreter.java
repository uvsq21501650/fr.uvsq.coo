package fr.uvsq.GROUPE3;

import java.util.Stack;
import java.util.Hashtable;
public class Interpreter
{
  protected Stack history=new Stack();
  protected Hashtable set=new Hashtable();

  public void session()
  {
    while(true)
    {
      Command command=getNewCommand();
      if(command instanceof Quit)
      {
        return;
      }
      else
      {
        command.execute();
      }
    }
  }

  abstract protected Command getNewCommand();
}
