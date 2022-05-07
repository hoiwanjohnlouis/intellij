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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum666ConfirmTransType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  666
 *  ConfirmTransType
 *  Identifies the Confirmation transaction type.
 *  Valid values:
 *      0 - New
 *      1 - Replace
 *      2 - Cancel
 */
class Tag666EnuConfirmTransTypeTest {
    @Test
    void FIX0666Test() {
        FIX44 fixData = FIX44.FIX666_ENU_CONFIRM_TRANS_TYPE;
        assertEquals( "FIX666", fixData.getID());
        assertEquals( "CONFIRM_TRANS_TYPE", fixData.getName());
        assertEquals( "ConfirmTransType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0666Test() {
        Tag666EnuConfirmTransType tagData;

        tagData = new Tag666EnuConfirmTransType(Enum666ConfirmTransType.NEW);
        assertEquals( Enum666ConfirmTransType.NEW.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag666EnuConfirmTransType(Enum666ConfirmTransType.REPLACE);
        assertEquals( Enum666ConfirmTransType.REPLACE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag666EnuConfirmTransType(Enum666ConfirmTransType.CANCEL);
        assertEquals( Enum666ConfirmTransType.CANCEL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}