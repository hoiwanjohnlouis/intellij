/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix42.enums;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum221BenchmarkCurveNameTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @BeforeAll
    static void beforeAll() {
    }

    @AfterAll
    static void afterAll() {
    }

    @Test
    void Enum0221Test() {
        Enum221BenchmarkCurveName enumType;

        enumType = Enum221BenchmarkCurveName.EONIA;
        enumType = Enum221BenchmarkCurveName.EUREPO;
        enumType = Enum221BenchmarkCurveName.EURIBOR;
        enumType = Enum221BenchmarkCurveName.FUTURESWAP;
        enumType = Enum221BenchmarkCurveName.LIBID;
        enumType = Enum221BenchmarkCurveName.LIBOR;
        enumType = Enum221BenchmarkCurveName.MUNIAAA;
        enumType = Enum221BenchmarkCurveName.OTHER;
        enumType = Enum221BenchmarkCurveName.PFANDBRIEFE;
        enumType = Enum221BenchmarkCurveName.SONIA;
        enumType = Enum221BenchmarkCurveName.SWAP;
        enumType = Enum221BenchmarkCurveName.TREASURY;

        assertEquals(1,1);
        assertNotEquals(2,1);
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}