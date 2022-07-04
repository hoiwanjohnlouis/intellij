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
    void FIXTest() {
        FIX44 fixData = FIX44.FIX940_ENU_AFFIRM_STATUS;
        assertEquals( "940", fixData.toEnumIDString());
        assertEquals( "AFFIRM_STATUS", fixData.toEnumNameString());
        assertEquals( "AffirmStatus", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0940Test() {
        Tag940EnuAffirmStatus tagData;
        Enum940AffirmStatus oneElement;

        oneElement = Enum940AffirmStatus.RECEIVED;
        tagData = new Tag940EnuAffirmStatus( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "940", tagData.toEnumIDString());
        assertEquals( "AFFIRM_STATUS", tagData.toEnumNameString());
        assertEquals( "AffirmStatus", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag940EnuAffirmStatus( Enum940AffirmStatus.REJECTED );
        assertEquals( Enum940AffirmStatus.REJECTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag940EnuAffirmStatus( Enum940AffirmStatus.AFFIRMED );
        assertEquals( Enum940AffirmStatus.AFFIRMED.toEnumIDString(), tagData.getDataValue());
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
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
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
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}