package fr.uvsq.coo.GROUPE3;


/**
  *@name Robot
  *
  */
class Robot
{
    private Position position;
    private Direction direction;

    public void tourner(){/* tourne d'1/4 de tour */}
    public void avance(){/* avance d'1 case */}
    public static void avancerTous(ArrayList<Robot> listRobots)
    {
      /*Faire avancer tous les robots.*/
      for(Robot robot : listRobots)
      {
        robot.avancer();
      }
    }

}
