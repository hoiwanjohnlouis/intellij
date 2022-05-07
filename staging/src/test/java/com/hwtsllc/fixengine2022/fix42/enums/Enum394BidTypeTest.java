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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  Tag394
 *  Enu
 *  BidType
 *
 *      1-3 msg types
 *      NON_DISCLOSED( "1", "NON_DISCLOSED", "1 - Non Disclosed style (e.g. US/European)" ),
 *      DISCLOSED( "2", "DISCLOSED", "2 - Disclosed style (e.g. Japanese)" ),
 *      NO_BIDDING( "3", "NO_BIDDING", "3 - No bidding process" ),
 */
class Enum394BidTypeTest {
    @Test
    void Enum0394Test() {
        Enum394BidType enumType;

        /**
         * 1-3 msg types
         */
        enumType = Enum394BidType.NON_DISCLOSED;
        assertEquals( "1", enumType.getID());
        assertEquals( "NON_DISCLOSED", enumType.getName());
        assertEquals( "1 - Non Disclosed style (e.g. US/European)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum394BidType.DISCLOSED;
        assertEquals( "2", enumType.getID());
        assertEquals( "DISCLOSED", enumType.getName());
        assertEquals( "2 - Disclosed style (e.g. Japanese)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum394BidType.NO_BIDDING;
        assertEquals( "3", enumType.getID());
        assertEquals( "NO_BIDDING", enumType.getName());
        assertEquals( "3 - No bidding process", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}