//: annotations/PasswordUtils.java
package annotations; /* Added by Eclipse.py */

import java.util.*;

public class PasswordUtils {
    @UseCase(id = 47, description = "Passwords must contain least one numeric")
    //验证密码
    //正则表达式 \转义字符 \w 字母下划线等 * 重复次数 \w*  \d数字
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = 48)
    //加密密码
    //反转后按照字符串输出
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    //验证新密码
    @UseCase(id = 49, description = "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
} ///:~
