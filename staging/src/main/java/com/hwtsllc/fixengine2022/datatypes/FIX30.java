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
 * FIX30 enum defines all the Financial Exchange Protocol's (FIX) fields.
 * It consists of 3 fields.
 *
 *         ENUMName     Enum Name has the FIXn prefix *n* is the tag number defined by FIX Prootocol document.
 *                      There may be a secondary prefix denoting the data type.
 *                      ET = EnumType field
 *                      ST = StringType field
 *                      NIGT = NumInGroupType field, saved as int
 *                      LT = LengthType field, saved as int
 *                      QT = QtyType field, saved as int
 *                      SNT = SeqNumType field, saved as int
 *                      others to follow
 * String  id           this is the identifier of the field as defined by the FIX protocol document, no duplicates.
 *                      Even though *id* is really an *int*, this app treats it as a String. so save it as a String.
 * String  name         short NAME of the field as defined by the FIX protocol document, no duplicates
 * String  description  a short blurb which describes what information the field contains
 */
public enum FIX30 implements EnumAccessors, LogStringVerbose {


    /*
     * Start of FIX3.0 as defined by the FIX Protocol Specification 3.0
     *  Tags: 104-113
     */
    FIX104_ET_IOI_QUALIFIER(104, "IOI_QUALIFIER", "IOIQualifier"),
    FIX105_WAVE_NO(105, "WAVE_NO", "WaveNo"),
    FIX106_ISSUER(106, "ISSUER", "Issuer"),
    FIX107_SECURITY_DESC(107, "SECURITY_DESC", "SecurityDesc"),
    FIX108_HEART_BT_INT(108, "HEART_BT_INT", "HeartBtInt"),
    FIX109_CLIENT_ID(109, "CLIENT_ID", "ClientID (replaced)"),
    FIX110_MIN_QTY(110, "MIN_QTY", "MinQty"),

    FIX111_MAX_FLOOR(111, "MAX_FLOOR", "MaxFloor"),
    FIX112_TEST_REQ_ID(112, "TEST_REQ_ID", "TestReqID"),
    FIX113_ET_REPORT_TO_EXCH(113, "REPORT_TO_EXCH", "ReportToExch"),
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

    /*
     * used in @Test routine.
     */
    public final static String JUNK_ENUM_NAME = "JunkEnumName";
    public final static String JUNK_ID = "JunkID";
    public final static String JUNK_NAME = "JunkName";
    public final static String JUNK_DESCRIPTION = "JunkDescription";
    public final static String JUNK_ST_DATA_VALUE = "JunkDataValue";
    public final static int JUNK_LT_DATA_VALUE = -65535;
    public final static int JUNK_NIGT_DATA_VALUE = -65535;
    public final static int JUNK_QT_DATA_VALUE = -65535;
    public final static int JUNK_SNT_DATA_VALUE = -65535;

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
        for (FIX30 oneFIX : FIX30.values()) {
            System.out.println(oneFIX);
        }
    }
}