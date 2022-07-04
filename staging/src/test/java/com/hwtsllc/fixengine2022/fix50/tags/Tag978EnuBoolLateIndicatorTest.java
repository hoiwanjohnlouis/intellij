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
import com.hwtsllc.fixengine2022.fix50.enums.Enum978LateIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  978
 *  LateIndicator
 *  Boolean
 *  <p>
 *  Indicates if the contrary intention was received after the exchange imposed cutoff time
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - After the exchange cutoff time" ),
 *  <p> NO( "N", "NO", "N - Received during normal exchange hours" ),
 */
class Tag978EnuBoolLateIndicatorTest {
    @Test
    void FIX0978Test() {
        FIX50 fixData = FIX50.FIX978_ENU_LATE_INDICATOR;
        assertEquals( "978", fixData.toEnumIDString());
        assertEquals( "LATE_INDICATOR", fixData.toEnumNameString());
        assertEquals( "LateIndicator", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0978Test() {
        Tag978EnuBoolLateIndicator tagData;

        tagData = new Tag978EnuBoolLateIndicator( Enum978LateIndicator.NO );
        assertEquals( Enum978LateIndicator.NO.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag978EnuBoolLateIndicator( Enum978LateIndicator.YES );
        assertEquals( Enum978LateIndicator.YES.toEnumIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag978EnuBoolLateIndicator tagData;

        // loop around the ENUM and process
        for ( Enum978LateIndicator oneEnum : Enum978LateIndicator.values()) {
            tagData = new Tag978EnuBoolLateIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag978EnuBoolLateIndicator tagData;

        // loop around the ENUM and process
        for (Enum978LateIndicator oneEnum : Enum978LateIndicator.values()) {
            tagData = new Tag978EnuBoolLateIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag978EnuBoolLateIndicator tagData;

        // loop around the ENUM and process
        for (Enum978LateIndicator oneEnum : Enum978LateIndicator.values()) {
            tagData = new Tag978EnuBoolLateIndicator(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag978EnuBoolLateIndicator tagData;

        // loop around the ENUM and process
        for (Enum978LateIndicator oneEnum : Enum978LateIndicator.values()) {
            tagData = new Tag978EnuBoolLateIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag978EnuBoolLateIndicator tagData;

        // loop around the ENUM and process
        for (Enum978LateIndicator oneEnum : Enum978LateIndicator.values()) {
            tagData = new Tag978EnuBoolLateIndicator(oneEnum);
            assertEquals( "Tag978EnuBoolLateIndicator\n" +
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