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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.fix43.enums.Enum532MassCancelRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag532EnuMassCancelRejectReasonTest {
    Tag532EnuMassCancelRejectReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            tagData = new Tag532EnuMassCancelRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            tagData = new Tag532EnuMassCancelRejectReason(oneEnum);
            assertEquals( "FIX532_ENU_MASS_CANCEL_REJECT_REASON", tagData.toFIXLabelString());
            assertEquals( "532", tagData.toFIXIDString());
            assertEquals( "MASS_CANCEL_REJECT_REASON", tagData.toEnumNameString());
            assertEquals( "MassCancelRejectReason", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            tagData = new Tag532EnuMassCancelRejectReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  532
         *  MassCancelRejectReason
         *  int
         *  <p>    0 - Mass Cancel Not Supported
         *  <p>    1 - Invalid or Unknown Security
         *  <p>    2 - Invalid or Unknown Underlying security
         *  <p>    3 - Invalid or Unknown Product
         *  <p>    4 - Invalid or Unknown CFICode
         */
        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.MASS_CANCEL_NOT_SUPPORTED );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.UNKNOWN_SECURITY );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.UNKNOWN_UNDERLYING );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.UNKNOWN_PRODUCT );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.UNKNOWN_CFICODE );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  532
         *  MassCancelRejectReason
         *  int
         *  <p>    5 - Invalid or Unknown SecurityType
         *  <p>    6 - Invalid or Unknown Trading Session
         */
        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.UNKNOWN_SECURITYTYPE );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.UNKNOWN_SESSION );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    99 - Other
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.OTHER );
        assertEquals( "99", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            tagData = new Tag532EnuMassCancelRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            tagData = new Tag532EnuMassCancelRejectReason(oneEnum);
            assertEquals( "Tag532EnuMassCancelRejectReason\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
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