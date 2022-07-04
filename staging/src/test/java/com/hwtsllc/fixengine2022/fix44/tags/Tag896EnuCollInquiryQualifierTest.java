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
import com.hwtsllc.fixengine2022.fix44.enums.Enum896CollInquiryQualifier;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  896
 *  CollInquiryQualifier
 *  int
 *  <p></p>
 *  Collateral inquiry qualifiers:
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Trade Date
 *  <p>    1 - GC Instrument
 *  <p>    2 - Collateral Instrument
 *  <p>    3 - Substitution Eligible
 *  <p>    4 - Not Assigned
 *  <p></p>
 *  <p>    5 - Partially Assigned
 *  <p>    6 - Fully Assigned
 *  <p>    7 - Outstanding Trades (Today < end date)
 */
class Tag896EnuCollInquiryQualifierTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX896_ENU_COLL_INQUIRY_QUALIFIER;
        assertEquals( "896", fixData.toEnumIDString());
        assertEquals( "COLL_INQUIRY_QUALIFIER", fixData.toEnumNameString());
        assertEquals( "CollInquiryQualifier", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0896Test() {
        Tag896EnuCollInquiryQualifier tagData;
        Enum896CollInquiryQualifier oneElement;

        oneElement = Enum896CollInquiryQualifier.TRADE_DATE;
        tagData = new Tag896EnuCollInquiryQualifier( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "896", tagData.toEnumIDString());
        assertEquals( "COLL_INQUIRY_QUALIFIER", tagData.toEnumNameString());
        assertEquals( "CollInquiryQualifier", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.GC_INSTRUMENT );
        assertEquals( Enum896CollInquiryQualifier.GC_INSTRUMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.COLLATERAL_INSTRUMENT );
        assertEquals( Enum896CollInquiryQualifier.COLLATERAL_INSTRUMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.SUBSTITUTION_ELIGIBLE );
        assertEquals( Enum896CollInquiryQualifier.SUBSTITUTION_ELIGIBLE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.NOT_ASSIGNED );
        assertEquals( Enum896CollInquiryQualifier.NOT_ASSIGNED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.PARTIALLY_ASSIGNED );
        assertEquals( Enum896CollInquiryQualifier.PARTIALLY_ASSIGNED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.FULLY_ASSIGNED );
        assertEquals( Enum896CollInquiryQualifier.FULLY_ASSIGNED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.OUTSTANDING_TRADES );
        assertEquals( Enum896CollInquiryQualifier.OUTSTANDING_TRADES.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag896EnuCollInquiryQualifier tagData;

        // loop around the ENUM and process
        for ( Enum896CollInquiryQualifier oneEnum : Enum896CollInquiryQualifier.values()) {
            tagData = new Tag896EnuCollInquiryQualifier(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag896EnuCollInquiryQualifier tagData;

        // loop around the ENUM and process
        for (Enum896CollInquiryQualifier oneEnum : Enum896CollInquiryQualifier.values()) {
            tagData = new Tag896EnuCollInquiryQualifier(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag896EnuCollInquiryQualifier tagData;

        // loop around the ENUM and process
        for (Enum896CollInquiryQualifier oneEnum : Enum896CollInquiryQualifier.values()) {
            tagData = new Tag896EnuCollInquiryQualifier(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag896EnuCollInquiryQualifier tagData;

        // loop around the ENUM and process
        for (Enum896CollInquiryQualifier oneEnum : Enum896CollInquiryQualifier.values()) {
            tagData = new Tag896EnuCollInquiryQualifier(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag896EnuCollInquiryQualifier tagData;

        // loop around the ENUM and process
        for (Enum896CollInquiryQualifier oneEnum : Enum896CollInquiryQualifier.values()) {
            tagData = new Tag896EnuCollInquiryQualifier(oneEnum);
            assertEquals( "Tag896EnuCollInquiryQualifier\n" +
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