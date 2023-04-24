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

package com.hwtsllc.fixengine.tags.fix42.tags;

import com.hwtsllc.fixengine.tags.fix42.enums.Enum388DiscretionInst;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag388EnuDiscretionInstTest {
    Tag388EnuDiscretionInst tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            tagData = new Tag388EnuDiscretionInst(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            tagData = new Tag388EnuDiscretionInst(oneEnum);
            assertEquals( "FIX388_ENU_DISCRETION_INST", tagData.toFIXLabelString());
            assertEquals( "388", tagData.toFIXIDString());
            assertEquals( "DISCRETION_INST", tagData.toFIXNameString());
            assertEquals( "DiscretionInst", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            tagData = new Tag388EnuDiscretionInst(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  388
         *  DiscretionInst
         *  char
         *  <p>     0 - Related to displayed price
         *  <p>     1 - Related to market price
         *  <p>     2 - Related to primary price
         *  <p>     3 - Related to local primary price
         *  <p>     4 - Related to midpoint price
         */
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_DISPLAYED_PRICE);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_MARKET_PRICE);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_PRIMARY_PRICE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_LOCAL_PRIMARY_PRICE);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_MIDPOINT_PRICE);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>     5 - Related to last trade price
         *  <p>     6 - Related to VWAP
         *  <p>     7 - Average Price Guarantee
         */
        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_LAST_TRADE_PRICE);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.RELATED_TO_VWAP);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag388EnuDiscretionInst(Enum388DiscretionInst.AVERAGE_PRICE_GUARANTEE);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            tagData = new Tag388EnuDiscretionInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            tagData = new Tag388EnuDiscretionInst(oneEnum);
            assertEquals( "Tag388EnuDiscretionInst\n" +
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