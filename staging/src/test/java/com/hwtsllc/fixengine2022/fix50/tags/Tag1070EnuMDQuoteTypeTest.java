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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1070MDQuoteType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1070
 *  MDQuoteType
 *  int
 *  <p>
 *  Identifies market data quote type.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Indicative
 *  <p>    1 - Tradeable
 *  <p>    2 - Restricted Tradeable
 *  <p>    3 - Counter
 *  <p>    4 - Indicative and Tradeable
 */
class Tag1070EnuMDQuoteTypeTest {
    @Test
    void FIX1070Test() {
        FIX50 fixData = FIX50.FIX1070_ENU_MD_QUOTE_TYPE;
        assertEquals( "1070", fixData.toEnumIDString());
        assertEquals( "MD_QUOTE_TYPE", fixData.toEnumNameString());
        assertEquals( "MDQuoteType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1070Test() {
        Tag1070EnuMDQuoteType tagData;

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.INDICATIVE );
        assertEquals( Enum1070MDQuoteType.INDICATIVE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.TRADEABLE );
        assertEquals( Enum1070MDQuoteType.TRADEABLE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.RESTRICTED );
        assertEquals( Enum1070MDQuoteType.RESTRICTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.COUNTER );
        assertEquals( Enum1070MDQuoteType.COUNTER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.INDICATIVE_TRADEABLE );
        assertEquals( Enum1070MDQuoteType.INDICATIVE_TRADEABLE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1070EnuMDQuoteType tagData;

        // loop around the ENUM and process
        for ( Enum1070MDQuoteType oneEnum : Enum1070MDQuoteType.values()) {
            tagData = new Tag1070EnuMDQuoteType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1070EnuMDQuoteType tagData;

        // loop around the ENUM and process
        for (Enum1070MDQuoteType oneEnum : Enum1070MDQuoteType.values()) {
            tagData = new Tag1070EnuMDQuoteType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1070EnuMDQuoteType tagData;

        // loop around the ENUM and process
        for (Enum1070MDQuoteType oneEnum : Enum1070MDQuoteType.values()) {
            tagData = new Tag1070EnuMDQuoteType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1070EnuMDQuoteType tagData;

        // loop around the ENUM and process
        for (Enum1070MDQuoteType oneEnum : Enum1070MDQuoteType.values()) {
            tagData = new Tag1070EnuMDQuoteType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1070EnuMDQuoteType tagData;

        // loop around the ENUM and process
        for (Enum1070MDQuoteType oneEnum : Enum1070MDQuoteType.values()) {
            tagData = new Tag1070EnuMDQuoteType(oneEnum);
            assertEquals( "Tag1070EnuMDQuoteType\n" +
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