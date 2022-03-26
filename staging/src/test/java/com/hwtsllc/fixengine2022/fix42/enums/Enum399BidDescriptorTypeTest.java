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

class Enum399BidDescriptorTypeTest {

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
    void Enum0399Test() {
        Enum399BidDescriptorType enumType;

        /*
         * 1-3 msg types
         */
        enumType = Enum399BidDescriptorType.SECTOR;
        enumType = Enum399BidDescriptorType.COUNTRY;
        enumType = Enum399BidDescriptorType.INDEX;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}