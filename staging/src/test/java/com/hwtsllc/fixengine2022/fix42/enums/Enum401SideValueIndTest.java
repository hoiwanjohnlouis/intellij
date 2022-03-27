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

class Enum401SideValueIndTest {
    @Test
    void Enum0401Test() {
        Enum401SideValueInd enumType;

        /*
         * 1-2 msg types
         */
        enumType = Enum401SideValueInd.SIDE_VALUE_1;
        enumType = Enum401SideValueInd.SIDE_VALUE_2;
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}