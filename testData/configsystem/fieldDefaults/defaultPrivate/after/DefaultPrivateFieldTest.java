import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class DefaultPrivateFieldTest {
  private int a = 0;
  private String b = "";

  public static void main(String[] args) throws Exception {
    Field field = DefaultPrivateFieldTest.class.getDeclaredField("a");
    System.out.println(Modifier.isPrivate(field.getModifiers()));
  }
}
