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

import com.hwtsllc.fixengine2022.fix50.enums.Enum1028ManualOrderIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1028EnuManualOrderIndicatorTest {
    Tag1028EnuManualOrderIndicator tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum1028ManualOrderIndicator oneEnum : Enum1028ManualOrderIndicator.values()) {
            tagData = new Tag1028EnuManualOrderIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum1028ManualOrderIndicator oneEnum : Enum1028ManualOrderIndicator.values()) {
            tagData = new Tag1028EnuManualOrderIndicator(oneEnum);
            assertEquals( "FIX1028_ENU_MANUAL_ORDER_INDICATOR", tagData.toEnumLabelString());
            assertEquals( "1028", tagData.toEnumIDString());
            assertEquals( "MANUAL_ORDER_INDICATOR", tagData.toEnumNameString());
            assertEquals( "ManualOrderIndicator", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1028ManualOrderIndicator oneEnum : Enum1028ManualOrderIndicator.values()) {
            tagData = new Tag1028EnuManualOrderIndicator(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1028
         *  ManualOrderIndicator
         *  Boolean
         *  <p> YES( "Y", "YES", "Y - Manually Order" ),
         *  <p> NO( "N", "NO", "N - Electronic Order" ),
         */
        tagData = new Tag1028EnuManualOrderIndicator( Enum1028ManualOrderIndicator.NO );
        assertEquals( "N", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag1028EnuManualOrderIndicator( Enum1028ManualOrderIndicator.YES );
        assertEquals( "Y", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );


        // loop around the ENUM and process
        for ( Enum1028ManualOrderIndicator oneEnum : Enum1028ManualOrderIndicator.values()) {
            tagData = new Tag1028EnuManualOrderIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum1028ManualOrderIndicator oneEnum : Enum1028ManualOrderIndicator.values()) {
            tagData = new Tag1028EnuManualOrderIndicator(oneEnum);
            assertEquals( "Tag1028EnuManualOrderIndicator\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}