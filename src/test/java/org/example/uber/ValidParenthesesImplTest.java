package org.example.uber;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParenthesesImplTest
{

    @ParameterizedTest
    @MethodSource("provideTestData")
    void test(String str, boolean expectedResult)
    {
        boolean actualResult = ValidParenthesesImpl.isValid(str);
        assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> provideTestData()
    {
        return Stream.of(
                Arguments.of("()", true),
                Arguments.of("()[]{}", true),
                Arguments.of("(]", false),
                Arguments.of("()[{{}}{}]{}", true)
        );
    }

}