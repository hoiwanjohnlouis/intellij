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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.fix42.enums.Enum411ExchangeForPhysical;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  411
 *  ExchangeForPhysical
 *  Boolean
 *  <p>
 *  Indicates whether or not to exchange for phsyical.
 *  <p></p>
 *  Valid values:
 *  <p>    N - False
 *  <p>    Y - True
 */
class Tag411EnuExchangeForPhysicalTest {
    Tag411EnuExchangeForPhysical tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum411ExchangeForPhysical oneEnum : Enum411ExchangeForPhysical.values()) {
            tagData = new Tag411EnuExchangeForPhysical(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum411ExchangeForPhysical oneEnum : Enum411ExchangeForPhysical.values()) {
            tagData = new Tag411EnuExchangeForPhysical(oneEnum);
            assertEquals( "FIX411_ENU_EXCHANGE_FOR_PHYSICAL", tagData.toEnumLabelString());
            assertEquals( "411", tagData.toEnumIDString());
            assertEquals( "EXCHANGE_FOR_PHYSICAL", tagData.toEnumNameString());
            assertEquals( "ExchangeForPhysical", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        tagData = new Tag411EnuExchangeForPhysical(Enum411ExchangeForPhysical.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag411EnuExchangeForPhysical(Enum411ExchangeForPhysical.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum411ExchangeForPhysical oneEnum : Enum411ExchangeForPhysical.values()) {
            tagData = new Tag411EnuExchangeForPhysical(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum411ExchangeForPhysical oneEnum : Enum411ExchangeForPhysical.values()) {
            tagData = new Tag411EnuExchangeForPhysical(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum411ExchangeForPhysical oneEnum : Enum411ExchangeForPhysical.values()) {
            tagData = new Tag411EnuExchangeForPhysical(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum411ExchangeForPhysical oneEnum : Enum411ExchangeForPhysical.values()) {
            tagData = new Tag411EnuExchangeForPhysical(oneEnum);
            assertEquals( "Tag411EnuExchangeForPhysical\n" +
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