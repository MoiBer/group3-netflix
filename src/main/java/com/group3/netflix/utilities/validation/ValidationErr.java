package com.group3.netflix.utilities.validation;

public class ValidationErr {
    public final static String NAME_MANDATORY = "name is mandatory";
    public final static String INTERVAL_RELEASE_YEAR = "release year must be in the range [1900, now)";
    public final static String INTERVAL_USER_RATING = "user rating must be in the interval [0, 10]";
    public final static String NEGATIVE_REVIEW = "number of reviews cannot be negative";
}
