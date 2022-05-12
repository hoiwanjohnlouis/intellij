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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  10
 *  CheckSum
 *  String
 *  Three byte, simple checksum
 *
 *  i.e. serves, with the trailing <SOH>, as the end-of-message delimiter.
 *
 *  (see Volume 2: "Checksum Calculation" for description).
 *  ALWAYS LAST FIELD IN MESSAGE;
 *
 *  Always defined as three characters.
 *  (Always unencrypted)
 */
class Tag10StrCheckSumTest {
    @Test
    void FIX0010Test() {
        FIX27 fixData = FIX27.FIX10_STR_CHECK_SUM;
        assertEquals( "CHECK_SUM", fixData.getName());
        assertEquals( "10", fixData.getID());
        assertEquals( "CheckSum", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0010Test() {
        Log10StrCheckSum tagData;

        tagData = new Log10StrCheckSum(new MyStringType("ABC") );
        assertEquals( "ABC", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}