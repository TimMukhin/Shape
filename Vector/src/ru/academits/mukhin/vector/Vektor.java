package ru.academits.mukhin.vector;

public class Vektor {
        private double[] array;
        private double [] array1;
        private int n;

        public Vektor(double[]array,int n) {
            if (n <= 0) {
                throw new IllegalArgumentException("Недопустимое значение!");
            } else {
                this.n = n;
                for (int i = 0; i<array.length; i++) {
                   this.array[i] = 0;
                    System.out.println(array[i]);
                }
            }
        }

        public Vektor (double [] array,double [] array1) {

        }
    }

