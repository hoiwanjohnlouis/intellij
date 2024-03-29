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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.datatypes.MyLocalMktDateType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  230
 *  ExDate
 *  LocalMktDate
 *  <p></p>
 *  The date when a distribution of interest is deducted from a securities assets
 *  or set aside for payment to bondholders.
 *  <p></p>
 *  On the ex-date, the securities price drops by the amount of the distribution
 *  <p></p>
 *  (plus or minus any market activity).
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  (prior to FIX 4.4 field was of type UTCDate)
 */
public class Tag230LmdExDate extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyLocalMktDateType dataValue;

    public final static String TESTA_LMD_EX_DATE
            = "Frodo-Tag230LmdExDate";
    public final static String TESTB_LMD_EX_DATE
            = "Gandalf-Tag230LmdExDate";

    public Tag230LmdExDate(MyLocalMktDateType dataValue) {
        setFixType(FIX42.FIX230_LMD_EX_DATE);
        this.dataValue = dataValue;
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
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag230LmdExDate tagData;

        tagData = new Tag230LmdExDate(new MyLocalMktDateType(TESTA_LMD_EX_DATE) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag230LmdExDate(new MyLocalMktDateType(TESTB_LMD_EX_DATE) );
        System.out.println(tagData.toVerboseString());
    }
}
