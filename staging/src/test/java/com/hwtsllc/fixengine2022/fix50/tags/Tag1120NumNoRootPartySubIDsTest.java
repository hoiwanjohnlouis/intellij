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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1120
 *  NoRootPartySubIDs
 *  NumInGroup
 *  <p>
 *  Number of RootPartySubID (1121) and RootPartySubIDType (1122) entries
 */
class Tag1120NumNoRootPartySubIDsTest {
    @Test
    void FIX1120Test() {
        FIX50 fixData = FIX50.FIX1120_NUM_NO_ROOT_PARTY_SUB_IDS;
        assertEquals( "1120", fixData.toFIXIDString());
        assertEquals( "NO_ROOT_PARTY_SUB_IDS", fixData.toFIXNameString());
        assertEquals( "NoRootPartySubIDs", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1120Test() {
        Tag1120NumNoRootPartySubIDs tagData;

        tagData = new Tag1120NumNoRootPartySubIDs(
                new MyNumInGroupType( Tag1120NumNoRootPartySubIDs.TESTA_NUM_NO_ROOT_PARTY_SUB_IDS ));
        assertEquals( Tag1120NumNoRootPartySubIDs.TESTA_NUM_NO_ROOT_PARTY_SUB_IDS,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1120NumNoRootPartySubIDs(
                new MyNumInGroupType( Tag1120NumNoRootPartySubIDs.TESTB_NUM_NO_ROOT_PARTY_SUB_IDS ));
        assertEquals( Tag1120NumNoRootPartySubIDs.TESTB_NUM_NO_ROOT_PARTY_SUB_IDS,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
}