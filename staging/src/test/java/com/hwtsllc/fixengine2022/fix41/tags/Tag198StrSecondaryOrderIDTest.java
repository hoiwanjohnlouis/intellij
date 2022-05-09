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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  198
 *  SecondaryOrderID
 *  String
 *  <p>
 *  Assigned by the party which accepts the order.
 *  Can be used to provide the OrderID (37) used by an exchange or executing system.
 */
class Tag198StrSecondaryOrderIDTest {
    @Test
    void FIX0198Test() {
        FIX41 fixData = FIX41.FIX198_STR_SECONDARY_ORDER_ID;
        assertEquals( "198", fixData.getID());
        assertEquals( "SECONDARY_ORDER_ID", fixData.getName());
        assertEquals( "SecondaryOrderId", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0198Test() {
        Tag198StrSecondaryOrderID tagData;

        tagData = new Tag198StrSecondaryOrderID(
                new MyStringType(Tag198StrSecondaryOrderID.TESTA_STR_SECONDARY_ORDER_ID));
        assertEquals( Tag198StrSecondaryOrderID.TESTA_STR_SECONDARY_ORDER_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag198StrSecondaryOrderID(
                new MyStringType(Tag198StrSecondaryOrderID.TESTB_STR_SECONDARY_ORDER_ID));
        assertEquals( Tag198StrSecondaryOrderID.TESTB_STR_SECONDARY_ORDER_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}