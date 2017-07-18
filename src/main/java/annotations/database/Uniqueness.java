//: annotations/database/Uniqueness.java
// Sample of nested annotations
package annotations.database;

//定义注解 唯一性约束
public @interface Uniqueness {
  Constraints constraints()
    default @Constraints(unique=true);
} ///:~
