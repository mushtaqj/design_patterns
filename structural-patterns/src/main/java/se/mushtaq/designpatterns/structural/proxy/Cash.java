package se.mushtaq.designpatterns.structural.proxy;

/**
 * <p>
 * TODO - Explain What does this class do ?
 * </p>
 *
 * @author MJameel
 * @since 8/19/2019
 **/
public class Cash implements Payment
{
  public void pay(double amount)
  {
    System.out.printf("Paid %.2f LKR in Cash\n",amount);
  }
}
