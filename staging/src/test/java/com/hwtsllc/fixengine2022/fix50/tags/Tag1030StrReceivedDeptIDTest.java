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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1030
 *  ReceivedDeptID
 *  String
 *  <p>
 *  Identifies the Broker / Dealer Department that first took the order.
 */
class Tag1030StrReceivedDeptIDTest {
    @Test
    void FIX1030Test() {
        FIX50 fixData = FIX50.FIX1030_STR_RECEIVED_DEPT_ID;
        assertEquals( "1030", fixData.toFIXIDString());
        assertEquals( "RECEIVED_DEPT_ID", fixData.toFIXNameString());
        assertEquals( "ReceivedDeptID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1030Test() {
        Tag1030StrReceivedDeptID tagData;

        tagData = new Tag1030StrReceivedDeptID( new MyStringType("Chloe Kim") );
        assertEquals( "Chloe Kim", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}