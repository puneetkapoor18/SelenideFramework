package org.selenide.tags.suite;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import java.lang.annotation.*;

@Tag("regression")
@Tag("smoke")
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Test
public @interface RegressionTest {
}
