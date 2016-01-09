package fr.uvsq.coo.GROUPE3.DAO;

public abstract class DAO<T>
{
    public abstract  T create(T obj);
    public abstract  T find(String nom);
    public abstract  T update(T t);
    public abstract  void delete(T t);
}

