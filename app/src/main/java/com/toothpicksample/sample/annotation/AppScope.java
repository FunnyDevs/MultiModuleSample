package com.toothpicksample.sample.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@javax.inject.Scope
@Documented
@Retention(RUNTIME)
public @interface AppScope {
}