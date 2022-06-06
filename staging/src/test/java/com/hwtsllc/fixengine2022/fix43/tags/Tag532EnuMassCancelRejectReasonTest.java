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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum532MassCancelRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  532
 *  MassCancelRejectReason
 *  int
 *  <p></p>
 *  Reason Order Mass Cancel Request was rejected
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Mass Cancel Not Supported
 *  <p>    1 - Invalid or Unknown Security
 *  <p>    2 - Invalid or Unkown Underlying security
 *  <p>    3 - Invalid or Unknown Product
 *  <p>    4 - Invalid or Unknown CFICode
 *  <p></p>
 *  <p>    5 - Invalid or Unknown SecurityType
 *  <p>    6 - Invalid or Unknown Trading Session
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag532EnuMassCancelRejectReasonTest {
    @Test
    void FIX0532Test() {
        FIX43 fixData = FIX43.FIX532_ENU_MASS_CANCEL_REJECT_REASON;
        assertEquals( "532", fixData.toFIXIDString());
        assertEquals( "MASS_CANCEL_REJECT_REASON", fixData.toFIXNameString());
        assertEquals( "MassCancelRejectReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0532Test() {
        Tag532EnuMassCancelRejectReason tagData;

        /*
         *  0-6, 99, types
         */

        /*
         *  0-6, types
         */
        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.MASS_CANCEL_NOT_SUPPORTED );
        assertEquals( Enum532MassCancelRejectReason.MASS_CANCEL_NOT_SUPPORTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.UNKNOWN_SECURITY );
        assertEquals( Enum532MassCancelRejectReason.UNKNOWN_SECURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.UNKNOWN_UNDERLYING );
        assertEquals( Enum532MassCancelRejectReason.UNKNOWN_UNDERLYING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.UNKNOWN_PRODUCT );
        assertEquals( Enum532MassCancelRejectReason.UNKNOWN_PRODUCT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.UNKNOWN_CFICODE );
        assertEquals( Enum532MassCancelRejectReason.UNKNOWN_CFICODE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.UNKNOWN_SECURITYTYPE );
        assertEquals( Enum532MassCancelRejectReason.UNKNOWN_SECURITYTYPE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.UNKNOWN_SESSION );
        assertEquals( Enum532MassCancelRejectReason.UNKNOWN_SESSION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  99, type
         */
        tagData = new Tag532EnuMassCancelRejectReason( Enum532MassCancelRejectReason.OTHER );
        assertEquals( Enum532MassCancelRejectReason.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag532EnuMassCancelRejectReason tagData;

        // loop around the ENUM and process
        for ( Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            tagData = new Tag532EnuMassCancelRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag532EnuMassCancelRejectReason tagData;

        // loop around the ENUM and process
        for (Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            tagData = new Tag532EnuMassCancelRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag532EnuMassCancelRejectReason tagData;

        // loop around the ENUM and process
        for (Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            tagData = new Tag532EnuMassCancelRejectReason(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag532EnuMassCancelRejectReason tagData;

        // loop around the ENUM and process
        for (Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            tagData = new Tag532EnuMassCancelRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag532EnuMassCancelRejectReason tagData;

        // loop around the ENUM and process
        for (Enum532MassCancelRejectReason oneEnum : Enum532MassCancelRejectReason.values()) {
            tagData = new Tag532EnuMassCancelRejectReason(oneEnum);
            assertEquals( "Tag532EnuMassCancelRejectReason\n" +
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