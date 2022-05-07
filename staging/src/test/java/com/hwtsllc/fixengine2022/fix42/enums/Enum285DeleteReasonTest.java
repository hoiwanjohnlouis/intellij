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

class Enum285DeleteReasonTest {
    /**
     *  285
     *  DeleteReason
     *
     *      0-1 msg types
     *      CANCELLATION_OR_TRADE_BUST( "0", "CANCELLATION_OR_TRADE_BUST", "0 - Cancellation / Trade Bust" ),
     *      ERROR( "1", "ERROR", "1 - Error" ),
     */
    @Test
    void Enum0285Test() {
        Enum285DeleteReason enumType;

        /**
         * 0-1 msg types
         */
        enumType = Enum285DeleteReason.CANCELLATION_OR_TRADE_BUST;
        assertEquals( "0", enumType.getID());
        assertEquals( "CANCELLATION_OR_TRADE_BUST", enumType.getName());
        assertEquals( "0 - Cancellation / Trade Bust", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum285DeleteReason.ERROR;
        assertEquals( "1", enumType.getID());
        assertEquals( "ERROR", enumType.getName());
        assertEquals( "1 - Error", enumType.getDescription());
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