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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 * FIXType enum defines all the Financial Exchange Protocol's (FIX) fields.  
 * It consists of 3 fields.
 *
 *         ENUMName     Enum Name has the FIXn prefix *n* is the tag number defined by FIX Prootocol document.
 *                      There may be a secondary prefix denoting the data type.
 *                      ENU = EnumType field
 *                      AMT = MyAmtType field
 *                      EXC = MyExchangeType field, saved as String
 *                      FLO = MyFloatType field, saved as String
 *                      INT = MyIntType field, saved as int
 *                      LEN = MyLengthType field, saved as int
 *                      LMD = MyLocalMktDateType field, saved as String
 *                      NUM = MyNumInGroupType field, saved as int
 *                      PCT = MyPercentageType field, saved as String
 *                      PRC = MyPriceType field, saved as String
 *                      PXO = MyPriceOffsetType field, saved as String
 *                      QTY = MyQtyType field, saved as int
 *                      SEQ = MySeqNumType field, saved as int
 *                      STR = MyStringType field, saved as String
 *                      UTC = MyUTCTimestampType field, saved as String
 *                      others to follow
 * String  id           The identifier of the field as defined by the FIX protocol document, no duplicates.
 *                      Even though *id* is really an *int*, this app treats it as a String. so save it as a String.
 * String  name         The short NAME of the field as defined by the FIX protocol document, no duplicates
 * String  description  A short blurb which describes what information the field contains
 */
@Deprecated
public enum FIXType implements EnumAccessors, LogStringVerbose {
    ;


    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////


    private final String id;
    private final String name;
    private final String description;

    /*
     * used in @Test routine.
     */
    public final static String JUNK_ENUM_NAME = "JunkEnumName";
    public final static String JUNK_ID = "JunkID";
    public final static String JUNK_NAME = "JunkName";
    public final static String JUNK_DESCRIPTION = "JunkDescription";
    public final static String JUNK_AMT_DATA_VALUE = "JunkAmtDataValue";
    public final static int JUNK_INT_DATA_VALUE = -65535;
    public final static int JUNK_LEN_DATA_VALUE = -65535;
    public final static String JUNK_LMD_DATA_VALUE = "JunkLocalMktDateDataValue";
    public final static int JUNK_NUM_DATA_VALUE = -65535;
    public final static String JUNK_PXO_DATA_VALUE = "JunkPriceOffsetDataValue";
    public final static String JUNK_PRC_DATA_VALUE = "JunkPriceDataValue";
    public final static int JUNK_QTY_DATA_VALUE = -65535;
    public final static int JUNK_SEQ_DATA_VALUE = -65535;
    public final static String JUNK_STR_DATA_VALUE = "JunkStringDataValue";
    public final static String JUNK_UTC_DATA_VALUE = "18991231_235959";

    FIXType(final int id, final String name, final String description) {
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

    public String getEnumName() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific ID code for this enum. eg: the first field
     */
    @Override
    public String getID() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public String toLogStringVerbose() {
        return this.getClass().getSimpleName()
                .concat("\n\tFIXTypeName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tFIXNumber[")
                .concat(getID())
                .concat("]")
                .concat("\n\tFIXName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tFIXDescription[")
                .concat(getDescription())
                .concat("]");
    }
    @Override
    public String toString() {
        return getEnumName()
                .concat("=[")
                .concat(getID())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
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
        for (FIXType oneFIX : FIXType.values()) {
            System.out.println(oneFIX);
        }
    }
}
