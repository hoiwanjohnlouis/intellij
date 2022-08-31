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
 *  <p></p>
 *  Unique identifier for Order as assigned by the buy-side
 *  <p></p>
 *  (institution, broker, intermediary  etc.)
 *  <p></p>
 *  (identified by SenderCompID (49) or OnBehalfOfCompID (5) as appropriate).
 *  <p></p>
 *  Uniqueness must be guaranteed within a single trading day.
 *  <p></p>
 *  Firms, particularly those  which electronically submit multi-day orders,
 *  trade globally or throughout market close periods, should ensure uniqueness
 *  across days, for example by embedding a date within the ClOrdID field.
 */
public class Tag11StrClOrdID extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_CL_ORD_ID
            = "DorothyDandridge-Tag11StrClOrdID";
    public final static String TESTB_STR_CL_ORD_ID
            = "DorothyJeanDandridge-Tag11StrClOrdID";

    public Tag11StrClOrdID(MyStringType dataValue) {
        setFixType(FIX27.FIX11_STR_CL_ORD_ID);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
                .concat("=")
                .concat(this.dataValue.toString());
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
        return this.dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag11StrClOrdID(new MyStringType(TESTA_STR_CL_ORD_ID)).toVerboseString() );
        System.out.println( new Tag11StrClOrdID(new MyStringType(TESTB_STR_CL_ORD_ID)).toVerboseString() );
    }
}
