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

package com.hwtsllc.fix.tags.fix27;

import com.hwtsllc.fix.datatypes.FIX27;
import com.hwtsllc.fix.datatypes.FIX27Abstract;
import com.hwtsllc.fix.datatypes.MyStringType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  17
 *  ExecID
 *  String
 *  <p></p>
 *  Unique identifier of execution message as assigned by sell-side (broker, exchange, ECN)
 *  <p></p>
 *  (will be 0 (zero) for ExecType (50) =I (Order Status)).
 *  <p></p>
 *  Uniqueness must be guaranteed within a single trading day or the life of a multi-day order.
 *  <p></p>
 *  Firms which accept multi-day orders should consider embedding a date within
 *  the ExecID field to assure uniqueness across days.
 *  <p></p>
 *  (Prior to FIX 4.1 this field was of type int)
 */
public class Tag17StrExecID extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_EXEC_ID
            = "LouiseBrooks-Tag17StrExecID";
    public final static String TESTB_STR_EXEC_ID
            = "CaroleLombard-Tag17StrExecID";

    public Tag17StrExecID(MyStringType dataValue) {
        setFixType(FIX27.FIX17_STR_EXEC_ID);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
        System.out.println( new Tag17StrExecID(new MyStringType(TESTA_STR_EXEC_ID)).toVerboseString() );
        System.out.println( new Tag17StrExecID(new MyStringType(TESTB_STR_EXEC_ID)).toVerboseString() );
    }
}