import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        try{
            // This is an absolute URI: it contains all of the uri components broken down below.
            URI uri = new URI("http://username:password@myserver.com:500/catalogue/phones?os=android#samsung");
            // Converting uri to url
            URL url = uri.toURL();
            System.out.println("URL = " + url);

            // We could also have a relative URI that we resolve using a base uri.
            URI baseUri = new URI("http://username:password@mynewserver.com:500");
            URI relativeUri1 = new URI("/catalogue/phones?os=android#samsung");
            URI relativeUri2 = new URI("/catalogue/tvs?manufacturer=samsung");
            URI relativeUri3 = new URI("/stores/locations?zip=12345");

            URI resolvedUri1 = baseUri.resolve(relativeUri1);
            URI resolvedUri2 = baseUri.resolve(relativeUri2);
            URI resolvedUri3 = baseUri.resolve(relativeUri3);

            URL url1 = resolvedUri1.toURL();
            System.out.println("URL from resolved uri: " + url1);
            URL url2 = resolvedUri2.toURL();
            System.out.println("URL from resolved uri: " + url2);
            URL url3 = resolvedUri3.toURL();
            System.out.println("URL from resolved uri: " + url3);

            // Breakdown of URI components
            System.out.println("Scheme = " + uri.getScheme());
            System.out.println("Scheme-specific part = " + uri.getSchemeSpecificPart());
            System.out.println("Authority = " + uri.getAuthority());
            System.out.println("User info = " + uri.getUserInfo());
            System.out.println("Host = " + uri.getHost());
            System.out.println("Port = " + uri.getPort());
            System.out.println("Path = " + uri.getPath());
            System.out.println("Query = " + uri.getQuery());
            System.out.println("Fragment = " + uri.getFragment());

        } catch (URISyntaxException e) {
            System.out.println("URI Bad Syntax: " + e.getMessage());
        } catch (MalformedURLException e) {
            System.out.println("URL Malformed: " + e.getMessage());
        }
    }
}
