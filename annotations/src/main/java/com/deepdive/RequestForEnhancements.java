package com.deepdive;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@interface RequestForEnhancements {
    RequestForEnhancement[] value();
}
