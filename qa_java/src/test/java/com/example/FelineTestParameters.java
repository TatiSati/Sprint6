package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;


    @RunWith(Parameterized.class)
    public class FelineTestParameters {
        private final int kittensCount;

        public FelineTestParameters(int kittensCount) {
            this.kittensCount = kittensCount;
        }
        //Параметр.тест
        @Parameterized.Parameters
        public static Object[][] getKittensData() {
            return new Object[][]{
                    {0},
                    {4},
            };
        }

        @Test
        public void getKittensParamKitten() {
            Feline feline = new Feline();
            int actualGetKittens = feline.getKittens(kittensCount);
            Assert.assertEquals(kittensCount, actualGetKittens);
        }
    }
