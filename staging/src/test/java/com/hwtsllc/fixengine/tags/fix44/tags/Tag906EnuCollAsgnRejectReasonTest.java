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

package com.hwtsllc.fixengine.tags.fix44.tags;

import com.hwtsllc.fixengine2022.fix44.enums.Enum906CollAsgnRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag906EnuCollAsgnRejectReasonTest {
    Tag906EnuCollAsgnRejectReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum906CollAsgnRejectReason oneEnum : Enum906CollAsgnRejectReason.values()) {
            tagData = new Tag906EnuCollAsgnRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum906CollAsgnRejectReason oneEnum : Enum906CollAsgnRejectReason.values()) {
            tagData = new Tag906EnuCollAsgnRejectReason(oneEnum);
            assertEquals( "FIX906_ENU_COLL_ASGN_REJECT_REASON", tagData.toFIXLabelString());
            assertEquals( "906", tagData.toFIXIDString());
            assertEquals( "COLL_ASGN_REJECT_REASON", tagData.toFIXNameString());
            assertEquals( "CollAsgnRejectReason", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum906CollAsgnRejectReason oneEnum : Enum906CollAsgnRejectReason.values()) {
            tagData = new Tag906EnuCollAsgnRejectReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  906
         *  CollAsgnRejectReason
         *  int
         *  <p>    0 - Unknown deal (order or trade)
         *  <p>    1 - Unknown or invalid instrument
         *  <p>    2 - Unauthorized transaction
         *  <p>    3 - Insufficient collateral
         *  <p>    4 - Invalid type of collateral
         */
        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.UNKNOWN_DEAL );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.INVALID_INSTRUMENT );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.UNAUTHORIZED_TRANSACTION );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.INSUFFICIENT_COLLATERAL );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.INVALID_COLLATERAL );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Excessive substitution
         */
        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.EXCESSIVE_SUBSTITUTION );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    99 - Other
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.OTHER );
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum906CollAsgnRejectReason oneEnum : Enum906CollAsgnRejectReason.values()) {
            tagData = new Tag906EnuCollAsgnRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum906CollAsgnRejectReason oneEnum : Enum906CollAsgnRejectReason.values()) {
            tagData = new Tag906EnuCollAsgnRejectReason(oneEnum);
            assertEquals( "Tag906EnuCollAsgnRejectReason\n" +
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