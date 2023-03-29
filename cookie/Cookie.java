package cookie;

import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

public class Cookie {

  public static void main(String[] args) {
    // Creating dummy Links for URI
    String link_one = "www.jelly.com";
    String link_two = "www.fish.com";

    // URI's using Dummy Links
    URI uri_one = URI.create(link_one);
    URI uri_two = URI.create(link_two);

    // Creating HTTP Cookie with 'Key' 'Value' Pairs
    HttpCookie cookie_one = new HttpCookie(
      "Cookie_Key_One",
      "Cookie_Value_One"
    );
    HttpCookie cookie_two = new HttpCookie(
      "Cookie_Key_Two",
      "Cookie_Value_Two"
    );

    // cookie_manager used to manage cookies i.e. Add Cookie accoring to HTTP Response and Fetch Cookie according to HTTP Request
    CookieManager cookie_manager = new CookieManager();

    // cookie_store uses cookie_manager method called getCookieStore() to retrieve the cookies that are managed by the cookie manager.
    CookieStore cookie_store = cookie_manager.getCookieStore();

    // cookie_store ma yo cookie yo link ko ho vanera store gareko
    // cookie_one is cookie of uri_one..
    cookie_store.add(uri_one, cookie_one);
    cookie_store.add(uri_two, cookie_two);

    // list stores all the cookies stored in cookie_store in ArrayForm[]
    List list = cookie_store.getCookies();
    System.out.println("Stored Cookies : " + list);

    // Removing Cookie by name
    cookie_store.remove(uri_one, cookie_one);
    System.out.println("Removed First Cookie : " + list);

    // Removes all Cookies Stored.
    cookie_store.removeAll();
    System.out.println("RemoveAll() : " + list);
  }
}
