/**
  * 1.Problemes :
  *     -L'interface Printer est 'trop grosse' (Riche en fonctionalites)
  *     Toute classe devant implementer cette interface devra
  *     toutes ses methodes : soucis d'Inefficacite
  *     -De plus si deux classes A et B dependent de Printer,
  *     le fait de modifier Printer pour le compte de A v induire
  *     une modification de B. Il y'a ici un Probleme de couplage
  *     fort entre A, B et Printer.
  *
  * 2.Cela va necessiter une modification de la classe SimplePrinter
  *   Cela cree un couplage fort entre SimplePrinter, Printer et la classe
  *   en question
  *
  * 3.Proposition de solution respectant LSP : Nous allons aggreger l'interface
  *   Printer interfaces moins riches et plus specialisee :
  *      -Printer
  *      -Scanner
  *      -Copier
  *      -Faxer
  *   SimplePrinter va implementer Printer. le Probleme pose au 2
  *   n'aura plus d'incidence sur SimplePrinter.
  *
  *
  */
