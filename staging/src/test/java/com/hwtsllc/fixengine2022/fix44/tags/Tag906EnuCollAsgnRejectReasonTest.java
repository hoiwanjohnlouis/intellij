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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum906CollAsgnRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  906
 *  CollAsgnRejectReason
 *  int
 *  <p></p>
 *  Collateral Assignment Reject Reason
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unknown deal (order or trade)
 *  <p>    1 - Unknown or invalid instrument
 *  <p>    2 - Unauthorized transaction
 *  <p>    3 - Insufficient collateral
 *  <p>    4 - Invalid type of collateral
 *  <p></p>
 *  <p>    5 - Excessive substitution
 *  <p></p>
 *  <p>    99 - Other
 *  <p></p>
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag906EnuCollAsgnRejectReasonTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX906_ENU_COLL_ASGN_REJECT_REASON;
        assertEquals( "906", fixData.toEnumIDString());
        assertEquals( "COLL_ASGN_REJECT_REASON", fixData.toEnumNameString());
        assertEquals( "CollAsgnRejectReason", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0906Test() {
        Tag906EnuCollAsgnRejectReason tagData;
        Enum906CollAsgnRejectReason oneElement;

        oneElement = Enum906CollAsgnRejectReason.UNKNOWN_DEAL;
        tagData = new Tag906EnuCollAsgnRejectReason( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "906", tagData.toEnumIDString());
        assertEquals( "COLL_ASGN_REJECT_REASON", tagData.toEnumNameString());
        assertEquals( "CollAsgnRejectReason", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.INVALID_INSTRUMENT );
        assertEquals( Enum906CollAsgnRejectReason.INVALID_INSTRUMENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.UNAUTHORIZED_TRANSACTION );
        assertEquals( Enum906CollAsgnRejectReason.UNAUTHORIZED_TRANSACTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.INSUFFICIENT_COLLATERAL );
        assertEquals( Enum906CollAsgnRejectReason.INSUFFICIENT_COLLATERAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.INVALID_COLLATERAL );
        assertEquals( Enum906CollAsgnRejectReason.INVALID_COLLATERAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.EXCESSIVE_SUBSTITUTION );
        assertEquals( Enum906CollAsgnRejectReason.EXCESSIVE_SUBSTITUTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag906EnuCollAsgnRejectReason( Enum906CollAsgnRejectReason.OTHER );
        assertEquals( Enum906CollAsgnRejectReason.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag906EnuCollAsgnRejectReason tagData;

        // loop around the ENUM and process
        for ( Enum906CollAsgnRejectReason oneEnum : Enum906CollAsgnRejectReason.values()) {
            tagData = new Tag906EnuCollAsgnRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag906EnuCollAsgnRejectReason tagData;

        // loop around the ENUM and process
        for (Enum906CollAsgnRejectReason oneEnum : Enum906CollAsgnRejectReason.values()) {
            tagData = new Tag906EnuCollAsgnRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag906EnuCollAsgnRejectReason tagData;

        // loop around the ENUM and process
        for (Enum906CollAsgnRejectReason oneEnum : Enum906CollAsgnRejectReason.values()) {
            tagData = new Tag906EnuCollAsgnRejectReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag906EnuCollAsgnRejectReason tagData;

        // loop around the ENUM and process
        for (Enum906CollAsgnRejectReason oneEnum : Enum906CollAsgnRejectReason.values()) {
            tagData = new Tag906EnuCollAsgnRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag906EnuCollAsgnRejectReason tagData;

        // loop around the ENUM and process
        for (Enum906CollAsgnRejectReason oneEnum : Enum906CollAsgnRejectReason.values()) {
            tagData = new Tag906EnuCollAsgnRejectReason(oneEnum);
            assertEquals( "Tag906EnuCollAsgnRejectReason\n" +
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