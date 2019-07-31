import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Practice
 * 我只需要改变配置文件 而不用改变源码
 * 可以无限扩展
 */
public class Practice {

    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();
        FileReader fr = new FileReader("config.txt");
        prop.load(fr);
        fr.close();

        String clazzName = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        System.out.println(clazzName + " - " + methodName);

        Class clazz = Class.forName(clazzName);
        // Constructor con = clazz.getConstructor();
        Object obj = clazz.newInstance();
        System.out.println(obj.getClass().getName());
        Method method = clazz.getMethod(methodName);
        method.invoke(obj);

    }
}