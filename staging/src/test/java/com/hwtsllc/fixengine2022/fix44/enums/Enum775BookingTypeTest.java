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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  775
 *  BookingType
 *  Method for booking out this order.
 *      Used when notifying a broker that an order to be settled by that broker
 *      is to be booked out as an OTC derivative (e.g. CFD or similar).
 *  Valid values:
 *      0 - Regular booking
 *      1 - CFD (Contract for difference)
 *      2 - Total Return Swap
 */
class Enum775BookingTypeTest {
    @Test
    void EnumTest() {
        Enum775BookingType enumType;

        enumType = Enum775BookingType.REGULAR_BOOKING;
        assertEquals( "0", enumType.getID() );
        assertEquals( "REGULAR_BOOKING", enumType.getName() );
        assertEquals( "0 - Regular booking", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum775BookingType.CONTRACT_FOR_DIFFERENCE;
        assertEquals( "1", enumType.getID() );
        assertEquals( "CONTRACT_FOR_DIFFERENCE", enumType.getName() );
        assertEquals( "1 - CFD (Contract for difference)", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum775BookingType.TOTAL_RETURN_SWAP;
        assertEquals( "2", enumType.getID() );
        assertEquals( "TOTAL_RETURN_SWAP", enumType.getName() );
        assertEquals( "2 - Total Return Swap", enumType.getDescription() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}