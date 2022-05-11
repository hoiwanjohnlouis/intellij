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
import com.hwtsllc.fixengine2022.fix50.enums.ENum980SecurityUpdateAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  980
 *  SecurityUpdateAction
 *  char
 *
 *  <p></p>
 *  Valid values:
 *  <p>    A - Add
 *  <p>    D - Delete
 *  <p>    M - Modify
 */
class Tag980EnuSecurityUpdateActionTest {
    @Test
    void FIX0980Test() {
        FIX50 fixData = FIX50.FIX980_ENU_SECURITY_UPDATE_ACTION;
        assertEquals( "980", fixData.getID());
        assertEquals( "SECURITY_UPDATE_ACTION", fixData.getName());
        assertEquals( "SecurityUpdateAction", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0980Test() {
        Tag980EnuSecurityUpdateAction tagData;

        tagData = new Tag980EnuSecurityUpdateAction( ENum980SecurityUpdateAction.ADD );
        assertEquals( ENum980SecurityUpdateAction.ADD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag980EnuSecurityUpdateAction( ENum980SecurityUpdateAction.DELETE );
        assertEquals( ENum980SecurityUpdateAction.DELETE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag980EnuSecurityUpdateAction( ENum980SecurityUpdateAction.MODIFY );
        assertEquals( ENum980SecurityUpdateAction.MODIFY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}