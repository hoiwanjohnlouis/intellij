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
import com.hwtsllc.fixengine2022.fix44.enums.Enum912LastRptRequested;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  912
 *  LastRptRequested
 *  Boolean
 *  <p></p>
 *  Indicates whether this message is that last report message
 *  in response to a request, such as Order Mass Status Request.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Not last message
 *  <p>    Y - Last message
 */
class Tag912EnuLastRptRequestedTest {
    @Test
    void FIX0912Test() {
        FIX44 fixData = FIX44.FIX912_ENU_LAST_RPT_REQUESTED;
        assertEquals( "912", fixData.toFIXIDString());
        assertEquals( "LAST_RPT_REQUESTED", fixData.toFIXNameString());
        assertEquals( "LastRptRequested", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0912Test() {
        Tag912EnuLastRptRequested tagData;

        tagData = new Tag912EnuLastRptRequested( Enum912LastRptRequested.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag912EnuLastRptRequested( Enum912LastRptRequested.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag912EnuLastRptRequested tagData;

        // loop around the ENUM and process
        for ( Enum912LastRptRequested oneEnum : Enum912LastRptRequested.values()) {
            tagData = new Tag912EnuLastRptRequested(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag912EnuLastRptRequested tagData;

        // loop around the ENUM and process
        for (Enum912LastRptRequested oneEnum : Enum912LastRptRequested.values()) {
            tagData = new Tag912EnuLastRptRequested(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag912EnuLastRptRequested tagData;

        // loop around the ENUM and process
        for (Enum912LastRptRequested oneEnum : Enum912LastRptRequested.values()) {
            tagData = new Tag912EnuLastRptRequested(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag912EnuLastRptRequested tagData;

        // loop around the ENUM and process
        for (Enum912LastRptRequested oneEnum : Enum912LastRptRequested.values()) {
            tagData = new Tag912EnuLastRptRequested(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag912EnuLastRptRequested tagData;

        // loop around the ENUM and process
        for (Enum912LastRptRequested oneEnum : Enum912LastRptRequested.values()) {
            tagData = new Tag912EnuLastRptRequested(oneEnum);
            assertEquals( "Tag912EnuLastRptRequested\n" +
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