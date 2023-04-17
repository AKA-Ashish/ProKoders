import java.net.*;
import java.util.List;
import java.io.*;

class LabFour_Cookie {
 public static void main(String[] args) throws URISyntaxException {

  // Creating Cookies
  HttpCookie http_cookie_A = new HttpCookie("Cookie1", "Jelly");
  HttpCookie http_cookie_B = new HttpCookie("Cookie2", "Fish");

  // URI for loading Cookies
  URI uri_one = new URI("https://www.example.com");
  URI uri_two = new URI("https://www.abc.com");

  // Cookiemanger instance created for managing cookies
  CookieManager cookie_manager = new CookieManager();

  // cookie store instance to handle cookies i.e. add/remove
  CookieStore cookie_store = cookie_manager.getCookieStore();

  // Cookies added to cookiestore
  cookie_store.add(uri_one, http_cookie_A);
  cookie_store.add(uri_two, http_cookie_B);

  // stored cookie lai fetch garera List ma haleko so user can view
  List<?> list = cookie_store.getCookies();
  System.out.println("Stored Cookies : " + list);

  // Removing cookie by uri and cookie name(object)
  cookie_store.remove(uri_one, http_cookie_A);
  System.out.println("After removing (http_cookie_A) : " + list);

  // Removing all stored cookie's
  cookie_store.removeAll();
  System.out.println("RemoveAll() : " + list);

 }
}