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
import com.hwtsllc.fixengine2022.fix43.enums.Enum477DistribPaymentMethod;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  477 (same as 477,)
 *  DistribPaymentMethod
 *  int
 *  <p></p>
 *  A code identifying the payment method for a (fractional) distribution.
 *  13 through 998 are reserved for future use
 *  <p>
 *  Values above 1000 are available for use by private agreement among counterparties
 *  <p></p>
 *  Valid values:
 *  <p>    1 - CREST
 *  <p>    2 - NSCC
 *  <p>    3 - Euroclear
 *  <p>    4 - Clearstream
 *  <p>    5 - Cheque
 *  <p></p>
 *  <p>    6 - Telegraphic Transfer
 *  <p>    7 - Fed Wire
 *  <p>    8 - Direct Credit (BECS,BACS)
 *  <p>    9 - ACH Debit
 *  <p>    10 - BPAY
 *  <p></p>
 *  <p>    11 - High Value Clearing System HVACS
 *  <p>    12 - Reinvest In Fund
 *  <p>    or any value conforming to the data type Reserved1000Plus
 */
class Tag477EnuDistribPaymentMethodTest {
    @Test
    void FIX0477Test() {
        FIX43 fixData = FIX43.FIX477_ENU_DISTRIB_PAYMENT_METHOD;
        assertEquals( "477", fixData.toEnumIDString());
        assertEquals( "DISTRIB_PAYMENT_METHOD", fixData.toEnumNameString());
        assertEquals( "DistribPaymentMethod", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0477Test() {
        Tag477EnuDistribPaymentMethod tagData;

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.CREST );
        assertEquals( Enum477DistribPaymentMethod.CREST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.NSCC );
        assertEquals( Enum477DistribPaymentMethod.NSCC.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.EUROCLEAR );
        assertEquals( Enum477DistribPaymentMethod.EUROCLEAR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.CLEARSTREAM );
        assertEquals( Enum477DistribPaymentMethod.CLEARSTREAM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.CHEQUE );
        assertEquals( Enum477DistribPaymentMethod.CHEQUE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.TELEGRAPHIC_TRANSFER );
        assertEquals( Enum477DistribPaymentMethod.TELEGRAPHIC_TRANSFER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.FED_WIRE );
        assertEquals( Enum477DistribPaymentMethod.FED_WIRE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.DIRECT_CREDIT );
        assertEquals( Enum477DistribPaymentMethod.DIRECT_CREDIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.ACH_CREDIT );
        assertEquals( Enum477DistribPaymentMethod.ACH_CREDIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.BPAY );
        assertEquals( Enum477DistribPaymentMethod.BPAY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.HIGH_VALUE_CLEARING_SYSTEM );
        assertEquals( Enum477DistribPaymentMethod.HIGH_VALUE_CLEARING_SYSTEM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.REINVEST_IN_FUND );
        assertEquals( Enum477DistribPaymentMethod.REINVEST_IN_FUND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag477EnuDistribPaymentMethod tagData;

        // loop around the ENUM and process
        for ( Enum477DistribPaymentMethod oneEnum : Enum477DistribPaymentMethod.values()) {
            tagData = new Tag477EnuDistribPaymentMethod(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag477EnuDistribPaymentMethod tagData;

        // loop around the ENUM and process
        for (Enum477DistribPaymentMethod oneEnum : Enum477DistribPaymentMethod.values()) {
            tagData = new Tag477EnuDistribPaymentMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag477EnuDistribPaymentMethod tagData;

        // loop around the ENUM and process
        for (Enum477DistribPaymentMethod oneEnum : Enum477DistribPaymentMethod.values()) {
            tagData = new Tag477EnuDistribPaymentMethod(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag477EnuDistribPaymentMethod tagData;

        // loop around the ENUM and process
        for (Enum477DistribPaymentMethod oneEnum : Enum477DistribPaymentMethod.values()) {
            tagData = new Tag477EnuDistribPaymentMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag477EnuDistribPaymentMethod tagData;

        // loop around the ENUM and process
        for (Enum477DistribPaymentMethod oneEnum : Enum477DistribPaymentMethod.values()) {
            tagData = new Tag477EnuDistribPaymentMethod(oneEnum);
            assertEquals( "Tag477EnuDistribPaymentMethod\n" +
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