package guru.springframework;

public class JavaHelloWorldTest {

  public void getHello() {
    JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
    assert("Hello World".equals(javaHelloWorld.getHello()));
  }
}