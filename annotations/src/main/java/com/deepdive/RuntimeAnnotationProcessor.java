package com.deepdive;

import java.lang.reflect.Method;

public class RuntimeAnnotationProcessor {

    public static void processClassAnnotations(Class<?> clazz) {
        if (clazz.isAnnotationPresent(RequestForEnhancement.class)) {
            RequestForEnhancement rfe = clazz.getAnnotation(RequestForEnhancement.class);
            printAnnotationDetails(rfe);
        }

        // Ayrıca, sınıfın metodlarını veya alanlarını da işleyebilirsiniz.
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RequestForEnhancement.class)) {
                RequestForEnhancement rfe = method.getAnnotation(RequestForEnhancement.class);
                printAnnotationDetails(rfe);
            }
        }
    }

    private static void printAnnotationDetails(RequestForEnhancement rfe) {
        System.out.println("RequestForEnhancement Details:");
        System.out.println("ID: " + rfe.id());
        System.out.println("Synopsis: " + rfe.synopsis());
        System.out.println("Engineer: " + rfe.engineer());
        System.out.println("Date: " + rfe.date());
    }
}
