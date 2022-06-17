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
import com.hwtsllc.fixengine2022.fix44.enums.Enum723PosMaintResult;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  723
 *  PosMaintResult
 *  int
 *  <p></p>
 *  Result of Position Maintenance Request.
 *  <p></p>
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Successful Completion - no warnings or errors
 *  <p>    1 - Rejected
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag723EnuPosMaintResultTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX723_ENU_POS_MAINT_RESULT;
        assertEquals( "723", fixData.toFIXIDString());
        assertEquals( "POS_MAINT_RESULT", fixData.toFIXNameString());
        assertEquals( "PosMaintResult", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0723Test() {
        Tag723EnuPosMaintResult tagData;
        Enum723PosMaintResult oneElement;

        oneElement = Enum723PosMaintResult.SUCCESSFUL;
        tagData = new Tag723EnuPosMaintResult( oneElement );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "723", tagData.toFIXIDString());
        assertEquals( "POS_MAINT_RESULT", tagData.toFIXNameString());
        assertEquals( "PosMaintResult", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag723EnuPosMaintResult(Enum723PosMaintResult.REJECTED);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag723EnuPosMaintResult(Enum723PosMaintResult.OTHER);
        assertEquals( "99", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag723EnuPosMaintResult tagData;

        // loop around the ENUM and process
        for ( Enum723PosMaintResult oneEnum : Enum723PosMaintResult.values()) {
            tagData = new Tag723EnuPosMaintResult(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag723EnuPosMaintResult tagData;

        // loop around the ENUM and process
        for (Enum723PosMaintResult oneEnum : Enum723PosMaintResult.values()) {
            tagData = new Tag723EnuPosMaintResult(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag723EnuPosMaintResult tagData;

        // loop around the ENUM and process
        for (Enum723PosMaintResult oneEnum : Enum723PosMaintResult.values()) {
            tagData = new Tag723EnuPosMaintResult(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag723EnuPosMaintResult tagData;

        // loop around the ENUM and process
        for (Enum723PosMaintResult oneEnum : Enum723PosMaintResult.values()) {
            tagData = new Tag723EnuPosMaintResult(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag723EnuPosMaintResult tagData;

        // loop around the ENUM and process
        for (Enum723PosMaintResult oneEnum : Enum723PosMaintResult.values()) {
            tagData = new Tag723EnuPosMaintResult(oneEnum);
            assertEquals( "Tag723EnuPosMaintResult\n" +
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