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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag215NumNoRoutingIDsTest {
    @Test
    void FIX0215Test() {
        FIX42 fixData = FIX42.FIX215_NUM_NO_ROUTING_IDS;
        assertEquals( "215", fixData.getID());
        assertEquals( "NO_ROUTING_IDS", fixData.getName());
        assertEquals( "NoRoutingIds", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0215Test() {
        Tag215NumNoRoutingIDs tagData;

        tagData = new Tag215NumNoRoutingIDs(new MyNumInGroupType(
                Tag215NumNoRoutingIDs.TESTA_NUM_NO_ROUTING_IDS));
        assertEquals( Tag215NumNoRoutingIDs.TESTA_NUM_NO_ROUTING_IDS,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag215NumNoRoutingIDs(new MyNumInGroupType(
                Tag215NumNoRoutingIDs.TESTB_NUM_NO_ROUTING_IDS));
        assertEquals( Tag215NumNoRoutingIDs.TESTB_NUM_NO_ROUTING_IDS,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
}