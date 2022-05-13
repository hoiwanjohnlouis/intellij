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
 *  1106
 *  TriggerSecurityDesc
 *  String
 *  <p>
 *  Defines the security description of the security whose prices will be tracked by the trigger logic.
 */
class Tag1106StrTriggerSecurityDescTest {
    @Test
    void FIX1106Test() {
        FIX50 fixData = FIX50.FIX1106_STR_TRIGGER_SECURITY_DESC;
        assertEquals( "1106", fixData.getID());
        assertEquals( "TRIGGER_SECURITY_DESC", fixData.getName());
        assertEquals( "trigger_security_desc", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1106Test() {
        Tag1106StrTriggerSecurityDesc tagData;

        tagData = new Tag1106StrTriggerSecurityDesc( new MyStringType("Chloe Kim") );
        assertEquals( "Chloe Kim", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}