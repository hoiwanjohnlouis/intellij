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

import com.hwtsllc.fixengine2022.fix42.enums.Enum419BasisPxType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag419EnuBasisPxTypeTest {
    Tag419EnuBasisPxType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum419BasisPxType oneEnum : Enum419BasisPxType.values()) {
            tagData = new Tag419EnuBasisPxType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum419BasisPxType oneEnum : Enum419BasisPxType.values()) {
            tagData = new Tag419EnuBasisPxType(oneEnum);
            assertEquals( "FIX419_ENU_BASIS_PX_TYPE", tagData.toFIXLabelString());
            assertEquals( "419", tagData.toFIXIDString());
            assertEquals( "BASIS_PX_TYPE", tagData.toFIXNameString());
            assertEquals( "BasisPxType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum419BasisPxType oneEnum : Enum419BasisPxType.values()) {
            tagData = new Tag419EnuBasisPxType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  419
         *  BasisPxType
         *  char
         *  <p>    2 - Closing price at morning session
         *  <p>    3 - Closing price
         *  <p>    4 - Current price
         *  <p>    5 - SQ
         *  <p>    6 - VWAP through a day
         */
        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.CLOSING_PRICE_MORNING);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.CLOSING_PRICE);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.CURRENT_PRICE);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.SQ);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_DAY);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    7 - VWAP through a morning session
         *  <p>    8 - VWAP through an afternoon session
         *  <p>    9 - VWAP through a day except "YORI" (an opening auction)
         */
        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_MORNING);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_AFTERNOON);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_DAY_EXCEPT_YORI);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    A - VWAP through a morning session except "YORI" (an opening auction)
         *  <p>    B - VWAP through an afternoon session except "YORI" (an opening auction)
         *  <p>    C - Strike
         *  <p>    D - Open
         */
        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_MORNING_EXCEPT_YORI);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.VWAP_AFTERNOON_EXCEPT_YORI);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.STRIKE);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.OPEN);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    Z - Others
         */
        tagData = new Tag419EnuBasisPxType(Enum419BasisPxType.OTHER);
        assertEquals( "Z", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum419BasisPxType oneEnum : Enum419BasisPxType.values()) {
            tagData = new Tag419EnuBasisPxType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum419BasisPxType oneEnum : Enum419BasisPxType.values()) {
            tagData = new Tag419EnuBasisPxType(oneEnum);
            assertEquals( "Tag419EnuBasisPxType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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