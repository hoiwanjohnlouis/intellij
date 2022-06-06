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
import com.hwtsllc.fixengine2022.fix43.enums.Enum585MassStatusReqType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  585
 *  MassStatusReqType
 *  int
 *  <p></p>
 *  Mass Status Request Type
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Status for orders for a Security
 *  <p>    2 - Status for orders for an Underlying Security
 *  <p>    3 - Status for orders for a Product
 *  <p>    4 - Status for orders for a CFICode
 *  <p>    5 - Status for orders for a SecurityType
 *  <p></p>
 *  <p>    6 - Status for orders for a trading session
 *  <p>    7 - Status for all orders
 *  <p>    8 - Status for orders for a PartyID
 */
class Tag585EnuMassStatusReqTypeTest {
    @Test
    void FIX0585Test() {
        FIX43 fixData = FIX43.FIX585_ENU_MASS_STATUS_REQ_TYPE;
        assertEquals( "585", fixData.toFIXIDString());
        assertEquals( "MASS_STATUS_REQ_TYPE", fixData.toFIXNameString());
        assertEquals( "MassStatusReqType", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0585Test() {
        Tag585EnuMassStatusReqType tagData;

        /*
         *  1-8 types
         */
        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_SECURITY );
        assertEquals( Enum585MassStatusReqType.STATUS_ORDERS_FOR_SECURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_UNDERLYING );
        assertEquals( Enum585MassStatusReqType.STATUS_ORDERS_FOR_UNDERLYING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_PRODUCT );
        assertEquals( Enum585MassStatusReqType.STATUS_ORDERS_FOR_PRODUCT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_CFICODE );
        assertEquals( Enum585MassStatusReqType.STATUS_ORDERS_FOR_CFICODE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_SECURITYTYPE );
        assertEquals( Enum585MassStatusReqType.STATUS_ORDERS_FOR_SECURITYTYPE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_SESSION );
        assertEquals( Enum585MassStatusReqType.STATUS_ORDERS_FOR_SESSION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ALL_ORDERS );
        assertEquals( Enum585MassStatusReqType.STATUS_ALL_ORDERS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag585EnuMassStatusReqType( Enum585MassStatusReqType.STATUS_ORDERS_FOR_PARTYID );
        assertEquals( Enum585MassStatusReqType.STATUS_ORDERS_FOR_PARTYID.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag585EnuMassStatusReqType tagData;

        // loop around the ENUM and process
        for ( Enum585MassStatusReqType oneEnum : Enum585MassStatusReqType.values()) {
            tagData = new Tag585EnuMassStatusReqType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag585EnuMassStatusReqType tagData;

        // loop around the ENUM and process
        for (Enum585MassStatusReqType oneEnum : Enum585MassStatusReqType.values()) {
            tagData = new Tag585EnuMassStatusReqType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag585EnuMassStatusReqType tagData;

        // loop around the ENUM and process
        for (Enum585MassStatusReqType oneEnum : Enum585MassStatusReqType.values()) {
            tagData = new Tag585EnuMassStatusReqType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag585EnuMassStatusReqType tagData;

        // loop around the ENUM and process
        for (Enum585MassStatusReqType oneEnum : Enum585MassStatusReqType.values()) {
            tagData = new Tag585EnuMassStatusReqType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag585EnuMassStatusReqType tagData;

        // loop around the ENUM and process
        for (Enum585MassStatusReqType oneEnum : Enum585MassStatusReqType.values()) {
            tagData = new Tag585EnuMassStatusReqType(oneEnum);
            assertEquals( "Tag585EnuMassStatusReqType\n" +
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