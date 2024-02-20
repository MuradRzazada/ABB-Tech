package org.Practise.StreamApi;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
    Function<String,Integer> function = new Function<String, Integer>() {
        @Override
        public Integer apply(String string) {
            return Integer.parseInt(string);
        }
    };
        System.out.println(function.apply("45"));
    }

    Predicate<Double> predicate = new Predicate<Double>() {
        @Override
        public boolean test(Double aDouble) {
            return aDouble.intValue()>20;
        }
    };

}
