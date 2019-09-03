package main;

@FunctionalInterface
public interface WordFilter {
    boolean isValid(String s);
}
