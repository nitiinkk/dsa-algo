public class RealInternet implements Internet {
    @Override
    public void connectTo(String host) throws Exception {
        System.out.println("Connecting to " + host);
    }
}
