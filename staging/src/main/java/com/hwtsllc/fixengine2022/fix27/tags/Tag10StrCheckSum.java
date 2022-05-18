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
 *  10
 *  CheckSum
 *  String
 *  Three byte, simple checksum
 *
 *  i.e. serves, with the trailing <SOH>, as the end-of-message delimiter.
 *
 *  (see Volume 2: "Checksum Calculation" for description).
 *  ALWAYS LAST FIELD IN MESSAGE;
 *
 *  Always defined as three characters.
 *  (Always unencrypted)
 */
public class Tag10StrCheckSum extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_CHECK_SUM = "789"; // fake data
    public final static String TESTB_STR_CHECK_SUM = "123";

    public Tag10StrCheckSum(MyStringType dataValue) {
        setFixType(FIX27.FIX10_STR_CHECK_SUM);
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
        dumpDataValues( new Tag10StrCheckSum(new MyStringType(TESTA_STR_CHECK_SUM)) );
        dumpDataValues( new Tag10StrCheckSum(new MyStringType(TESTB_STR_CHECK_SUM)) );
    }
    /**
     *
     * @param tagData   Tag10StrCheckSum
     */
    static void dumpDataValues(Tag10StrCheckSum tagData) {
        System.out.println("-------------------- Start Tag10StrCheckSum MyStringType --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("-------------------- End Tag10StrCheckSum MyStringType --------------------");
    }
}
