package edu.epam.fop.lambdas;

import java.util.function.Function;

@FunctionalInterface
public interface ThrowingFunction <T,R,E extends Throwable>{

    R apply (T t) throws E;
    static <T, R, E extends Throwable> Function <T,R> quiet (ThrowingFunction <T,R,E> throwingFunction){
        if (throwingFunction !=null){
            return (input) -> {
                try {
                    return throwingFunction.apply(input);
                } catch (Throwable ex) {
                    throw new RuntimeException(ex.getMessage(), ex);
                }
            };
        }
        return null;
    }
}
