package hometask.six.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * Created by horsey on 23.01.16.
 */
public class Bibliographer {
    public static void main(String[] args) {

        Book book1236 = new Book("Stephen Hawking", "A Brief History of Time. Black Holes and Baby Universes. The Theory of Everything", 3000, 2012, 512, BookGenre.SCIENCE);
        //System.out.println(book1236.toString());
        BiblioItem itemOne = new BiblioItem(book1236, "Ivan Hohlov");
        //System.out.println(itemOne.toString());

        reflector(book1236);
        //reflector(itemOne);


    }

    public static void reflector(Object obj) {
        Class reflector = obj.getClass();
        Package pack = reflector.getPackage();
        int modifiers = reflector.getModifiers();
        System.out.println("=====================" + "\n" + "class package: " + pack.getName() + "\n" + Modifier.toString(modifiers) + " " + "class: " + reflector.getSimpleName());

        Class[] interfaces = reflector.getInterfaces();
        System.out.println("=====================" + "\n" + "extends: " + reflector.getSuperclass().getSimpleName());

        System.out.print("=====================" + "\n" + "implements interfaces: ");
        for (int i = 0; i < interfaces.length; i++) {
            System.out.print(interfaces[i].getSimpleName() + " " + "\n");
        }

        System.out.println("=====================" + "\n" + "class fields: " + "\n");
        Field[] fields = reflector.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(Modifier.toString(f.getModifiers()) + " " + f.getType() + " " + f.getName() + " ");
        }

        Method[] methods = reflector.getDeclaredMethods();
        System.out.println("=====================" + "\n" + "methods and annotations:" + "\n");
        for (Method m : methods) {
            Annotation[] annotations = m.getDeclaredAnnotations();
            for (Annotation a : annotations) {
                System.out.println("@" + a.toString() + " ");
                if (a.toString().contains("DummyAnnotation")){
                    try {
                        m.invoke(obj, "Random String");
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }

            }
            Type type = m.getReturnType();
            System.out.println(Modifier.toString(m.getModifiers()) + " " + type.getTypeName() + " " + m.getName());
        }
    }
}

