//: annotations/database/DBTable.java
package annotations.database;
import java.lang.annotation.*;

@Target(ElementType.TYPE) // Applies to classes only
@Retention(RetentionPolicy.RUNTIME)
//定义一个注解 表明其为一个数据库表 用在类上的
public @interface DBTable {
  public String name() default "";
} ///:~
