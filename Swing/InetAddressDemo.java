import java.net.Inet4Address;
import java.util.Arrays;
import java.net.InetAddress;
public class InetAddressDemo
{
    public static void main(String[] arg) throws Exception
    {
        InetAddress ip =  Inet4Address.getByName("www.linkedin.com");
        System.out.println("ip : "+ip);
            System.out.print("\nAddress : " +Arrays.toString(ip.getAddress()));
        System.out.print("\nHost Address : " +ip.getHostAddress());

        System.out.print("\nisSiteLocalAddress : " +ip.isSiteLocalAddress());

    }
}  