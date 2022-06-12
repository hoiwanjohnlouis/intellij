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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  726
 *  ResponseDestination
 *  String
 *  <p></p>
 *  URI (Uniform Resource Identifier) for details) or other pre-arranged value.
 *  <p></p>
 *  Used in conjunction with ResponseTransportType (725) value of Out-of-Band
 *  to identify the out-of-band destination.
 *  <p></p>
 *  See "Appendix 6-B FIX Fields Based Upon Other Standards"
 */
public class Tag726StrResponseDestination extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_RESPONSE_DESTINATION
            = "FredericaVonStade-Tag726StrResponseDestination";
    public final static String TESTB_STR_RESPONSE_DESTINATION
            = "VivicaGenaux-Tag726StrResponseDestination";

    public Tag726StrResponseDestination(MyStringType dataValue) {
        setFixType( FIX44.FIX726_STR_RESPONSE_DESTINATION );
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
        Tag726StrResponseDestination tagData;

        tagData = new Tag726StrResponseDestination(new MyStringType( TESTA_STR_RESPONSE_DESTINATION ) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag726StrResponseDestination(new MyStringType( TESTB_STR_RESPONSE_DESTINATION ) );
        System.out.println(tagData.toVerboseString());
    }
}
