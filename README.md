# Java笔记
## 1.0 什么是工厂模式?

工厂模式是为了解决繁琐的new实例化,所以通过一个接口来实现共同对实例化进行统一!

比如,用户需要根据自身语言的不同来选择对应的语言,如何通过工厂模式来创建呢?

- 这是语言包
```java
public class chinese implements I18n {
    public String getTitle(){
        return "欢迎来到我的世界";
    }
}
```

- 定义一个统一的接口
```java
package language;

public interface I18n {
    public String getTitle();
}
```

- 定义一个工厂类
```Java
package language;

public class I18NFactory {
    public static I18n getI18NObject(String area){
        if(area.equals("china")){
            return new chinese();
        }else if(area.equals("Italy")){
            return new Italy();
        }else if(area.equals("japan")){
            return new japan();
        }else{
            return null;
        }
    }
}
```
- 主函数
```java
import language.I18NFactory;
import language.I18n;

public class softwore {
    public static void main(String[] args) {
            I18n i18n = I18NFactory.getI18NObject("Italy");
            System.out.println(i18n.getTitle());

    }
}

```

这个时候用户只要通过自定义选择来创建不同的语言.