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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  85
 *  NoDlvyInst
 *  NumInGroup
 *  <p>
 *  Number of delivery instruction fields in repeating group.
 *  <p>
 *  Note this field was removed in FIX 4.1 and reinstated in FIX 4.4.
 */
// @Deprecated
class Tag85NumNoDlvyInstTest {
    @Test
    void FIX0085Test() {
        FIX27 fixData = FIX27.FIX85_NUM_NO_DLVY_INST;
        assertEquals( "NO_DLVY_INST", fixData.toFIXNameString());
        assertEquals( "85", fixData.toFIXIDString());
        assertEquals( "NoDlvyInst (no longer used)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0085Test() {
        Tag85NumNoDlvyInst tagData;

        tagData = new Tag85NumNoDlvyInst(new MyNumInGroupType(42) );
        assertEquals( 42, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag85NumNoDlvyInst tagData;

        tagData = new Tag85NumNoDlvyInst(new MyNumInGroupType(Tag85NumNoDlvyInst.TESTB_NUM_NO_DLVY_INST));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag85NumNoDlvyInst tagData;

        tagData = new Tag85NumNoDlvyInst(new MyNumInGroupType(Tag85NumNoDlvyInst.TESTB_NUM_NO_DLVY_INST));
        assertEquals( Tag85NumNoDlvyInst.TESTB_NUM_NO_DLVY_INST, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag85NumNoDlvyInst tagData;

        tagData = new Tag85NumNoDlvyInst(new MyNumInGroupType(Tag85NumNoDlvyInst.TESTB_NUM_NO_DLVY_INST));
        assertEquals( tagData.toFIXIDString() + "=" + Tag85NumNoDlvyInst.TESTB_NUM_NO_DLVY_INST,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag85NumNoDlvyInst tagData;

        tagData = new Tag85NumNoDlvyInst(new MyNumInGroupType(Tag85NumNoDlvyInst.TESTB_NUM_NO_DLVY_INST));
        assertEquals( String.valueOf(Tag85NumNoDlvyInst.TESTB_NUM_NO_DLVY_INST),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag85NumNoDlvyInst tagData;

        tagData = new Tag85NumNoDlvyInst(new MyNumInGroupType(Tag85NumNoDlvyInst.TESTA_NUM_NO_DLVY_INST));
        assertEquals( "Tag85NumNoDlvyInst\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag85NumNoDlvyInst.TESTA_NUM_NO_DLVY_INST + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag85NumNoDlvyInst.TESTA_NUM_NO_DLVY_INST + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}