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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  FIX30 enum defines all the Financial Exchange Protocol's (FIX) fields.
 *  It consists of 3 fields.
 *  <p>
 *         ENUMName     Enum Name has the FIXn prefix *n* is the tag number defined by FIX Protocol document.
 *                      There may be a secondary prefix denoting the data type.
 *  <p>
 *  <p>                 BOOL = EnumType field
 *  <p>                 ENU = EnumType field
 *  <p>                 AMT = MyAmtType field, saved as double
 *  <p>                 CCY = MyCurrencyType field, saved as String
 *  <p>                 CHA = MyCharType field, saved as char
 *  <p>                 COU = MyCountryType field, saved as String
 *  <p>                 DAT = MyDataType field, saved as String
 *  <p>                 EXC = MyExchangeType field, saved as String
 *  <p>                 FLO = MyFloatType field, saved as float
 *  <p>                 INT = MyIntType field, saved as int
 *  <p>                 LEN = MyLengthType field, saved as int
 *  <p>                 LMD = MyLocalMktDateType field, saved as String
 *  <p>                 NUM = MyNumInGroupType field, saved as int
 *  <p>                 PCT = MyPercentageType field, saved as String
 *  <p>                 PRC = MyPriceType field, saved as String
 *  <p>                 PXO = MyPriceOffsetType field, saved as String
 *  <p>                 QTY = MyQtyType field, saved as int
 *  <p>                 SEQ = MySeqNumType field, saved as int
 *  <p>                 STR = MyStringType field, saved as String
 *  <p>                 UTC = MyUTCTimestampType field, saved as String
 *  <p>                 UTCD = MyUTCDateType field, saved as String
 *  <p>                 UTCT = MyUTCTimeType field, saved as String
 *  <p>                 others to follow
 *  <p>
 * String  id           The identifier of the field as defined by the FIX protocol document, no duplicates.
 *                      Even though *id* is really an *int*, this app treats it as a String. so save it as a String.
 *  <p>
 * String  name         The short NAME of the field as defined by the FIX protocol document, no duplicates
 *  <p>
 * String  description  A short blurb which describes what information the field contains
 */
public enum FIX30 implements LogFIXString, LogVerboseString {


    /*
     * Start of FIX3.0 as defined by the FIX Protocol Specification 3.0
     *  Tags: 104-113
     */
    FIX104_ENU_IOI_QUALIFIER(104, "IOI_QUALIFIER", "IOIQualifier"),
    FIX105_STR_WAVE_NO(105, "WAVE_NO", "WaveNo"),
    FIX106_STR_ISSUER(106, "ISSUER", "Issuer"),
    FIX107_STR_SECURITY_DESC(107, "SECURITY_DESC", "SecurityDesc"),
    FIX108_INT_HEART_BT_INT(108, "HEART_BT_INT", "HeartBtInt"),
    FIX109_STR_CLIENT_ID(109, "CLIENT_ID", "ClientID (replaced)"),
    FIX110_QTY_MIN_QTY(110, "MIN_QTY", "MinQty"),

    FIX111_QTY_MAX_FLOOR(111, "MAX_FLOOR", "MaxFloor"),
    FIX112_STR_TEST_REQ_ID(112, "TEST_REQ_ID", "TestReqID"),
    FIX113_BOOL_REPORT_TO_EXCH(113, "REPORT_TO_EXCH", "ReportToExch"),
    /*
     *
     * End of FIX3.0
     *
     */


    ;


    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////


    private final String id;
    private final String name;
    private final String description;

    FIX30(final int id, final String name, final String description) {
        /*
         *  Even though fixNumber is an *int*, this app treats it as a String,
         *  so convert the field at load time instead of changing the lines.
         *
         *  todo: convert all definition lines to be String instead of int.
         *
         */
        this.id = String.valueOf(id);
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumNameString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific ID code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tFIXTypeName[")
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tFIXNumber[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tFIXName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tFIXDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    @Override
    public String toString() {
        return toEnumNameString()
                .concat("=[")
                .concat(toFIXIDString())
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
                .concat("]");
    }

    /**
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (FIX30 oneFIX : FIX30.values()) {
            System.out.println(oneFIX);
        }
    }
}
