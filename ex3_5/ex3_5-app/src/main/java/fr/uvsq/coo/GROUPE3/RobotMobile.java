package fr.uvsq.coo.GROUPE3

/**
  * Robot qui sait se deplacer
  *
  *
  */
class RobotMobile extends Robot()
{
  @override
  public void avance()
  {
    /* avance d'1 case */
    System.out.println("Je suis un Robot capable d'avancer..")
  }

  @override
  public void tourner()
  {
    /* tourne d'1/4 de tour */
    System.out.println("Je suis un Robot qui sait tourner");
  }

  public static void avancerTous(ArrayList<RobotMobile> listRobots)
  {
    /*Faire avancer tous les robots.*/
    for(Robot robot : listRobots)
    {
      robot.avancer();
    }
  }
}
