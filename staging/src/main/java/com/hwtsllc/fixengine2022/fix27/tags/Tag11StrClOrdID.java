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
 *  11
 *  ClOrdID
 *  String
 *  Unique identifier for Order as assigned by the buy-side
 *  (institution, broker, intermediary  etc.)
 *  (identified by SenderCompID (49) or OnBehalfOfCompID (5) as appropriate).
 *
 *  Uniqueness must be guaranteed within a single trading day.
 *  Firms, particularly those  which electronically submit multi-day orders,
 *  trade globally or throughout market close periods, should ensure uniqueness
 *  across days, for example by embedding a date within the ClOrdID field.
 */
public class Tag11StrClOrdID extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_CL_ORD_ID = "BilboBaggins-11StClOrdID"; // fake data
    public final static String TESTB_STR_CL_ORD_ID = "Gandalf-11StClOrdID";

    public Tag11StrClOrdID(MyStringType dataValue) {
        setFixType(FIX27.FIX11_STR_CL_ORD_ID);
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
                .concat("]");
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
        dumpDataValues( new Tag11StrClOrdID(new MyStringType(TESTA_STR_CL_ORD_ID)) );
        dumpDataValues( new Tag11StrClOrdID(new MyStringType(TESTB_STR_CL_ORD_ID)) );
    }
    /**
     *
     * @param tagData   Tag11StrClOrdID
     */
    static void dumpDataValues(Tag11StrClOrdID tagData) {
        System.out.println("-------------------- Start String --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("Accessing FIXTag Directly:");
        System.out.println("TagDataString:" + tagData);
        System.out.println("EnumNameString:" + tagData.toEnumNameString());
        System.out.println("FIXIDString:" + tagData.toFIXIDString());
        System.out.println("FIXNameString:" + tagData.toFIXNameString());
        System.out.println("FIXDescriptionString:" + tagData.toFIXDescriptionString());
        System.out.println("ValuePairString:" + tagData.toValuePairString());
        System.out.println("-------------------- End String --------------------");
    }
}
