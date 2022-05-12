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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag384NumNoMsgTypesTest {
    @Test
    void FIX0384Test() {
        FIX42 fixData = FIX42.FIX384_NUM_NO_MSG_TYPES;
        assertEquals( "384", fixData.getID());
        assertEquals( "NO_MSG_TYPES", fixData.getName());
        assertEquals( "NoMsgTypes", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0384Test() {
        Log384NumNoMsgTypes tagData;

        tagData = new Log384NumNoMsgTypes(new MyNumInGroupType(
                Log384NumNoMsgTypes.TESTA_NUM_NO_MSG_TYPES));
        assertEquals( Log384NumNoMsgTypes.TESTA_NUM_NO_MSG_TYPES,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        tagData = new Log384NumNoMsgTypes(new MyNumInGroupType(
                Log384NumNoMsgTypes.TESTB_NUM_NO_MSG_TYPES));
        assertEquals( Log384NumNoMsgTypes.TESTB_NUM_NO_MSG_TYPES,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
}