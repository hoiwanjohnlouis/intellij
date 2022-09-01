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

import com.hwtsllc.fixengine2022.fix43.enums.Enum477DistribPaymentMethod;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag477EnuDistribPaymentMethodTest {
    Tag477EnuDistribPaymentMethod tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum477DistribPaymentMethod oneEnum : Enum477DistribPaymentMethod.values()) {
            tagData = new Tag477EnuDistribPaymentMethod(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum477DistribPaymentMethod oneEnum : Enum477DistribPaymentMethod.values()) {
            tagData = new Tag477EnuDistribPaymentMethod(oneEnum);
            assertEquals( "FIX477_ENU_DISTRIB_PAYMENT_METHOD", tagData.toFIXLabelString());
            assertEquals( "477", tagData.toEnumIDString());
            assertEquals( "DISTRIB_PAYMENT_METHOD", tagData.toEnumNameString());
            assertEquals( "DistribPaymentMethod", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum477DistribPaymentMethod oneEnum : Enum477DistribPaymentMethod.values()) {
            tagData = new Tag477EnuDistribPaymentMethod(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  477 (same as 477,)
         *  DistribPaymentMethod
         *  int
         *  <p>    1 - CREST
         *  <p>    2 - NSCC
         *  <p>    3 - Euroclear
         *  <p>    4 - Clearstream
         *  <p>    5 - Cheque
         */
        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.CREST );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.NSCC );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.EUROCLEAR );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.CLEARSTREAM );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.CHEQUE );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Telegraphic Transfer
         *  <p>    7 - Fed Wire
         *  <p>    8 - Direct Credit (BECS,BACS)
         *  <p>    9 - ACH Debit
         *  <p>    10 - BPAY
         */
        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.TELEGRAPHIC_TRANSFER );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.FED_WIRE );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.DIRECT_CREDIT );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.ACH_CREDIT );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.BPAY );
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    11 - High Value Clearing System HVACS
         *  <p>    12 - Reinvest In Fund
         *  <p>    or any value conforming to the data type Reserved1000Plus
         */
        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.HIGH_VALUE_CLEARING_SYSTEM );
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag477EnuDistribPaymentMethod( Enum477DistribPaymentMethod.REINVEST_IN_FUND );
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum477DistribPaymentMethod oneEnum : Enum477DistribPaymentMethod.values()) {
            tagData = new Tag477EnuDistribPaymentMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum477DistribPaymentMethod oneEnum : Enum477DistribPaymentMethod.values()) {
            tagData = new Tag477EnuDistribPaymentMethod(oneEnum);
            assertEquals( "Tag477EnuDistribPaymentMethod\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
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