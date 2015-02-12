package com.google.gson;


/** 
 * This is a configurable {@link ExclusionStrategy} that can be used for
 * unit testing.
 * 
 * @author Joel Leitch
 */
final class MockExclusionStrategy implements ExclusionStrategy {
    private final boolean skipClass;

    private final boolean skipField;

    public MockExclusionStrategy(boolean skipClass ,boolean skipField) {
        this.skipClass = skipClass;
        this.skipField = skipField;
    }

    public boolean shouldSkipField(FieldAttributes f) {
        return skipField;
    }

    public boolean shouldSkipClass(Class<?> clazz) {
        return skipClass;
    }
}

