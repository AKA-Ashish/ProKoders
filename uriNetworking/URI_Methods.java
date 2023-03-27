package uriNetworking;

import java.net.*;

class URI_Methods {

  public static void main(String[] args) {
    String uri_link = "https://user:password@example.com/search?q=dogs#results";
    String uri_link2 =
      "https://user:password@subdomain.example.com/path/to/page?category=books&sort=price#section-2";

    try {
      URI uri = URI.create(uri_link); // Create URI and Store into 'uri' variable
      URI uri2 = new URI(uri_link2);

      System.out.println("Full URI : " + uri); // Fetch Full URI Link

      System.out.println("URI Scheme : " + uri.getScheme());

      System.out.println("URI Authority : " + uri.getAuthority());

      System.out.println("URI Path : " + uri.getPath());

      System.out.println("URI Query : " + uri.getQuery());

      System.out.println("URI Fragments : " + uri.getFragment());

      System.out.println(
        "parseServerAuthority() : " + uri.parseServerAuthority()
      );

      System.out.println("normalize() : " + uri.normalize());

      //RELATIVIZE() Method
      //Use : Relation Create to reach one URI from Another.
      //Here,baseURI ma imageURI ko image lai use garna paryo vane we can relativize() create a relative URI that points to the image
      URI baseURI = new URI("https://www.example.com/foo/bar.html");
      URI imageURI = new URI("https://www.example.com/foo/images/logo.png");

      //imageURI lai chai baseURI(parent) sanga relate gareko & parentURI can use components of childURI
      URI relativeURI = baseURI.relativize(imageURI);

      System.out.println("Relative URI : " + relativeURI.toString()); // in Simple words,Relation Create gareko

      System.out.println("URI to URL : " + uri.toURL()); // URI to URL convert

      System.out.println("getUserInfo() : " + uri.getUserInfo()); // Fetch userinfo from uri

      System.out.println("getHost() : " + uri.getHost()); // Domain Name

      //checks which URI comes before or after the other in a natural order.
      System.out.println("URI Comapre to : " + uri.compareTo(uri2)); // URI Objects String value Compare

      //true if the two URIs have the same scheme, authority, path, query, and fragment components, and false otherwise.
      System.out.println("URI Equals : " + uri.equals(uri2)); // URI Objects String value Compare

      System.out.println("isAbsolute() : " + uri.isAbsolute()); // True if Scheme available i.e. Http or Https

      //True if isAbsolute->True && scheme-specific part does not begin with Slash character '/'
      //Eg : https:www.google.com
      System.out.println("isOpaque() : " + uri.isOpaque());

      System.out.println("HashCode() : " + uri.hashCode()); // Returns URI hashcode.
      System.out.println("HashCode() : " + uri2.hashCode()); // Returns URI hashcode.

      System.out.println("toASCIIString() : " + uri.toASCIIString());
    } catch (Exception e) {
      System.out.println("Error : " + e.getMessage());
    }
  }
}
