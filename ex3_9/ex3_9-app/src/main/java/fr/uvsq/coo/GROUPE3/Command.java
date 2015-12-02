package fr.uvsq.coo.GROUPE3;

abstract class Command implements clonable
{
  public abstract void execute();
  public abstract void undo();
}
