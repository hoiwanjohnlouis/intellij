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

class Enum338TradSesMethodTest {
    @Test
    void Enum0338Test() {
        Enum338TradSesMethod enumType;

        /*
         * 1-3 msg types
         */
        enumType = Enum338TradSesMethod.ELECTRONIC;
        enumType = Enum338TradSesMethod.OPEN_OUTCRY;
        enumType = Enum338TradSesMethod.TWO_PARTY;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}