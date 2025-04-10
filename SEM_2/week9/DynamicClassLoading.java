package week9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class DynamicClassLoading {
    private static final Logger logger = LoggerFactory.getLogger(DynamicClassLoading.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the full class name to load (e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();

        try {

            logger.info("Attempting to load class: {}", className);

            //Class<?> loadedClass  ---> Declares a variable that can hold any class type.
            //Class.forName(className) ---> Dynamically loads the class

            Class<?> loadedClass = Class.forName(className);  // This may throw ClassNotFoundException

            logger.info("Class '{}' loaded successfully!", loadedClass.getName());

        } catch (ClassNotFoundException e) {
            logger.error("ClassNotFoundException: The class '{}' was not found!", className);

        } finally {
            scanner.close();
        }


    }
}

