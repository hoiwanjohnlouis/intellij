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
 *  17
 *  ExecID
 *  String
 *  Unique identifier of execution message as assigned by sell-side (broker, exchange, ECN)
 *  (will be 0 (zero) for ExecType (50) =I (Order Status)).
 *
 *  Uniqueness must be guaranteed within a single trading day or the life of a multi-day order.
 *  Firms which accept multi-day orders should consider embedding a date within
 *  the ExecID field to assure uniqueness across days.
 *  (Prior to FIX 4.1 this field was of type int)
 */
class Tag17StrExecIDTest {
    @Test
    void FIX0017Test() {
        FIX27 fixData = FIX27.FIX17_STR_EXEC_ID;
        assertEquals( "EXEC_ID", fixData.getName());
        assertEquals( "17", fixData.getID());
        assertEquals( "ExecID", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0017Test() {
        Log17StrExecID tagData;

        tagData = new Log17StrExecID(new MyStringType("BEST-1234") );
        assertEquals( "BEST-1234", tagData.getDataValue());
    }
}