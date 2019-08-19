package se.mushtaq.designpatterns.structural.proxy;

import se.mushtaq.designpatterns.structural.PatternTest;

/**
 * <p>
 *
 * </p>
 *
 * @author MJameel
 * @since 8/10/2019
 **/
public class ProxyPatternTest implements PatternTest
{
  public void run()
  {

    final Payment cashPayment = new Cash();
    final Payment creditCardPayment = new CreditCard(cashPayment);

    cashPayment.pay(500);
    creditCardPayment.pay(1500);
  }
}
