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
import com.hwtsllc.fixengine2022.fix44.enums.Enum940AffirmStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  940
 *  AffirmStatus
 *  int
 *  <p></p>
 *  Identifies the status of the ConfirmationAck.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Received
 *  <p>    2 - Confirm rejected, i.e. not affirmed
 *  <p>    3 - Affirmed
 */
class Tag940EnuAffirmStatusTest {
    @Test
    void FIX0940Test() {
        FIX44 fixData = FIX44.FIX940_ENU_AFFIRM_STATUS;
        assertEquals( "940", fixData.toFIXIDString());
        assertEquals( "AFFIRM_STATUS", fixData.toFIXNameString());
        assertEquals( "AffirmStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0940Test() {
        Tag940EnuAffirmStatus tagData;

        tagData = new Tag940EnuAffirmStatus( Enum940AffirmStatus.RECEIVED );
        assertEquals( Enum940AffirmStatus.RECEIVED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag940EnuAffirmStatus( Enum940AffirmStatus.REJECTED );
        assertEquals( Enum940AffirmStatus.REJECTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag940EnuAffirmStatus( Enum940AffirmStatus.AFFIRMED );
        assertEquals( Enum940AffirmStatus.AFFIRMED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag940EnuAffirmStatus tagData;

        // loop around the ENUM and process
        for ( Enum940AffirmStatus oneEnum : Enum940AffirmStatus.values()) {
            tagData = new Tag940EnuAffirmStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag940EnuAffirmStatus tagData;

        // loop around the ENUM and process
        for (Enum940AffirmStatus oneEnum : Enum940AffirmStatus.values()) {
            tagData = new Tag940EnuAffirmStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag940EnuAffirmStatus tagData;

        // loop around the ENUM and process
        for (Enum940AffirmStatus oneEnum : Enum940AffirmStatus.values()) {
            tagData = new Tag940EnuAffirmStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag940EnuAffirmStatus tagData;

        // loop around the ENUM and process
        for (Enum940AffirmStatus oneEnum : Enum940AffirmStatus.values()) {
            tagData = new Tag940EnuAffirmStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag940EnuAffirmStatus tagData;

        // loop around the ENUM and process
        for (Enum940AffirmStatus oneEnum : Enum940AffirmStatus.values()) {
            tagData = new Tag940EnuAffirmStatus(oneEnum);
            assertEquals( "Tag940EnuAffirmStatus\n" +
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