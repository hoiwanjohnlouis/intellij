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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.MyEnumIOIQty;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  27 (same as 27, 682)
 *  IOIQty
 *  String
 *  <p>
 *  Quantity (e.g. number of shares) in numeric form or relative size.
 *  <p></p>
 *  682 (same as 27, 682)
 *  LegIOIQty
 *  String
 *  <p>
 *  Leg-specific IOI quantity.
 *  <p>
 *  See IOIQty (27) for description and valid values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - 1000000000
 *  <p>    S - Small
 *  <p>    M - Medium
 *  <p>    L - Large
 *  <p>    U - Undisclosed Quantity
 */
class Tag27EnuIOIQtyTest {

    @Test
    void FIX0027Test() {
        FIX27 fixData = FIX27.FIX27_ENU_IOI_SHARES;
        assertEquals( "IOI_SHARES", fixData.toFIXNameString());
        assertEquals( "27", fixData.toFIXIDString());
        assertEquals( "IOIShares", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0027Test() {
        Tag27EnuIOIQty tagData;

        tagData = new Tag27EnuIOIQty(MyEnumIOIQty.ONE_BILLION);
        assertEquals( MyEnumIOIQty.ONE_BILLION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag27EnuIOIQty(MyEnumIOIQty.SMALL);
        assertEquals( MyEnumIOIQty.SMALL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag27EnuIOIQty(MyEnumIOIQty.MEDIUM);
        assertEquals( MyEnumIOIQty.MEDIUM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag27EnuIOIQty(MyEnumIOIQty.LARGE);
        assertEquals( MyEnumIOIQty.LARGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag27EnuIOIQty(MyEnumIOIQty.UNDISCLOSED_QUANTITY);
        assertEquals( MyEnumIOIQty.UNDISCLOSED_QUANTITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag27EnuIOIQty tagData;

        // loop around the ENUM and process
        for (MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag27EnuIOIQty(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag27EnuIOIQty tagData;

        // loop around the ENUM and process
        for (MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag27EnuIOIQty(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag27EnuIOIQty tagData;

        // loop around the ENUM and process
        for (MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag27EnuIOIQty(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag27EnuIOIQty tagData;

        // loop around the ENUM and process
        for (MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag27EnuIOIQty(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag27EnuIOIQty tagData;

        // loop around the ENUM and process
        for (MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag27EnuIOIQty(oneEnum);
            assertEquals( "Tag27EnuIOIQty\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}