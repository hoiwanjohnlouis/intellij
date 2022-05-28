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
import com.hwtsllc.fixengine2022.fix42.enums.Enum377SolicitedFlag;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  377
 *  SolicitedFlag
 *  Boolean
 *  <p>
 *  Indicates whether or not the order was solicited.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Was not solicited
 *  <p>    Y - Was solicited
 */
class Tag377EnuSolicitedFlagTest {
    @Test
    void FIX0377Test() {
        FIX42 fixData = FIX42.FIX377_ENU_SOLICITED_FLAG;
        assertEquals( "377", fixData.toFIXIDString());
        assertEquals( "SOLICITED_FLAG", fixData.toFIXNameString());
        assertEquals( "SolicitedFlag", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0377Test() {
        Tag377EnuSolicitedFlag tagData;

        tagData = new Tag377EnuSolicitedFlag(Enum377SolicitedFlag.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag377EnuSolicitedFlag(Enum377SolicitedFlag.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag377EnuSolicitedFlag tagData;

        // loop around the ENUM and process
        for (Enum377SolicitedFlag oneEnum : Enum377SolicitedFlag.values()) {
            tagData = new Tag377EnuSolicitedFlag(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag377EnuSolicitedFlag tagData;

        // loop around the ENUM and process
        for (Enum377SolicitedFlag oneEnum : Enum377SolicitedFlag.values()) {
            tagData = new Tag377EnuSolicitedFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag377EnuSolicitedFlag tagData;

        // loop around the ENUM and process
        for (Enum377SolicitedFlag oneEnum : Enum377SolicitedFlag.values()) {
            tagData = new Tag377EnuSolicitedFlag(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag377EnuSolicitedFlag tagData;

        // loop around the ENUM and process
        for (Enum377SolicitedFlag oneEnum : Enum377SolicitedFlag.values()) {
            tagData = new Tag377EnuSolicitedFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag377EnuSolicitedFlag tagData;

        // loop around the ENUM and process
        for (Enum377SolicitedFlag oneEnum : Enum377SolicitedFlag.values()) {
            tagData = new Tag377EnuSolicitedFlag(oneEnum);
            assertEquals( "Tag377EnuSolicitedFlag\n" +
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