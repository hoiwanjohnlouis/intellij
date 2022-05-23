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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.fix41.enums.Enum209AllocHandlInst;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  209
 *  AllocHandlInst
 *  int
 *  <p>
 *  Indicates how the receiver (i.e. third party) of Allocation message should handle/process the account details.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Match
 *  <p>    2 - Forward
 *  <p>    3 - Forward and Match
 */
class Tag209EnuAllocHandlInstTest {
    @Test
    void FIX0209Test() {
        FIX41 fixData = FIX41.FIX209_ENU_ALLOC_HANDL_INST;
        assertEquals( "209", fixData.toFIXIDString());
        assertEquals( "ALLOC_HANDL_INST", fixData.toFIXNameString());
        assertEquals( "AllocHandlInst", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0209Test() {
        Tag209EnuAllocHandlInst tagData;

        tagData = new Tag209EnuAllocHandlInst(Enum209AllocHandlInst.MATCH);
        assertEquals( Enum209AllocHandlInst.MATCH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag209EnuAllocHandlInst(Enum209AllocHandlInst.FORWARD);
        assertEquals( Enum209AllocHandlInst.FORWARD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag209EnuAllocHandlInst(Enum209AllocHandlInst.FORWARD_AND_MATCH);
        assertEquals( Enum209AllocHandlInst.FORWARD_AND_MATCH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag209EnuAllocHandlInst tagData;

        // loop around the ENUM and process
        for (Enum209AllocHandlInst oneEnum : Enum209AllocHandlInst.values()) {
            tagData = new Tag209EnuAllocHandlInst(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag209EnuAllocHandlInst tagData;

        // loop around the ENUM and process
        for (Enum209AllocHandlInst oneEnum : Enum209AllocHandlInst.values()) {
            tagData = new Tag209EnuAllocHandlInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag209EnuAllocHandlInst tagData;

        // loop around the ENUM and process
        for (Enum209AllocHandlInst oneEnum : Enum209AllocHandlInst.values()) {
            tagData = new Tag209EnuAllocHandlInst(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag209EnuAllocHandlInst tagData;

        // loop around the ENUM and process
        for (Enum209AllocHandlInst oneEnum : Enum209AllocHandlInst.values()) {
            tagData = new Tag209EnuAllocHandlInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag209EnuAllocHandlInst tagData;

        // loop around the ENUM and process
        for (Enum209AllocHandlInst oneEnum : Enum209AllocHandlInst.values()) {
            tagData = new Tag209EnuAllocHandlInst(oneEnum);
            assertEquals( "Tag209EnuAllocHandlInst\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}