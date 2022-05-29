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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1028ManualOrderIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1028
 *  ManualOrderIndicator
 *  Boolean
 *  <p>
 *  Indicates if the order was initially received manually (as opposed to electronically)
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Manually Order" ),
 *  <p> NO( "N", "NO", "N - Electronic Order" ),
 */
class Tag1028EnuManualOrderIndicatorTest {
    @Test
    void FIX1028Test() {
        FIX50 fixData = FIX50.FIX1028_ENU_MANUAL_ORDER_INDICATOR;
        assertEquals( "1028", fixData.toFIXIDString());
        assertEquals( "MANUAL_ORDER_INDICATOR", fixData.toFIXNameString());
        assertEquals( "ManualOrderIndicator", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1028Test() {
        Tag1028EnuManualOrderIndicator tagData;

        tagData = new Tag1028EnuManualOrderIndicator( Enum1028ManualOrderIndicator.NO );
        assertEquals( Enum1028ManualOrderIndicator.NO.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag1028EnuManualOrderIndicator( Enum1028ManualOrderIndicator.YES );
        assertEquals( Enum1028ManualOrderIndicator.YES.toFIXIDString(), tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1028EnuManualOrderIndicator tagData;

        // loop around the ENUM and process
        for ( Enum1028ManualOrderIndicator oneEnum : Enum1028ManualOrderIndicator.values()) {
            tagData = new Tag1028EnuManualOrderIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1028EnuManualOrderIndicator tagData;

        // loop around the ENUM and process
        for (Enum1028ManualOrderIndicator oneEnum : Enum1028ManualOrderIndicator.values()) {
            tagData = new Tag1028EnuManualOrderIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1028EnuManualOrderIndicator tagData;

        // loop around the ENUM and process
        for (Enum1028ManualOrderIndicator oneEnum : Enum1028ManualOrderIndicator.values()) {
            tagData = new Tag1028EnuManualOrderIndicator(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1028EnuManualOrderIndicator tagData;

        // loop around the ENUM and process
        for (Enum1028ManualOrderIndicator oneEnum : Enum1028ManualOrderIndicator.values()) {
            tagData = new Tag1028EnuManualOrderIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1028EnuManualOrderIndicator tagData;

        // loop around the ENUM and process
        for (Enum1028ManualOrderIndicator oneEnum : Enum1028ManualOrderIndicator.values()) {
            tagData = new Tag1028EnuManualOrderIndicator(oneEnum);
            assertEquals( "Tag1028EnuManualOrderIndicator\n" +
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