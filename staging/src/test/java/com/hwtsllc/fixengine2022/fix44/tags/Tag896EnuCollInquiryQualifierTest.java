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
    Tag896EnuCollInquiryQualifier tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum896CollInquiryQualifier oneEnum : Enum896CollInquiryQualifier.values()) {
            tagData = new Tag896EnuCollInquiryQualifier(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum896CollInquiryQualifier oneEnum : Enum896CollInquiryQualifier.values()) {
            tagData = new Tag896EnuCollInquiryQualifier(oneEnum);
            assertEquals( "FIX896_ENU_COLL_INQUIRY_QUALIFIER", tagData.toEnumLabelString());
            assertEquals( "896", tagData.toEnumIDString());
            assertEquals( "COLL_INQUIRY_QUALIFIER", tagData.toEnumNameString());
            assertEquals( "CollInquiryQualifier", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - Trade Date
         *  <p>    1 - GC Instrument
         *  <p>    2 - Collateral Instrument
         *  <p>    3 - Substitution Eligible
         *  <p>    4 - Not Assigned
         */
        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.TRADE_DATE );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.GC_INSTRUMENT );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.COLLATERAL_INSTRUMENT );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.SUBSTITUTION_ELIGIBLE );
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.NOT_ASSIGNED );
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    5 - Partially Assigned
         *  <p>    6 - Fully Assigned
         *  <p>    7 - Outstanding Trades (Today < end date)
         */
        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.PARTIALLY_ASSIGNED );
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.FULLY_ASSIGNED );
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag896EnuCollInquiryQualifier( Enum896CollInquiryQualifier.OUTSTANDING_TRADES );
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum896CollInquiryQualifier oneEnum : Enum896CollInquiryQualifier.values()) {
            tagData = new Tag896EnuCollInquiryQualifier(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum896CollInquiryQualifier oneEnum : Enum896CollInquiryQualifier.values()) {
            tagData = new Tag896EnuCollInquiryQualifier(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum896CollInquiryQualifier oneEnum : Enum896CollInquiryQualifier.values()) {
            tagData = new Tag896EnuCollInquiryQualifier(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum896CollInquiryQualifier oneEnum : Enum896CollInquiryQualifier.values()) {
            tagData = new Tag896EnuCollInquiryQualifier(oneEnum);
            assertEquals( "Tag896EnuCollInquiryQualifier\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}