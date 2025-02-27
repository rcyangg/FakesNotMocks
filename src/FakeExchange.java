public class FakeExchange implements Exchange {

  @Override
  public float rate(String origin, String target) {
    // Return a fixed exchange rate for testing purposes
    // For example, 1 USD = 0.85 Euro
    return 0.85f;
  }
}
