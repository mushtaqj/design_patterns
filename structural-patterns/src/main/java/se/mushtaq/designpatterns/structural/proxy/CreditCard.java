package se.mushtaq.designpatterns.structural.proxy;

/**
 * <p>
 * TODO - Explain What does this class do ?
 * </p>
 *
 * @author MJameel
 * @since 8/19/2019
 **/
public class CreditCard implements Payment
{
  private final Payment cashPayment;

  public CreditCard(final Payment cashPayment)
  {
    this.cashPayment = cashPayment;
  }

  public void pay(double amount)
  {
    System.out.printf("Paying %.2f LKR using credit card\n", amount);
    this.cashPayment.pay(amount);
  }
}
