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
import com.hwtsllc.fixengine2022.fix43.enums.Enum546Scope;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  546
 *  Scope
 *  MultipleCharValue
 *  <p>
 *  Specifies the market scope of the market data.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Local Market (Exchange, ECN, ATS)
 *  <p>    2 - National
 *  <p>    3 - Global
 */
class Tag546EnuScopeTest {
    @Test
    void FIX0546Test() {
        FIX43 fixData = FIX43.FIX546_ENU_MARKET_SCOPE;
        assertEquals( "546", fixData.toEnumIDString());
        assertEquals( "MARKET_SCOPE", fixData.toEnumNameString());
        assertEquals( "MarketScope", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0546Test() {
        Tag546EnuScope tagData;

        tagData = new Tag546EnuScope( Enum546Scope.LOCAL_MARKET);
        assertEquals( Enum546Scope.LOCAL_MARKET.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag546EnuScope( Enum546Scope.NATIONAL);
        assertEquals( Enum546Scope.NATIONAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag546EnuScope( Enum546Scope.GLOBAL);
        assertEquals( Enum546Scope.GLOBAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag546EnuScope tagData;

        // loop around the ENUM and process
        for ( Enum546Scope oneEnum : Enum546Scope.values()) {
            tagData = new Tag546EnuScope(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag546EnuScope tagData;

        // loop around the ENUM and process
        for ( Enum546Scope oneEnum : Enum546Scope.values()) {
            tagData = new Tag546EnuScope(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag546EnuScope tagData;

        // loop around the ENUM and process
        for ( Enum546Scope oneEnum : Enum546Scope.values()) {
            tagData = new Tag546EnuScope(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag546EnuScope tagData;

        // loop around the ENUM and process
        for ( Enum546Scope oneEnum : Enum546Scope.values()) {
            tagData = new Tag546EnuScope(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag546EnuScope tagData;

        // loop around the ENUM and process
        for ( Enum546Scope oneEnum : Enum546Scope.values()) {
            tagData = new Tag546EnuScope(oneEnum);
            assertEquals( "Tag546EnuScope\n" +
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