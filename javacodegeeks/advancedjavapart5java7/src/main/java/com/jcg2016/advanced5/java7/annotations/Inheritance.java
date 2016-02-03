package com.jcg2016.advanced5.java7.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Inheritance {
    @Target( { ElementType.TYPE } )
    @Retention( RetentionPolicy.RUNTIME )
    @Inherited
    @interface InheritableAnnotation {        
    }
    
    @InheritableAnnotation
    public class Parent {        
    }
    
    public class Child extends Parent {       
    }    
}
