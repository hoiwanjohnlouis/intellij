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

package com.hwtsllc.fix.tags.fix41;

import com.hwtsllc.fix.datatypes.FIX41;
import com.hwtsllc.fix.datatypes.FIX41Abstract;
import com.hwtsllc.fix.datatypes.MyStringType;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  206
 *  OptAttribute
 *  char
 *  <p></p>
 *  Can be used for SecurityType (167) =OPT to identify a particular security.
 *  <p></p>
 *  Valid values vary by SecurityExchange:
 *  <p>    *** REPLACED values - See "Replaced Features and Supported Approach" ***
 *  <p></p>
 *      For Exchange: MONEP (Paris)
 *  <p>    L = Long (a.k.a. "American")
 *  <p>    S = Short (a.k.a. "European")
 *  <p></p>
 *      For Exchanges: DTB (Frankfurt), HKSE (Hong Kong), and SOFFEX (Zurich)
 *  <p>    0-9 = single digit "version" number assigned by exchange following capital adjustments
 *               (0=current, 1=prior, 2=prior to , etc).
 */
public class Tag206StrOptAttribute extends FIX41Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_OPT_ATTRIBUTE
            = "RosalindRussell-Tag206StrOptAttribute";
    public final static String TESTB_STR_OPT_ATTRIBUTE
            = "CatherineRosalindRussell-Tag206StrOptAttribute";

    public Tag206StrOptAttribute(MyStringType dataValue) {
        setFixType(FIX41.FIX206_STR_OPT_ATTRIBUTE);
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
        Tag206StrOptAttribute tagData;

        tagData = new Tag206StrOptAttribute(new MyStringType(TESTA_STR_OPT_ATTRIBUTE) );
        System.out.println( tagData.toVerboseString() );

        tagData = new Tag206StrOptAttribute(new MyStringType(TESTB_STR_OPT_ATTRIBUTE) );
        System.out.println( tagData.toVerboseString() );
    }
}
