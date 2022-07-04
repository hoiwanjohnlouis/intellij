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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum419BasisPxType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  419
 *  BasisPxType
 *  char
 *  <p>
 *  Code to represent the basis price type.
 *  <p></p>
 *  Valid values:
 *  <p>    2 - Closing price at morning session
 *  <p>    3 - Closing price
 *  <p>    4 - Current price
 *  <p>    5 - SQ
 *  <p>    6 - VWAP through a day
 *  <p></p>
 *  <p>    7 - VWAP through a morning session
 *  <p>    8 - VWAP through an afternoon session
 *  <p>    9 - VWAP through a day except "YORI" (an opening auction)
 *  <p></p>
 *  <p>    A - VWAP through a morning session except "YORI" (an opening auction)
 *  <p>    B - VWAP through an afternoon session except "YORI" (an opening auction)
 *  <p>    C - Strike
 *  <p>    D - Open
 *  <p></p>
 *  <p>    Z - Others
 */
class Tag419EnuBasisPxTypeTest {
    @Test
    void FIX0419Test() {
        FIX42 fixData = FIX42.FIX419_ENU_BASIS_PX_TYPE;
        assertEquals( "419", fixData.toEnumIDString());
        assertEquals( "BASIS_PX_TYPE", fixData.toEnumNameString());
        assertEquals( "BasisPxType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0419Test() {
        Tag419EnuBasisPxType tagData;

        /*
         *  2-9, A-D, Z msg types
         */
        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.CLOSING_PRICE_MORNING);
        assertEquals( Enum419BasisPxType.CLOSING_PRICE_MORNING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.CLOSING_PRICE);
        assertEquals( Enum419BasisPxType.CLOSING_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.CURRENT_PRICE);
        assertEquals( Enum419BasisPxType.CURRENT_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.SQ);
        assertEquals( Enum419BasisPxType.SQ.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_DAY);
        assertEquals( Enum419BasisPxType.VWAP_DAY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_MORNING);
        assertEquals( Enum419BasisPxType.VWAP_MORNING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_AFTERNOON);
        assertEquals( Enum419BasisPxType.VWAP_AFTERNOON.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_DAY_EXCEPT_YORI);
        assertEquals( Enum419BasisPxType.VWAP_DAY_EXCEPT_YORI.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_MORNING_EXCEPT_YORI);
        assertEquals( Enum419BasisPxType.VWAP_MORNING_EXCEPT_YORI.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI);
        assertEquals( Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.STRIKE);
        assertEquals( Enum419BasisPxType.STRIKE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.OPEN);
        assertEquals( Enum419BasisPxType.OPEN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.OTHER);
        assertEquals( Enum419BasisPxType.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag419EnuBasisPxType tagData;

        // loop around the ENUM and process
        for (Enum419BasisPxType oneEnum : Enum419BasisPxType.values()) {
            tagData = new Tag419EnuBasisPxType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag419EnuBasisPxType tagData;

        // loop around the ENUM and process
        for (Enum419BasisPxType oneEnum : Enum419BasisPxType.values()) {
            tagData = new Tag419EnuBasisPxType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag419EnuBasisPxType tagData;

        // loop around the ENUM and process
        for (Enum419BasisPxType oneEnum : Enum419BasisPxType.values()) {
            tagData = new Tag419EnuBasisPxType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag419EnuBasisPxType tagData;

        // loop around the ENUM and process
        for (Enum419BasisPxType oneEnum : Enum419BasisPxType.values()) {
            tagData = new Tag419EnuBasisPxType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag419EnuBasisPxType tagData;

        // loop around the ENUM and process
        for (Enum419BasisPxType oneEnum : Enum419BasisPxType.values()) {
            tagData = new Tag419EnuBasisPxType(oneEnum);
            assertEquals( "Tag419EnuBasisPxType\n" +
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