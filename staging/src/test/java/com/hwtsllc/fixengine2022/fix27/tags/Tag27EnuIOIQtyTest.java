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
    Tag27EnuIOIQty tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag27EnuIOIQty(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void Tag0027Test() {
        tagData = new Tag27EnuIOIQty(MyEnumIOIQty.ONE_BILLION);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag27EnuIOIQty(MyEnumIOIQty.SMALL);
        assertEquals( "S", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag27EnuIOIQty(MyEnumIOIQty.MEDIUM);
        assertEquals( "M", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag27EnuIOIQty(MyEnumIOIQty.LARGE);
        assertEquals( "L", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag27EnuIOIQty(MyEnumIOIQty.UNDISCLOSED_QUANTITY);
        assertEquals( "U", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag27EnuIOIQty(oneEnum);
            assertEquals( "FIX27_ENU_IOI_SHARES", tagData.toEnumLabelString());
            assertEquals( "IOI_SHARES", tagData.toEnumNameString());
            assertEquals( "27", tagData.toEnumIDString());
            assertEquals( "IOIShares", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // loop around the ENUM and process
        for (MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag27EnuIOIQty(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag27EnuIOIQty(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag27EnuIOIQty(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumIOIQty oneEnum : MyEnumIOIQty.values()) {
            tagData = new Tag27EnuIOIQty(oneEnum);
            assertEquals( "Tag27EnuIOIQty\n" +
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