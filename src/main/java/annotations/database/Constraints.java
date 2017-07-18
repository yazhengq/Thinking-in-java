//: annotations/database/Constraints.java
package annotations.database;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
//定义一个注解 关于表里的 字段 约束
public @interface Constraints {
  boolean primaryKey() default false;
  boolean allowNull() default true;
  boolean unique() default false;

  // 注意 注解的类型 是这样写的 ***SuperAnno*** name();
} ///:~
