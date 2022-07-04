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
import com.hwtsllc.fixengine2022.fix44.enums.Enum754AutoAcceptIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  754
 *  AutoAcceptIndicator
 *  Boolean
 *  <p></p>
 *  Identifies whether an allocation has been
 *  automatically accepted on behalf of the Carry Firm by the Clearing House.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Allocation Pending Accept
 *  <p>    Y - Allocation Automatically Accepted
 */
class Tag754EnuAutoAcceptIndicatorTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX754_ENU_AUTO_ACCEPT_INDICATOR;
        assertEquals( "754", fixData.toEnumIDString());
        assertEquals( "AUTO_ACCEPT_INDICATOR", fixData.toEnumNameString());
        assertEquals( "AutoAcceptIndicator", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0754Test() {
        Tag754EnuAutoAcceptIndicator tagData;
        Enum754AutoAcceptIndicator oneElement;

        oneElement = Enum754AutoAcceptIndicator.NO;
        tagData = new Tag754EnuAutoAcceptIndicator( oneElement );
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "754", tagData.toEnumIDString());
        assertEquals( "AUTO_ACCEPT_INDICATOR", tagData.toEnumNameString());
        assertEquals( "AutoAcceptIndicator", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag754EnuAutoAcceptIndicator( Enum754AutoAcceptIndicator.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag754EnuAutoAcceptIndicator tagData;

        // loop around the ENUM and process
        for ( Enum754AutoAcceptIndicator oneEnum : Enum754AutoAcceptIndicator.values()) {
            tagData = new Tag754EnuAutoAcceptIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag754EnuAutoAcceptIndicator tagData;

        // loop around the ENUM and process
        for (Enum754AutoAcceptIndicator oneEnum : Enum754AutoAcceptIndicator.values()) {
            tagData = new Tag754EnuAutoAcceptIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag754EnuAutoAcceptIndicator tagData;

        // loop around the ENUM and process
        for (Enum754AutoAcceptIndicator oneEnum : Enum754AutoAcceptIndicator.values()) {
            tagData = new Tag754EnuAutoAcceptIndicator(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag754EnuAutoAcceptIndicator tagData;

        // loop around the ENUM and process
        for (Enum754AutoAcceptIndicator oneEnum : Enum754AutoAcceptIndicator.values()) {
            tagData = new Tag754EnuAutoAcceptIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag754EnuAutoAcceptIndicator tagData;

        // loop around the ENUM and process
        for (Enum754AutoAcceptIndicator oneEnum : Enum754AutoAcceptIndicator.values()) {
            tagData = new Tag754EnuAutoAcceptIndicator(oneEnum);
            assertEquals( "Tag754EnuAutoAcceptIndicator\n" +
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