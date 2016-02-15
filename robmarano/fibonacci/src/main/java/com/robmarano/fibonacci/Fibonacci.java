/***************************************************************************
 * Copyright (c) 2016 HW Tech Services, LLC
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package com.robmarano.fibonacci;

import java.util.ArrayList;

public class Fibonacci {
    // members
    protected int m_fibLength;
    protected long m_fibValue;

    // class fields
    protected static ArrayList<Fibonacci> fibValues;

    // static initializer
    static {
        fibValues = new ArrayList<Fibonacci>();
    }

    // class methods

    // long fib(int n)
    public static long fib(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // Fibonacci getFib(int n)
    public static Fibonacci getFib(int n) {
        Fibonacci returnVal = null;
        for (Fibonacci f: fibValues) {
            if (f.getFibLenth() == n) {
                returnVal = f;
            }
        }
        if (returnVal == null) {
            returnVal = new Fibonacci(n);
        }
        return returnVal;
    }

    // ctor
    public Fibonacci(int n) {
        m_fibLength = n;
        m_fibValue = Fibonacci.fib(n);
        fibValues.add(this);
    }

    // getFibLength()
    public int getFibLenth() {
        return m_fibLength;
    }

    // get FibValue()
    public long getFibValue() {
        return m_fibValue;
    }
}
