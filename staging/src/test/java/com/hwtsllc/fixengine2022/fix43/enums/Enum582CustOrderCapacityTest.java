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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum582CustOrderCapacityTest {
    /**
     *  Information is the same for TAGS 582
     */
    @Test
    void Enum0582Test() {
        Enum582CustOrderCapacity enumType;

        /*
         *  1-4 types
         */
        enumType = Enum582CustOrderCapacity.MEMBER_TRADING_ACCOUNT;
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum582CustOrderCapacity.CLEARING_FIRM_PROPRIETARY;
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum582CustOrderCapacity.MEMBER_TRADING_FOR_ANOTHER;
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum582CustOrderCapacity.ALL_OTHER;
        assertNotEquals( FIXType.JUNK_ID, enumType.getID());
        assertNotEquals( FIXType.JUNK_NAME, enumType.getName());
        assertNotEquals( FIXType.JUNK_DESCRIPTION, enumType.getDescription());
    }
}