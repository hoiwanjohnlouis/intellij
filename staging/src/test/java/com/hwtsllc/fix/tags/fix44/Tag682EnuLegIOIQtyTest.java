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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.MyEnumIOIQty;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag682EnuLegIOIQtyTest {
    Tag682EnuLegIOIQty tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag682EnuLegIOIQty(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag682EnuLegIOIQty(oneEnum);
            assertEquals( "FIX682_ENU_LEG_IOI_QTY", tagData.toFIXLabelString());
            assertEquals( "682", tagData.toFIXIDString());
            assertEquals( "LEG_IOI_QTY", tagData.toFIXNameString());
            assertEquals( "LegIOIQty", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag682EnuLegIOIQty(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  27 (same as 27, 682)
         *  <p>    0 - 1000000000
         *  <p>    S - Small
         *  <p>    M - Medium
         *  <p>    L - Large
         *  <p>    U - Undisclosed Quantity
         */
        tagData = new Tag682EnuLegIOIQty( MyEnumIOIQty.ONE_BILLION );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.SMALL);
        assertEquals( "S", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.MEDIUM);
        assertEquals( "M", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.LARGE);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag682EnuLegIOIQty(MyEnumIOIQty.UNDISCLOSED_QUANTITY);
        assertEquals( "U", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag682EnuLegIOIQty(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag682EnuLegIOIQty(oneEnum);
            assertEquals( "Tag682EnuLegIOIQty\n" +
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