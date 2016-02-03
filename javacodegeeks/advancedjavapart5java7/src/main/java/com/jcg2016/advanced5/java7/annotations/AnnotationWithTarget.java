package com.jcg2016.advanced5.java7.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target( { ElementType.FIELD, ElementType.METHOD } )
public @interface AnnotationWithTarget {    
}
