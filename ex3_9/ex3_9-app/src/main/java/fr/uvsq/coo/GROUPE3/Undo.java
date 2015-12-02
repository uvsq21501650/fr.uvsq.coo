package fr.uvsq.coo.GROUPE3;
import java.util.Stack;

class Undo extends Command
{
  protected Stack history;
  public Undo(Stack h)
  {
    history=h;
  }
  @override
  public void execute()
  {
    ((Command) history.top()).undo();
  }
  @override
  public void undo(){}
}
