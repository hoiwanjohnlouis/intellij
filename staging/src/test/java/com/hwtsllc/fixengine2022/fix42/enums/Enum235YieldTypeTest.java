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

class Enum235YieldTypeTest {

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
    void Enum0235Test() {
        Enum235YieldType enumType;

        enumType = Enum235YieldType.AFTERTAX;
        enumType = Enum235YieldType.ANNUAL;
        enumType = Enum235YieldType.ATISSUE;
        enumType = Enum235YieldType.AVGMATURITY;
        enumType = Enum235YieldType.BOOK;
        enumType = Enum235YieldType.CALL;
        enumType = Enum235YieldType.CHANGE;
        enumType = Enum235YieldType.CLOSE;
        enumType = Enum235YieldType.COMPOUND;
        enumType = Enum235YieldType.CURRENT;
        enumType = Enum235YieldType.GOVTEQUIV;
        enumType = Enum235YieldType.GROSS;
        enumType = Enum235YieldType.INFLATION;
        enumType = Enum235YieldType.INVERSEFLOATER;
        enumType = Enum235YieldType.LASTCLOSE;
        enumType = Enum235YieldType.LASTMONTH;
        enumType = Enum235YieldType.LASTQUARTER;
        enumType = Enum235YieldType.LASTYEAR;
        enumType = Enum235YieldType.LONGAVGLIFE;
        enumType = Enum235YieldType.MARK;
        enumType = Enum235YieldType.MATURITY;
        enumType = Enum235YieldType.NEXTREFUND;
        enumType = Enum235YieldType.OPENAVG;
        enumType = Enum235YieldType.PREVCLOSE;
        enumType = Enum235YieldType.PROCEEDS;
        enumType = Enum235YieldType.PUT;
        enumType = Enum235YieldType.SEMIANNUAL;
        enumType = Enum235YieldType.SHORTAVGLIFE;
        enumType = Enum235YieldType.SIMPLE;
        enumType = Enum235YieldType.TAXEQUIV;
        enumType = Enum235YieldType.TENDER;
        enumType = Enum235YieldType.TRUE;
        enumType = Enum235YieldType.VALUE1_32;
        enumType = Enum235YieldType.WORST;

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