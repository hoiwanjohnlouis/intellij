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
import com.hwtsllc.fixengine2022.fix44.enums.Enum944CollAction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  944
 *  CollAction
 *  int
 *  Action proposed for an Underlying Instrument instance.
 *  Valid values:
 *      0 - Retain
 *      1 - Add
 *      2 - Remove
 */
class Tag944EnuCollActionTest {
    @Test
    void FIX0944Test() {
        FIX44 fixData = FIX44.FIX944_ENU_COLL_ACTION;
        assertEquals( "944", fixData.getID());
        assertEquals( "COLL_ACTION", fixData.getName());
        assertEquals( "CollAction", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0944Test() {
        Tag944EnuCollAction tagData;

        tagData = new Tag944EnuCollAction( Enum944CollAction.RETAIN );
        assertEquals( Enum944CollAction.RETAIN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag944EnuCollAction( Enum944CollAction.ADD );
        assertEquals( Enum944CollAction.ADD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag944EnuCollAction( Enum944CollAction.REMOVE );
        assertEquals( Enum944CollAction.REMOVE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}