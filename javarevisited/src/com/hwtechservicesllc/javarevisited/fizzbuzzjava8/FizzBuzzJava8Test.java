package com.hwtechservicesllc.javarevisited.fizzbuzzjava8;

/**
 * Copyright 8/22/2015 by HW Tech Services, Inc., LLC
 * <p>
 * Package com.hwtechservices.javarevisited.FizzBuzzJava8
 * Project FizzBuzzJava8
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
 **/

import org.junit.Assert;
import org.junit.Test;

/** JUnit tests for our three FizzBuzz solution, including two in Java 8.
 * @author WINDOWS 8
 */

public class FizzBuzzJava8Test {

    @Test public void testWithNumberIsDividableBy3() { Assert.assertEquals("Fizz", FizzBuzzJava8.fizzBuzz(3)); Assert.assertEquals("Fizz", FizzBuzzJava8.fizzBuzzInJava8(3)); Assert.assertEquals("Fizz", FizzBuzzJava8.fizzBuzzSolutionJava8(3)); } @Test public void testWithNumberIsDividableBy5() { Assert.assertEquals("Buzz", FizzBuzzJava8.fizzBuzz(5)); Assert.assertEquals("Buzz", FizzBuzzJava8.fizzBuzzInJava8(5)); Assert.assertEquals("Buzz", FizzBuzzJava8.fizzBuzzSolutionJava8(5)); } @Test public void testWithNumberIsDividableBy15() { Assert.assertEquals("FizzBuzz", FizzBuzzJava8.fizzBuzz(15)); Assert.assertEquals("FizzBuzz", FizzBuzzJava8.fizzBuzzInJava8(15)); Assert.assertEquals("FizzBuzz", FizzBuzzJava8.fizzBuzzSolutionJava8(15)); Assert.assertEquals("FizzBuzz", FizzBuzzJava8.fizzBuzz(45)); Assert.assertEquals("FizzBuzz", FizzBuzzJava8.fizzBuzzInJava8(45)); Assert.assertEquals("FizzBuzz", FizzBuzzJava8.fizzBuzzSolutionJava8(45)); } @Test public void testOtherNumbers() { Assert.assertEquals("1", FizzBuzzJava8.fizzBuzz(1)); Assert.assertEquals("1", FizzBuzzJava8.fizzBuzzInJava8(1)); Assert.assertEquals("1", FizzBuzzJava8.fizzBuzzSolutionJava8(1)); Assert.assertEquals("7", FizzBuzzJava8.fizzBuzz(7)); Assert.assertEquals("7", FizzBuzzJava8.fizzBuzzInJava8(7)); Assert.assertEquals("7", FizzBuzzJava8.fizzBuzzSolutionJava8(7)); }


}
