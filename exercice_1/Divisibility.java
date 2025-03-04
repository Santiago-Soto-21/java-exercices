/** 
 * Exercice 1 dans le cadre du devoir 1
 */
import java.util.Scanner;
import java.util.InputMismatchException;


/**
 * Class principal
 * @author theGholem
 * @author ayman-lahdili
 */
public class Divisibility{

  private int a, b; // les deux valeurs à comparer

  /**
   * Constructeur pour la class Divisibility
   * @param a
   * @param b
   */
  public Divisibility(int a, int b){
    this.a=a;
    this.b=b;
  }

  /**
   *  Imprime si le nombre a est divisble par le nombre b ou vice-versa
   */
  public void isDisvisible() {
    if ( this.a%this.b == 0 ){
      System.out.println(this.a+" est divisible par "+this.b+" .");
    } else if ( this.a%this.b!=0 && this.b%this.a == 0 ) {
      System.out.println(this.a+" n'est pas divisible par "+this.b+" . \nPar contre "+this.b+" est divisible par "+this.a);
    } else {
      System.out.println("Aucun des deux n'est divisible par l'autre");
    }
  }


  public static void main(String[]args) {

    System.out.println("-----> EXO1 \n");
    Scanner input = new Scanner(System.in);

    
    try {

      System.out.println("Veuillez saisir le entier nombre svp");
      int n1 = input.nextInt();
      System.out.println("Veuillez saisir le second entier svp");
      int n2 = input.nextInt();

      Divisibility isD = new Divisibility(n1,n2);
      isD.isDisvisible();

    } catch (InputMismatchException e) {
      System.out.println("Error : "+e.getMessage()+"/nLe type int est attendu");
    }

    input.close();

  }

}
