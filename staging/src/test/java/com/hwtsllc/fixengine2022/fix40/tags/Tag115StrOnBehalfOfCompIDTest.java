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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  115
 *  OnBehalfOfCompID
 *  String
 *  Assigned value used to identify firm originating message
 *  if the message was delivered by a third party
 *  i.e. the third party firm identifier would be delivered
 *  in the SenderCompID field and the firm originating the message in this field.
 */
class Tag115StrOnBehalfOfCompIDTest {
    @Test
    void FIX0115Test() {
        FIX40 fixData = FIX40.FIX115_STR_ON_BEHALF_OF_COMP_ID;
        assertEquals( "ON_BEHALF_OF_COMP_ID", fixData.getName());
        assertEquals( "115", fixData.getID());
        assertEquals( "OnBehalfOfCompID", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0115Test() {
        Tag115StrOnBehalfOfCompID tagData;

        tagData = new Tag115StrOnBehalfOfCompID(new MyStringType("Legolas-115OnBehalfOfCompID") );
        assertEquals( "Legolas-115OnBehalfOfCompID", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}