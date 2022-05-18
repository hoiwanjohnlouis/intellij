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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  64
 *  SettlDate
 *  LocalMktDate
 *  Specific date of trade settlement (SettlementDate) in YYYYMMDD format.
 *
 *  If present, this field overrides SettlType (63).
 *  This field is required if the value of  SettlType (63) is 6 (Future) or 8 (Sellers Option).
 *  This field must be omitted if the value of SettlType (63) is 7 (When and If Issued)
 *  (expressed in local time at place of settlement)
 */
public class Tag64StrSettlDate extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_SETTL_DATE = "BilboBaggins-64SettlDate"; // fake data
    public final static String TESTB_STR_SETTL_DATE = "Gandalf-64SettlDate";

    public Tag64StrSettlDate(MyStringType dataValue) {
        setFixType(FIX27.FIX64_STR_SETTL_DATE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        dumpDataValues( new Tag64StrSettlDate(new MyStringType(TESTA_STR_SETTL_DATE)) );
        dumpDataValues( new Tag64StrSettlDate(new MyStringType(TESTB_STR_SETTL_DATE)) );
    }
    /**
     *
     * @param tagData   Tag64StrSettlDate
     */
    static void dumpDataValues(Tag64StrSettlDate tagData) {
        System.out.println("-------------------- Start Tag64StrSettlDate MyStringType --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("-------------------- End Tag64StrSettlDate MyStringType --------------------");
    }
}