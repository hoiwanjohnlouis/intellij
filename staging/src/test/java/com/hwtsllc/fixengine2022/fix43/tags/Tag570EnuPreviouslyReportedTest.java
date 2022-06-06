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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum570PreviouslyReported;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  570
 *  PreviouslyReported
 *  Boolean
 *  <p>
 *  Indicates if the trade capture report was previously reported to the counterparty
 *  <p>
 *  Valid values:
 *  <p>    N - Not reported to counterparty
 *  <p>    Y - Previously reported to counterparty
 */
class Tag570EnuPreviouslyReportedTest {
    @Test
    void FIX0570Test() {
        FIX43 fixData = FIX43.FIX570_ENU_PREVIOUSLY_REPORTED;
        assertEquals( "570", fixData.toFIXIDString());
        assertEquals( "PREVIOUSLY_REPORTED", fixData.toFIXNameString());
        assertEquals( "PreviouslyReported", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0570Test() {
        Tag570EnuPreviouslyReported tagData;

        tagData = new Tag570EnuPreviouslyReported( Enum570PreviouslyReported.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag570EnuPreviouslyReported(Enum570PreviouslyReported.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag570EnuPreviouslyReported tagData;

        // loop around the ENUM and process
        for ( Enum570PreviouslyReported oneEnum : Enum570PreviouslyReported.values()) {
            tagData = new Tag570EnuPreviouslyReported(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag570EnuPreviouslyReported tagData;

        // loop around the ENUM and process
        for (Enum570PreviouslyReported oneEnum : Enum570PreviouslyReported.values()) {
            tagData = new Tag570EnuPreviouslyReported(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag570EnuPreviouslyReported tagData;

        // loop around the ENUM and process
        for (Enum570PreviouslyReported oneEnum : Enum570PreviouslyReported.values()) {
            tagData = new Tag570EnuPreviouslyReported(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag570EnuPreviouslyReported tagData;

        // loop around the ENUM and process
        for (Enum570PreviouslyReported oneEnum : Enum570PreviouslyReported.values()) {
            tagData = new Tag570EnuPreviouslyReported(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag570EnuPreviouslyReported tagData;

        // loop around the ENUM and process
        for (Enum570PreviouslyReported oneEnum : Enum570PreviouslyReported.values()) {
            tagData = new Tag570EnuPreviouslyReported(oneEnum);
            assertEquals( "Tag570EnuPreviouslyReported\n" +
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