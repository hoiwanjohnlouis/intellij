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

import com.hwtsllc.fixengine2022.fix43.enums.Enum531MassCancelResponse;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag531EnuMassCancelResponseTest {
    Tag531EnuMassCancelResponse tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum531MassCancelResponse oneEnum : Enum531MassCancelResponse.values()) {
            tagData = new Tag531EnuMassCancelResponse(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum531MassCancelResponse oneEnum : Enum531MassCancelResponse.values()) {
            tagData = new Tag531EnuMassCancelResponse(oneEnum);
            assertEquals( "FIX531_ENU_MASS_CANCEL_RESPONSE", tagData.toEnumLabelString());
            assertEquals( "531", tagData.toEnumIDString());
            assertEquals( "MASS_CANCEL_RESPONSE", tagData.toEnumNameString());
            assertEquals( "MassCancelResponse", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum531MassCancelResponse oneEnum : Enum531MassCancelResponse.values()) {
            tagData = new Tag531EnuMassCancelResponse(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  531
         *  MassCancelResponse
         *  char
         *  <p>    0 - Cancel Request Rejected - See MassCancelRejectReason (532)
         *  <p>    1 - Cancel orders for a security
         *  <p>    2 - Cancel orders for an Underlying Security
         *  <p>    3 - Cancel orders for a Product
         *  <p>    4 - Cancel orders for a CFICode
         */
        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_REQUEST_REJECTED );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SECURITY );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_UNDERLYING );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_PRODUCT );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_CFICODE );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - Cancel orders for a SecurityType
         *  <p>    6 - Cancel orders for a trading session
         *  <p>    7 - Cancel All Orders
         */
        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SECURITYTYPE );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ORDERS_FOR_SESSION );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag531EnuMassCancelResponse( Enum531MassCancelResponse.CANCEL_ALL_ORDERS );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum531MassCancelResponse oneEnum : Enum531MassCancelResponse.values()) {
            tagData = new Tag531EnuMassCancelResponse(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum531MassCancelResponse oneEnum : Enum531MassCancelResponse.values()) {
            tagData = new Tag531EnuMassCancelResponse(oneEnum);
            assertEquals( "Tag531EnuMassCancelResponse\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
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