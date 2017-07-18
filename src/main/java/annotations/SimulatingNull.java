//: annotations/SimulatingNull.java
package annotations; /* Added by Eclipse.py */
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SimulatingNull {
  //不能有null 所以这些都是习惯性用法
  public int id() default -1;
  public String description() default "";
} ///:~
