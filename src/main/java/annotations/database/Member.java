//: annotations/database/Member.java
package annotations.database;

@DBTable(name = "MEMBER") //数据库的表
public class Member {
  @SQLString(30) String firstName; //字符串
  @SQLString(50) String lastName; //字符串
  @SQLInteger Integer age; //整型
  @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
  String handle; //句柄为主键
  static int memberCount; //计数器
  public String getHandle() { return handle; }
  public String getFirstName() { return firstName; }
  public String getLastName() { return lastName; }
  public String toString() { return handle; }
  public Integer getAge() { return age; }
} ///:~
