package com.critical.utils;

import java.util.function.IntBinaryOperator;

public class haikang01 {
    enum Solution {
        /**
         * 加
         */
        ADD("+", (a, b) -> a + b),
        /**
         * 减
         */
        SUB("-", (a, b) -> a - b),
        /**
         * 乘
         */
        MUL("*", (a, b) -> a * b),
        /**
         * 除
         */
        DIV("/", (a,  b) -> a / b);

        private final String symbol;
        private final IntBinaryOperator op;

        Solution(String symbol, IntBinaryOperator op) {
            this.symbol = symbol;
            this.op = op;
        }

        public int apply(int a, int b) {
            return op.applyAsInt(a, b);
        }
    }
}
