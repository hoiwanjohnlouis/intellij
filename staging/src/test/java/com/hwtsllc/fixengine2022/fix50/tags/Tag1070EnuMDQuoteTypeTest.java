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

import com.hwtsllc.fixengine2022.fix50.enums.Enum1070MDQuoteType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1070EnuMDQuoteTypeTest {
    Tag1070EnuMDQuoteType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum1070MDQuoteType oneEnum : Enum1070MDQuoteType.values()) {
            tagData = new Tag1070EnuMDQuoteType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum1070MDQuoteType oneEnum : Enum1070MDQuoteType.values()) {
            tagData = new Tag1070EnuMDQuoteType(oneEnum);
            assertEquals( "FIX1070_ENU_MD_QUOTE_TYPE", tagData.toEnumLabelString());
            assertEquals( "1070", tagData.toEnumIDString());
            assertEquals( "MD_QUOTE_TYPE", tagData.toEnumNameString());
            assertEquals( "MDQuoteType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1070MDQuoteType oneEnum : Enum1070MDQuoteType.values()) {
            tagData = new Tag1070EnuMDQuoteType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1070
         *  MDQuoteType
         *  int
         *  <p>    0 - Indicative
         *  <p>    1 - Tradeable
         *  <p>    2 - Restricted Tradeable
         *  <p>    3 - Counter
         *  <p>    4 - Indicative and Tradeable
         */
        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.INDICATIVE );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.TRADEABLE );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.RESTRICTED );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.COUNTER );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1070EnuMDQuoteType( Enum1070MDQuoteType.INDICATIVE_TRADEABLE );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum1070MDQuoteType oneEnum : Enum1070MDQuoteType.values()) {
            tagData = new Tag1070EnuMDQuoteType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum1070MDQuoteType oneEnum : Enum1070MDQuoteType.values()) {
            tagData = new Tag1070EnuMDQuoteType(oneEnum);
            assertEquals( "Tag1070EnuMDQuoteType\n" +
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