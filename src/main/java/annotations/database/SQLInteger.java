//: annotations/database/SQLInteger.java
package annotations.database;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
//定义一个注解 关于表里的 数据类型 String Integer
public @interface SQLInteger {
  String name() default "";
  Constraints constraints() default @Constraints;
} ///:~
