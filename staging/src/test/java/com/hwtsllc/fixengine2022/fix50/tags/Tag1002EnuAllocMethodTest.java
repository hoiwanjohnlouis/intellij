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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1002AllocMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1002
 *  AllocMethod
 *  int
 *  <p>
 *  Specifies the method under which a trade quantity was allocated.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Automatic
 *  <p>    2 - Guarantor
 *  <p>    3 - Manual
 */
class Tag1002EnuAllocMethodTest {
    @Test
    void FIX1002Test() {
        FIX50 fixData = FIX50.FIX1002_ENU_ALLOC_METHOD;
        assertEquals( "1002", fixData.getID());
        assertEquals( "ALLOC_METHOD", fixData.getName());
        assertEquals( "AllocMethod", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1002Test() {
        Tag1002EnuAllocMethod tagData;

        tagData = new Tag1002EnuAllocMethod( Enum1002AllocMethod.AUTOMATIC );
        assertEquals( Enum1002AllocMethod.AUTOMATIC.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1002EnuAllocMethod( Enum1002AllocMethod.GUARANTOR );
        assertEquals( Enum1002AllocMethod.GUARANTOR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1002EnuAllocMethod( Enum1002AllocMethod.MANUAL );
        assertEquals( Enum1002AllocMethod.MANUAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}